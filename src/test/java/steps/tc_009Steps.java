package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_009Page;

import static org.junit.Assert.assertTrue;
import static utils.TimeUtils.measureExecutionTime;

public class tc_009Steps {
    private tc_009Page uploadPage;

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_está_en_la_página_de_carga_de_archivos() {
        uploadPage = new tc_009Page();
        uploadPage.navigateToUploadPage();
    }

    @When("el usuario sube un archivo de tamaño {int} MB")
    public void el_usuario_sube_un_archivo_de_tamaño_MB(int size) {
        String filePath = uploadPage.getFilePath(size);
        long timeTaken = measureExecutionTime(() -> uploadPage.uploadFile(filePath));
        assertTrue("El archivo de " + size + " MB se cargó en: " + timeTaken + "ms", timeTaken < 2000);
    }

    @Then("el archivo debería cargarse y procesarse en menos de {int} segundos")
    public void el_archivo_debería_cargarse_y_procesarse_en_menos_de_segundos(int seconds) {
        // Already verified in @When step
    }

    @When("el usuario mide el tiempo de respuesta desde la selección hasta la vista previa")
    public void el_usuario_mide_el_tiempo_de_respuesta_desde_la_selección_hasta_la_vista_previa() {
        long responseTime = measureExecutionTime(() -> uploadPage.previewFile());
        assertTrue("El tiempo de respuesta fue: " + responseTime + "ms", responseTime < 1000);
    }

    @Then("el tiempo de respuesta debería ser inferior a {int} segundo para archivos pequeños")
    public void el_tiempo_de_respuesta_debería_ser_inferior_a_segundo_para_archivos_pequeños(int sec) {
        // Already affirmed in @When step
    }
}