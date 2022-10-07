Feature:Calculate Incentive,GST and Invoice
  @loginToHeropayout
  Scenario: Check when master error record is one
    When I launch Chrome browser
    Then I login as a Pm user
    #-------------------for LMS File upload---------------#
    When I go to Workflow
    When I go to Update File
    When I Verify Workflow Upload Excel
    When I Select File Type
    When I Select Month
    When I Select Period
    When I Select Product Name
    When I Select Year
    When I choose select File
    When I click on Submit button
    #--------------Perform Eligiblity after upload LMS-----------#
    When I Select Reports
    When I select Batch Management
    Then I click on Eligiblity
    #When I Verify Master Error Record
    When I Verify Master Error Record as 1
    When I click on Master Error Record
    #--------------After Error Records need Required file upload-----------#
    When I go on workflow
    When I go on upload file
    When I choose file type
    When I Choose Month
    When I Choose Period
    When I choose Product Name
    When I choose Year
    #--------------------DSA Cancellation file upload-----------#
    When I choose Cancel File
    When I choose Submit
    When I go to report again
    When I go to Batch management
    #------------------Again perform eligiblity to make count zero-----------#
    When I choose eligiblity
    When i click on view Eligiblity Sheet
    When I select Eligiblity Type in Batch Management
    When I click on Eligiblity Submit Button
    #When I click on Eligiblity Close Button

    #---------------Perform Incentive Calculation---------------#
    When i click on Reports
    When I click on Batch Management
    When i click on incentive
    When I click on Incentive sheet for view
    When I click on Incentive Select Role
    When I click on SUBMIT
    #When I select Close

    #---------------Perform GST Calculation---------------#
    When I Select Reports  for GST
    When I click on Batch Management for GST
    When I calculate GST
    When I click on View GST Sheet

    #---------------Perform Invoice Generation---------------#
    When I select Reports for Invoice Generation
    When I select Batch Management for Invoice Generation
    When I click on Generate Invoice
    When I click on view invoice

    #---------------Close Chrome Browser Window---------------
    When I close the Chrome browser

                      ############# Second Scenario: ################
  Scenario: Check when master error record is zero
    When I launch Chrome browser
    Then I login as a Pm user

    #---------------for LMS File upload---------------#
    When I go to Workflow
    When I go to Update File
    When I Verify Workflow Upload Excel
    When I Select File Type
    When I Select Month
    When I Select Period
    When I Select Product Name
    When I Select Year
    When I choose select File
    When I click on Submit button

    #---------------Perform Eligiblity after upload LMS---------------#
    When I Select Reports
    When I select Batch Management
    Then I click on Eligiblity
    When I Verify Master Error Record as zero
    When i click on view Eligiblity Sheet
    When I select Eligiblity Type in Batch Management
    When I click on Eligiblity Submit Button
    #When I click on Eligiblity Close Button

   #---------------Incentive calculation---------------#
    When i click on Reports
    When I click on Batch Management
    When i click on incentive
    When I click on Incentive sheet for view
    When I click on Incentive Select Role
    When I click on SUBMIT
    #When I select Close

    #---------------Perform GST Calculation---------------#
    When I Select Reports  for GST
    When I click on Batch Management for GST
    When I calculate GST
    When I click on View GST Sheet

    #---------------Perform Invoice Generation---------------#
    When I select Reports for Invoice Generation
    When I select Batch Management for Invoice Generation
    When I click on Generate Invoice
    When I click on view invoice
    #***********Close Chrome Browser Window*******************
    When I close the Chrome browser