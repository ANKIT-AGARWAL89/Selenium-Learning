package selenium.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragandDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
        WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actDragAndDrop = new Actions(driver);
        actDragAndDrop.dragAndDrop(source,destination).perform();
    }
}
