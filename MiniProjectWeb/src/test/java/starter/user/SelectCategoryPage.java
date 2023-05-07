package starter.user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SelectCategoryPage extends PageObject {
    private By selectBtn(){
        return By.id("//i[@class='v-input__icon v-input__icon--append']");
    }
    private By select(){
        return By.xpath("//div[text()='gaming']");
    }

    @Step
    public void userClickSelectCategoryButton() {
        $(selectBtn()).click();
    }
    @Step
    public void userCanSeeSelectedCategory() {
        $(select()).click();
    }
}
