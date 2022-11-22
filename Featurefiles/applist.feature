@tag
Feature:List of Applications

@Login
Scenario: Verify Recruiter Ai Application List
#                LOGIN
 Given Launch Application using valid URL
  Then accept cookies and choose login type
  When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  Then verify captcha and click on Login button
  Given Recruiter clicks on Jobs Menu
Then click on Job postings link
Then click on applications button of any posted Job
#             UPLOAD RESUME
#Given recruiter clicks on upload resume
#Then recruiter can add candidate using quick applicant add
#When enter quick applicant first name and last name "deeven" and "D"
#When enter quick applicant email and phone no "9849000048 and "deeven@a048.com"
#Then recruiter clicks on bulk import applicants
#Then recruiter clicks on select from talent pool
#                  TAG
When recruiter adds tag to list of applications and submit
#               SHORTLIST 
And Shortlist the selected Application
And add additional email recipients
And click on Submit button to send email to candidate
#              TALENT POOL
Given recruiter clicks on add to talent pool button
When recruiter chooses add applicant to default talentpool
#When recruiter chooses add applicant to existing bucket
#Then recruiter add applicant to new bucket "vip a007"  
Then Click on Submit Button of Talent pool
#                  KIV
Given recruiter clicks on add to kiv button
Then add or remove applications from kiv using toggle and submit
#             CHANGE STAGE
#Given recruiter clicks on change stage button
#Then choose application stage from dropdown list
#             EMAIL TEMPLATE
Given recruiter clicks on Add Email Button
Then choose Shortlist Email template to send candidates
And click on Submit button of EmailTemplates
#              DOWNLOAD CV
Given recruiter clicks on download option
Then recruiter clicks on submit to download cvs
#           DOWNLOAD XOPA REPORT
Given recruiter clicks on download option
Then recruiter selects xopa report from dropdown and submit
#                 DELETE
#Given recruiter clicks on delete option and submit

Scenario: close the browser
Given close Browser
