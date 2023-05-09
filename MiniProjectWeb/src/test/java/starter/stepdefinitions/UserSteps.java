package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
    //========================Registrasi============================
    @Steps
    RegisterPage registerPage;
    @Given("user on main page")
    public void userOnMainPage() {
        registerPage.userOnMainPage();
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        registerPage.userClickOnLoginButton();
    }

    @And("user on login page")
    public void userOnLoginPage() {
        registerPage.userOnLoginPage();
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerPage.userClickRegisterButton();
    }

    @And("user on register page")
    public void userOnRegisterPage() {
        registerPage.userOnRegisterPage();
    }

    @And("user enter a valid full name")
    public void userEnterAValidFullName() {
        registerPage.userEnterAValidFullName("denise");
    }

    @And("user enter a valid email")
    public void userEnterAValidEmail() {
        registerPage.userEnterAValidEmail("denise@gmail.com");
    }

    @And("user enter a valid password")
    public void userEnterAValidPassword() {
        registerPage.userEnterAValidPassword("123");
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        registerPage.userClickOnRegisterButton();
    }
    //========================Product Detail============================
    @Steps
    ProductDetailPage productDetailPage;
    @And("user click the detail button on the selected product")
    public void userClickTheDetailButtonOnTheSelectedProduct() {
        productDetailPage.userClickTheDetailButtonOnTheSelectedProduct();
    }

    @Then("user on detail page")
    public void userOnDetailPage() {
        productDetailPage.userOnDetailPage();
    }
    //========================Buy Product============================
    @Steps
    BuyProductPage buyProductPage;
    @And("user click buy button on the selected product")
    public void userClickBuyButtonOnTheSelectedProduct() {
        buyProductPage.userClickBuyButtonOnTheSelectedProduct();
    }

    @And("user can see the number in the shopping cart")
    public void userCanSeeTheNumberInTheShoppingCart() {
        buyProductPage.userCanSeeTheNumberInTheShoppingCart();
    }

    @And("user can click shopping cart button")
    public void userCanClickShoppingCartButton() {
        buyProductPage.userCanClickShoppingCartButton();
    }

    @Then("user can see product purchased")
    public void userCanSeeProductPurchased() {
        buyProductPage.userCanSeeProductPurchased();
    }
    //========================Payment============================
    @Steps
    PaymentPage paymentPage;
    @And("user can add number product")
    public void userCanAddNumberProduct() {
        paymentPage.userCanAddNumberProduct();
    }

    @And("user can click pay button")
    public void userCanClickPayButton() {
        paymentPage.userCanClickPayButton();
    }

    @Then("user goes to the successful transaction page")
    public void userGoesToTheSuccessfulTransactionPage() {
        paymentPage.userGoesToTheSuccessfulTransactionPage();
    }
    //========================Select Category============================
    @Steps
    SelectCategoryPage selectCategoryPage;
    @And("user click select category button")
    public void userClickSelectCategoryButton() {
        selectCategoryPage.userClickSelectCategoryButton();
    }

    @Then("user can see selected category")
    public void userCanSeeSelectedCategory() {
        selectCategoryPage.userCanSeeSelectedCategory();
    }
    //========================Transaction============================
    @Steps
    TransactionPage transactionPage;
    @And("user click account button")
    public void userClickAccountButton() {
        transactionPage.userClickAccountButton();
    }

    @And("user can click transaction")
    public void userCanClickTransaction() {
        transactionPage.userCanClickTransaction();
    }
    //========================Transaction============================

    @And("user can click logout button")
    public void userCanClickLogoutButton() {
    }

    @And("user enter a invalid email")
    public void userEnterAInvalidEmail() {
    }

    @Then("user see an error message")
    public void userSeeAnErrorMessage() {
    }

    @And("user enter a invalid password")
    public void userEnterAInvalidPassword() {
    }
}
