package selenium.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

import java.time.Duration;

// Actions (class) → Used to create a chain of multiple actions. (to Perform)
// Action (interface) → Represents the final built action that can be executed. (to Build)

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice-automation.com/hover/");
        driver.manage().window().maximize();
        WebElement mouseHoverLocation = driver.findElement(By.xpath("//h3[@id='mouse_over']"));
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        // build -> Create an action  // moveToElement method to Hover the mouse
        Action mouseHoverDone = act.moveToElement(mouseHoverLocation).build();
        // perform -> perform the action
        mouseHoverDone.perform();
        System.out.println(mouseHoverLocation.getText());
    }
}
