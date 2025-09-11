package selenium.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions actRightClick = new Actions(driver);
        WebElement rightClickLocation = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
        // contextClick method for right click
        actRightClick.contextClick(rightClickLocation).perform();

        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
        driver.switchTo().alert().accept();
    }
}
