package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadInvalidFile() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.sendKeys("/path/to/invalid/large-file.extension");
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}