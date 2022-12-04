@tag
Feature: Bulk Upload feature
  I want to use this template for Uploading Bulk of Jobs 

  @tag1
  Scenario: Verify Bulk Upload functionality
  #LOGIN
  Given Launch Application using valid URL
  Then accept cookies and choose login type
  When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  Then verify captcha and click on Login button
  #BULK UPLOAD
  Given Recruiter clicks on Jobs Menu 
  Then select create new job section
  #Then Recruiter clicks on download bulk upload template
  When recruiter clicks on upload button of Bulk Jobs
  When Verify uploaded job beings displayed in job list or not

  #Given close Browser

#Scenario: close the browser
#Given close Browser
