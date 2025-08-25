package selenium.HandlingAlertsOrPOPUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TypesOfAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Alert myAlert = driver.switchTo().alert();
        // myAlert.accept()
        // myAlert.dismiss()
        // myAlert.getText()
        // myAlert.sendKeys("")


        // JS Normal Alert
//        WebElement normalAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
//        normalAlert.click();
//        Alert myAlert = driver.switchTo().alert();
//        System.out.println(myAlert.getText());
//        myAlert.accept();
//        WebElement normalAlertValidation = driver.findElement(By.xpath("//p[normalize-space()='You successfully clicked an alert']"));
//        System.out.println("Is normal alert accepted : " + normalAlertValidation.isDisplayed());

        // JS Confirm Alert
        // dismal of the alert
//        WebElement confirmAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
//        confirmAlert.click();
//        Alert myJsConfirmAlert = driver.switchTo().alert();
//        System.out.println(myJsConfirmAlert.getText());
//        myJsConfirmAlert.dismiss();   // to cancel the alert (not accepting)
//        WebElement confirmAlertDismissValidation = driver.findElement(By.xpath("//p[normalize-space()='You clicked: Cancel']"));
//        System.out.println("is dismissal of alert done ? "+confirmAlertDismissValidation.isDisplayed());
        // acceptance of the alert
//        myJsConfirmAlert.accept();
//        WebElement confirmAlertAcceptValidation = driver.findElement(By.xpath("//p[normalize-space()='You clicked: Ok']"));
//        System.out.println("is acceptance of alert done ? " + confirmAlertAcceptValidation.isDisplayed());

        // JS Prompt Alert
//        WebElement promptAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
//        promptAlert.click();
//        Alert myJspromptAlert = driver.switchTo().alert();
//        System.out.println(myJspromptAlert.getText());
//        String prompt = "Ankit prompt";
//        myJspromptAlert.sendKeys(prompt);
//        myJspromptAlert.accept();
        // validation
//        WebElement promptAlertAcceptValidation = driver.findElement(By.xpath("//p[@id='result']"));
//        String actualPrompt = promptAlertAcceptValidation.getText();
//        String expectedPrompt = "You entered: " + prompt;
//        if (expectedPrompt.equals(actualPrompt))
//            System.out.println("Prompt passed correctly reflected on UI");

        // switching to driver via explicit wait - without using  driver.switchTo().alert();
        WebElement normalAlertViaExplicitWait = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
        normalAlertViaExplicitWait.click();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        Alert alertViaExplicitWait = myWait.until(ExpectedConditions.alertIsPresent());
        alertViaExplicitWait.accept();
    }
}
