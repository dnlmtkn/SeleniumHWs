package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserAssignment {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.syntaxprojects.com/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        System.out.println(url);
        System.out.println(title);

        driver.quit();


    }
}
