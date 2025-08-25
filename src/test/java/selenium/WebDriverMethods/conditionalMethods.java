package selenium.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        // isDisplayed
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        boolean islogoDisplayed = logo.isDisplayed();
        System.out.println("is logo displayed : " + islogoDisplayed);

        // isEnabled
        WebElement nameBox = driver.findElement(By.id("FirstName"));
        boolean isNameBoxAvailable = nameBox.isEnabled();
        System.out.println("is name box available : " + isNameBoxAvailable);

        // isSelected
        WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
        boolean isMaleSelected = maleRadioButton.isSelected();
        System.out.println("is male radio button selected : " + isMaleSelected);

        driver.findElement(By.id("gender-male")).click();

        WebElement femaleRadioButton = driver.findElement(By.id("gender-female"));
        boolean isFemaleSelected = femaleRadioButton.isSelected();
        System.out.println("is female radio button selected : " + isFemaleSelected);
    }
}
