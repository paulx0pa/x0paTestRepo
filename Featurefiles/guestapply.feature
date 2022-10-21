@tag
Feature:Candidate Job Application form

@Guestapplyjob
Scenario:Verify Candidate apply for job as a guest
Given Candidate clicks on job link
When Candidate clicks on apply button of Job
And candidate choose to apply as guest

@Application
Scenario Outline:Verify guest candidate able to fill job Application
And Candidate enters first name "<firstname>"
And Candidate enters last name "<lastname>"
And Candidate  chooses Country "<country>"
And Candidate enters phone no "<phoneno>"
And Candidate enters Email Address "<mail>"
And Candidate uploads his resume

Examples:
|firstname|lastname|country|phoneno   |mail           |
|first001 |last001 |india  |9100100100|first001@in.com|




#And Candidate uploads his resume
#Then Candidate accepts terms and conditions by clicking on checkbox
#And clicks on Next Button
#When candidate mentions about him in about me text field
#When Candidate clicks on edit option of EducationA
#And enters InstituteA Name
#And choose country of instituteA
#And choose city of instituteA
#And select Qualification from InstituteA
#And Enter CGPA got in InstituteA
#And choose start date of InstituteA
#And choose ending date of InstitueA
#And Click on Save Button of EduA
#When Candidate clicks on edit option of EducationB
#And enters InstituteB Name
#And choose country of instituteB
#And choose city of instituteB
#And select Qualification from InstituteB
#And Enter CGPA got in InstituteB
#And choose start date of InstituteB
#And choose ending date of InstitueB
#And Click on Save Button of EduB
#When Candidate clicks on edit option of EducationC
#And enters InstituteC Name
#And choose country of instituteC
#And choose city of instituteC
#And select Qualification from InstituteC
#And Enter CGPA got in InstituteC
#And choose start date of InstituteC
#And choose ending date of InstitueC
#And Click on Save Button of EduC
#Then candidate clicks on add button of project
#When candidate enters project title
#And candidate enters Description of project
#And Candidate selects project start and end dates
#And Click on Save button of project
#And Candidate click on next Button
#
#@Rating
#Scenario:verify candidate rates for Skills
#And candidate rate for skills
#And candidate click on submit button of Application
