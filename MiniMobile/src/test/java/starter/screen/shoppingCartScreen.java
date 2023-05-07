package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class shoppingCartScreen extends BasePageObject {
    private By buyBtn(){
        return AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    private By numberCart(){
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"1\"]");
    }
    private By cart(){
        return AppiumBy.xpath("");
    }
    private By cartPage(){
        return AppiumBy.xpath("");
    }

    @Step
    public void userClickBuyButtonOnTheSelectedProduct() {
        onClick(buyBtn());
    }
    @Step
    public void userCanSeeTheNumberInTheShoppingCart() {
        Assert.assertTrue(waitUntilVisible(numberCart()).isDisplayed());
    }
    @Step
    public void userCanClickShoppingCartButton() {
        onClick(cart());
    }
    @Step
    public void userCanSeeProductPurchased() {
        Assert.assertTrue(waitUntilVisible(cartPage()).isDisplayed());
    }
}
