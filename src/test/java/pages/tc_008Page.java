package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_008Page {
    WebDriver driver;

    By uploadInput = By.id("uploadElementId");
    By fileList = By.id("fileListId");
    By deleteButton = By.xpath("//button[contains(text(),'Eliminar')]");
    
    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarArchivo(String nombreArchivo) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("ruta_del_archivo/" + nombreArchivo);
    }

    public boolean verificarVistaPreviaArchivo(String nombreArchivo, String tipo) {
        String archivoDetalles = driver.findElement(fileList).getText();
        return archivoDetalles.contains(nombreArchivo) && archivoDetalles.contains(tipo);
    }

    public boolean archivoEnLista(String nombreArchivo) {
        WebElement listaDeArchivos = driver.findElement(fileList);
        return listaDeArchivos.getText().contains(nombreArchivo);
    }

    public void eliminarArchivo(String nombreArchivo) {
        WebElement elementoArchivo = driver.findElement(By.xpath("//li[contains(text(),'" + nombreArchivo + "') and //button[contains(text(),'Eliminar')]]"));
        elementoArchivo.findElement(deleteButton).click();
    }
}