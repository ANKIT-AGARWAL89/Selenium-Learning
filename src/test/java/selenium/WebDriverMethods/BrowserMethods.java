package selenium.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.partialLinkText("OrangeHRM")).click();

        Set<String> windowIds = driver.getWindowHandles();

        //Approch-1 to use windowhandles
//        List<String> windowIdsList = new ArrayList<>(windowIds);
//        String parentWindowId = windowIdsList.get(0);
//        String childWindowId = windowIdsList.get(1);
//        driver.switchTo().window(childWindowId);
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(parentWindowId);
//        System.out.println(driver.getTitle());

        //Approch-2 to use windowhandles
        for (String id : windowIds) {
            String title = driver.switchTo().window(id).getTitle();
            if (title.equals("OrangeHRM"))
                driver.close();
        }

        // close() -> close the browser on which driver is focused
//        driver.close();

        // quit() -> close the all browser
//        driver.quit();
    }
}
