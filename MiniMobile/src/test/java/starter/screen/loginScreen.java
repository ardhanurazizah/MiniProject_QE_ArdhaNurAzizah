package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class loginScreen extends BasePageObject {

    private By mainPage(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }
    private By login(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By loginPage(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Login\"]");
    }
    private By email(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By password(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By loginBtn(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    @Step
    public void userOnMainPage() {
        Assert.assertTrue(waitUntilVisible(mainPage()).isDisplayed());
    }
    @Step
    public void userClickOnLoginPage() {
        onClick(login());
    }
    @Step
    public void userOnLoginPage() {
        Assert.assertTrue(waitUntilVisible(loginPage()).isDisplayed());
    }
    @Step
    public void userEnterAValidEmail(String email) {
        onType(email(), email);
    }

    @Step
    public void userEnterAValidPassword(String password) {
        onType(password(), password);
    }
    @Step
    public void userClickOnLoginButton() {
        onClick(loginBtn());
    }
}
