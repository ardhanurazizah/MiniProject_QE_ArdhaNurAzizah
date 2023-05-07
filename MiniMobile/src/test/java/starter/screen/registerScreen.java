package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class registerScreen extends BasePageObject {
    private By register(){
        return AppiumBy.accessibilityId("Register");
    }
    private By registerPage(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Register\"]");
    }
    private By fullName(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By registerBtn(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    @Step
    public void userClickRegisterButton() {
        onClick(register());
    }
    @Step
    public void userOnRegisterPage() {
        Assert.assertTrue(waitUntilVisible(registerPage()).isDisplayed());
    }
    @Step
    public void userEnterAValidFullName(String name) {
        onType(fullName(), name);
    }
    @Step
    public void userClickOnRegisterButton() {
        onClick(registerBtn());
    }
}
