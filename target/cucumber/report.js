$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_loginlogout.feature");
formatter.feature({
  "line": 2,
  "name": "Login and Logout feature",
  "description": "I want to use this to verify login and logout",
  "id": "login-and-logout-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "verify login and logout functionality",
  "description": "",
  "id": "login-and-logout-feature;verify-login-and-logout-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch Application using valid URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "accept cookies and choose login type",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enters valid credentials \"paul@trainingqa.com\" and \"XPAStag0\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify captcha and click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.launch_Application_using_valid_URL()"
});
formatter.result({
  "duration": 6573378300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.accept_cookies_and_choose_login_type()"
});
formatter.result({
  "duration": 1100255700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "paul@trainingqa.com",
      "offset": 26
    },
    {
      "val": "XPAStag0",
      "offset": 52
    }
  ],
  "location": "Stepdef.enters_valid_credentials_and(String,String)"
});
formatter.result({
  "duration": 305427000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.verify_captcha_and_click_on_Login_button()"
});
formatter.result({
  "duration": 163115400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify Recruiter Ai Logout Functionality",
  "description": "",
  "id": "login-and-logout-feature;verify-recruiter-ai-logout-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Click on Logout Button",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "close Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.click_on_Logout_Button()"
});
