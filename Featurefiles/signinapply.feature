@tag
Feature:candidate sign in and apply for job

@Signinapplyjob
Scenario:Verify signed in Candidates apply for job 
Given Candidate clicks on job link
When Candidate clicks on apply button of Job
And candidate choose sign in option to apply

@Registration
Scenario Outline:Verify Candidate registration
Given candidate click on register Link
When candidate enter first name "<firstname>"
And candidate enter last name "<lastname>"
And candidate enters email "<mail>"
And candidate enters password "<password>"
And candidate enters conformpassword "<conformpassword>"
And candidate accepts terms and conditions
And candidate enters submit button of registration
Then candidate clicks on click here to login
When candidate enters mail "<mail>" to login
And candidate enters password "<password>" to login
And candidate clicks on login button
#start filling application
Then Signed in Candidate click on Apply button of Job
When Candidate enters first name "<firstname>"
And Candidate enters last name "<lastname>"
And Candidate  chooses Country "<country>" 
And Candidate enters phone no "<phoneno>"
And Candidate enters Email Address "<mail>"
And click on checkbox to recieve whatsapp notifications
And Candidate uploads his resume
#Then Candidate accepts terms and conditions by clicking on checkbox
#And clicks on Next button
Examples:
|firstname|lastname|mail                  |password      |conformpassword  |country|phoneno    |
|Prakash  |Paul    |prakashpaul12@xyz.com |PRakaSh$012xFa|PRakaSh$012xFa   |india  |8000000011 |

#@CandidateLogin
#Scenario:Verify candidate login


#@Application
#Scenario:Verify candidate basic details of job Application


#@CandidateEduProj
#Scenario:verify candidate education and project details 
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
#
#@closebrowser
#Scenario:Close browser
#Given close browser
