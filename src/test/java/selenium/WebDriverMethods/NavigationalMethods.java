package selenium.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalMethods {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        // navigate().to() -> can take url as string or object
        // as string
        driver.navigate().to("https://demo.nopcommerce.com/");
        // as object
//        URL myUrl = new URL("https://demo.nopcommerce.com/");
//        driver.navigate().to(myUrl);

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // navigate().back()
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        // navigate().forward()
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        // navigate().refresh()
        driver.navigate().refresh();
    }
}
