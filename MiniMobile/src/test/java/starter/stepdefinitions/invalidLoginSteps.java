package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class invalidLoginSteps {
    @Steps
    invalidLoginSteps invalidLoginSteps;
    @And("user enter a invalid email")
    public void userEnterAInvalidEmail() {
        invalidLoginSteps.userEnterAInvalidEmail("denis@gmail.com");
    }

    @Then("user see an error message")
    public void userSeeAnErrorMessage() {
        invalidLoginSteps.userSeeAnErrorMessage();
    }

    @And("user enter a invalid password")
    public void userEnterAInvalidPassword() {
        invalidLoginSteps.userEnterAInvalidPassword("8562485727");
    }
}
