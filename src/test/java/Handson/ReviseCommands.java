package Handson;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.function.Function;

public class ReviseCommands {
    public static void main(String[] args) {
        // driver initialization
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Searching WebElement by findElement method
        WebElement element = driver.findElement((By.id("")));
        // storing locator in a variable
        By locator = By.id("");

        // get commands

        // to open a url
        driver.get("https://testautomationpractice.blogspot.com/");
        // to get the title of the page
        driver.getTitle();
        // to get the current url
        driver.getCurrentUrl();
        // to get the page source
        driver.getPageSource();
        // to get the class
        driver.getClass();
        // to get the current window handle
        driver.getWindowHandle();
        // to get all the window handles
        driver.getWindowHandles();

        // Navigation methods

        // to navigate to a url
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        // to refresh the page
        driver.navigate().refresh();
        // to navigate forward
        driver.navigate().forward();
        // to navigate back
        driver.navigate().back();

        // Conditional methods

        // e.g.- logo is displayed or not
        element.isDisplayed();
        // e.g.- Checkbox, radio button is selected or not
        element.isSelected();
        // e.g.- email input box is enabled or not
        element.isEnabled();

        // Wait Commands

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Explicit Wait
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        //fluent wait with custom settings
        Wait<WebDriver> fluentWait = new FluentWait<>(driver).pollingEvery(Duration.ofSeconds(2)).withTimeout(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class);
        WebElement element2 = fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(locator);
            }
        });

        // Alerts

        // Switching the driver on alert
        Alert alert = driver.switchTo().alert();
        // Normal JS Alert/JS Confirm Alert
        alert.accept();
        // JS dismiss Alert
        alert.dismiss();
        // Prompt alert
        alert.sendKeys("Ankit");
        // Switching the driver on alert via explicit wait
        Alert alert1 = explicitWait.until(ExpectedConditions.alertIsPresent());
        // get the text of the alert
        String alertText = alert.getText();

        // Authentication POPUP Alert (username:password@)
        driver.get("https://username:password@testautomationpractice.blogspot.com/");


        // Screenshot

        // Full Screen Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotLocation = new File(System.getProperty("user.dir") + "/screenshot.png");
        file.renameTo(screenshotLocation);
        // element specific Screenshot
        // specific element ss e.g - logo
        File logo = element.getScreenshotAs(OutputType.FILE);
        File screenshotLocationforLogo = new File(System.getProperty("user.dir") + "/logo.png");
        logo.renameTo(screenshotLocationforLogo);
    }
}
