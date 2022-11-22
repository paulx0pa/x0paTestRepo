@tag
Feature: Application info page
  I want to use this to verify login and logout

  @tag1
  Scenario: verify login and logout functionality
  Given Launch Application using valid URL
  Then accept cookies and choose login type
  When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
  Then verify captcha and click on Login button
  Then Recruiter clicks on source menu
Then Recruiter clicks on all applicants section
Then Recruiter clicks on any Application
#Then Recruiter downloads cv of applicant
#Then Recruiter downloads report of candidate
When Recruiter clicks on candidates Resume
When Recruiter clicks on candidates Interview Status
Then Recruiter enables autosend pre screening Questions
Then Recruiter shortlists the candidate
Then Recruiter sends shortlist Mail
Then Recruiter choose already have concent option
Then Recruiter clicks on add pre interview stage button
Then Recruiter clicks on add interview stage button
Then Recruiter chooses Interview type phone round
Then Recruiter schedules interview by clicking on blue arrow
Then Recruiter clicks on checkbox to directly send invite
Then Recruiter chooses Interview date and time
Then recruiter clicks on end time
Then Recruiter clicks on schedule an interview button
Then Recruiter clicks on yes if candidate attended interview
Then Recruiter clicks on mark this stage as complete
Then recruiter gives feedback on interview
Then recruiter rates candidate
Then recruiter accepts candidate
#       SECOND INTERVIEW ROUND
 Then Recruiter again clicks on add interview stage button
 Then Recruiter chooses Interview type Onsite
 Then recruiter chooses onsite round
 Then Recruiter clicks on checkbox to directly send invite
 Then Recruiter chooses Interview date and time
 Then recruiter clicks on end time
 Then Recruiter clicks on schedule an interview button
 Then Recruiter clicks on yes if candidate attended interview
Then Recruiter clicks on mark this stage as complete
Then recruiter gives feedback on interview
Then recruiter rates candidate
Then recruiter accepts candidate
#     ONLINE INTERVIEW ROUND
Then again recruiter clicks on add interview stage button
Then Recruiter chooses Interview type Online
Then Recruiter clicks on checkbox to directly send invite
Then Recruiter chooses Interview date and time
Then recruiter clicks on end time
When recruiter choose meeting type
Then Recruiter clicks on schedule an interview button
Then recruiter clicks on start meeting button
Then Recruiter clicks on yes if candidate attended interview
Then Recruiter clicks on mark this stage as complete
Then recruiter gives feedback on interview
Then recruiter rates candidate
Then recruiter accepts candidate
#     Coding/Whiteboard Assessment 
#Then recruiter chooses Coding or Whiteboard Assessment 
Then recruiter takes final decision on interview
Then recruiter sends offer concent
Then recruiter resends offer concent
Then recruiter skips offer concent
Then recruiter clicks on add offer to add offer details
Then recruiter clicks on send offer added
And Recruiter clicks on candidates Approvals Table
And Recruiter clicks on candidates Collaborators
And Recruiter clicks on candidates Applicant Notes
And Recruiter clicks on candidates References
And Recruiter clicks on candidates Offer Information
And Recruiter clicks on candidates Other Jobs Applied
And Recruiter clicks on candidates Suitable Jobs
#And Recruiter clicks on candidates Chat with candidate
And Recruiter clicks on candidates Post Hire Feedback
And Recruiter clicks on candidates Onboarding
Then recruiter clicks on Add template
#Then recruiter clicks on create new template
#Then recruiter names the template and submit
#Then recruiter clicks on add stage
#Then recruiter names the stage Instructions to candidate Submit
#Then recruiter clicks on stage dropdown and click on add doc
#Then recruiter gives name to doc and add notes then submit
#Then recruiter clicks on onboarding link available at TLC
#Then recruiter clicks on add candidate
#Then select job select candidate select template
#Then click on invite candidate
Then recruiter select required template and submit
And Recruiter clicks on candidates Timeline
And Recruiter clicks on candidates Contact Numbers

Scenario: close the browser
Given close Browser