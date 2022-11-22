$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefiles/07_jobinfo.feature");
formatter.feature({
  "line": 2,
  "name": "Job Info",
  "description": "",
  "id": "job-info",
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
  "name": "login to Verify Recruiter Ai Application info",
  "description": "",
  "id": "job-info;login-to-verify-recruiter-ai-application-info",
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
  "comments": [
    {
      "line": 6,
      "value": "#                LOGIN"
    }
  ],
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
  "duration": 6532746700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.accept_cookies_and_choose_login_type()"
});
formatter.result({
  "duration": 347638100,
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
  "duration": 477863400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.verify_captcha_and_click_on_Login_button()"
});
formatter.result({
  "duration": 79809300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Verify create new job functionality with basic information",
  "description": "",
  "id": "job-info;verify-create-new-job-functionality-with-basic-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@CreateNewJob"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Recruiter clicks on Jobs Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "select create new job section",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on Start button of form",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "choose office address \"\u003coffice address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "add Job Title as \"\u003cjob title\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "add internal code for job \"\u003cinternal code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select Job Status as \"\u003cjob status\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "choose candidates from other countries",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enable rank and file job",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Country Location \"\u003ccountry location\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Select City location \"\u003ccity location\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "add skills \"\u003cskill 1\u003e\" and \"\u003cskill 2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "add Qualification \"\u003cqualification\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "add job type in emp details as \"\u003cjob type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select minimum experience as \"\u003cmin exp\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "select maximum experience as \"\u003cmax exp\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "choose Employment type as \"\u003cemp type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "choose no of vacancies \"\u003cvacancies\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "choose close date of job \"\u003cmdyclosedate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "add Job Description \"\u003cjob discription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "add Job Requirements \"\u003cjob requirements\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "choose primary recruiter \"\u003cprimary recruiter\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click on submit button of job",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "click on view job button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#   JOB INFO"
    }
  ],
  "line": 39,
  "name": "recruiter clicks on collaborators section of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "recruiter clicks on job approvers section of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "recruiter clicks on work flow automation of job",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "enable this job be open forever until closed manually",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "allow candidates to attach CV while applying for this job",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enable to ask any pre-screening questions to the candidate",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "enable What other shortlisting criteria would you like to enable",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "enable already have consent from candidates to proceed with the interviews",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "auto send pre interview questions to the candidate asa gives the consent",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "add pre interview stage",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#And For shortlisted candidates setup assessments and interviews"
    },
    {
      "line": 50,
      "value": "#And enable already have consent from candidates to proceed with the offer"
    }
  ],
  "line": 51,
  "name": "recruiter enables assesments and interview setup toggle",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Recruiter chooses Interview type phone round in job info",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Recruiter schedules interview by clicking on blue arrow of job info",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "Recruiter clicks on checkbox to directly send invite",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "recruiter clicks on add slot button",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Recruiter chooses Interview date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "recruiter selects end date and time",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 58,
      "value": "#Then Recruiter clicks on schedule an interview button"
    }
  ],
  "line": 59,
  "name": "recruiter enables already have consent from candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "recruiter clicks on conversations section of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "recruiter clicks on ai settings of Job",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "recruiter clicks on hiring goals of job",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "recruiter clicks on consulting fee of job",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "recruiter clicks on meta info of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "recruiter clicks on timeline of job posted",
  "keyword": "When "
});
formatter.examples({
  "line": 67,
  "name": "",
  "description": "",
  "id": "job-info;verify-create-new-job-functionality-with-basic-information;",
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
      "line": 69,
      "id": "job-info;verify-create-new-job-functionality-with-basic-information;;1"
    },
    {
      "cells": [
        "Hyderabad",
        "software Tester",
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
      "line": 70,
      "id": "job-info;verify-create-new-job-functionality-with-basic-information;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 70,
  "name": "Verify create new job functionality with basic information",
  "description": "",
  "id": "job-info;verify-create-new-job-functionality-with-basic-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 12,
      "name": "@CreateNewJob"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Recruiter clicks on Jobs Menu",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "select create new job section",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on Start button of form",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "choose office address \"Hyderabad\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "add Job Title as \"software Tester\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "add internal code for job \"Job0001\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select Job Status as \"internal\u0026external\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "choose candidates from other countries",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enable rank and file job",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Country Location \"India\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Select City location \"Hyderabad\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "add skills \"java\" and \"sql\"",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "add Qualification \"Bachelor\u0027s degree\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "add job type in emp details as \"Permanent\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select minimum experience as \"2\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "select maximum experience as \"10\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "choose Employment type as \"full-time\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "choose no of vacancies \"15\"",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "choose close date of job \"12/02/2022\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "add Job Description \"candidate should be expert in java\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "add Job Requirements \"3 years experience\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "choose primary recruiter \"anand paul\"",
  "matchedColumns": [
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click on submit button of job",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "click on view job button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#   JOB INFO"
    }
  ],
  "line": 39,
  "name": "recruiter clicks on collaborators section of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "recruiter clicks on job approvers section of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "recruiter clicks on work flow automation of job",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "enable this job be open forever until closed manually",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "allow candidates to attach CV while applying for this job",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "enable to ask any pre-screening questions to the candidate",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "enable What other shortlisting criteria would you like to enable",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "enable already have consent from candidates to proceed with the interviews",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "auto send pre interview questions to the candidate asa gives the consent",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "add pre interview stage",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#And For shortlisted candidates setup assessments and interviews"
    },
    {
      "line": 50,
      "value": "#And enable already have consent from candidates to proceed with the offer"
    }
  ],
  "line": 51,
  "name": "recruiter enables assesments and interview setup toggle",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Recruiter chooses Interview type phone round in job info",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Recruiter schedules interview by clicking on blue arrow of job info",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "Recruiter clicks on checkbox to directly send invite",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "recruiter clicks on add slot button",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Recruiter chooses Interview date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "recruiter selects end date and time",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 58,
      "value": "#Then Recruiter clicks on schedule an interview button"
    }
  ],
  "line": 59,
  "name": "recruiter enables already have consent from candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "recruiter clicks on conversations section of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "recruiter clicks on ai settings of Job",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "recruiter clicks on hiring goals of job",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "recruiter clicks on consulting fee of job",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "recruiter clicks on meta info of job posted",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "recruiter clicks on timeline of job posted",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_Jobs_Menu()"
});
formatter.result({
  "duration": 1893577600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.select_create_new_job_section()"
});
formatter.result({
  "duration": 438285300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.click_on_Start_button_of_form()"
});
formatter.result({
  "duration": 349150200,
  "status": "passed"
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
  "duration": 7575859000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "software Tester",
      "offset": 18
    }
  ],
  "location": "Stepdef.add_Job_Title_as(String)"
});
formatter.result({
  "duration": 436673100,
  "status": "passed"
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
  "duration": 187082800,
  "status": "passed"
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
  "duration": 282756900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.choose_candidates_from_other_countries()"
});
formatter.result({
  "duration": 94971500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.enable_rank_and_file_job()"
});
formatter.result({
  "duration": 134911200,
  "status": "passed"
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
  "duration": 549986400,
  "status": "passed"
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
  "duration": 600882000,
  "status": "passed"
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
  "duration": 673547900,
  "status": "passed"
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
  "duration": 471330300,
  "status": "passed"
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
  "duration": 267470800,
  "status": "passed"
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
  "duration": 252289500,
  "status": "passed"
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
  "duration": 170867100,
  "status": "passed"
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
  "duration": 322044900,
  "status": "passed"
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
  "duration": 260768400,
  "status": "passed"
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
  "duration": 403789600,
  "status": "passed"
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
  "duration": 844112100,
  "status": "passed"
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
  "duration": 486104800,
  "status": "passed"
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
  "duration": 221424300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.click_on_submit_button_of_job()"
});
formatter.result({
  "duration": 227529100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.click_on_view_job_button()"
});
formatter.result({
  "duration": 5481289300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_collaborators_section_of_job_posted()"
});
formatter.result({
  "duration": 17367848600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_job_approvers_section_of_job_posted()"
});
formatter.result({
  "duration": 3155585700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_work_flow_automation_of_job()"
});
formatter.result({
  "duration": 2471578100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.enable_this_job_be_open_forever_until_closed_manually()"
});
formatter.result({
  "duration": 3002470000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.allow_candidates_to_attach_CV_while_applying_for_this_job()"
});
formatter.result({
  "duration": 3001927200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.enable_to_ask_any_pre_screening_questions_to_the_candidate()"
});
formatter.result({
  "duration": 18071685600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.enable_What_other_shortlisting_criteria_would_you_like_to_enable()"
});
formatter.result({
  "duration": 3916464800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.enable_already_have_consent_from_candidates_to_proceed_with_the_interviews()"
});
formatter.result({
  "duration": 2156646300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.auto_send_pre_interview_questions_to_the_candidate_asa_gives_the_consent()"
});
formatter.result({
  "duration": 2131323800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.add_pre_interview_stage()"
});
formatter.result({
  "duration": 8891249300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_enables_assesments_and_interview_setup_toggle()"
});
formatter.result({
  "duration": 2234531800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_type_phone_round_in_job_info()"
});
formatter.result({
  "duration": 2661567200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_schedules_interview_by_clicking_on_blue_arrow_of_job_info()"
});
formatter.result({
  "duration": 3236504800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_checkbox_to_directly_send_invite()"
});
formatter.result({
  "duration": 204685000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_add_slot_button()"
});
formatter.result({
  "duration": 2172559900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_Interview_date_and_time()"
});
formatter.result({
  "duration": 2506704800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_selects_end_date_and_time()"
});
formatter.result({
  "duration": 5357718200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_enables_already_have_consent_from_candidate()"
});
formatter.result({
  "duration": 4394674200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_conversations_section_of_job_posted()"
});
formatter.result({
  "duration": 7332048800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_ai_settings_of_Job()"
});
formatter.result({
  "duration": 321236400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_hiring_goals_of_job()"
});
formatter.result({
  "duration": 2028357200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_consulting_fee_of_job()"
});
formatter.result({
  "duration": 191687800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_meta_info_of_job_posted()"
});
formatter.result({
  "duration": 19076594700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_timeline_of_job_posted()"
});
formatter.result({
  "duration": 237662500,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d107.0.5304.107)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PAUL\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\paul\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:52679}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dfac527b477474b384299d7e2a0b7054\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat stepdef.Stepdef.recruiter_clicks_on_timeline_of_job_posted(Stepdef.java:2879)\r\n\tat ✽.When recruiter clicks on timeline of job posted(Featurefiles/07_jobinfo.feature:65)\r\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 73,
      "value": "#Given Recruiter clicks on Jobs Menu"
    },
    {
      "line": 74,
      "value": "#Then click on Job postings link"
    },
    {
      "line": 75,
      "value": "#Then recruiter clicks on any job"
    },
    {
      "line": 76,
      "value": "#When recruiter clicks on clone job"
    },
    {
      "line": 77,
      "value": "#When recruiter clicks on email this job \"job@id1.com\" and \"jobcc@id1.com\""
    },
    {
      "line": 78,
      "value": "#When recruiter clicks on transfer ownership of the job"
    },
    {
      "line": 79,
      "value": "#           edit job"
    },
    {
      "line": 82,
      "value": "#Scenario: Verify Recruiter Ai Application List"
    },
    {
      "line": 83,
      "value": "#When recruiter clicks on collaborators section of job posted"
    },
    {
      "line": 84,
      "value": "#When recruiter clicks on job approvers section of job posted"
    },
    {
      "line": 85,
      "value": "#When recruiter clicks on work flow automation of job"
    },
    {
      "line": 86,
      "value": "#Then recruiter enables assesments and interview setup toggle"
    },
    {
      "line": 87,
      "value": "#Then Recruiter chooses Interview type phone round in job info"
    },
    {
      "line": 88,
      "value": "#Then Recruiter schedules interview by clicking on blue arrow of job info"
    },
    {
      "line": 89,
      "value": "#Then Recruiter clicks on checkbox to directly send invite"
    },
    {
      "line": 90,
      "value": "#Then recruiter clicks on add slot button"
    },
    {
      "line": 91,
      "value": "#Then Recruiter chooses Interview date and time"
    },
    {
      "line": 92,
      "value": "#Then recruiter selects end date and time"
    },
    {
      "line": 93,
      "value": "#Then Recruiter clicks on schedule an interview button"
    },
    {
      "line": 94,
      "value": "#Then recruiter enables already have consent from candidate"
    },
    {
      "line": 95,
      "value": "#When recruiter clicks on conversations section of job posted"
    },
    {
      "line": 96,
      "value": "#When recruiter clicks on ai settings of Job"
    },
    {
      "line": 97,
      "value": "#When recruiter clicks on hiring goals of job"
    },
    {
      "line": 98,
      "value": "#When recruiter clicks on consulting fee of job"
    },
    {
      "line": 99,
      "value": "#When recruiter clicks on meta info of job posted"
    },
    {
      "line": 100,
      "value": "#When recruiter clicks on timeline of job posted"
    }
  ],
  "line": 102,
  "name": "close the browser",
  "description": "",
  "id": "job-info;close-the-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 103,
  "name": "close Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.close_Browser()"
});
formatter.result({
  "duration": 475908100,
  "status": "passed"
});
});