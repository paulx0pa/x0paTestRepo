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
  Then Recruiter clicks on download bulk upload template
  When recruiter clicks on upload button of Bulk Jobs
  # JOB LIST PAGE
  #When recruiter selects Job or jobs using Checkbox
  #Then recruiter clicks on Batch actions button
#Then recruiter chooses job visibility from batch actions dd
#When recruiter selects Job or jobs using Checkbox
#Then recruiter clicks on Batch actions button
#Then recruiter chooses job status from batch actions dd
#When recruiter selects Job or jobs using Checkbox
#Then recruiter clicks on Batch actions button
#Then recruiter chooses transfer ownership from batch actions dd
#Then recruiter selects any job or list of jobs
#Then recruiter clicks on add tag button and add tag name "tag_a0002"
  
  #
#Scenario: close the browser
#Given close Browser
