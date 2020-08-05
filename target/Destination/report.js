$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Valid and Invalid Credential",
  "description": "",
  "id": "valid-and-invalid-credential",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10072296000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to  login successfully,",
  "description": "so that user can see welcome massage",
  "id": "valid-and-invalid-credential;user-should-able-to--login-successfully,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@validCredential"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter valid username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter valid password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should able to see welcome Massage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepsDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 275977500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_enter_valid_username()"
});
formatter.result({
  "duration": 491689500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_enter_valid_password()"
});
formatter.result({
  "duration": 405988100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_click_on_login_button()"
});
formatter.result({
  "duration": 2558533600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_should_able_to_see_welcome_Massage_successfully()"
});
formatter.result({
  "duration": 552322900,
  "status": "passed"
});
formatter.after({
  "duration": 2658898200,
  "status": "passed"
});
});