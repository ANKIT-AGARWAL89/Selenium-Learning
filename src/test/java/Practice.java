import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.HashSet;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\aal419\\Downloads\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://dthing04e05.bskyb.com/cbs-hss-inventory-batch/");
        driver.findElement(By.xpath("//small[contains(normalize-space(), '@sky.uk')]")).click();

    }
}
