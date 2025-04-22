Feature: OCR Error Handling for Corrupted File

  Scenario: Validate error handling in OCR processing for a corrupted file
    Given I am on the file upload page
    When I upload a corrupted file for OCR processing
    Then the system should detect the failure
    And notify the error to the Broker
    And terminate the processing