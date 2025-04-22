package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;
import static org.junit.Assert.*;

public class tc_001Steps {
    WebDriver driver = new ChromeDriver();
    tc_001Page page = new tc_001Page(driver);

    @Given("^El usuario está en la página de carga de documentos$")
    public void navigateToDocumentUploadPage() {
        page.navigateToDocumentUploadPage();
    }

    @When("^El usuario selecciona la opción 'cargar documentos'$")
    public void selectUploadDocumentsOption() {
        page.clickUploadDocumentsOption();
    }

    @Then("^El sistema muestra la opción para carga única y carga múltiple$")
    public void verifyUploadOptionsDisplayed() {
        assertTrue(page.isSingleUploadOptionVisible());
        assertTrue(page.isMultipleUploadOptionVisible());
    }

    @When("^El usuario elige 'carga en un solo archivo'$")
    public void selectSingleFileUpload() {
        page.selectSingleUploadOption();
    }
    
    @Then("^Se habilita un único recuadro para subir el archivo$")
    public void verifySingleFileUploadEnabled() {
        assertTrue(page.isSingleFileUploadEnabled());
    }

    @When("^El usuario elige 'cargar documentos por separado'$")
    public void selectMultipleFileUpload() {
        page.selectMultipleUploadOption();
    }
    
    @Then("^Se muestran múltiples recuadros correspondientes a cada documento requerido$")
    public void verifyMultipleFileUploadEnabled() {
        assertTrue(page.isMultipleFileUploadEnabled());
    }
}