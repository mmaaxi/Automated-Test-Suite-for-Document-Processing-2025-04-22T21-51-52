package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_003Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page;

    @Given("Estoy en la página de carga de archivos")
    public void estoy_en_la_página_de_carga_de_archivos() {
        page = new tc_003Page(driver);
        page.navigateToUploadPage();
    }

    @When("Intento subir un archivo con formato no permitido o tamaño mayor a 50 MB")
    public void intento_subir_un_archivo_con_formato_no_permitido_o_tamaño_mayor_a_50_Mb() {
        page.uploadInvalidFile();
    }

    @Then("Veo un mensaje de error indicando formato inválido o tamaño excedido")
    public void veo_un_mensaje_de_error_indicando_formato_inválido_o_tamaño_excedido() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }
}