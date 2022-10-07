Feature: XYZ
    Scenario:check flow
        When I launch Chrome browser
        Then I login as a Pm user

    #for LMS File upload***********
        When i click on "Workflow"
        Then i select "Upload File"
        Then I select "reportType" as "LMS Upload"
        Then I select "monthName" as "Jul"
        Then I select "exec_type" as "Monthly"
        Then I select "productName" as "TW"
        Then I select "yearVal" as "2020"
        Then I clicked on select file for LMS upload "btn btn-info btn-block"
        Then I click on submit "submitExcel"
        When i click on "Reports"
        Then i select "Batch Management"

    #*********Perform Eligiblity after upload LMS ********
        When I clicked on " checkEligibility"

        When I Verify Master Error Record
        Then i select "2"
        When I click on Master Error Record


    #************after error records need Required file upload******
        When i click on "Workflow"
        Then i select "Upload File"
        Then I select "reportType" as "Cancellation Upload"
        Then I select "monthName" as "Jul"
        Then I select "exec_type" as "Monthly"
        Then I select "productName" as "TW"
        Then I select "yearVal" as "2019"

































































