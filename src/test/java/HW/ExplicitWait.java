package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");

        /*
        User Story
- **Title**: Verifying Synchronization Using Explicit Waits
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/synchronization-explicit-wait-homework.php`
- So that I can ensure the text, button, and checkbox functionalities work as expected using appropriate wait times.



Acceptance Criteria

1. **Change Text**:
   - Click on the button **"Click me to change text!"**.
   - Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console.

2. **Enable Button**:
   - Click on the button **"Click me to enable button"**.
   - Wait for the button to be enabled, and once it's enabled, click on it.

3. **Checkbox Checked Based on Click**:
   - Click on the button **"Click me to check the checkbox"**.
   - Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.
         */


        WebElement changeText = driver.findElement(By.cssSelector("button#changetext_button"));
        changeText.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("h2#headingtext"), "Ssyntaxtechs"));
        WebElement changedText = driver.findElement(By.cssSelector("h2#headingtext"));
        System.out.println(changedText.getText());

        WebElement enableButton = driver.findElement(By.cssSelector("button#enable_button"));
        WebElement buttonButton = driver.findElement(By.xpath("//button[text()='Button']"));
        enableButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        buttonButton.click();

        WebElement checkboxButton = driver.findElement(By.cssSelector("button#checkbox_button"));
        checkboxButton.click();
        WebElement checkbox = driver.findElement(By.cssSelector("input#checkbox"));
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox, true));
        System.out.println(checkbox.isSelected());


    }
}
