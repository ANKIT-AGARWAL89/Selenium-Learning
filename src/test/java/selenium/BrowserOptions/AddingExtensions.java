package selenium.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

public class AddingExtensions {
    public static void main(String[] args) {

//        First need to download crx type of a plugin and and that file path in selenium code

        ChromeOptions options = new ChromeOptions();
        File selectorHubCrxfile = new File("C:\\Users\\aal419\\Downloads\\SelectorsHub-Chrome-Web-Store.crx");
//        File selectorHubCrxfile = new File(System.getProperty("user.dir") + "\\src\\test\\java\\selenium\\BrowserOptions\\SelectorsHub-Chrome-Web-Store.crx");
        options.addExtensions(selectorHubCrxfile);
//        options.addArguments("load-extension=" + System.getProperty("user.dir") + "src/test/java/selenium/BrowserOptions/SelectorsHub-Chrome-Web-Store.crx");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }
}
