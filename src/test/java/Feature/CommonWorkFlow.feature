Feature: common workflow
  Scenario: Check whether file is upload or not
When I launch Chrome browser
Then I login as a Pm user
When i click on "Workflow"
Then i select "Upload File"
Then I select "reportType" as "LMS Upload"
Then I select "monthName" as "Jul"
Then I select "exec_type" as "Monthly"
Then I select "productName" as "TW"
Then I select "yearVal" as "2020"
Then I clicked on select file for LMS upload "btn btn-info btn-block"
Then I click on submit "submitExcel"
    When I close the Chrome browser