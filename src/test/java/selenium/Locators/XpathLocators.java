package selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");

        // Absolute xpath
//        driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/form[1]/input[1]"));

        // Relative xpath
        // //tagname[@attribute='value']
//        driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("1");
        // //*[@attribute='value']
//        driver.findElement(By.xpath("//*[@placeholder='Search store']")).sendKeys("2");

        // xpath with multiple attribute
        // //tagname[@attribute1='value'][@attribute2='value']
//        driver.findElement(By.xpath("//*[@placeholder='Search store'][@aria-label='Search store']")).sendKeys("3");

        // xpath with AND OR -> //tagname[@attribute1='value' and @attribute2='value']
//        driver.findElement(By.xpath("//*[@placeholder='Search store' and @aria-label='Search store']")).sendKeys("and");
//        driver.findElement(By.xpath("//*[@placeholder='Search store' or @aria-label='Search store']")).sendKeys("or");

        // xpath with inner text
        // //tagname[text()='innertextvalue'] Note - Link text can be inner text but all inner text won't be link text
//        driver.findElement(By.xpath("//*[text()='Register']")).click();
        // //tagname[.='innertextvalue']
        driver.findElement(By.xpath("//*[.='Register']")).click();

        // //tagname[contains(@attribute,'substring of value')]
//        driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("contains");

        // //tagname[starts-with(@attribute,'prefix of value')]
//        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("starts-with");

        // chained xpath -> //relative xpath/absolute xpath
//        driver.findElement(By.xpath("//form[@id='small-search-box-form']/input")).sendKeys("chainedxpath");

//        driver.quit();
    }
}
