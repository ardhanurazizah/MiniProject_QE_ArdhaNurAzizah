package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class registerSteps {
    @Steps
    registerSteps registerSteps;
    @And("user click register button")
    public void userClickRegisterButton() {
        registerSteps.userClickRegisterButton();
    }

    @And("user on register page")
    public void userOnRegisterPage() {
        registerSteps.userOnRegisterPage();
    }

    @And("user enter a valid full name")
    public void userEnterAValidFullName() {
        registerSteps.userEnterAValidFullName("anik");
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        registerSteps.userClickRegisterButton();
    }
}
