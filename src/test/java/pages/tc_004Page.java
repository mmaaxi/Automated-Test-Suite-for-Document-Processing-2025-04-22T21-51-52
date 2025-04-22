package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tc_004Page {

    private WebDriver driver;

    // Locators
    private By uploadButton = By.id("uploadButton");
    private By uploadedFilesList = By.id("uploadedFilesList");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadCompressedFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath); // This depends on the implementation, could need a file chooser interaction
    }

    public boolean isFileDecompressed() {
        // Logic to verify if the file has been decompressed
        // For example, checking if the number of listed files is greater than 1
        return driver.findElements(uploadedFilesList).size() > 1;
    }

    public boolean areAllDocumentsListed() {
        // Verify if all expected documents are listed;
        List<WebElement> files = driver.findElements(uploadedFilesList);
        // Placeholder: Should check for actual file names
        return files.size() > 0;
    }
}