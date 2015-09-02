$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("net/rytighe/cukes3/first.feature");
formatter.feature({
  "id": "the-internet-has-a-downloads-page",
  "description": "",
  "name": "The Internet has a downloads page",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 2,
  "type": "background"
});
formatter.step({
  "name": "I am at the landing page",
  "keyword": "Given ",
  "line": 3
});
formatter.match({
  "location": "BackgroundDefinitions.i_am_at_the_landing_page()"
});
formatter.result({
  "duration": 2601205000,
  "status": "passed"
});
formatter.scenario({
  "id": "the-internet-has-a-downloads-page;",
  "description": "The-Internet download page contains links",
  "name": "",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I navigate to the \"download\" page",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I count 7 links",
  "keyword": "Then ",
  "line": 7
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
  "duration": 609013000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 8
    }
  ],
  "location": "DownloadDefinitions.i_count_links(int)"
});
formatter.result({
  "duration": 25730000,
  "status": "passed"
});
formatter.after({
  "duration": 72343000,
  "status": "passed"
});
formatter.after({
  "duration": 32000,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 2,
  "type": "background"
});
formatter.step({
  "name": "I am at the landing page",
  "keyword": "Given ",
  "line": 3
});
formatter.match({
  "location": "BackgroundDefinitions.i_am_at_the_landing_page()"
});
formatter.result({
  "duration": 1988957000,
  "status": "passed"
});
formatter.scenario({
  "id": "the-internet-has-a-downloads-page;",
  "description": "",
  "name": "",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "I access the dropdown page",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "I set the dropdown to option 1",
  "keyword": "And ",
  "line": 11
});
formatter.match({
  "location": "LandingPageDefinitions.i_access_the_dropdown_page()"
});
formatter.result({
  "duration": 499704000,
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
  "duration": 5137160000,
  "status": "passed"
});
formatter.after({
  "duration": 73692000,
  "status": "passed"
});
formatter.after({
  "duration": 24000,
  "status": "passed"
});
});