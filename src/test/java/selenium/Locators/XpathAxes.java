package selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//  element/axis::target
//  element/axis::target[predicate]
//  all this axis can find multiple element
//  ancestor-or-self:: => find self and ancestor
//  descendant includes children, grandchildren, great-grandchildren, etc.
//  descendant-or-self:: => find self and descendant
//  following finds elements that appear after the current element anywhere in the document, excluding descendants.
//  self is useful when XPath expressions are constructed dynamically //*[self::input or self::textarea]
// //div[@id='login']//input and //div[@id='login']/descendant::input are equal

public class XpathAxes {
    public static void main(String[] args) throws InterruptedException {

        By parentLocator1 = By.xpath("//input[@id='username']/parent::div");
        By parentLocator2 = By.xpath("//input[@id='username']/..");
        By childLocator1 = By.xpath("//div[@id='login']/child::label");
        By childLocator2 = By.xpath("//div[@id='login']/label");
        By MultipleChildLocator = By.xpath("//div[@id='login']/child::*");
        By ancestorLocator1 = By.xpath("//input[@id='username']/ancestor::div");
        By ancestorLocator2 = By.xpath("//input[@id='username']/ancestor::div[@id='login']");
        By descendantLocator = By.xpath("//div[@id='login']/descendant::input");
        By followingSiblingLocator = By.xpath("//label[text()='Email']/following-sibling::input");
        By multipleFollowingSiblingLocator = By.xpath("//label[text()='Username']/following-sibling::*");
        By precedingSiblingLocator = By.xpath("//input[@id='username']/preceding-sibling::label");
        By followingLocator = By.xpath("//input[@id='username']/following::input");
        By precedingLocator = By.xpath("//input[@id='password']/preceding::input");
        By selfLocator = By.xpath("//input[@id='password']/self::input");


    }
}
