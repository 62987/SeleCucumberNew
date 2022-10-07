Feature:Calculate Incentive,GST and Invoice
  @login

  Scenario: Check Login Page
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

    #************Upload DSA Scheme file**************
    #Then i verify DSA scheme "viewMasterDetailsTD"
    Then i verify Dsa scheme
    Then i upload DSA scheme ""



    #************after error records need Required file upload******
    When i click on "Workflow"
    Then i select "Upload File"
    Then I select "reportType" as "Cancellation Upload"
    Then I select "monthName" as "Jul"
    Then I select "exec_type" as "Monthly"
    Then I select "productName" as "TW"
    Then I select "yearVal" as "2019"



    #************DSA Cancellation file upload*****************
    Then I clicked on select file for cancellation file "btn btn-info btn-block"
    Then I click on submit "submitExcel"
    When i click on "Reports"
    Then i select "Batch Management"
    #*************again perform eligiblity to make count zero********
    When I clicked on "checkEligibility"
    Then I click on Eligibility Sheet "holdJob"
    Then I select eligibility role "form-control ng-pristine ng-valid ng-empty ng-touched" as "SE Eligibility"
    Then I click on submit button "btn btn-primary"
    #When I click on Eligiblity Close Button
    When i click on "Reports"
    Then i select "Batch Management"

    #****************Perform Incentive Calculation**************
    When I clicked on " calculateIncentive"
    When I clicked on " IncentiveModel"
    Then I select eligibility role "form-control ng-pristine ng-untouched ng-valid ng-empty" as "SE Incentive"

    When I click on SUBMIT
    #When I select Close
    #*****************Perform GST Calculation****************
    When i click on "Reports"
    Then i select "Batch Management"
    When I clicked on " downloadPDF1"
    Then I click on View GST sheet " viewGSTDetails"
    #********************Perform Invoice Generation**********
    When i click on "Reports"
    Then i select "Batch Management"
    When I clicked on " generateInvoice"
    Then I click on View GST sheet " viewInvoiceDetails"

    #***********Close Chrome Browser Window*******************
    When I close the Chrome browser