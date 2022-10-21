$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("candidatereg.feature");
formatter.feature({
  "line": 2,
  "name": "Candidate choose Sign in and Apply",
  "description": "",
  "id": "candidate-choose-sign-in-and-apply",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify Candidate registration",
  "description": "",
  "id": "candidate-choose-sign-in-and-apply;verify-candidate-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Candidate clicks on job link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Candidate clicks on apply button of Job",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "candidate choose sign in option to apply",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "candidate click on register Link",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "candidate enter first name \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "candidate enter last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "candidate enters email \"\u003cmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "candidate enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "candidate enters conformpassword \"\u003cconformpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "candidate accepts terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "candidate enters submit button of registration",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "candidate-choose-sign-in-and-apply;verify-candidate-registration;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "mail",
        "password",
        "conformpassword"
      ],
      "line": 19,
      "id": "candidate-choose-sign-in-and-apply;verify-candidate-registration;;1"
    },
    {
      "cells": [
        "karun",
        "kumar",
        "karun11@0001.com",
        "akshay@0001",
        "akshay@0001"
      ],
      "line": 20,
      "id": "candidate-choose-sign-in-and-apply;verify-candidate-registration;;2"
    },
    {
      "cells": [
        "Suresh",
        "kumar",
        "suresh11@0001.com",
        "suresh@0001",
        "suresh@0001"
      ],
      "line": 21,
      "id": "candidate-choose-sign-in-and-apply;verify-candidate-registration;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Verify Candidate registration",
  "description": "",
  "id": "candidate-choose-sign-in-and-apply;verify-candidate-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 4,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Candidate clicks on job link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Candidate clicks on apply button of Job",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "candidate choose sign in option to apply",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "candidate click on register Link",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "candidate enter first name \"karun\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "candidate enter last name \"kumar\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "candidate enters email \"karun11@0001.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "candidate enters password \"akshay@0001\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "candidate enters conformpassword \"akshay@0001\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "candidate accepts terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "candidate enters submit button of registration",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_job_link()"
});
formatter.result({
  "duration": 4969054700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_apply_button_of_Job()"
});
formatter.result({
  "duration": 137633700,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50935}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f12607134e27236ba5d8a3145096e70c\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027hs-eu-confirmation-button\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.candidate_clicks_on_apply_button_of_Job(Stepdef.java:549)\r\n\tat ✽.When Candidate clicks on apply button of Job(candidatereg.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.candidate_choose_sign_in_option_to_apply()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_click_on_register_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "karun",
      "offset": 28
    }
  ],
  "location": "Stepdef.candidate_enter_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "kumar",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enter_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "karun11@0001.com",
      "offset": 24
    }
  ],
  "location": "Stepdef.candidate_enters_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "akshay@0001",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enters_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "akshay@0001",
      "offset": 34
    }
  ],
  "location": "Stepdef.candidate_enters_conformpassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_accepts_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_enters_submit_button_of_registration()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 21,
  "name": "Verify Candidate registration",
  "description": "",
  "id": "candidate-choose-sign-in-and-apply;verify-candidate-registration;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 4,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Candidate clicks on job link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Candidate clicks on apply button of Job",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "candidate choose sign in option to apply",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "candidate click on register Link",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "candidate enter first name \"Suresh\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "candidate enter last name \"kumar\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "candidate enters email \"suresh11@0001.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "candidate enters password \"suresh@0001\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "candidate enters conformpassword \"suresh@0001\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "candidate accepts terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "candidate enters submit button of registration",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_job_link()"
});
formatter.result({
  "duration": 2653534000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_apply_button_of_Job()"
});
formatter.result({
  "duration": 18452400,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50961}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6fa93e9b2ba6896073039bbf07a963ef\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027hs-eu-confirmation-button\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.candidate_clicks_on_apply_button_of_Job(Stepdef.java:549)\r\n\tat ✽.When Candidate clicks on apply button of Job(candidatereg.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.candidate_choose_sign_in_option_to_apply()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_click_on_register_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Suresh",
      "offset": 28
    }
  ],
  "location": "Stepdef.candidate_enter_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "kumar",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enter_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "suresh11@0001.com",
      "offset": 24
    }
  ],
  "location": "Stepdef.candidate_enters_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "suresh@0001",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enters_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "suresh@0001",
      "offset": 34
    }
  ],
  "location": "Stepdef.candidate_enters_conformpassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_accepts_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_enters_submit_button_of_registration()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("createbasicjob.feature");
