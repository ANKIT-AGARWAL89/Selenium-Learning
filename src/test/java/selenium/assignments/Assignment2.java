package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;


public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links - "+links.size());
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Number of images present - "+images.size());
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.partialLinkText("Samsung galaxy s6"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
