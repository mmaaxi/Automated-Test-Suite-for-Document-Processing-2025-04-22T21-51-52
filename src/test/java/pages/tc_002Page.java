package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class tc_002Page {
    
    private WebDriver driver;

    @FindBy(id = "fileUploadInput")
    private WebElement fileUploadInput;

    @FindBy(id = "uploadStatus")
    private WebElement uploadStatus;

    @FindBy(id = "filePreview")
    private WebElement filePreview;

    public tc_002Page() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/file-upload");
    }

    public void uploadValidFile(String filePath) {
        fileUploadInput.sendKeys(filePath);
    }

    public boolean isFileUploaded() {
        return uploadStatus.getText().contains("Upload successful");
    }

    public boolean isFilePreviewVisible() {
        return filePreview.isDisplayed() 
                && filePreview.getText().contains("File Name:") 
                && filePreview.getText().contains("File Size:") 
                && filePreview.getText().contains("File Type:");
    }
}