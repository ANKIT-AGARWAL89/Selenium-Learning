package selenium.Screenshots;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class SpecificAreaOfPageScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Webelement.takescreenshot()
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourceFile = logo.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\logo.png");
        sourceFile.renameTo(targetFile);
    }
}
