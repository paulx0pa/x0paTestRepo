@tag
Feature: Login and Logout feature
  I want to use this to verify login and logout

  @tag1
  Scenario: verify login and logout functionality
  Given Launch Application using valid URL
  Then accept cookies and choose login type
  When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  Then verify captcha and click on Login button

  @Logout
  Scenario: Verify Recruiter Ai Logout Functionality
  Given Click on Logout Button
  
