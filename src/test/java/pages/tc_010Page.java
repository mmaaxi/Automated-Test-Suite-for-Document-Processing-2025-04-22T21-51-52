package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    private WebDriver driver;
    private By documentUploadButton = By.id("uploadButton");
    private By processButton = By.id("processButton");
    private By slipGeneratedMessage = By.id("slipGenerated");
    private By historyStorageConfirmation = By.id("historyConfirmation");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadDocuments() {
        driver.findElement(documentUploadButton).click();
        // Code to upload documents
    }

    public void processDocuments() {
        driver.findElement(processButton).click();
        // Code to process documents
    }

    public boolean isSlipGenerated() {
        return driver.findElement(slipGeneratedMessage).isDisplayed();
    }

    public boolean isDataStoredInHistory() {
        return driver.findElement(historyStorageConfirmation).isDisplayed();
    }
}