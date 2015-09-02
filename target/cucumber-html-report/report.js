$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("net/rytighe/internet/first.feature");
formatter.feature({
  "line": 1,
  "name": "The Internet has a downloads page",
  "description": "",
  "id": "the-internet-has-a-downloads-page",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am at the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDefinitions.i_am_at_the_landing_page()"
});
formatter.result({
  "duration": 2852724751,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "The-Internet download page contains links",
  "id": "the-internet-has-a-downloads-page;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to the \"download\" page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I count links",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "download",
      "offset": 19
    }
  ],
  "location": "LandingPageDefinitions.iNavigateToTheXPage(String)"
});
formatter.result({
  "duration": 595523761,
  "status": "passed"
});
formatter.match({
  "location": "DownloadDefinitions.i_count_links()"
});
formatter.result({
  "duration": 13886998,
  "status": "passed"
});
formatter.after({
  "duration": 68488394,
  "status": "passed"
});
formatter.after({
  "duration": 28962,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am at the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundDefinitions.i_am_at_the_landing_page()"
});
formatter.result({
  "duration": 2385765345,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "",
  "description": "",
  "id": "the-internet-has-a-downloads-page;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I access the dropdown page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I set the dropdown to option 1",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageDefinitions.i_access_the_dropdown_page()"
});
formatter.result({
  "duration": 640455621,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "DropdownDefinitions.i_set_the_dropdown_to_option(int)"
});
formatter.result({
  "duration": 116334498,
  "status": "passed"
});
formatter.after({
  "duration": 67037441,
  "status": "passed"
});
formatter.after({
  "duration": 22988,
  "status": "passed"
});
});