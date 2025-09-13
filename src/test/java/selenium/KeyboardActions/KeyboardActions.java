package selenium.KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Ankit");
        Actions actKeyboardActions = new Actions(driver);
        // pressing the Ctrl + A
        actKeyboardActions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        // pressing the Ctrl + C
        actKeyboardActions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        // pressing the tab
        actKeyboardActions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        // pressing the Ctrl + V
        actKeyboardActions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
    }
}
