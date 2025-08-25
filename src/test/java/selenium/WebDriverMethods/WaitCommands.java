package selenium.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.function.Function;

public class WaitCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // sleep() - will wait to what it mentioned
//        Thread.sleep(2000);

        // Implicit wait - just mention one time in code & it will take care.
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");

        // Explicit wait -> first condition check if element not found then wait for element
//        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement password = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
//        password.sendKeys("admin123");
//
//        WebElement loginButton = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
//        loginButton.click();

        // Fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(9))
                .pollingEvery(Duration.ofSeconds(3)) // every 3 seconds condition will be checked
                .ignoring(NoSuchElementException.class);

        WebElement userName = fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@placeholder='Username']"));
            }
        });
        userName.sendKeys("Admin");
        driver.quit();
    }
}
