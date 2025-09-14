package selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor jS = (JavascriptExecutor) driver;
        // scrolling to a particular location
        jS.executeScript("window.scrollBy(0,1500)", "");
        System.out.println(jS.executeScript("return window.pageYOffset"));

        // scrolling till a element visible
        WebElement elementLocForVisibility = driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']"));
        jS.executeScript("arguments[0].scrollIntoView();", elementLocForVisibility);

        // scrolling page till end of the page
        jS.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        // scrolling up to initial position
        jS.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }
}
