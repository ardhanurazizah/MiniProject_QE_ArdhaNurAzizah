package starter.user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By main(){
        return By.xpath("//h3[text()='AltaShop']");
    }
    private By loginBtn(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--dark']");
    }
    private By login(){
        return By.xpath("//div[text()='Login']");
    }
    private By register(){
        return By.xpath("//a[text()='Register']");
    }
    private By registerPage(){
        return By.xpath("//div[text()='Register']");
    }
    private By fullNameText(){
        return By.xpath("//label[text()='Nama Lengkap']//following-sibling::input");
    }
    private By emailText(){
        return By.xpath("//label[text()='Email']//following-sibling::input");
    }
    private By passwordText(){
        return By.xpath("//label[text()='Password']//following-sibling::input");
    }
    private By registerBtn(){
        return By.xpath("//span[text()='Register']");
    }

    @Step
    public void userOnMainPage() {
        open();
        $(main()).shouldBeVisible();
    }
    @Step
    public void userClickOnLoginButton() {
        $(loginBtn()).click();
    }
    @Step
    public void userOnLoginPage() {
        $(login()).shouldBeVisible();
    }
    @Step
    public void userClickRegisterButton() {
        $(register()).click();
    }
    @Step
    public void userOnRegisterPage() {
        $(registerPage()).shouldBeVisible();
    }
    @Step
    public void userEnterAValidFullName(String fullName) {
        $(fullNameText()).type(fullName);
    }
    @Step
    public void userEnterAValidEmail(String email) {
        $(emailText()).type(email);
    }
    @Step
    public void userEnterAValidPassword(String password) {
        $(passwordText()).type(password);
    }
    @Step
    public void userClickOnRegisterButton() {
        $(registerBtn()).click();
    }
}
