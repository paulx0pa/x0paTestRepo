@tag
Feature:Create new Job with Basic Information 

Scenario: Verify Recruiter Ai Login Functionality
Given Launch Application using valid URL
Then accept cookies and choose login type
When enters valid credentials "paul@trainingqa.com" and "XPAStag0"
Then verify captcha and click on Login button
Given Recruiter clicks on Jobs Menu
Then click on Job postings link


@title
Scenario: Verify Recruiter Ai job title Filter
Then click on filters option of jobs
When filter job by using job title
@id
Scenario: Verify Recruiter Ai job id Filter
When filter job by using job id
#@company
#Scenario: Verify Recruiter Ai job company Filter
#When filter job by company
@minsal
Scenario: Verify Recruiter Ai job min salary Filter
When filter job by min salary
@maxsal
Scenario: Verify Recruiter Ai max salary Filter
When filter job by max salary
@od
Scenario: Verify Recruiter Ai job open date Filter
When filter job by open date
@cd
Scenario: Verify Recruiter Ai job close date Filter
When filter job by close date
@vac
Scenario: Verify Recruiter Ai job vacancy Filter
When filter job by vacancy
@private
Scenario: Verify Recruiter Ai job private Filter
When filter job by private
@minxp
Scenario: Verify Recruiter Ai job min exp Filter
When filter job by min experience
@maxxp
Scenario: Verify Recruiter Ai job max exp Filter
When filter job by max experience
@tags
Scenario: Verify Recruiter Ai tags Filter
When filter job by using tags
@as
Scenario: Verify Recruiter Ai approvals status Filter
When filter job by using approval status
@ht
Scenario: Verify Recruiter Ai job hour type Filter
When filter job by hour type
@jt
Scenario: Verify Recruiter Ai job type Filter
When filter job by job type
@jc
Scenario: Verify Recruiter Ai job cateogory Filter
When filter job by job cateogory
