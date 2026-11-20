package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class MyntraAutomation {
    public static void main(String[] args) {

//        Myntra E2E Automation Steps
//        Launch Myntra
//        Open Myntra application/website.
//                Verify the home page is displayed.
//                Search Product
//        Click the search box.
//        Enter "shirt".
//                Press Enter/Search.
//                Verify search results are displayed.
//        Select Product
//        Select a shirt from the search results.
//                Verify the product details page is displayed.
//        Capture:
//        Product name
//        Product price
//        Discount, if applicable
//                Size
//        Add Product to Bag
//        Select the required size.
//        Click Add to Bag.
//        Navigate to the bag/cart.
//                Set Quantity = 2
//        Increase the product quantity to 2.
//        Verify quantity is displayed as 2.
//        Verify Product in Cart
//        Verify the product name matches the selected product.
//        Verify the size matches the selected size.
//                Verify quantity = 2.
//
//        Validate Price
//
//        Capture the product price from the product page.
//        Calculate expected price:
//
//        Expected subtotal = Unit price × Quantity
//
//        Example:
//
//        ₹1,000 × 2 = ₹2,000
//
//        Validate Discount
//        If a discount is applicable, capture the discount.
//        Calculate the expected discounted amount.
//                Compare it with the discount shown in the cart.
//        Validate Taxes/Charges
//        Capture applicable taxes/other charges.
//                Calculate/verify the expected charges against the cart/order summary.
//        Validate Final Amount
//        Verify:
//
//        Final Amount = Subtotal − Discount + Taxes + Applicable Charges
//
//        Compare the calculated amount with the total amount displayed in the cart.
//        Assertions
//        Product name → Expected = Actual
//        Size → Expected = Actual
//        Quantity → 2
//        Unit price → Expected = Actual
//        Discount → Expected = Actual
//        Tax/charges → Expected = Actual
//        Final amount → Expected = Actual


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.myntra.com/");

        WebElement searchInputBox = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
        searchInputBox.sendKeys("shirt");

        searchInputBox.sendKeys(Keys.ENTER);

//        WebElement searchButton = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
//        searchButton.click();

        WebElement shirt_Loc = driver.findElement(By.xpath("//li[contains(@class,'product-base')][3]"));
        shirt_Loc.click();

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String winId : windowHandles) {
            if (!winId.equals(parentWindow)) {
                driver.switchTo().window(winId);
            }
        }
        WebElement size_button = driver.findElement(By.xpath("//p[text()='40']"));
        size_button.click();

        WebElement add_bag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
        add_bag.click();

//        WebElement go_to_bag_button = driver.findElement(By.xpath("//span[text()='GO TO BAG']"));
//        go_to_bag_button.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='GO TO BAG']"))).click();

        WebElement quantity_option = driver.findElement(By.xpath("//span[starts-with(normalize-space(),'Qty')]"));
        quantity_option.click();
        int quantity = 4;
        WebElement quantityyyy = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dialogs-base-display'][normalize-space()='" + quantity + "']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", quantityyyy);
    }
}
