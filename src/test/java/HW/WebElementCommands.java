package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {

        /*
        Acceptance Criteria
1. Retrieve Attribute:
   - Retrieve the text "inspect me to view my custom attribute" from the element and print it on the console, ensuring the text is correct.

2. Meal Preference:
   - Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it.
   - Ensure that the option for "Tech Talk" is disabled.
   - Click on "Show More Options" and ensure the "Art Exhibition" option is displayed, then click on it.

3. Mystery Message:
   - Retrieve the value of the attribute `title` from the element containing the text "Hover me to reveal the secret"
   and print it on the console.

Option Box:
   - If "Checkbox 1" is enabled, click on it.
   - Ensure that "Checkbox 2" is disabled.---

5. Input Field:
   - clear the text in the input box and send the text "here is the custom text entered" using selenium commands.
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement text = driver.findElement(By.cssSelector("div#textattr"));
        System.out.println(text.getText());

        WebElement musicFest = driver.findElement(By.xpath("//input[@value='music_festival']"));
        if (musicFest.isEnabled()) {
            System.out.println("The 'Music Festival' option is enabled");
            musicFest.click();
        } else {
            System.out.println("The 'Music Festival' option is disabled");
        }

        WebElement TechTalk = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        if (text.isDisplayed()) {
            System.out.println("The 'Tech Talk' is disabled");
        } else {
            System.out.println("The 'Tech Talk' is enabled");
        }

        WebElement ShowMoreButton = driver.findElement(By.cssSelector("button.btn.btn-default"));
        ShowMoreButton.click();
        WebElement ArtExhibition = driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        if (ArtExhibition.isDisplayed()) {
            System.out.println("The 'Art Exhibition' option is displayed");
        } else {
            System.out.println("The 'Art Exhibition' option is not displayed");
        }
        ArtExhibition.click();

        WebElement MysteryMessage = driver.findElement(By.cssSelector("div#hidden_message"));
        String message = MysteryMessage.getAttribute("title");
        System.out.println(message);

        WebElement CheckBox = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        if (CheckBox.isEnabled()) {
            CheckBox.click();
        } else {

        }

        WebElement CheckBox2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        if (CheckBox2.isEnabled()) {
            System.out.println("The 'CheckBox2' is not disabled");
        } else {
            System.out.println("The 'CheckBox2' is disabled");
        }

        WebElement inputField = driver.findElement(By.cssSelector("input#inputField"));
        inputField.clear();
        inputField.sendKeys("here is the custom text entered");


    }
}
