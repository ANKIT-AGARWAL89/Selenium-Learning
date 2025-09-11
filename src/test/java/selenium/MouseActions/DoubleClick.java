package selenium.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement doubleClickLocation = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        WebElement secondBox = driver.findElement(By.xpath("//input[@id='field2']"));
        Actions actDoubleClick = new Actions(driver);
        // doubleClick() method to perform double click
        actDoubleClick.doubleClick(doubleClickLocation).perform();
        System.out.println(secondBox.getAttribute("value"));
    }
}
