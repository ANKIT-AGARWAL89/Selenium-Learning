package selenium.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.Set;

public class getMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // get method
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // getTitle
        String title = driver.getTitle();
        System.out.println("Title of the website: " + title);

        // getCurrentUrl
        String currentUrl = driver.getCurrentUrl();
        System.out.println("driver control on this link - " + currentUrl);

        // getPageSource
        String pageSource = driver.getPageSource();
        System.out.println("Page source : " + pageSource);

        // getWindowHandle
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window handle for this current page : " + windowHandle);

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("OrangeHRM")).click();

        // getWindowHandles
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window handles for all the page : " + windowHandles);

        driver.quit();

    }
}
