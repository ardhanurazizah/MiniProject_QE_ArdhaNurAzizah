package starter.user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class BuyProductPage extends PageObject {
    private By buyBtn(){
        return By.xpath("//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    private By cartNumber(){
        return By.xpath("//span[@class='v-badge__badge primary']");
    }
    private By cartBtn(){
        return By.xpath("//span[@class='v-btn__content']");
    }
    private By cartPage(){
        return By.xpath("//div[text()='Total Bayar']");
    }

    @Step
    public void userClickBuyButtonOnTheSelectedProduct() {
        $(buyBtn()).click();
    }
    @Step
    public void userCanSeeTheNumberInTheShoppingCart() {
        $(cartNumber()).shouldBeVisible();
    }
    @Step
    public void userCanClickShoppingCartButton() {
        $(cartBtn()).click();
    }
    @Step
    public void userCanSeeProductPurchased() {
        $(cartPage()).shouldBeVisible();
    }
}
