@tag
Feature: Job Info

@Login
Scenario: login to Verify Recruiter Ai Application info
#                LOGIN
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
#   JOB INFO
When recruiter clicks on collaborators section of job posted
When recruiter clicks on job approvers section of job posted
When recruiter clicks on work flow automation of job
Then recruiter enables assesments and interview setup toggle
Then Recruiter chooses Interview type phone round in job info
Then Recruiter schedules interview by clicking on blue arrow of job info
Then Recruiter clicks on checkbox to directly send invite
Then recruiter clicks on add slot button
Then Recruiter chooses Interview date and time
Then recruiter selects end date and time
#Then Recruiter clicks on schedule an interview button
Then recruiter enables already have consent from candidate
When recruiter clicks on conversations section of job posted
When recruiter clicks on ai settings of Job
When recruiter clicks on hiring goals of job
When recruiter clicks on consulting fee of job
When recruiter clicks on meta info of job posted
When recruiter clicks on timeline of job posted

Examples:

|office address|job title        |internal code|job status       |country location|city location|skill 1|skill 2|qualification    |job type |min exp|max exp|emp type |vacancies|mdyclosedate|job discription                   |job requirements  |primary recruiter|
|Hyderabad     |software Tester  |Job0001      |internal&external|India           |Hyderabad    |java   |sql    |Bachelor's degree|Permanent|2      |10     |full-time|15       |12/02/2022  |candidate should be expert in java|3 years experience|anand paul       |


#Given Recruiter clicks on Jobs Menu
#Then click on Job postings link
#Then recruiter clicks on any job
#When recruiter clicks on clone job
#When recruiter clicks on email this job "job@id1.com" and "jobcc@id1.com"
#When recruiter clicks on transfer ownership of the job
#           edit job


#Scenario: Verify Recruiter Ai Application List
#When recruiter clicks on collaborators section of job posted
#When recruiter clicks on job approvers section of job posted
#When recruiter clicks on work flow automation of job
#Then recruiter enables assesments and interview setup toggle
#Then Recruiter chooses Interview type phone round in job info
#Then Recruiter schedules interview by clicking on blue arrow of job info
#Then Recruiter clicks on checkbox to directly send invite
#Then recruiter clicks on add slot button
#Then Recruiter chooses Interview date and time
#Then recruiter selects end date and time
#Then Recruiter clicks on schedule an interview button
#Then recruiter enables already have consent from candidate
#When recruiter clicks on conversations section of job posted
#When recruiter clicks on ai settings of Job
#When recruiter clicks on hiring goals of job
#When recruiter clicks on consulting fee of job
#When recruiter clicks on meta info of job posted
#When recruiter clicks on timeline of job posted

#Scenario: close the browser
#Given close Browser