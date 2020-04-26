$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenario_1.feature");
formatter.feature({
  "line": 1,
  "name": "Second Scenario",
  "description": "",
  "id": "second-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Checking HamBurger Menu",
  "description": "",
  "id": "second-scenario;checking-hamburger-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select \u0027Contact us\u0027 from the hamburger menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am taken to the \u0027Contact us\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I am presented with the below options for contacts",
  "keyword": "And "
});
formatter.match({
  "location": "Test_1.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 8725833576,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_select_Contact_us_from_the_hamburger_menu()"
});
formatter.result({
  "duration": 1995786979,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_am_taken_to_the_Contact_us_page()"
});
formatter.result({
  "duration": 522568533,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_am_presented_with_the_below_options_for_contacts()"
});
formatter.result({
  "duration": 24709,
  "status": "passed"
});
formatter.after({
  "duration": 2321320858,
  "status": "passed"
});
formatter.uri("Scenario_2.feature");
formatter.feature({
  "line": 1,
  "name": "First Scenario",
  "description": "",
  "id": "first-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Checking PWC featured articles",
  "description": "",
  "id": "first-scenario;checking-pwc-featured-articles",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am viewing the \u0027Home\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am presented with a carousel displaying 3 featured articles",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Clicking the \u0027Next\u0027 button on the carousel will load the next_featured articles",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Clicking the \u0027Previous\u0027 button on the carousel will load the previous_featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "Test_1.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 8789478206,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_am_viewing_the_Home_page()"
});
formatter.result({
  "duration": 29270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 42
    }
  ],
  "location": "Test_1.i_am_presented_with_a_carousel_displaying_featured_articles(int)"
});
formatter.result({
  "duration": 899917663,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles()"
});
formatter.result({
  "duration": 1302422896,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles()"
});
formatter.result({
  "duration": 1303734357,
  "status": "passed"
});
formatter.after({
  "duration": 2149118812,
  "status": "passed"
});
formatter.uri("Scenario_3.feature");
formatter.feature({
  "line": 1,
  "name": "Third Scenario",
  "description": "",
  "id": "third-scenario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Checking Magnifying glass search",
  "description": "",
  "id": "third-scenario;checking-magnifying-glass-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the \u0027Magnifying glass\u0027 icon to perform a search",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter the text \u0027Single page applications\u0027 in \"\u003cSearch\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I submit the search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I am presented with at least one search result",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "third-scenario;checking-magnifying-glass-search;",
  "rows": [
    {
      "cells": [
        "Search"
      ],
      "line": 12,
      "id": "third-scenario;checking-magnifying-glass-search;;1"
    },
    {
      "cells": [
        "Single Page Applications"
      ],
      "line": 13,
      "id": "third-scenario;checking-magnifying-glass-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Checking Magnifying glass search",
  "description": "",
  "id": "third-scenario;checking-magnifying-glass-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the \u0027Magnifying glass\u0027 icon to perform a search",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter the text \u0027Single page applications\u0027 in \"Single Page Applications\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I submit the search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I am presented with at least one search result",
  "keyword": "And "
});
formatter.match({
  "location": "Test_1.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "duration": 8285069416,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_click_on_the_Magnifying_glass_icon_to_perform_a_search()"
});
formatter.result({
  "duration": 146287197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single Page Applications",
      "offset": 48
    }
  ],
  "location": "Test_1.i_enter_the_text_Single_page_applications_in(String)"
});
formatter.result({
  "duration": 2081611265,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_submit_the_search()"
});
formatter.result({
  "duration": 29650,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_am_taken_to_the_search_results_page()"
});
formatter.result({
  "duration": 18626,
  "status": "passed"
});
formatter.match({
  "location": "Test_1.i_am_presented_with_at_least_one_search_result()"
});
formatter.result({
  "duration": 518775939,
  "status": "passed"
});
formatter.after({
  "duration": 2113182502,
  "status": "passed"
});
});