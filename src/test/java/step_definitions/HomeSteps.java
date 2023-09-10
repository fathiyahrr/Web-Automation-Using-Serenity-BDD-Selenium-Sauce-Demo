package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private WebDriver driver = Hooks.driver;

    HomePage homePage = new HomePage(driver);

    @And("And User already on home page")
    public void verifyLabelProduct(){
        Assert.assertTrue(homePage.verifyLabelProduct());
    }

    @And("User filter list  product by {string}")
    public void selectFilterProduct(String filterProduct) {
        homePage.selectFilterProduct(filterProduct);
    }
    @And("User click button cart 1 {string}")
    public void clickButtonCart1(String button1){
        homePage.clickButtonCart1(button1);
    }

    @And("User click button cart 2 {string}")
    public void clickButtonCart2 (String button2){
        homePage.clickButtonCart2(button2);
    }
    @Then("User click shopping cart")
    public void selectShoppingCart() {
        homePage.selectShoppingCart();
    }
}