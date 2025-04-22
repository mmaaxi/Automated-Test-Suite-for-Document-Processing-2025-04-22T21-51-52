package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_006Steps {

    WebDriver driver = new ChromeDriver();
    tc_006Page page = new tc_006Page(driver);

    @Given("El usuario está en la página de carga de documentos")
    public void usuarioEnPaginaDeCargaDeDocumentos() {
        page.navigateToUploadPage();
    }

    @When("El usuario sube un documento estructurado")
    public void usuarioSubeDocumentoEstructurado() {
        page.uploadStructuredDocument();
    }
    
    @When("El usuario sube un documento no estructurado")
    public void usuarioSubeDocumentoNoEstructurado() {
        page.uploadUnstructuredDocument();
    }

    @Then("El sistema procesa los documentos con OCR")
    public void sistemaProcesaDocumentosConOCR() {
        page.verifyOCRProcessing();
    }

    @Then("El sistema extrae los datos correctamente")
    public void sistemaExtraeDatosCorrectamente() {
        page.verifyDataExtraction();
    }

    @Then("El sistema muestra la información para confirmación")
    public void sistemaMuestraInformacionParaConfirmacion() {
        page.verifyDataDisplayForConfirmation();
    }
}