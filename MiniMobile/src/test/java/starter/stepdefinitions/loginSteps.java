package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.loginScreen;

public class loginSteps {
    @Steps
    loginScreen loginScreen;
    @Given("user on main page")
    public void userOnMainPage() {
        loginScreen.userOnMainPage();
    }

    @When("user click on login page")
    public void userClickOnLoginPage() {
        loginScreen.userOnLoginPage();
    }

    @And("user on login page")
    public void userOnLoginPage() {
        loginScreen.userClickOnLoginPage();
    }

    @And("user enter a valid email")
    public void userEnterAValidEmail() {
        loginScreen.userEnterAValidEmail("anik@gmail.com");
    }

    @And("user enter a valid password")
    public void userEnterAValidPassword() {
        loginScreen.userEnterAValidPassword("123");
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        loginScreen.userClickOnLoginButton();
    }
}
