package selenium.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploading {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // single file upload
        WebElement locationToUploadSingleFile = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
        WebElement singleFileuploadButton = driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']"));
        locationToUploadSingleFile.sendKeys(System.getProperty("user.dir") + "\\src\\test\\java\\selenium\\FileUpload\\Pic1.png");
        singleFileuploadButton.click();

        // multiple file upload
        WebElement locationToUploadMultipleFile = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
        WebElement multipleFileuploadButton = driver.findElement(By.xpath("//button[normalize-space()='Upload Multiple Files']"));
        String file1 = "C:\\Users\\aal419\\IdeaProjects\\Selenium-SDET_QA_PAVANTutorial\\src\\test\\java\\selenium\\FileUpload\\Pic1.png";
        String file2 = "C:\\Users\\aal419\\IdeaProjects\\Selenium-SDET_QA_PAVANTutorial\\src\\test\\java\\selenium\\FileUpload\\Pic2.png";
        locationToUploadMultipleFile.sendKeys(file1+"\n"+file2);
        multipleFileuploadButton.click();
    }
}
