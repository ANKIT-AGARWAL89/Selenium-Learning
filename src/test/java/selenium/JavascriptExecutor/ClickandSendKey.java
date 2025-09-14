package selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ClickandSendKey {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor jS = (JavascriptExecutor) driver;
        WebElement elementForInputBox = driver.findElement(By.xpath("//input[@id='name']"));
        WebElement elementForClickableloc = driver.findElement(By.xpath("//input[@id='male']"));
        // sendKey() method replicating via JavascriptExecutor
        jS.executeScript("arguments[0].setAttribute('value','Ankit')", elementForInputBox);

        // click() method replicating via JavascriptExecutor
        jS.executeScript("arguments[0].click()", elementForClickableloc);
    }
}
