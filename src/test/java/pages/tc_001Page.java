package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    By uploadDocumentsOption = By.id("upload-documents");
    By singleUploadOption = By.id("single-upload");
    By multipleUploadOption = By.id("multiple-upload");
    By singleFileUploadBox = By.id("single-file-upload");
    By multipleFilesUploadBoxes = By.cssSelector(".multiple-upload-boxes");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("https://example.com/document-upload");
    }

    public void clickUploadDocumentsOption() {
        driver.findElement(uploadDocumentsOption).click();
    }

    public boolean isSingleUploadOptionVisible() {
        return driver.findElement(singleUploadOption).isDisplayed();
    }

    public boolean isMultipleUploadOptionVisible() {
        return driver.findElement(multipleUploadOption).isDisplayed();
    }

    public void selectSingleUploadOption() {
        driver.findElement(singleUploadOption).click();
    }

    public boolean isSingleFileUploadEnabled() {
        return driver.findElement(singleFileUploadBox).isDisplayed();
    }

    public void selectMultipleUploadOption() {
        driver.findElement(multipleUploadOption).click();
    }

    public boolean isMultipleFileUploadEnabled() {
        return driver.findElement(multipleFilesUploadBoxes).isDisplayed();
    }
}