package steps;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;

public class tc_010Steps {
    private WebDriver driver;
    private tc_010Page page;

    public tc_010Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc_010Page(driver);
    }

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        page.openDocumentUploadPage();
    }

    @When("I complete the document upload and processing")
    public void i_complete_the_document_upload_and_processing() {
        page.uploadDocuments();
        page.processDocuments();
    }

    @Then("the system generates the 'Slip de salida'")
    public void the_system_generates_the_slip_de_salida() {
        assertTrue(page.isSlipGenerated());
    }

    @Then("it stores both the original documents and extracted data in the request history")
    public void it_stores_both_the_original_documents_and_extracted_data_in_the_request_history() {
        assertTrue(page.isDataStoredInHistory());
    }
}