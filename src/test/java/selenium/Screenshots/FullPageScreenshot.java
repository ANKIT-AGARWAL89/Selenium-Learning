package selenium.Screenshots;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class FullPageScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        TakesScreenshot tS = (TakesScreenshot) driver;
        File sourceFile = tS.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\fullpage.png");
        sourceFile.renameTo(targetFile);
    }
}
