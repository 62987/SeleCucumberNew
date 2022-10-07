Feature: Calculate Direct Incentive for DSA
  @loginToHeropayout

  Scenario:Direct Incentive
    When I launch Chrome browser for direct incentive
    Then I login as PMTW user
    Then I click on workflow
    Then I click on upload file
    Then I select New Incetive File
    Then I select Month for new incentive
    Then I select period for new incentive
    Then I select Product Name for new incentive
    Then I select Year for new incentive
    Then I upload new incentive file
    Then i click on submit button
    Then i click on reports for direct incentive
    Then i click on batch management
    Then i click on calculate GST button
    Then i click on view GST sheet

    Then i click on reports for direct incentive
    Then i click on batch management
    Then i click on invoice generation button
    Then i click on view invoice sheet

    Then i close the chrome browser










