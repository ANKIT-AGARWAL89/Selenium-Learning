package selenium.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ReadOnlyDatePicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement datePickerLoc = driver.findElement(By.id("txtDate"));
        datePickerLoc.click();

        WebElement selectYear = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select selectYearDropDown = new Select(selectYear);
        selectYearDropDown.selectByVisibleText("2016");

        WebElement selectMonth = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select selectMonthDropDown = new Select(selectMonth);
        selectMonthDropDown.selectByVisibleText("Jan");


        WebElement selectDate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[normalize-space()='1']"));
        selectDate.click();
    }
}
