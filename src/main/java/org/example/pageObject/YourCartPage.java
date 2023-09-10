package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
    public static WebDriver webDriver;

    public YourCartPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement buttonRemove;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckout;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement yourCart;

    public void selectButtonRemove(){
        buttonRemove.click();
    }
    public void selectButtonCheckout(){
        buttonCheckout.click();
    }
    public boolean verifyYourCartPage() {
        return yourCart.isDisplayed();
    }
}
