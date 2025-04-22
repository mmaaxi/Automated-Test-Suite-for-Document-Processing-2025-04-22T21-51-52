package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page page = PageFactory.initElements(driver, tc_008Page.class);

    @Given("que el usuario abre la aplicación de carga de archivos")
    public void abrirAplicacionDeCargaDeArchivos() {
        driver.get("url_de_la_aplicacion");
    }

    @When("el usuario sube el archivo {string}")
    public void subirArchivo(String archivo) {
        page.cargarArchivo(archivo);
    }

    @Then("el sistema muestra el nombre {string}, el tamaño y el tipo PDF del archivo")
    public void validarVistaPrevia(String nombreArchivo) {
        Assert.assertTrue(page.verificarVistaPreviaArchivo(nombreArchivo, "PDF"));
    }

    @Given("el archivo {string} fue subido")
    public void archivoFueSubido(String archivo) {
        Assert.assertTrue(page.archivoEnLista(archivo));
    }

    @When("el usuario selecciona la opción de eliminar para el archivo {string}")
    public void eliminarArchivo(String archivo) {
        page.eliminarArchivo(archivo);
    }

    @Then("el archivo {string} se elimina correctamente de la lista antes de la confirmación")
    public void validarEliminacionArchivo(String archivo) {
        Assert.assertFalse(page.archivoEnLista(archivo));
    }
}