Feature: Validate mandatory documents during upload

  Scenario: User attempts to upload without mandatory documents
    Given the user is on the upload page
    When the user initiates the upload process without a mandatory document
    Then the system should prevent proceeding and display an error message about the missing document