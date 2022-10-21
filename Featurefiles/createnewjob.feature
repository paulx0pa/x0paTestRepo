@tag
Feature: Create New Job with all details
@Login
Scenario: Verify Recruiter Ai Login Functionality
Given Launch Application using valid URL
Then accept cookies and choose login type
When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
Then verify captcha and click on Login button

@CreateNewJob
Scenario Outline: Verify create new job functionality
Given Recruiter clicks on Jobs Menu 
Then select create new job section
When click on Start button of form
#And click on Add New Office button to add new office Address
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
When clicks on skills and education section
When recruiter add industry field "<industry>"
And add keywords for AI to vote CV "<keyword>"
And recruiter add Education "<education>"
When recruiter clicks on Additional Information
When recruiter add Work Location "<worklocation>"
And recruiter add working Hours "<working hrs>"
And enter minimal Annual Salary "<min sal>"
And enter maximum Annual Salary "<max sal>"

Examples:

|office address|job title        |internal code|job status       |country location|city location|skill 1|skill 2|qualification    |job type |min exp|max exp|emp type |vacancies|mdyclosedate|job discription                   |job requirements  |primary recruiter|industry          |keyword|education     |worklocation|working hrs|min sal  |max sal  |
|Hyderabad     |software engineer|Job0001      |internal&external|India           |Hyderabad    |java   |sql    |Bachelor's degree|Permanent|2      |10     |full-time|15       |12/02/2022  |candidate should be expert in java|3 years experience|anand paul       |computer software |java   |BSc Computers |Hyderabad   |8 hrs      | 400000  |1000000  |


#@Skills&Education
#Scenario Outline:verify recruiter able to add Skills and Education




#@AdditionalInformation
#Scenario:verify recruiter able to add AdditionalInformation


@PrescreeningQuestions
Scenario: verify recruiter able to choose pre screening questions
Given recruiter clicks on pre screening questionaire 
When recruiter clicks on select questions button
When recruiter clicks on Add Question button
And recruiter adds essay text type question
And recruiter adds numeric type question
And recruiter adds yes or no question
#And recruiter adds multiple choice question
#And recruiter adds weighted choice question
#And recruiter adds file type question
And Select questions from displayed List
Then click on Add Selected option


@Attachments
Scenario: Verify Attachments functionality
Given recruiter Clicks on Attachments section
When recruiter uploads Attachment file
Then click on submit after uploading file

