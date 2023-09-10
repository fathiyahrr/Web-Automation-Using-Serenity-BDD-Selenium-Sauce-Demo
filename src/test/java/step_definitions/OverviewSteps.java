package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OverviewSteps {

    private final WebDriver driver = Hooks.driver;

    OverviewPage overviewPage = new OverviewPage (driver);

    @Then("User already on checkout:overview page")
    public void verifyOverviewPage(){
        Assert.assertTrue(overviewPage.verifyOverviewPage());
    }
    @When("User check total")
    public void verifyTotal(){
        Assert.assertTrue(overviewPage.verifyTotal());
    }
    @And("User click on finish button")
    public void clickButtonFinish(){
        overviewPage.clickButtonFinish ();
    }
    @Then("User already on Chechout: Complete! page")
    public void verifycheckoutComplete(){
        Assert.assertTrue(overviewPage.verifycheckoutComplete());
    }
}
