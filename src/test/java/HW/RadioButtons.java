package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        /*
        User Story
- Title: Verifying Radio Button Functionality
- As a user,
- I want to navigate to `https://syntaxprojects.com/basic-radiobutton-demo-homework.php`
- So that I can check if all radio buttons are working as expected.

 Acceptance Criteria

1. Choose Your Favorite Beverage:
   - Select the Juice radio button from the list of favorite beverages.

2. Preferred Working Environment:
   - Retrieve all radio buttons in the Preferred Working Environment section.
   - Traverse through the list of radio buttons in code and select the Hybrid option.


3. Choose Your Favorite Season:
   - If the Spring radio button is disabled, click on the "Enable Buttons" button.
   - Ensure that the Spring option is now enabled, then select it.
   - By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially.
   Then click on the "Show Buttons" button.
   - Verify that the Winter option is displayed after clicking and is available for selection.

4. Choose Your Favorite Meal:
   - Select the Lunch radio button from the list of favorite meals.
         */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        WebElement favBev= driver.findElement(By.xpath("//input[@value='Juice']"));
        favBev.click();

        List<WebElement> workingEnvironments=driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for (WebElement workEnvironment:workingEnvironments){
            if (workEnvironment.getAttribute("value").equals("hybrid")){
                workEnvironment.click();
            }
        }

        WebElement favSeasonS= driver.findElement(By.xpath("//input[@value='spring']"));
        WebElement favSeasButton= driver.findElement(By.cssSelector("button#enabledFruitradio"));
        if (!favSeasonS.isEnabled()){
            favSeasButton.click();
        }
        favSeasonS.click();

        WebElement winterButton= driver.findElement(By.xpath("//input[@value='winter']"));
        WebElement showButton= driver.findElement(By.cssSelector("button#showRadioButtons"));
        if (!winterButton.isDisplayed()){
            showButton.click();
        }else{
            System.out.println("The 'Winter' button is displayed");
        }

        if (winterButton.isDisplayed()){
            System.out.println("The 'Winter' button is displayed now");
            winterButton.click();
        }else{
            System.out.println("The 'Winter' button is not displayed");
        }

        WebElement lunchButton= driver.findElement(By.xpath("//input[@value='lunch']"));
        lunchButton.click();




    }
}
