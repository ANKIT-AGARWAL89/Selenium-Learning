package selenium.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // get the element of dropdown to pass in Select class to create
        WebElement SingleSelectLoc = driver.findElement(By.xpath("//select[@id='country']"));
        Select singleSelectDropDown = new Select(SingleSelectLoc);

//         select by visible text
        singleSelectDropDown.selectByVisibleText("United Kingdom");
//         select by index (starts with 0)
//        singleSelectDropDown.selectByIndex(2);
//         select by value
//        singleSelectDropDown.selectByValue("uk");

        // print all the options
        List<WebElement> dropDownoptions = singleSelectDropDown.getOptions();
        for (WebElement option : dropDownoptions) {
            System.out.println(option.getText());
        }

        // Multiple select drop down
        WebElement multiSelectLoc = driver.findElement(By.xpath("//select[@id='colors']"));
        Select multiSelectDropDown = new Select(multiSelectLoc);
        multiSelectDropDown.selectByVisibleText("Red");
        multiSelectDropDown.selectByVisibleText("Green");
        List<WebElement> choosedoptions = multiSelectDropDown.getAllSelectedOptions();
        for (WebElement option : choosedoptions) {
            System.out.println(option.getText());
        }
        // deselect all the option
        multiSelectDropDown.deselectAll();

        // check dropdown supports multiple selections
        System.out.println(singleSelectDropDown.isMultiple());
        System.out.println(multiSelectDropDown.isMultiple());

        driver.quit();
    }
}