formatter.feature({
  "line": 2,
  "name": "Create new Job with Basic Information",
  "description": "",
  "id": "create-new-job-with-basic-information",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify Recruiter Ai Login Functionality",
  "description": "",
  "id": "create-new-job-with-basic-information;verify-recruiter-ai-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch Application using valid URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "accept cookies and choose login type",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enters valid credentials \"paul@trainingqa.com\" and \"XPAStag0\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "verify captcha and click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.launch_Application_using_valid_URL()"
});
formatter.result({
  "duration": 2929560900,
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: received Inspector.detached event\n  (failed to check if window was closed: disconnected: Unable to receive message from renderer)\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50987}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b709870c31e6e05433eeedecad181d0\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat stepdef.Stepdef.launch_Application_using_valid_URL(Stepdef.java:32)\r\n\tat ✽.Given Launch Application using valid URL(createbasicjob.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.accept_cookies_and_choose_login_type()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.verify_captcha_and_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Verify create new job functionality with basic information",
  "description": "",
  "id": "create-new-job-with-basic-information;verify-create-new-job-functionality-with-basic-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@CreateNewJob"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Recruiter clicks on Jobs Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "select create new job section",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click on Start button of form",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "choose office address \"\u003coffice address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "add Job Title as \"\u003cjob title\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "add internal code for job \"\u003cinternal code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select Job Status as \"\u003cjob status\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "choose candidates from other countries",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enable rank and file job",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Country Location \"\u003ccountry location\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select City location \"\u003ccity location\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "add skills \"\u003cskill 1\u003e\" and \"\u003cskill 2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "add Qualification \"\u003cqualification\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "add job type in emp details as \"\u003cjob type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select minimum experience as \"\u003cmin exp\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select maximum experience as \"\u003cmax exp\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "choose Employment type as \"\u003cemp type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "choose no of vacancies \"\u003cvacancies\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "choose close date of job \"\u003cmdyclosedate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "add Job Description \"\u003cjob discription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "add Job Requirements \"\u003cjob requirements\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "choose primary recruiter \"\u003cprimary recruiter\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "click on submit button of job",
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "create-new-job-with-basic-information;verify-create-new-job-functionality-with-basic-information;",
  "rows": [
    {
      "cells": [
        "office address",
        "job title",
        "internal code",
        "job status",
        "country location",
        "city location",
        "skill 1",
        "skill 2",
        "qualification",
        "job type",
        "min exp",
        "max exp",
        "emp type",
        "vacancies",
        "mdyclosedate",
        "job discription",
        "job requirements",
        "primary recruiter"
      ],
      "line": 39,
      "id": "create-new-job-with-basic-information;verify-create-new-job-functionality-with-basic-information;;1"
    },
    {
      "cells": [
        "Hyderabad",
        "software engineer",
        "Job0001",
        "internal\u0026external",
        "India",
        "Hyderabad",
        "java",
        "sql",
        "Bachelor\u0027s degree",
        "Permanent",
        "2",
        "10",
        "full-time",
        "15",
        "12/02/2022",
        "candidate should be expert in java",
        "3 years experience",
        "anand paul"
      ],
      "line": 40,
      "id": "create-new-job-with-basic-information;verify-create-new-job-functionality-with-basic-information;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 40,
  "name": "Verify create new job functionality with basic information",
  "description": "",
  "id": "create-new-job-with-basic-information;verify-create-new-job-functionality-with-basic-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 11,
      "name": "@CreateNewJob"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Recruiter clicks on Jobs Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "select create new job section",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click on Start button of form",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "choose office address \"Hyderabad\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "add Job Title as \"software engineer\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "add internal code for job \"Job0001\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select Job Status as \"internal\u0026external\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "choose candidates from other countries",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enable rank and file job",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Country Location \"India\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select City location \"Hyderabad\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "add skills \"java\" and \"sql\"",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "add Qualification \"Bachelor\u0027s degree\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "add job type in emp details as \"Permanent\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select minimum experience as \"2\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select maximum experience as \"10\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "choose Employment type as \"full-time\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "choose no of vacancies \"15\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "choose close date of job \"12/02/2022\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "add Job Description \"candidate should be expert in java\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "add Job Requirements \"3 years experience\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "choose primary recruiter \"anand paul\"",
  "matchedColumns": [
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "click on submit button of job",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_Jobs_Menu()"
});
formatter.result({
  "duration": 5029550800,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50987}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b709870c31e6e05433eeedecad181d0\n*** Element info: {Using\u003dxpath, value\u003d(//a[@class\u003d\u0027bx--header__menu-item\u0027])[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.recruiter_clicks_on_Jobs_Menu(Stepdef.java:65)\r\n\tat ✽.Given Recruiter clicks on Jobs Menu(createbasicjob.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.select_create_new_job_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.click_on_Start_button_of_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 23
    }
  ],
  "location": "Stepdef.choose_office_address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "software engineer",
      "offset": 18
    }
  ],
  "location": "Stepdef.add_Job_Title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Job0001",
      "offset": 27
    }
  ],
  "location": "Stepdef.add_internal_code_for_job(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "internal\u0026external",
      "offset": 22
    }
  ],
  "location": "Stepdef.select_Job_Status_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.choose_candidates_from_other_countries()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.enable_rank_and_file_job()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 25
    }
  ],
  "location": "Stepdef.select_Country_Location(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 22
    }
  ],
  "location": "Stepdef.select_City_location(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 12
    },
    {
      "val": "sql",
      "offset": 23
    }
  ],
  "location": "Stepdef.add_skills_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Bachelor\u0027s degree",
      "offset": 19
    }
  ],
  "location": "Stepdef.add_Qualification(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Permanent",
      "offset": 32
    }
  ],
  "location": "Stepdef.add_job_type_in_emp_details_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "Stepdef.select_minimum_experience_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 30
    }
  ],
  "location": "Stepdef.select_maximum_experience_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "full-time",
      "offset": 27
    }
  ],
  "location": "Stepdef.choose_Employment_type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 24
    }
  ],
  "location": "Stepdef.choose_no_of_vacancies(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12/02/2022",
      "offset": 26
    }
  ],
  "location": "Stepdef.choose_close_date_of_job(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "candidate should be expert in java",
      "offset": 21
    }
  ],
  "location": "Stepdef.add_Job_Description(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3 years experience",
      "offset": 22
    }
  ],
  "location": "Stepdef.add_Job_Requirements(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "anand paul",
      "offset": 26
    }
  ],
  "location": "Stepdef.choose_primary_recruiter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.click_on_submit_button_of_job()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("createnewjob.feature");
