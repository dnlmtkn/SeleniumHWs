package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        /*
        User Story
-Title: Verifying Checkbox Functionality
- As a user,
- I want to navigate to `https://syntaxprojects.com/basic-checkbox-demo-homework.php`
- So that I can ensure all the checkbox functionality is working as expected.



Acceptance Criteria

1. Subscribe to Newsletter:
   - Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it.

2.Select Your Hobbies:
   - Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
   - Traverse through the list and select the **Reading** and **Cooking** checkboxes.

3. Select Your Interests:
   - Verify that the **Support** and **Music** checkboxes are not displayed by default.
   - Click on the "Show Checkboxes" button, and then select the **Music** checkbox.

4. Preferences:
   - Verify that the **Receive Notifications** checkbox is disabled.
   - Click on the "Enable Checkboxes" button, and then select the **Receive Notifications** checkbox.
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement newsletterBox = driver.findElement(By.cssSelector("input#newsletter"));
        if (newsletterBox.isEnabled()) {
            newsletterBox.click();
        } else {
            System.out.println("The checkbox is not enabled");
        }

        List<WebElement> hobbies = driver.findElements(By.cssSelector("input.cb-element"));
        for (WebElement hobbie : hobbies) {
            if (hobbie.getAttribute("id").equals("reading") || hobbie.getAttribute("id").equals("cooking")) {
                hobbie.click();
            }
        }

        WebElement supportInterest = driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement musicInterest = driver.findElement(By.xpath("//input[@value='Music']"));
        WebElement showButton = driver.findElement(By.cssSelector("button#toggleCheckboxButtons"));

        if (!supportInterest.isDisplayed() & !musicInterest.isDisplayed()) {
            showButton.click();
            Thread.sleep(1000);
            musicInterest.click();
        } else {
            System.out.println("One or all of the buttons are displayed");
        }

        WebElement receiveNotificationsButton = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        WebElement enableButton = driver.findElement(By.cssSelector("button#enabledcheckbox"));

        if (!receiveNotificationsButton.isEnabled()) {
            enableButton.click();
            Thread.sleep(1000);
            receiveNotificationsButton.click();
        } else {
            System.out.println("The 'Receive Notifications' button is enabled");
        }


    }
}
