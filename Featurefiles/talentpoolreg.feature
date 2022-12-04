@tag
Feature:talent pool registration
  I want to use this to verify talent pool registration

  @tag1
  Scenario: verify login and logout functionality
  Given Launch Application using valid URL
  Then accept cookies and choose login type
  When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  Then verify captcha and click on Login button
 Then Recruiter clicks on source menu
 Then click on external talent pool
 Then copy link to send to prospective candidates
 Then new candidate registers to tp using shared link
 When candidate starts filling the form of tp 
 Given close Browser
 
   Scenario: verify talentpool registration successful or not
  Given Launch Application using valid URL
  Then accept cookies and choose login type
  When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  Then verify captcha and click on Login button
 Then Recruiter clicks on source menu
 Then click on external talent pool
  When search for registered candidate in talent pool
 Then verify registred candidate available in talent pool or not
 
 #Then copy link to send to prospective candidates
 #Then new candidate registers to tp using shared link
 #When candidate starts filling the form of tp 