package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_005Page;
import static org.junit.Assert.*;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page uploadPage;

    @Given("the user is on the upload page")
    public void the_user_is_on_the_upload_page() {
        driver = // Initialize the WebDriver (e.g., new ChromeDriver())
        driver.get("http://example.com/upload");
        uploadPage = PageFactory.initElements(driver, tc_005Page.class);
    }

    @When("the user initiates the upload process without a mandatory document")
    public void the_user_initiates_the_upload_without_mandatory_document() {
        uploadPage.clickUploadButtonWithoutMandatoryDocument();
    }

    @Then("the system should prevent proceeding and display an error message about the missing document")
    public void the_system_should_display_error_message_about_missing_document() {
        assertTrue(uploadPage.isErrorMessageDisplayed());
        driver.quit();
    }
}