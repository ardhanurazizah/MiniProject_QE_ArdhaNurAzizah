package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class logoutSteps {
    @Steps
    logoutSteps logoutSteps;
    @And("user can click logout button")
    public void userCanClickLogoutButton() {
        logoutSteps.userCanClickLogoutButton();
    }
}
