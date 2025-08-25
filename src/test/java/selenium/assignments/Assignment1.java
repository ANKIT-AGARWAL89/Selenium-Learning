package selenium.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        if (driver.getTitle().equals("nopCommerce demo store. Home page title"))
            System.out.println("match");
        else
            System.out.println("not matched");
        driver.quit();
    }

}
