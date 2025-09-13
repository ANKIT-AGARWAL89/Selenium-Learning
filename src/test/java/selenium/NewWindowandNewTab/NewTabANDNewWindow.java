package selenium.NewWindowandNewTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabANDNewWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://flowcv.com/");

        // part of selenium 4

        // 2nd link will render on new tab but same window
//        driver.switchTo().newWindow(WindowType.TAB);
        // 2nd link will render on different window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://testautomationpractice.blogspot.com/");
    }
}
