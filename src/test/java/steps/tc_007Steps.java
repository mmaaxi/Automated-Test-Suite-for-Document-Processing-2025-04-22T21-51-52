package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        page.navigateToFileUploadPage();
    }

    @When("I upload a corrupted file for OCR processing")
    public void i_upload_a_corrupted_file_for_ocr_processing() {
        page.uploadCorruptedFile();
    }

    @Then("the system should detect the failure")
    public void the_system_should_detect_the_failure() {
        Assert.assertTrue(page.isFailureDetected());
    }

    @Then("notify the error to the Broker")
    public void notify_the_error_to_the_Broker() {
        Assert.assertTrue(page.isErrorNotifiedToBroker());
    }

    @Then("terminate the processing")
    public void terminate_the_processing() {
        Assert.assertTrue(page.isProcessingTerminated());
    }
}