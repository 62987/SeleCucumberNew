Feature: Login Page
  @login
  Scenario: Check Login Page
    When I launch chrome browser
    Then I login as a PM user

    #for LMS File upload***********
    When I go to workflow
    When I go to Update file
    When I Verify Workflow Upload Excel
    When I select File Type
    When I select Month
    When I select Period
    When I select Product Name
    When I select Year
    When I choose Select File
    When I click on submit button
    When I select Reports
    When I Select Batch Management

    #*********Perform Eligiblity after LMS upload********
    Then I click on Eligiblity
    When I Verify Master Error Record
    When I click on Master Error Record

    #************after error records need Required file upload******
    When I go on workflow
    When I go on upload file
    When I choose file type
    When I Choose Month
    When I Choose Period
    When I choose Product Name
    When I choose Year
    #************DSA Cancellation file upload*****************
    When I choose Cancel File
    When I choose Submit
    When I go to report again
    When I go to Batch management
    #*************again perform eligiblity to make count zero********
    When I choose eligiblity
    When i click on view Eligiblity Sheet
    When I select Eligiblity Type in Batch Management
    When I click on Eligiblity Submit Button
    #When I click on Eligiblity Close Button
    When i click on Reports
    When I click on Batch Management
    #****************Perform Incentive Calculation**************
    When i click on incentive
    When I click on Incentive sheet for view
    When I click on Incentive Select Role
    When I click on SUBMIT
    #When I select Close
    #*****************Perform GST Calculation****************
    When I Select Reports  for GST
    When I click on Batch Management for GST
    When I calculate GST
    When I click on View GST Sheet
    #********************Perform Invoice Generation**********
    When I select Reports for Invoice Generation
    When I select Batch Management for Invoice Generation
    When I click on Generate Invoice
    When I click on view invoice

    #***************Target File Upload for TM **********************
    #When I click on Master
    #When I click on Target
    #When I Select File Type for Target
    #When I select Role in Upload Target
    #When I select Product Name in Upload Target
    #When I select Period in Upload Target
    #When I select Fle for Upload Target
    #When I click on submit button for upload Target
    #When I click on Reset in Upload Target


     #When I click on Payment Management


    #***********Close Chrome Browser Window*******************
    When I close the chrome browser