formatter.feature({
  "line": 2,
  "name": "Create New Job with all details",
  "description": "",
  "id": "create-new-job-with-all-details",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify Recruiter Ai Login Functionality",
  "description": "",
  "id": "create-new-job-with-all-details;verify-recruiter-ai-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Application using valid URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "accept cookies and choose login type",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enters valid credentials \"paul@trainingqa.com\" and \"XPAStag0\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify captcha and click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.launch_Application_using_valid_URL()"
});
formatter.result({
  "duration": 2732309800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.accept_cookies_and_choose_login_type()"
});
formatter.result({
  "duration": 32290000,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51017}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0501d1a3942824562905e04f7ddb1dbb\n*** Element info: {Using\u003did, value\u003dhs-eu-confirmation-button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.accept_cookies_and_choose_login_type(Stepdef.java:41)\r\n\tat ✽.Then accept cookies and choose login type(createnewjob.feature:6)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.verify_captcha_and_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Verify create new job functionality",
  "description": "",
  "id": "create-new-job-with-all-details;verify-create-new-job-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@CreateNewJob"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Recruiter clicks on Jobs Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "select create new job section",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on Start button of form",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#And click on Add New Office button to add new office Address"
    }
  ],
  "line": 16,
  "name": "choose office address \"\u003coffice address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "add Job Title as \"\u003cjob title\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "add internal code for job \"\u003cinternal code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select Job Status as \"\u003cjob status\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "choose candidates from other countries",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enable rank and file job",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Country Location \"\u003ccountry location\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select City location \"\u003ccity location\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "add skills \"\u003cskill 1\u003e\" and \"\u003cskill 2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "add Qualification \"\u003cqualification\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "add job type in emp details as \"\u003cjob type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select minimum experience as \"\u003cmin exp\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select maximum experience as \"\u003cmax exp\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "choose Employment type as \"\u003cemp type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "choose no of vacancies \"\u003cvacancies\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "choose close date of job \"\u003cmdyclosedate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "add Job Description \"\u003cjob discription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "add Job Requirements \"\u003cjob requirements\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "choose primary recruiter \"\u003cprimary recruiter\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "clicks on skills and education section",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "recruiter add industry field \"\u003cindustry\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "add keywords for AI to vote CV \"\u003ckeyword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "recruiter add Education \"\u003ceducation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "recruiter clicks on Additional Information",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "recruiter add Work Location \"\u003cworklocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "recruiter add working Hours \"\u003cworking hrs\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter minimal Annual Salary \"\u003cmin sal\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter maximum Annual Salary \"\u003cmax sal\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 45,
  "name": "",
  "description": "",
  "id": "create-new-job-with-all-details;verify-create-new-job-functionality;",
  "rows": [
    {
      "cells": [
        "office address",
        "job title",
        "internal code",
        "job status",
        "country location",
        "city location",
        "skill 1",
        "skill 2",
        "qualification",
        "job type",
        "min exp",
        "max exp",
        "emp type",
        "vacancies",
        "mdyclosedate",
        "job discription",
        "job requirements",
        "primary recruiter",
        "industry",
        "keyword",
        "education",
        "worklocation",
        "working hrs",
        "min sal",
        "max sal"
      ],
      "line": 47,
      "id": "create-new-job-with-all-details;verify-create-new-job-functionality;;1"
    },
    {
      "cells": [
        "Hyderabad",
        "software engineer",
        "Job0001",
        "internal\u0026external",
        "India",
        "Hyderabad",
        "java",
        "sql",
        "Bachelor\u0027s degree",
        "Permanent",
        "2",
        "10",
        "full-time",
        "15",
        "12/02/2022",
        "candidate should be expert in java",
        "3 years experience",
        "anand paul",
        "computer software",
        "java",
        "BSc Computers",
        "Hyderabad",
        "8 hrs",
        "400000",
        "1000000"
      ],
      "line": 48,
      "id": "create-new-job-with-all-details;verify-create-new-job-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 48,
  "name": "Verify create new job functionality",
  "description": "",
  "id": "create-new-job-with-all-details;verify-create-new-job-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 10,
      "name": "@CreateNewJob"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Recruiter clicks on Jobs Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "select create new job section",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on Start button of form",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#And click on Add New Office button to add new office Address"
    }
  ],
  "line": 16,
  "name": "choose office address \"Hyderabad\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "add Job Title as \"software engineer\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "add internal code for job \"Job0001\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select Job Status as \"internal\u0026external\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "choose candidates from other countries",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enable rank and file job",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select Country Location \"India\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select City location \"Hyderabad\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "add skills \"java\" and \"sql\"",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "add Qualification \"Bachelor\u0027s degree\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "add job type in emp details as \"Permanent\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select minimum experience as \"2\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select maximum experience as \"10\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "choose Employment type as \"full-time\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "choose no of vacancies \"15\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "choose close date of job \"12/02/2022\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "add Job Description \"candidate should be expert in java\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "add Job Requirements \"3 years experience\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "choose primary recruiter \"anand paul\"",
  "matchedColumns": [
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "clicks on skills and education section",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "recruiter add industry field \"computer software\"",
  "matchedColumns": [
    18
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "add keywords for AI to vote CV \"java\"",
  "matchedColumns": [
    19
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "recruiter add Education \"BSc Computers\"",
  "matchedColumns": [
    20
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "recruiter clicks on Additional Information",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "recruiter add Work Location \"Hyderabad\"",
  "matchedColumns": [
    21
  ],
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "recruiter add working Hours \"8 hrs\"",
  "matchedColumns": [
    22
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "enter minimal Annual Salary \"400000\"",
  "matchedColumns": [
    23
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "enter maximum Annual Salary \"1000000\"",
  "matchedColumns": [
    24
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_Jobs_Menu()"
});
formatter.result({
  "duration": 5028740700,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51017}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0501d1a3942824562905e04f7ddb1dbb\n*** Element info: {Using\u003dxpath, value\u003d(//a[@class\u003d\u0027bx--header__menu-item\u0027])[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.recruiter_clicks_on_Jobs_Menu(Stepdef.java:65)\r\n\tat ✽.Given Recruiter clicks on Jobs Menu(createnewjob.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.select_create_new_job_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.click_on_Start_button_of_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 23
    }
  ],
  "location": "Stepdef.choose_office_address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "software engineer",
      "offset": 18
    }
  ],
  "location": "Stepdef.add_Job_Title_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Job0001",
      "offset": 27
    }
  ],
  "location": "Stepdef.add_internal_code_for_job(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "internal\u0026external",
      "offset": 22
    }
  ],
  "location": "Stepdef.select_Job_Status_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.choose_candidates_from_other_countries()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.enable_rank_and_file_job()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 25
    }
  ],
  "location": "Stepdef.select_Country_Location(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 22
    }
  ],
  "location": "Stepdef.select_City_location(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 12
    },
    {
      "val": "sql",
      "offset": 23
    }
  ],
  "location": "Stepdef.add_skills_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Bachelor\u0027s degree",
      "offset": 19
    }
  ],
  "location": "Stepdef.add_Qualification(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Permanent",
      "offset": 32
    }
  ],
  "location": "Stepdef.add_job_type_in_emp_details_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "Stepdef.select_minimum_experience_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 30
    }
  ],
  "location": "Stepdef.select_maximum_experience_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "full-time",
      "offset": 27
    }
  ],
  "location": "Stepdef.choose_Employment_type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 24
    }
  ],
  "location": "Stepdef.choose_no_of_vacancies(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12/02/2022",
      "offset": 26
    }
  ],
  "location": "Stepdef.choose_close_date_of_job(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "candidate should be expert in java",
      "offset": 21
    }
  ],
  "location": "Stepdef.add_Job_Description(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3 years experience",
      "offset": 22
    }
  ],
  "location": "Stepdef.add_Job_Requirements(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "anand paul",
      "offset": 26
    }
  ],
  "location": "Stepdef.choose_primary_recruiter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.clicks_on_skills_and_education_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "computer software",
      "offset": 30
    }
  ],
  "location": "Stepdef.recruiter_add_industry_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 32
    }
  ],
  "location": "Stepdef.add_keywords_for_AI_to_vote_CV(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BSc Computers",
      "offset": 25
    }
  ],
  "location": "Stepdef.recruiter_add_Education(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_Additional_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad",
      "offset": 29
    }
  ],
  "location": "Stepdef.recruiter_add_Work_Location(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8 hrs",
      "offset": 29
    }
  ],
  "location": "Stepdef.recruiter_add_working_Hours(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400000",
      "offset": 29
    }
  ],
  "location": "Stepdef.enter_minimal_Annual_Salary(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000",
      "offset": 29
    }
  ],
  "location": "Stepdef.enter_maximum_Annual_Salary(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 51,
      "value": "#@Skills\u0026Education"
    },
    {
      "line": 52,
      "value": "#Scenario Outline:verify recruiter able to add Skills and Education"
    },
    {
      "line": 57,
      "value": "#@AdditionalInformation"
    },
    {
      "line": 58,
      "value": "#Scenario:verify recruiter able to add AdditionalInformation"
    }
  ],
  "line": 62,
  "name": "verify recruiter able to choose pre screening questions",
  "description": "",
  "id": "create-new-job-with-all-details;verify-recruiter-able-to-choose-pre-screening-questions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 61,
      "name": "@PrescreeningQuestions"
    }
  ]
});
formatter.step({
  "line": 63,
  "name": "recruiter clicks on pre screening questionaire",
  "keyword": "Given "
});
formatter.step({
  "line": 64,
  "name": "recruiter clicks on select questions button",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "recruiter clicks on Add Question button",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "recruiter adds essay text type question",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "recruiter adds numeric type question",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "recruiter adds yes or no question",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 69,
      "value": "#And recruiter adds multiple choice question"
    },
    {
      "line": 70,
      "value": "#And recruiter adds weighted choice question"
    },
    {
      "line": 71,
      "value": "#And recruiter adds file type question"
    }
  ],
  "line": 72,
  "name": "Select questions from displayed List",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "click on Add Selected option",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_pre_screening_questionaire()"
});
formatter.result({
  "duration": 2031954800,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51017}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0501d1a3942824562905e04f7ddb1dbb\n*** Element info: {Using\u003dxpath, value\u003d(//li[@class\u003d\u0027sui-single-option-facet__item inactive\u0027])[3]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.recruiter_clicks_on_pre_screening_questionaire(Stepdef.java:319)\r\n\tat ✽.Given recruiter clicks on pre screening questionaire(createnewjob.feature:63)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_select_questions_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_Add_Question_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_adds_essay_text_type_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_adds_numeric_type_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.recruiter_adds_yes_or_no_question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.select_questions_from_displayed_List()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.click_on_Add_Selected_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 77,
  "name": "Verify Attachments functionality",
  "description": "",
  "id": "create-new-job-with-all-details;verify-attachments-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 76,
      "name": "@Attachments"
    }
  ]
});
formatter.step({
  "line": 78,
  "name": "recruiter Clicks on Attachments section",
  "keyword": "Given "
});
formatter.step({
  "line": 79,
  "name": "recruiter uploads Attachment file",
  "keyword": "When "
});
formatter.step({
  "line": 80,
  "name": "click on submit after uploading file",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.recruiter_Clicks_on_Attachments_section()"
});
formatter.result({
  "duration": 2029105700,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51017}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0501d1a3942824562905e04f7ddb1dbb\n*** Element info: {Using\u003dxpath, value\u003d(//button[@type\u003d\u0027button\u0027])[73]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.recruiter_Clicks_on_Attachments_section(Stepdef.java:505)\r\n\tat ✽.Given recruiter Clicks on Attachments section(createnewjob.feature:78)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.recruiter_uploads_Attachment_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.click_on_submit_after_uploading_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("guestapply.feature");
formatter.feature({
  "line": 2,
  "name": "Candidate Job Application form",
  "description": "",
  "id": "candidate-job-application-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify Candidate apply for job as a guest",
  "description": "",
  "id": "candidate-job-application-form;verify-candidate-apply-for-job-as-a-guest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Guestapplyjob"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Candidate clicks on job link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Candidate clicks on apply button of Job",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "candidate choose to apply as guest",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_job_link()"
});
formatter.result({
  "duration": 2918851900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_apply_button_of_Job()"
});
formatter.result({
  "duration": 49207800,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51049}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7cded4565323ae21503b506cd22442f9\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027hs-eu-confirmation-button\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.candidate_clicks_on_apply_button_of_Job(Stepdef.java:549)\r\n\tat ✽.When Candidate clicks on apply button of Job(guestapply.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.candidate_choose_to_apply_as_guest()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Verify guest candidate able to fill job Application",
  "description": "",
  "id": "candidate-job-application-form;verify-guest-candidate-able-to-fill-job-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Application"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Candidate enters first name \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Candidate enters last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Candidate  chooses Country \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Candidate enters phone no \"\u003cphoneno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Candidate enters Email Address \"\u003cmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Candidate uploads his resume",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "candidate-job-application-form;verify-guest-candidate-able-to-fill-job-application;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "country",
        "phoneno",
        "mail"
      ],
      "line": 20,
      "id": "candidate-job-application-form;verify-guest-candidate-able-to-fill-job-application;;1"
    },
    {
      "cells": [
        "first001",
        "last001",
        "india",
        "9100100100",
        "first001@in.com"
      ],
      "line": 21,
      "id": "candidate-job-application-form;verify-guest-candidate-able-to-fill-job-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Verify guest candidate able to fill job Application",
  "description": "",
  "id": "candidate-job-application-form;verify-guest-candidate-able-to-fill-job-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 10,
      "name": "@Application"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Candidate enters first name \"first001\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Candidate enters last name \"last001\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Candidate  chooses Country \"india\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Candidate enters phone no \"9100100100\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Candidate enters Email Address \"first001@in.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Candidate uploads his resume",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "first001",
      "offset": 29
    }
  ],
  "location": "Stepdef.candidate_enters_first_name(String)"
});
formatter.result({
  "duration": 37746400,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51049}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7cded4565323ae21503b506cd22442f9\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027candidateFirstName\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.candidate_enters_first_name(Stepdef.java:629)\r\n\tat ✽.And Candidate enters first name \"first001\"(guestapply.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "last001",
      "offset": 28
    }
  ],
  "location": "Stepdef.candidate_enters_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "india",
      "offset": 28
    }
  ],
  "location": "Stepdef.candidate_chooses_Country(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "9100100100",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enters_phone_no(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "first001@in.com",
      "offset": 32
    }
  ],
  "location": "Stepdef.candidate_enters_Email_Address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_uploads_his_resume()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("loginlogout.feature");
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
  "duration": 3091624600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.accept_cookies_and_choose_login_type()"
});
formatter.result({
  "duration": 62313300,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51072}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b8ff08ffc45ce78b99351464fb27b4a\n*** Element info: {Using\u003did, value\u003dhs-eu-confirmation-button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.accept_cookies_and_choose_login_type(Stepdef.java:41)\r\n\tat ✽.Then accept cookies and choose login type(loginlogout.feature:8)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.verify_captcha_and_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
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
formatter.match({
  "location": "Stepdef.click_on_Logout_Button()"
});
formatter.result({
  "duration": 4031384600,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51072}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1b8ff08ffc45ce78b99351464fb27b4a\n*** Element info: {Using\u003dxpath, value\u003d//button[@aria-label\u003d\u0027Logout\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.click_on_Logout_Button(Stepdef.java:60)\r\n\tat ✽.Given Click on Logout Button(loginlogout.feature:14)\r\n",
  "status": "failed"
});
formatter.uri("signinapply.feature");
formatter.feature({
  "line": 2,
  "name": "candidate sign in and apply for job",
  "description": "",
  "id": "candidate-sign-in-and-apply-for-job",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify signed in Candidates apply for job",
  "description": "",
  "id": "candidate-sign-in-and-apply-for-job;verify-signed-in-candidates-apply-for-job",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Signinapplyjob"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Candidate clicks on job link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Candidate clicks on apply button of Job",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "candidate choose sign in option to apply",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_job_link()"
});
formatter.result({
  "duration": 5568776600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_apply_button_of_Job()"
});
formatter.result({
  "duration": 72076800,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51098}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5cfac20e47fae22d685c2de74f856bba\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027hs-eu-confirmation-button\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.candidate_clicks_on_apply_button_of_Job(Stepdef.java:549)\r\n\tat ✽.When Candidate clicks on apply button of Job(signinapply.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdef.candidate_choose_sign_in_option_to_apply()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Verify Candidate registration",
  "description": "",
  "id": "candidate-sign-in-and-apply-for-job;verify-candidate-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "candidate click on register Link",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "candidate enter first name \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "candidate enter last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "candidate enters email \"\u003cmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "candidate enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "candidate enters conformpassword \"\u003cconformpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "candidate accepts terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "candidate enters submit button of registration",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "candidate clicks on click here to login",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "candidate enters mail \"\u003cmail\u003e\" to login",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "candidate enters password \"\u003cpassword\u003e\" to login",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "candidate clicks on login button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#start filling application"
    }
  ],
  "line": 25,
  "name": "Signed in Candidate click on Apply button of Job",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Candidate enters first name \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Candidate enters last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Candidate  chooses Country \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Candidate enters phone no \"\u003cphoneno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Candidate enters Email Address \"\u003cmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on checkbox to recieve whatsapp notifications",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Candidate uploads his resume",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 33,
      "value": "#Then Candidate accepts terms and conditions by clicking on checkbox"
    },
    {
      "line": 34,
      "value": "#And clicks on Next button"
    }
  ],
  "line": 35,
  "name": "",
  "description": "",
  "id": "candidate-sign-in-and-apply-for-job;verify-candidate-registration;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "mail",
        "password",
        "conformpassword",
        "country",
        "phoneno"
      ],
      "line": 36,
      "id": "candidate-sign-in-and-apply-for-job;verify-candidate-registration;;1"
    },
    {
      "cells": [
        "Prakash",
        "Paul",
        "prakashpaul12@xyz.com",
        "PRakaSh$012xFa",
        "PRakaSh$012xFa",
        "india",
        "8000000011"
      ],
      "line": 37,
      "id": "candidate-sign-in-and-apply-for-job;verify-candidate-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 37,
  "name": "Verify Candidate registration",
  "description": "",
  "id": "candidate-sign-in-and-apply-for-job;verify-candidate-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 10,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "candidate click on register Link",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "candidate enter first name \"Prakash\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "candidate enter last name \"Paul\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "candidate enters email \"prakashpaul12@xyz.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "candidate enters password \"PRakaSh$012xFa\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "candidate enters conformpassword \"PRakaSh$012xFa\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "candidate accepts terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "candidate enters submit button of registration",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "candidate clicks on click here to login",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "candidate enters mail \"prakashpaul12@xyz.com\" to login",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "candidate enters password \"PRakaSh$012xFa\" to login",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "candidate clicks on login button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#start filling application"
    }
  ],
  "line": 25,
  "name": "Signed in Candidate click on Apply button of Job",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Candidate enters first name \"Prakash\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Candidate enters last name \"Paul\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Candidate  chooses Country \"india\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Candidate enters phone no \"8000000011\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Candidate enters Email Address \"prakashpaul12@xyz.com\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "click on checkbox to recieve whatsapp notifications",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Candidate uploads his resume",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.candidate_click_on_register_Link()"
});
formatter.result({
  "duration": 12327400,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d106.0.5249.119)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 106.0.5249.119, chrome: {chromedriverVersion: 106.0.5249.61 (511755355844..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51098}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5cfac20e47fae22d685c2de74f856bba\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Register\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdef.Stepdef.candidate_click_on_register_Link(Stepdef.java:561)\r\n\tat ✽.Given candidate click on register Link(signinapply.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prakash",
      "offset": 28
    }
  ],
  "location": "Stepdef.candidate_enter_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Paul",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enter_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "prakashpaul12@xyz.com",
      "offset": 24
    }
  ],
  "location": "Stepdef.candidate_enters_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PRakaSh$012xFa",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enters_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PRakaSh$012xFa",
      "offset": 34
    }
  ],
  "location": "Stepdef.candidate_enters_conformpassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_accepts_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_enters_submit_button_of_registration()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_click_here_to_login_span_class_xpa_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "prakashpaul12@xyz.com",
      "offset": 23
    }
  ],
  "location": "Stepdef.candidate_enters_mail_to_login(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "PRakaSh$012xFa",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enters_password_to_login(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.signed_in_Candidate_click_on_Apply_button_of_Job()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Prakash",
      "offset": 29
    }
  ],
  "location": "Stepdef.candidate_enters_first_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Paul",
      "offset": 28
    }
  ],
  "location": "Stepdef.candidate_enters_last_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "india",
      "offset": 28
    }
  ],
  "location": "Stepdef.candidate_chooses_Country(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8000000011",
      "offset": 27
    }
  ],
  "location": "Stepdef.candidate_enters_phone_no(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "prakashpaul12@xyz.com",
      "offset": 32
    }
  ],
  "location": "Stepdef.candidate_enters_Email_Address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.click_on_checkbox_to_recieve_whatsapp_notifications()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdef.candidate_uploads_his_resume()"
});
formatter.result({
  "status": "skipped"
});
});