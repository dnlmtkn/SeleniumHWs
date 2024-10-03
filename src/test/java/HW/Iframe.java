package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {
    public static void main(String[] args) {

        /*
         User Story
- **Title**: Handling Iframe Interactions for Form Submission
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/handle-iframe-homework.php`
- So that I can enter the username, select a city, and click on the age checkbox while correctly handling iframes.



Acceptance Criteria

1. Select Age Checkbox:
   - Select the **Age** checkbox.

2. **Select City**:
   - Select any city from the dropdown.

3. **Enter Username**:
   -enter your username in the **Username** field.
         */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        driver.switchTo().frame("dropdownIframe");
        driver.switchTo().frame("checkboxIframe");
        WebElement ageCheckBox= driver.findElement(By.xpath("//input[@value='Option-1']"));
        ageCheckBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement citiesDropDown= driver.findElement(By.cssSelector("select#cities"));
        Select sel=new Select(citiesDropDown);
        sel.selectByValue("Houston");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        WebElement userName=driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("opa");


    }
}
