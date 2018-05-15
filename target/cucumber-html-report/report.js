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
  "duration": 83853207642,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to see the various options like Deliveries/Facilities/Finance/Employee Mgmt",
  "description": "",
  "id": "verify-links-from-home-page;user-should-be-able-to-see-the-various-options-like-deliveries/facilities/finance/employee-mgmt",
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
  "name": "User Click on Menu Option",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Verify all Menu options are clickable",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.navigate_to_iConnect_page()"
});
formatter.result({
  "duration": 50822731756,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.User_is_able_to_login()"
});
formatter.result({
  "duration": 94952397053,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.User_Click_on_Menu_Option()"
});
formatter.result({
  "duration": 24996594270,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.Verify_all_Menu_options_are_clickable()"
});
formatter.result({
  "duration": 754506661,
  "error_message": "java.lang.AssertionError: All main menu options are not displayed\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat com.iConnectTest.stepDefinations.HomePageStepDef.Verify_all_Menu_options_are_clickable(HomePageStepDef.java:37)\r\n\tat ✽.Then Verify all Menu options are clickable(Homepagea.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 30360686241,
  "status": "passed"
});
});