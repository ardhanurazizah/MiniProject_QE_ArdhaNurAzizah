package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class purchaseScreen extends BasePageObject {
    private By addNumber(){
        return AppiumBy.xpath("");
    }
    private By payBtn(){
        return AppiumBy.xpath("");
    }
    private By transactionPage(){
        return AppiumBy.xpath("");
    }

    @Step
    public void userCanAddNumberProduct() {
        onClick(addNumber());
    }
    @Step
    public void userCanClickPayButton() {
        onClick(payBtn());
    }
    @Step
    public void userGoesToTheSuccessfulTransactionPage() {
        Assert.assertTrue(waitUntilVisible(transactionPage()).isDisplayed());
    }

}
