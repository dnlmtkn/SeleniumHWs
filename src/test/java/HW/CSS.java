package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {

        /*
         User Story
- Title: Form Submission Using Unique CSS Selectors
- As a user,
- I want to navigate to `https://syntaxprojects.com/cssSelector-homework.php`
- So that I can successfully fill the form using appropriate CSS selectors.


Acceptance Criteria
1. The user should fill in all the text boxes in the form using*CSS selectors that are unique and return only one element (1/1).
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userId = driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("userid");

        WebElement userName = driver.findElement(By.cssSelector("input[id='UserName']"));
        userName.sendKeys("username");

        WebElement intro = driver.findElement(By.cssSelector("input[name='LectureIntro']"));
        intro.sendKeys("intro");

        WebElement feedback = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedback.sendKeys("feedback");

        WebElement feedback1 = driver.findElement(By.cssSelector("input[id$='Ducky']"));
        feedback1.sendKeys("feedback1");

        WebElement clientId = driver.findElement(By.cssSelector("input[name='ClientID']"));
        clientId.sendKeys("clientid");

        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("email");

        WebElement course = driver.findElement(By.cssSelector("input[name*='Course']"));
        course.sendKeys("course topic");

    }
}
