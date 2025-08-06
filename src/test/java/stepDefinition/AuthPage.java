package stepDefinition;

import io.cucumber.java.en.When;

import static pages.AuthPage.*;

public class AuthPage {

    @When("^User successfully enters the log in details$")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_username_tb();
        sendkeys_password_tb();
        click_login_btn();

    }



}
