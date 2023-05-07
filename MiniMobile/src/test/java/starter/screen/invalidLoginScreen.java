package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class invalidLoginScreen extends BasePageObject {
    private By invalidEmail(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By invalidPassword(){
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By errorMessage(){
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");
    }

    @Step
    public void userEnterAInvalidEmail(String inEmail) {
        onType(invalidEmail(), inEmail);
    }
    @Step
    public void userEnterAInvalidPassword(String inPassword) {
        onType(invalidPassword(), inPassword);
    }
    @Step
    public String userSeeAnErrorMessage() {
        return waitUntilVisible(errorMessage()).getText();
    }
}
