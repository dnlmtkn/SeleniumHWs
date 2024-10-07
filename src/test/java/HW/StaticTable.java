package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        /*
        User Story
- **Title**: Verifying Dynamic Table Search Functionality
- **As a user,**
- I want to navigate to `https://syntaxprojects.com/table-search-filter-demo-homework.php`
- So that I can ensure the table fulfills the following criteria dynamically.

Acceptance Criteria

1. **Print All Entries with the Country "USA"**:
   - Dynamically search the table for entries where the country is **"USA"**.
   - Print all the rows matching criteria

2. **Dynamic Logic**:
   - Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
   - The code should be flexible enough to accommodate changes in the country name
   - If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work, and the output
   should reflect the correct entries based on the updated country.
         */

        List <WebElement> countries=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int rowCount=1;
        for (WebElement country:countries){
            if (country.getText().equals("USA")){
                WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+rowCount+"]"));
                System.out.println(row.getText());
            }
            rowCount++;
        }

        System.out.println("##############################");
        //another way:

        List <WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for (WebElement row1:rows){
            if (row1.getText().contains("USA")){
                System.out.println(row1.getText());
            }
        }
    }
}
