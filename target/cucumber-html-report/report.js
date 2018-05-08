$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepagea.feature");
formatter.feature({
  "line": 2,
  "name": "Verify links from Home page",
  "description": "I want to use this template for my feature file",
  "id": "verify-links-from-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@complete"
    }
  ]
});
formatter.before({
  "duration": 4730888238,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to see the various options like Deliveries / Facilities/ Finance / Employee Mgmt",
  "description": "",
  "id": "verify-links-from-home-page;user-should-be-able-to-see-the-various-options-like-deliveries-/-facilities/-finance-/-employee-mgmt",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Navigate to iConnect page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is able to login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User able to see the all Menu options",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Verify label of all menu options",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginStepDef.User_is_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 8390323627,
  "status": "passed"
});
});