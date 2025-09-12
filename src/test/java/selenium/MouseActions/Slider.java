package selenium.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        WebElement minSliderCurrentLocation = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
        WebElement maxSliderCurrentLocation = driver.findElement(By.xpath("//div[@id='HTML7']//span[2]"));
        // getting the current coordinate of slider min and max point
        System.out.println(minSliderCurrentLocation.getLocation()); // (846, 2021)
        System.out.println(maxSliderCurrentLocation.getLocation()); // (976, 2021)
        Actions actSlideBar = new Actions(driver);
        // draging minslide and dropping at currentlocation+100
        actSlideBar.dragAndDropBy(minSliderCurrentLocation, 100, 0).perform();
        // draging maxslide and dropping at currentlocation-20
        actSlideBar.dragAndDropBy(maxSliderCurrentLocation,-20,0).perform();
    }
}
