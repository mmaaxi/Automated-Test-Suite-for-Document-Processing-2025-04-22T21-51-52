Feature: Validate the generation of 'Slip de salida' and storage in history

  Scenario: Verify document upload and processing
    Given I am on the document upload page
    When I complete the document upload and processing
    Then the system generates the 'Slip de salida'
    And it stores both the original documents and extracted data in the request history