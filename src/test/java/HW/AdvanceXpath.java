package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {

        /*
        User Story
- Title: Filling Form Using Advanced Xpath Selectors
- As a user,
- I want to navigate to `https://syntaxprojects.com/advanceXpath-homework.php`
- So that I can fill in specific details in the form using advanced Xpath selectors.


Acceptance Criteria
1.The user should enter the names of books in reverse order from least favorite to favorite using advanced Xpath
(such as `parent`, `following-sibling`, or `preceding-sibling`).
2. The user should enter the name of their favorite book using advanced Xpath.
3. The user should enter the names of grandparent, parent, and child fields using advanced Xpath.
4. The form should submit successfully only if all fields are filled out correctly using the appropriate advanced Xpath
expressions.(to be removed)
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement leastFav = driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFav.sendKeys(" least opaaa");

        WebElement leastFav1 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFav1.sendKeys("least opaa");

        WebElement leastFav2 = driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFav2.sendKeys("least opa");

        WebElement bestBook = driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        bestBook.sendKeys("best opa");

        WebElement bestBook1 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        bestBook1.sendKeys("best opaa");

        WebElement bestBook2 = driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        bestBook2.sendKeys("best opaaa");

        WebElement grandP = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandP.sendKeys("grand opa");

        WebElement parent = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("parent opa");

        WebElement child = driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("child opa");


    }
}
