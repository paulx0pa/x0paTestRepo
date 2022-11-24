@tag
Feature:Create new Job with Basic Information 

@Login
@Before
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
Then copy the job link
Given close Browser

Examples:

|office address|job title        |internal code|job status       |country location|city location|skill 1|skill 2|qualification    |job type |min exp|max exp|emp type |vacancies|mdyclosedate|job discription                   |job requirements  |primary recruiter|
|Hyderabad     |software Tester  |Job0001      |internal&external|India           |Hyderabad    |java   |sql    |Bachelor's degree|Permanent|2      |10     |full-time|15       |12/02/2022  |candidate should be expert in java|3 years experience|anand paul       |

#Scenario: close the browser
#Given close Browser