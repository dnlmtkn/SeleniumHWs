package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {

        /*
        User Story
- **Title**: Verifying Window Popup Modal Functionality for Buttons B1 and B2
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/window-popup-modal-demo-homework.php`
- So that I can verify the functionality of Buttons B1 and B2.



Acceptance Criteria

1. Click on Button B1:
   - Ensure that clicking on the **B1** button opens a new window.
   - Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"**.

2. Click on Button B2:
   - Ensure that clicking on the **B2** button opens a new window.
   - Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        WebElement button1 = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        WebElement button2 = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));

        button1.click();
        button2.click();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().equals("https://syntaxprojects.com/b1-page.php")) {
                System.out.println("B1 has been opened up");
                WebElement button1Text = driver.findElement(By.xpath("//h2[text()='Welcome to B1! page']"));
                if (button1Text.getText().equals("Welcome to B1! page")) {
                    System.out.println("B1 button text is correct");
                } else {
                    System.out.println("B1 button text isn't correct");
                }
            } else {
                if (driver.getCurrentUrl().equals("https://syntaxprojects.com/b2-page.php")) {
                    System.out.println("B2 has been opened up");
                    Thread.sleep(1000);
                    WebElement button2Text = driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
                    if (button2Text.getText().equals("Welcome to B2 page")) {
                        System.out.println("B2 button text is correct");
                    } else {
                        System.out.println("B2 button text isn't correct");
                    }
                }
            }
        }


    }
}
