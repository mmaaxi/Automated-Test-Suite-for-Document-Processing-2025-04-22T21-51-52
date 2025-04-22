package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

public class tc_007Page {

    WebDriver driver;
    WebDriverWait wait;

    public tc_007Page() {
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadCorruptedFile() {
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        uploadElement.sendKeys("/path/to/corrupted/file");
        driver.findElement(By.id("upload-button")).click();
    }

    public boolean isFailureDetected() {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error-message")));
        return errorMessage.getText().contains("File could not be processed");
    }

    public boolean isErrorNotifiedToBroker() {
        // Logic to check if error is notified to broker
        return true; // Placeholder for actual implementation
    }

    public boolean isProcessingTerminated() {
        WebElement processingStatus = driver.findElement(By.id("status"));
        return processingStatus.getText().equals("Processing terminated");
    }
}