package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");

        /*
        ### User Story
- **Title**: Verifying Checkbox Selection Using Synchronization
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/synchronization-waits-homework.php`
- So that I can verify the functionality of selecting **Option 1** in the checkbox after the appropriate wait time.

 #### Acceptance Criteria

1. **Button Click and Checkbox Selection**:
   - Click on the button labeled **"Click me"**.
   - Use an appropriate wait method to wait until the checkbox options appear.
   - Once the checkboxes are visible, select **Option 1** from the list of checkboxes.
         */

        WebElement button=driver.findElement(By.cssSelector("button#show_text_synchronize_three"));
        button.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement option1= driver.findElement(By.xpath("//input[@value='Option-1']"));
        option1.click();


    }
}
