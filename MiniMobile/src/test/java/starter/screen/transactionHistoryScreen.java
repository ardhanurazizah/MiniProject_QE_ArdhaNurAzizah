package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class transactionHistoryScreen extends BasePageObject {
    private By accountBtn(){
        return AppiumBy.xpath("");
    }
    private By transactionBtn(){
        return AppiumBy.xpath("");
    }

    @Step
    public void userClickAccountButton() {
        onClick(accountBtn());
    }
    @Step
    public void userCanClickTransaction() {
        onClick(transactionBtn());
    }
}
