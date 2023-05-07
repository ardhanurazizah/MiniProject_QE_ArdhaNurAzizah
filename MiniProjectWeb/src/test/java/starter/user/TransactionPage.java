package starter.user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By accountBtn(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-user theme--dark']");
    }
    private By transactionBtn(){
        return By.id("//div[contains(text(), 'Transaksi')]/parent::div");
    }

    @Step
    public void userClickAccountButton() {
        $(accountBtn()).click();
    }
    @Step
    public void userCanClickTransaction() {
        $(transactionBtn()).click();
    }
}
