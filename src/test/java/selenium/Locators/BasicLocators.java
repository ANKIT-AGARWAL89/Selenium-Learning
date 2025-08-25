package selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasicLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-opencart.com/");
        driver.manage().window().maximize();
        // name
//        WebElement searchbar = driver.findElement(By.name("search"));
//        searchbar.sendKeys("Iphone16");
//        driver.quit();

        // id
//        WebElement logo = driver.findElement(By.id("logo"));
//        System.out.println("Is logo displayed ? - " + logo.isDisplayed());
//        driver.quit();

        // Link-text, partial link-tex
//        Thread.sleep(7000);
//        WebElement element = driver.findElement(By.linkText("Partial Payment Advanced Pro"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(7000);
//        element.click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.findElement(By.partialLinkText("Partial")).click();
//        driver.quit();

        // tagName
//        Thread.sleep(2000);
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Number of links in this page: "+ links.size());
//        driver.quit();

        // className
//        driver.findElement(By.className("form-control")).sendKeys("ankit");
//        driver.quit();
    }
}