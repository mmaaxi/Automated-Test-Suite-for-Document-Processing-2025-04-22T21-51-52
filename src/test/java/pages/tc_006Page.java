package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadStructuredDocument() {
        driver.findElement(By.id("structured-upload")).sendKeys("/path/to/structured/document");
    }

    public void uploadUnstructuredDocument() {
        driver.findElement(By.id("unstructured-upload")).sendKeys("/path/to/unstructured/document");
    }

    public void verifyOCRProcessing() {
        // Add verification logic for OCR processing
    }

    public void verifyDataExtraction() {
        // Add verification logic for data extraction
    }

    public void verifyDataDisplayForConfirmation() {
        // Add verification logic to confirm data display
    }
}