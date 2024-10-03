package HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {

        /*
         User Story
- **Title**: Verifying JavaScript Alerts Functionality
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/javascript-alert-box-demo-homework.php`
- So that I can make sure the alerts functionality is working as expected.



Acceptance Criteria

1. Birthday Reminder:
   - Click on the "Birthday Reminder" button.
   - When the alert appears, accept the alert.

2. Delete Confirmation:
   - Click on the **"Delete File"** button.
   - When the confirmation alert appears, **dismiss** the alert.
   - Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.

3. Name Collection:
   - Click on the **"Enter Your Name"** button.
   - Accept the alert and provide a name.
   - Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.
         */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        WebElement birthdayReminderButton= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        birthdayReminderButton.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement deleteFileButton= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        deleteFileButton.click();
        alert.dismiss();
        WebElement statusOfAction= driver.findElement(By.cssSelector("p#confirm-demo"));
        System.out.println(statusOfAction.getText());

        WebElement yourNameButton=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        yourNameButton.click();
        alert.sendKeys("Danil");
        alert.accept();

        WebElement enteredName= driver.findElement(By.cssSelector("p#prompt-demo"));
        System.out.println(enteredName.getText());


    }
}
