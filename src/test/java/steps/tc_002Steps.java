package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;
import pages.tc_002Page;

public class tc_002Steps {

    private tc_002Page page;

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_archivos() {
        page = new tc_002Page();
        page.navigateToFileUploadPage();
    }

    @When("el usuario selecciona un archivo PDF/DOCX dentro del límite de 50 MB")
    public void el_usuario_selecciona_un_archivo_valido() {
        page.uploadValidFile("path/to/valid/file.pdf");
    }

    @Then("el archivo se carga exitosamente")
    public void el_archivo_se_carga_exitosamente() {
        assertTrue(page.isFileUploaded());
    }

    @Then("se muestra la vista previa del archivo con nombre, tamaño y tipo")
    public void se_muestra_la_vista_previa_del_archivo() {
        assertTrue(page.isFilePreviewVisible());
    }
}