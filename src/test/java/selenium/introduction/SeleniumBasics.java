package selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
////        System.out.println(driver.getPageSource());
//        System.out.println(driver.getClass());
//        System.out.println(driver.getWindowHandle());
//        System.out.println(driver.getWindowHandles());
//        driver.quit();
    }
}