package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutPage;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;

    public boolean verifycheckoutPage1(){
        return checkoutPage.isDisplayed();
    }
    public void setFirstName(String frstName) {
        firstName.sendKeys(frstName);
    }
    public void setLastName(String lstName) {
        lastName.sendKeys(lstName);
    }
    public void setPostalCode(String pstalCode){
        postalCode.sendKeys(pstalCode);
    }
    public void clickButtonContinue(){
        buttonContinue.click();
    }
}
