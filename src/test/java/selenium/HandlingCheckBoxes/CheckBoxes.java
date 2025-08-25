package selenium.HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // select a check box
//        WebElement mondayCheckbox = driver.findElement(By.xpath("//input[@id='monday']"));
//        mondayCheckbox.click();
//        System.out.println("Is monday check box selected : "+mondayCheckbox.isSelected());

        // select all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
//        for (WebElement checkBox : checkBoxes) {
//            checkBox.click();
//        }

        // select last 3 boxes
        for (int i = checkBoxes.size()-3; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
        }

        // unselect the selected checkboxes
        for (WebElement checkBox: checkBoxes){
            if (checkBox.isSelected()){
                checkBox.click();
            }
        }
    }
}
