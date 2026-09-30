package selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumBasics {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//        driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        List<WebElement> logos = driver.findElements(By.xpath("//img[@alt='orangehrm-logo']"));
//
//        for (int i = 0; i < logos.size(); i++) {
//            WebElement logo = logos.get(i);
//
//            System.out.println("Logo " + (i + 1));
//            System.out.println("Displayed: " + logo.isDisplayed());
//            System.out.println("HTML: " + logo.getAttribute("outerHTML"));
//            System.out.println("----------------");
//        }
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
//        System.out.println(driver.getClass());
//        System.out.println(driver.getWindowHandle());
//        System.out.println(driver.getWindowHandles());
//        driver.quit();
    }
}