@tag
Feature: Edit Job Info 

Scenario: Verify Recruiter Ai Login Functionality
Given Launch Application using valid URL
Then accept cookies and choose login type
When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
Then verify captcha and click on Login button

@CreateNewJob
Scenario Outline:Verify create new job functionality with basic information
Given Recruiter clicks on Jobs Menu 
Then select create new job section
When click on Start button of form
And choose office address "<office address>"
And add Job Title as "<job title>"
And add internal code for job "<internal code>"
And select Job Status as "<job status>"
And choose candidates from other countries
And enable rank and file job
And Select Country Location "<country location>"
And Select City location "<city location>"
And add skills "<skill 1>" and "<skill 2>"
And add Qualification "<qualification>"
And add job type in emp details as "<job type>"
And select minimum experience as "<min exp>"
And select maximum experience as "<max exp>"
And choose Employment type as "<emp type>"
And choose no of vacancies "<vacancies>"
And choose close date of job "<mdyclosedate>"
And add Job Description "<job discription>"
And add Job Requirements "<job requirements>"
And choose primary recruiter "<primary recruiter>"
And click on submit button of job
And click on view job button
#Then copy the job link
#When recruiter clicks on clone job
#When recruiter clicks on email this job "job@id1.com" and "jobcc@id1.com"
#When recruiter clicks on transfer ownership of the job
Examples:

|office address|job title        |internal code|job status       |country location|city location|skill 1|skill 2|qualification    |job type |min exp|max exp|emp type |vacancies|mdyclosedate|job discription                   |job requirements  |primary recruiter|
|Hyderabad     |software Tester  |Job0001      |internal&external|India           |Hyderabad    |java   |sql    |Bachelor's degree|Permanent|2      |10     |full-time|15       |12/02/2022  |candidate should be expert in java|3 years experience|anand paul       |

Scenario Outline: verify edit job info
#When recruiter clicks on clone job
#When recruiter clicks on email this job "job@id1.com" and "jobcc@id1.com"
When recruiter clicks on edit job
And recruiter edits office address "<office address>"
And recruiter edits Job Title as "<job title>"
And recruiter edits internal code for job "<internal code>"
And recruiter edits Job Status as "<job status>"
#And recruiter edits choose candidates from other countries
#And recruiter edits enable rank and file job
#And recruiter edits Country Location "<country location>"
#And recruiter edits City location "<city location>"
#And recruiter edits skills "<skill 1>" and "<skill 2>"
#And recruiter edits add Qualification "<qualification>"
#And recruiter edits job type in emp details as "<job type>"
And recruiter edits minimum experience as "<min exp>"
And recruiter edits maximum experience as "<max exp>"
And recruiter edits Employment type as "<emp type>"
And recruiter edits no of vacancies "<vacancies>"
And recruiter edits close date of job "<mdyclosedate>"
And recruiter edits Job Description "<job discription>"
And recruiter edits Job Requirements "<job requirements>"
#And recruiter edits primary recruiter "<primary recruiter>"
#And click on submit after editing basic info of job
When clicks on skills and education section
When recruiter edits industry field "<industry>"
And recruiter edits add keywords for AI to vote CV "<keyword>"
And recruiter edits Education "<education>"
When recruiter clicks on Additional Information
When recruiter edits Work Location "<worklocation>"
And recruiter can edit working Hours "<working hrs>"
And recruiter can edit minimal Annual Salary "<min sal>"
And recruiter can edit maximum Annual Salary "<max sal>"
And recruiter edits prescreening questions
Then recruiter can edit collaborators
#And edit prescreening settings
#And edit prescreening shortlist criteria
#And edit interview setup
Given close Browser

Examples:

|office address|job title        |internal code|job status       |country location|city location|skill 1|skill 2|qualification    |job type |min exp|max exp|emp type |vacancies|mdyclosedate|job discription                   |job requirements  |primary recruiter|industry          |keyword|education     |worklocation|working hrs|min sal  |max sal  |
|Hyderabad     |software Engineer|Job0001      |internal&external|Germany         |haag         |java   |sql    |Bachelor's degree|Permanent|3      |12     |full-time|15       |12/02/2022  |candidate should be expert in java|3 years experience|anand paul       |computer software |java   |BSc Computers |Hyderabad   |8 hrs      | 400000  |1000000  |

#Scenario: close the browser
#Given close Browser
