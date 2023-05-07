package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class logoutScreen extends BasePageObject {
    private By logoutBtn(){
        return AppiumBy.xpath("");
    }

    @Step
    public void userCanClickLogoutButton() {
        onClick(logoutBtn());
    }
}
