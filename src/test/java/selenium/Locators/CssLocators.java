package selenium.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //tag id
        // tag#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("1");
        // #id
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("2");

        // tag className
        // tag.classname
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("3");
        // .classname
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("4");

        // tag attribute
        // tag[attribute='value']
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("5");

        // tag class attribute
        // tag.className[attribute='value']
        driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("6");
        driver.quit();
    }
}