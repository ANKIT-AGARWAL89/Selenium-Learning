package selenium.shadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// get shadow root as SearchContext and help of shadow root find the actual element

public class ShadowDOM {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dev.automationtesting.in/shadow-dom");
        driver.manage().window().maximize();

        // won't work if trying to access shadow dom directly
       //  System.out.println(driver.findElement(By.cssSelector("#shadow-element")).getText());

        // single shadow DOM
        SearchContext shadowRoot = driver.findElement(By.id("shadow-root")).getShadowRoot();
        WebElement actualElementInsideShadowDom = shadowRoot.findElement(By.cssSelector("#shadow-element"));;
        System.out.println(actualElementInsideShadowDom.getText());

        // nested shadow DOM
        SearchContext shadow0 = driver.findElement(By.id("shadow-root")).getShadowRoot();
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        WebElement actualElementInsideNestedShadowDom = shadow1.findElement(By.cssSelector("#nested-shadow-element"));
        System.out.println(actualElementInsideNestedShadowDom.getText());
    }
}
