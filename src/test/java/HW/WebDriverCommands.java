package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        String title= driver.getTitle();
        System.out.println(title);
        driver.navigate().to("https://www.syntaxprojects.com");
        String title1= driver.getTitle();
        System.out.println(title1);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();


    }
}
