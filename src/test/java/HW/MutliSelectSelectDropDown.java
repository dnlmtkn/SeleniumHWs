package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MutliSelectSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        /*
        User Story
- **Title**: Verifying Dropdown and Multi-Select Functionality
- **As a user,**
- I want to navigate to https://syntaxprojects.com/basic-select-dropdown-demo-homework.php Links to an external site.
- So that I can verify that users can select the correct options from both single and multi-select dropdowns.



Acceptance Criteria

1. Select List Demo:
   - Use the **Select** class to select the option **"Pear"** from the dropdown.
   - You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`).
   - Use the **getOptions** method to retrieve all options from the dropdown and print them on the console.

2. Select Multiple Options:
   - First, verify that the **Select** dropdown is multi-select by checking the dropdown’s properties.
   - Using the **Select** class, make the following selections:
     - **Traveling**
     - **Cooking**
     - **Gardening**
   - Click the **"Get All Selected"** button and print the result on the console.
   - After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
   - Click the **"Get All Selected"** button again and print the result on the console.
         */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        WebElement dropDown= driver.findElement(By.cssSelector("select#fav_fruit_selector"));
        Select sel=new Select(dropDown);
        sel.selectByValue("Pear");

        List<WebElement> options=sel.getOptions();
        for (WebElement option:options){
            System.out.println(option);
        }

        WebElement multiOptions=driver.findElement(By.cssSelector("select#select_multi_hobbies"));
        Select sel1=new Select(multiOptions);
        System.out.println(sel1.isMultiple());

        sel1.selectByValue("Traveling");
        sel1.selectByValue("Cooking");
        sel1.selectByValue("Gardening");

        WebElement allSelectedButton=driver.findElement(By.cssSelector("button#get_all"));
        allSelectedButton.click();
        WebElement selectedOptions=driver.findElement(By.cssSelector("p.get_selected_values"));
        System.out.println(selectedOptions.getText());

        Thread.sleep(5000);
        sel1.deselectByValue("Traveling");
        allSelectedButton.click();
        System.out.println(selectedOptions.getText());





    }
}
