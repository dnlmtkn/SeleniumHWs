package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class CalendarWithNavigation {
    public static void main(String[] args) {

        /*
         ### User Story
- **Title**: Verifying Dynamic Date Selection in the jQuery Date Picker
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/jquery-date-picker-demo-homework.php`
- So that I can ensure the correct "To" and "From" dates are selected from the calendar.



#### Acceptance Criteria

1. **Select "From" and "To" Dates**:
   - Select the **From** date and the **To** date in the jQuery date picker.
   - The code logic should be **dynamic**, meaning it should work with any selected dates without requiring any changes to the core logic.
   - The selection should not rely on hard-coded date values and should be adaptable if the date range changes.
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");

        driver.findElement(By.cssSelector("input#from_date")).click();

        boolean notMonth = true;
        while (notMonth) {
            WebElement monthAndYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
            if (monthAndYear.getText().equals("December 2025")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : dates) {
                    if (date.getText().equals("10")) {
                        date.click();
                    }
                }
                notMonth = false;
            } else {
                driver.findElement(By.xpath("//a[@title='Next']")).click();
            }
        }

        driver.findElement(By.cssSelector("input#to_date")).click();
        boolean notMonthTo = true;
        while (notMonthTo) {
            WebElement monthAndYearTo = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
            if (monthAndYearTo.getText().equals("May 2025")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : dates) {
                    if (date.getText().equals("23")) {
                        date.click();
                    }
                }
                notMonthTo = false;
            } else {
                driver.findElement(By.xpath("//a[@title='Next']")).click();
            }
        }

    }
}
