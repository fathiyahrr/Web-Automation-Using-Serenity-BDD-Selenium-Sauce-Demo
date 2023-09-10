package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.YourCartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class YourCartSteps {
    private final WebDriver driver = Hooks.driver;

    YourCartPage yourCartPage = new YourCartPage(driver);

    @When("User already on your cart page")
    public void verifyYourCartPage() {
        Assert.assertTrue(yourCartPage.verifyYourCartPage());
    }

    @And("User click button remove")
    public void selectButtonRemove(){
        yourCartPage.selectButtonRemove();
    }

    @And("User click button checkout")
    public void selectButtonCheckout(){
        yourCartPage.selectButtonCheckout();
    }

}
