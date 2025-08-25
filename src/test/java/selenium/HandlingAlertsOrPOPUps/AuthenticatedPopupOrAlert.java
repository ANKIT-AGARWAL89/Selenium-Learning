package selenium.HandlingAlertsOrPOPUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopupOrAlert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // syntax :
        // URL - https://admin:admin@the-internet.herokuapp.com/basic_auth
        // Needs to give in automation - https://username:password@the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
