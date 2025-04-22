package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_005Page {
    WebDriver driver;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "errorMessage")
    WebElement errorMessage;

    public tc_005Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButtonWithoutMandatoryDocument() {
        // Ensure no document is uploaded
        uploadButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }
}