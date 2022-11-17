$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefiles/04_application.feature");
formatter.feature({
  "line": 2,
  "name": "Application info page",
  "description": "I want to use this to verify login and logout",
  "id": "application-info-page",
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
  "id": "application-info-page;verify-login-and-logout-functionality",
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
formatter.step({
  "line": 11,
  "name": "Recruiter clicks on source menu",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Recruiter clicks on all applicants section",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Recruiter clicks on any Application",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#Then Recruiter downloads cv of applicant"
    },
    {
      "line": 15,
      "value": "#Then Recruiter downloads report of candidate"
    }
  ],
  "line": 16,
  "name": "Recruiter clicks on candidates Resume",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Recruiter clicks on candidates Interview Status",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Recruiter enables autosend pre screening Questions",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Recruiter shortlists the candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Recruiter sends shortlist Mail",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Recruiter choose already have concent option",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Recruiter clicks on add pre interview stage button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Recruiter clicks on add interview stage button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Recruiter chooses Interview type phone round",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Recruiter schedules interview by clicking on blue arrow",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Recruiter clicks on checkbox to directly send invite",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Recruiter chooses Interview date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Recruiter clicks on schedule an interview button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Recruiter clicks on yes if candidate attended interview",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Recruiter clicks on mark this stage as complete",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "recruiter gives feedback on interview",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "recruiter rates candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "recruiter accepts candidate",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#       SECOND INTERVIEW ROUND"
    }
  ],
  "line": 35,
  "name": "Recruiter again clicks on add interview stage button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Recruiter chooses Interview type Onsite",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "recruiter chooses onsite round",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Recruiter clicks on checkbox to directly send invite",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Recruiter chooses Interview date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Recruiter clicks on schedule an interview button",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Recruiter clicks on yes if candidate attended interview",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Recruiter clicks on mark this stage as complete",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "recruiter gives feedback on interview",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "recruiter rates candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "recruiter accepts candidate",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 46,
      "value": "#     ONLINE INTERVIEW ROUND"
    }
  ],
  "line": 47,
  "name": "again recruiter clicks on add interview stage button",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Recruiter chooses Interview type Online",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Recruiter clicks on checkbox to directly send invite",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Recruiter chooses Interview date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "recruiter choose meeting type",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "Recruiter clicks on schedule an interview button",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "recruiter clicks on start meeting button",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "Recruiter clicks on yes if candidate attended interview",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Recruiter clicks on mark this stage as complete",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "recruiter gives feedback on interview",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "recruiter rates candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "recruiter accepts candidate",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 59,
      "value": "#     Coding/Whiteboard Assessment"
    },
    {
      "line": 60,
      "value": "#Then recruiter chooses Coding or Whiteboard Assessment"
    }
  ],
  "line": 61,
  "name": "recruiter takes final decision on interview",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "recruiter sends offer concent",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "recruiter resends offer concent",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "recruiter skips offer concent",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "recruiter clicks on add offer to add offer details",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "recruiter clicks on send offer added",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "Recruiter clicks on candidates Approvals Table",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Recruiter clicks on candidates Collaborators",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Recruiter clicks on candidates Applicant Notes",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "Recruiter clicks on candidates References",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "Recruiter clicks on candidates Offer Information",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Recruiter clicks on candidates Other Jobs Applied",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Recruiter clicks on candidates Suitable Jobs",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 74,
      "value": "#And Recruiter clicks on candidates Chat with candidate"
    }
  ],
  "line": 75,
  "name": "Recruiter clicks on candidates Post Hire Feedback",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Recruiter clicks on candidates Onboarding",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "recruiter clicks on Add template",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 78,
      "value": "#Then recruiter clicks on create new template"
    },
    {
      "line": 79,
      "value": "#Then recruiter names the template and submit"
    },
    {
      "line": 80,
      "value": "#Then recruiter clicks on add stage"
    },
    {
      "line": 81,
      "value": "#Then recruiter names the stage Instructions to candidate Submit"
    },
    {
      "line": 82,
      "value": "#Then recruiter clicks on stage dropdown and click on add doc"
    },
    {
      "line": 83,
      "value": "#Then recruiter gives name to doc and add notes then submit"
    },
    {
      "line": 84,
      "value": "#Then recruiter clicks on onboarding link available at TLC"
    },
    {
      "line": 85,
      "value": "#Then recruiter clicks on add candidate"
    },
    {
      "line": 86,
      "value": "#Then select job select candidate select template"
    },
    {
      "line": 87,
      "value": "#Then click on invite candidate"
    }
  ],
  "line": 88,
  "name": "recruiter select required template and submit",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Recruiter clicks on candidates Timeline",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "Recruiter clicks on candidates Contact Numbers",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.launch_Application_using_valid_URL()"
});
formatter.result({
  "duration": 8373105500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.accept_cookies_and_choose_login_type()"
});
formatter.result({
  "duration": 3533115500,
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
  "duration": 547524200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.verify_captcha_and_click_on_Login_button()"
});
formatter.result({
  "duration": 78381600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_source_menu()"
});
formatter.result({
  "duration": 10153147500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_all_applicants_section()"
});
formatter.result({
  "duration": 3345803700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_any_Application()"
});
formatter.result({
  "duration": 17651786100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Resume()"
});
formatter.result({
  "duration": 11212819700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Interview_Status()"
});
formatter.result({
  "duration": 232017200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_enables_autosend_pre_screening_Questions()"
});
formatter.result({
  "duration": 4511620400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_shortlists_the_candidate()"
});
formatter.result({
  "duration": 4152168400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_sends_shortlist_Mail()"
});
formatter.result({
  "duration": 10338550900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_choose_already_have_concent_option()"
});
formatter.result({
  "duration": 10304122900,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton id\u003d\"have-consent-btn\" tabindex\u003d\"0\" class\u003d\"ml-md-2 xpa-min-width-100 justify-content-center mb-2 mb-md-0 bx--btn bx--btn--sm bx--btn--secondary\" type\u003d\"button\"\u003e...\u003c/button\u003e is not clickable at point (717, 563). Other element would receive the click: \u003cdiv class\u003d\"bx--loading-overlay\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d107.0.5304.107)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51490}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d1b157515355d1a5472d66b151d078ac\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat stepdef.Stepdef.recruiter_choose_already_have_concent_option(Stepdef.java:1364)\r\n\tat ✽.Then Recruiter choose already have concent option(Featurefiles/04_application.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_add_pre_interview_stage_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_add_interview_stage_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_schedules_interview_by_clicking_on_blue_arrow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_checkbox_to_directly_send_invite()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_date_and_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_schedule_an_interview_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_yes_if_candidate_attended_interview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_mark_this_stage_as_complete()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_gives_feedback_on_interview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_rates_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_accepts_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_again_clicks_on_add_interview_stage_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_type_Onsite()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_onsite_round()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_checkbox_to_directly_send_invite()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_date_and_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_schedule_an_interview_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_yes_if_candidate_attended_interview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_mark_this_stage_as_complete()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_gives_feedback_on_interview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_rates_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_accepts_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.again_recruiter_clicks_on_add_interview_stage_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_type_Online()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_checkbox_to_directly_send_invite()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_date_and_time()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_choose_meeting_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_schedule_an_interview_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_start_meeting_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_yes_if_candidate_attended_interview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_mark_this_stage_as_complete()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_gives_feedback_on_interview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_rates_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_accepts_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_takes_final_decision_on_interview()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_sends_offer_concent()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_resends_offer_concent()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_skips_offer_concent()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_add_offer_to_add_offer_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_send_offer_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Approvals_Table()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Collaborators()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Applicant_Notes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_References()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Offer_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Other_Jobs_Applied()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Suitable_Jobs()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Post_Hire_Feedback()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Onboarding()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_Add_template()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_select_required_template_and_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Timeline()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_candidates_Contact_Numbers()"
});
formatter.result({
  "status": "skipped"
});
});