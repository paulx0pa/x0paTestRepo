@tag
Feature:New Candidate Registration 

@Registration
Scenario Outline:Verify Candidate registration
Given Candidate clicks on job link
When Candidate clicks on apply button of Job
And candidate choose sign in option to apply
Given candidate click on register Link
When candidate enter first name "<firstname>"
And candidate enter last name "<lastname>"
And candidate enters email "<mail>"
And candidate enters password "<password>"
And candidate enters conformpassword "<conformpassword>"
And candidate accepts terms and conditions
And candidate enters submit button of registration
Then candidate clicks on click here to login
When enters valid credentials "<mail>" and "<password>"
Then verify captcha and click on Login button

Examples:
|firstname|lastname|mail                |password    |conformpassword |
|Praveen  |kumar   |Ex7905066@a040a.com |akshay@0001 |akshay@0001     |

#Scenario: close the browser
#Given close Browser