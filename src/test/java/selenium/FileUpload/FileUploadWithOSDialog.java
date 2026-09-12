package selenium.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUploadWithOSDialog {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new ChromeDriver();
        // not able to find website which accept os level upload
        driver.get("");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("upload")).click();

        Robot robot = new Robot();

        // Wait 2 seconds
        robot.delay(2000);
        String filePath = "C:\\Users\\aal419\\Downloads\\64ae6d55-a74b-468b-81ec-8f159312bca9.png";

//      Copy path to clipboard
        StringSelection stringSelection = new StringSelection(filePath);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        // Ctrl + V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
