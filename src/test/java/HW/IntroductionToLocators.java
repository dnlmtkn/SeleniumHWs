package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToLocators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName=driver.findElement(By.id("fullName"));
        fullName.sendKeys("Danil Mitkin");

        WebElement email=driver.findElement(By.id("yourEmail"));
        email.sendKeys("danilmitkin.com");

        WebElement clientName=driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Danil");

        WebElement clientId=driver.findElement(By.id("ClientId"));
        clientId.sendKeys("10");

        WebElement clientFeedback=driver.findElement(By.id("ClientfeedbackId"));
        clientFeedback.sendKeys("Opa");

        WebElement projectName=driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Syntax");

        WebElement projectTime=driver.findElement(By.id("ProjectTimeId"));
        projectTime.sendKeys("December 2024");

        WebElement currentAddress=driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("123 Main, New York");

        WebElement permanentAddress=driver.findElement(By.id("PermanentAddressId"));
        permanentAddress.sendKeys("123 Main, New York");

        WebElement link2=driver.findElement(By.id("btn-submit"));
        link2.click();

        Thread.sleep(2000);
        driver.navigate().refresh();

        WebElement fullName1=driver.findElement(By.id("fullName"));
        fullName1.sendKeys("Danil Mitkin");

        WebElement email1=driver.findElement(By.id("yourEmail"));
        email1.sendKeys("danil@mitkin.com");

        WebElement clientName1=driver.findElement(By.id("clientNameId"));
        clientName1.sendKeys("Danil");

        WebElement clientId1=driver.findElement(By.id("ClientId"));
        clientId1.sendKeys("10");

        WebElement clientFeedback1=driver.findElement(By.id("ClientfeedbackId"));
        clientFeedback1.sendKeys("Opa");

        WebElement projectName1=driver.findElement(By.id("ProjectNameId"));
        projectName1.sendKeys("Syntax");

        WebElement projectTime1=driver.findElement(By.id("ProjectTimeId"));
        projectTime1.sendKeys("December 2024");

        WebElement currentAddress1=driver.findElement(By.id("CurrentAddressId"));
        currentAddress1.sendKeys("123 Main, New York");

        WebElement permanentAddress1=driver.findElement(By.id("PermanentAddressId"));
        permanentAddress1.sendKeys("123 Main, New York");

        WebElement link21=driver.findElement(By.id("btn-submit"));
        link21.click();

        WebElement link1=driver.findElement(By.linkText("Click Here."));
        link1.click();










    }
}
