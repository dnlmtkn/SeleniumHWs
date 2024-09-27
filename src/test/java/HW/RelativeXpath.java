package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) {

        /*
        User Story : Fill Out Form Using XPath

Given the user navigates to `https://www.syntaxprojects.com/Xpath-homework.php`,
When the user enters the necessary information in the form,
Then all the necessary key points in the acceptance criteria should be met.


### Acceptance Criteria:
1. The user is able to enter their hobbies using XPath.
2. When the user clicks the "Click Here" button using XPath.,
   Then the message `"Button clicked:"` should be displayed on the screen.
3. The user successfully enters their favorite movie using XPath to find the text boxes.
4. The user uses the `contains()` method of XPath to locate a specific text element on the page and prints it to the console.
5. The user is able to enter the city in the designated field.
6. The user must use the **indexing technique** learned in class to enter  email addresses.
7. The user must use the **operators technique** (e.g., `and`, `or`) to enter both the client name and client ID.
8. The user can use **any XPath technique** to enter the street number and house number.
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        WebElement hobbies = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Cycling");

        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        WebElement movies = driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        movies.sendKeys("Idk");

        WebElement text = driver.findElement(By.xpath("//label[contains(text(),'ipsum dolor sit amet')]"));
        String printText = text.getText();
        System.out.println(printText);

        WebElement city = driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("NYC");

        WebElement personalEmail = driver.findElement(By.xpath("(//input[@type='email' and @class='form-control'])[1]"));
        personalEmail.sendKeys("personal@personal.com");

        WebElement officeEmail = driver.findElement(By.xpath("(//input[@type='email' and @class='form-control'])[2]"));
        officeEmail.sendKeys("office@office.com");

        WebElement professionalEmail = driver.findElement(By.xpath("(//input[@type='email' and @class='form-control'])[3]"));
        professionalEmail.sendKeys("professional@professional.com");

        //#7 Client Name / Client ID don't have unique attribute value to use 'and'/'or' operators:

        WebElement clientName = driver.findElement(By.xpath("//input[@id='clientName']"));
        clientName.sendKeys("Client");

        WebElement clientID = driver.findElement(By.xpath("//input[@id='clientId']"));
        clientID.sendKeys("ID");

        WebElement streetN = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetN.sendKeys("123");

        WebElement houseN = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseN.sendKeys("123");


    }
}
