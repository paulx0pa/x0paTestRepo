@tag
Feature:Candidate apply for job as Guest

#@Guestapplyjob
#Scenario:Verify Candidate apply for job as a guest


@Application
Scenario Outline:Verify guest candidate able to fill job Application
Given Candidate clicks on job link
When Candidate clicks on apply button of Job
And candidate choose to apply as guest
And Candidate enters first name "<firstname>"
And Candidate enters last name "<lastname>"
And Candidate  chooses Country "<country>"
And Candidate enters phone no "<phoneno>"
And Candidate enters Email Address "<mail>"
And Candidate uploads his resume
Then Candidate accepts terms and conditions by clicking on checkbox
And clicks on Next Button
When candidate fills about me text field
When Candidate clicks on edit option of EducationA
And enters InstituteA Name "<institute-a>"
And choose country of instituteA
And choose city of instituteA "<cityofins-a>"
And select Qualification from InstituteA "<qualification-a>"
And Enter CGPA got in InstituteA "<cgpa-a>"
And choose start date of InstituteA "<doj-ins-a>"
And choose ending date of InstitueA "<yop-ins-a>"
And Click on Save Button of EduA
#  DELETE 2Q AND 3Q
#When candidate clicks on delete Qb and Qc
When Candidate clicks on edit option of EducationB
And enters InstituteB Name "<institute-b>"
And choose country of instituteB
And choose city of instituteB "<cityofins-b>"
And select Qualification from InstituteB "<qualification-b>"
And Enter CGPA got in InstituteB "<cgpa-b>"
And choose start date of InstituteB "<doj-ins-b>"
And choose ending date of InstitueB "<yop-ins-b>"
And Click on Save Button of EduB
When Candidate clicks on edit option of EducationC
And enters InstituteC Name "<institute-c>"
And choose country of instituteC
And choose city of instituteC "<cityofins-c>"
And select Qualification from InstituteC "<qualification-c>"
And Enter CGPA got in InstituteC "<cgpa-c>"
And choose start date of InstituteC "<doj-ins-c>"
And choose ending date of InstitueC "<yop-ins-c>"
And Click on Save Button of EduC
When candidate adds work experience
When candidate adds certifications
Then candidate clicks on add button of project
When candidate enters project title "<project-title>"
And candidate enters Description of project "<project-discription>"
And Candidate selects project start and end dates
And Click on Save button of project
And Candidate click on next Button
And candidate rate for skills
And candidate click on submit button of Application

Examples:
|firstname|lastname|country|phoneno   |mail                     |institute-a|cityofins-a |qualification-a  |cgpa-a|doj-ins-a      |yop-ins-a    |institute-b|cityofins-b|qualification-b|cgpa-b|doj-ins-b      |yop-ins-b    |institute-c|cityofins-c|qualification-c              |cgpa-c|doj-ins-c     |yop-ins-c    |project-title|project-discription|
|uday     |a10     |india  |6300630013|uday@a13.com             |GITE       |Rjy         |Bachelor's Degree|8.6   |12th june,2017 |30 April,2021|Lyola      |Vij        |Diploma        |7.8   |12th june,2015 |30 April,2021|ZPHS       |skp        |High School or Equivalent    |8.2   |12th june,2015|30 April,2021|ERP Project  |Stock Market       | 

Scenario: close the browser
Given close Browser