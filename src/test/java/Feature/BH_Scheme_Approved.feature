Feature: ABCD
  Scenario: BH Approval
    When I launch Chrome browser
    Then I login as a Pm user


    Then I click on master "Master"
    Then i select "Schema Master"
    Then I select "reportType" as "DSA-Scheme"
    Then I select "monthName" as "Apr"
    Then I select "Role" as "DSA"
    Then I select "productName" as "TW"
    Then I select "yearVal" as "2019"
    Then I select "exec_type" as "Monthly"
    Then i click on select file "btn btn-info btn-block"
    Then I click on submit "submitExcel"

