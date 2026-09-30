package selenium.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int numberOfRows = rows.size();
        System.out.println("Number of rows: " + numberOfRows);

        List<WebElement> cols = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        System.out.println("Number of columns: " + cols.size());


        for (int i = 2; i <= numberOfRows; i++) {
            for (int j = 1; j <= cols.size(); j++) {
                String columnData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]")).getText();
                System.out.print(columnData+" ");
            }
            System.out.println();
        }
    }
}
