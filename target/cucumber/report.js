$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Featurefiles/09_joblist.feature");
formatter.feature({
  "line": 2,
  "name": "List of Jobs",
  "description": "",
  "id": "list-of-jobs",
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
  "name": "Verify Recruiter Ai Application List",
  "description": "",
  "id": "list-of-jobs;verify-recruiter-ai-application-list",
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
      "value": "#LOGIN"
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
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#BULK UPLOAD"
    }
  ],
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
  "comments": [
    {
      "line": 14,
      "value": "#Then Recruiter clicks on download bulk upload template"
    }
  ],
  "line": 15,
  "name": "recruiter clicks on upload button of Bulk Jobs",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "# JOB LIST PAGE"
    }
  ],
  "line": 17,
  "name": "copy id of job",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "recruiter selects Job or jobs using Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "recruiter clicks on Batch actions button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "recruiter chooses job visibility from batch actions dd",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "recruiter selects Job or jobs using Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "recruiter clicks on add tag button and add tag name \"tag_a0003\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "recruiter selects Job or jobs using Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "recruiter clicks on Batch actions button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "recruiter chooses job status close from batch actions dd",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "recruiter clicks on closed jobs link",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "filter job by id",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "recruiter selects Job or jobs using Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "recruiter clicks on Batch actions button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "recruiter chooses job visibility from batch actions dd",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "recruiter selects Job or jobs using Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "recruiter clicks on Batch actions button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "recruiter chooses job status open from batch actions dd",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "verify opened job is displayed on open job list or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.launch_Application_using_valid_URL()"
});
formatter.result({
  "duration": 10648924100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.accept_cookies_and_choose_login_type()"
});
formatter.result({
  "duration": 1593138600,
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
  "duration": 624336100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.verify_captcha_and_click_on_Login_button()"
});
formatter.result({
  "duration": 169687300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_Jobs_Menu()"
});
formatter.result({
  "duration": 5459632200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.select_create_new_job_section()"
});
formatter.result({
  "duration": 612486000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_upload_button_of_Bulk_Jobs()"
});
formatter.result({
  "duration": 21770299600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.copy_id_of_job()"
});
formatter.result({
  "duration": 4010768000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_selects_Job_or_jobs_using_Checkbox()"
});
formatter.result({
  "duration": 72870600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clics_on_Batch_actions_button()"
});
formatter.result({
  "duration": 383937100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_job_visibility_from_batch_actions_dd()"
});
formatter.result({
  "duration": 660812600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_selects_Job_or_jobs_using_Checkbox()"
});
formatter.result({
  "duration": 1937398200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tag_a0003",
      "offset": 53
    }
  ],
  "location": "Stepdef.recruiter_clicks_on_add_tag_button_and_add_tag_name(String)"
});
formatter.result({
  "duration": 12090323300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_selects_Job_or_jobs_using_Checkbox()"
});
formatter.result({
  "duration": 92250900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clics_on_Batch_actions_button()"
});
formatter.result({
  "duration": 164492200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_job_status_close_from_batch_actions_dd()"
});
formatter.result({
  "duration": 2806985900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clicks_on_closed_jobs_link()"
});
formatter.result({
  "duration": 4684237400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.filter_job_by_id()"
});
formatter.result({
  "duration": 3906962800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_selects_Job_or_jobs_using_Checkbox()"
});
formatter.result({
  "duration": 8015803100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clics_on_Batch_actions_button()"
});
formatter.result({
  "duration": 397328900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_job_visibility_from_batch_actions_dd()"
});
formatter.result({
  "duration": 508840200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_selects_Job_or_jobs_using_Checkbox()"
});
formatter.result({
  "duration": 1335653300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_clics_on_Batch_actions_button()"
});
formatter.result({
  "duration": 145706400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.recruiter_chooses_job_status_from_batch_actions_dd()"
});
formatter.result({
  "duration": 4638091100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.verify_opened_job_is_displayed_on_open_job_list_or_not()"
});
formatter.result({
  "duration": 3667482000,
  "status": "passed"
});
});