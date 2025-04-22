package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

public class tc_004Steps {

    private WebDriver driver;
    private tc_004Page page;

    public tc_004Steps() {
        // Initialize WebDriver and Page Object
        // driver = new WebDriverManager().getDriver();
        page = new tc_004Page(driver);
    }

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_archivos() {
        page.navigateToUploadPage();
    }

    @When("el usuario sube un archivo comprimido con múltiples documentos")
    public void el_usuario_sube_un_archivo_comprimido_con_multiples_documentos() {
        page.uploadCompressedFile("path/to/compressedfile.zip");
    }

    @Then("el sistema debe descomprimir el archivo")
    public void el_sistema_debe_descomprimir_el_archivo() {
        Assert.assertTrue(page.isFileDecompressed());
    }

    @Then("listar cada documento para su validación")
    public void listar_cada_documento_para_su_validacion() {
        Assert.assertTrue(page.areAllDocumentsListed());
    }
}