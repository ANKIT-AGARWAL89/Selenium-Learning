package selenium.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
    driver.switchTo().frame(WebElement);
    driver.switchTo().frame(Name or ID);
    driver.switchTo().frame(index);
    driver.switchTo().defaultContent();  // Goes directly to the main page.
    driver.switchTo().parentFrame();    //  Goes only one level up.

*/
public class Frame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // switching to the frame by frame element
        WebElement frameElement = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frameElement);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Ankit");

        // come out from frame
        driver.switchTo().defaultContent();

        // switching to another frame
        WebElement frameElement2 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frameElement2);
        // switching to nested iframe via index
        driver.switchTo().frame(0); // bcz one iframe we have so obvious index is zero
        WebElement radioButton = driver.findElement(By.xpath("//div[@id='i6']//div[@class='rseUEf nQOrEb']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",radioButton);
    }
}
