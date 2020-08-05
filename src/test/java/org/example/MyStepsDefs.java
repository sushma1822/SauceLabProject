package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepsDefs {
    HomePage homePage = new HomePage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
       homePage.verifyUrl();
    }

    @When("^user enter valid username$")
    public void user_enter_valid_username() {
     homePage.userShouldEnterUsername();
    }

    @When("^user enter valid password$")
    public void user_enter_valid_password()  {
     homePage.userShouldEnterPassword();
    }

    @When("^user click on login button$")
    public void user_click_on_login_button()  {
      homePage.userShouldClickOnButton();
    }

    @Then("^user should able to see welcome Massage successfully$")
    public void user_should_able_to_see_welcome_Massage_successfully()  {
       homePage.userShouldVerifyTextOnWelcomePage();
    }


    @Given("^user is on home page$")
    public void userIsOnHomePage() {
       // homePage.verifyUrl();
    }

    @When("^user enter \"([^\"]*)\" in username text box$")
    public void userEnterInUsernameTextBox(String username)  {
        homePage.userEnterUsername(username);
    }

    @And("^user enter \"([^\"]*)\" in password text box$")
    public void userEnterInPasswordTextBox(String password)  {
          homePage.userEnterPassword(password);
    }


    @Then("^user should not able to see login successfully and user  should get  an \"([^\"]*)\"$")
    public void userShouldNotAbleToSeeLoginSuccessfullyAndUserShouldGetAn(String massage)  {
       homePage.userShouldSeeVerifyMassage(massage);

    }
}
