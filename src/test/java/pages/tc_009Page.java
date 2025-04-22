package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverProvider;

public class tc_009Page {

    private WebDriver driver;

    public tc_009Page() {
        this.driver = DriverProvider.getDriver();
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload"); // URL de la página de carga
    }

    public String getFilePath(int sizeMB) {
        // Returns a mock path based on size, you might want to dynamically create files
        return "path/to/mock/file_" + sizeMB + "MB.txt";
    }

    public void uploadFile(String filePath) {
        WebElement uploadField = driver.findElement(By.id("file-upload"));
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        
        uploadField.sendKeys(filePath);
        uploadButton.click();
    }

    public void previewFile() {
        WebElement previewButton = driver.findElement(By.id("preview-button"));
        previewButton.click();
    }
}