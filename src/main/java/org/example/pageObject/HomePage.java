package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public static WebDriver webDriver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelProduck;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filterProduct;
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement buttonCart1;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement buttonCart2;
    @FindBy(xpath = "//a[.='2']")
    private WebElement shoppingCart;
    public boolean verifyLabelProduct(){
        return labelProduck.isDisplayed();
    }
    public void selectFilterProduct(String fltrProduct) {
        Select filter = new Select(filterProduct);
        filter.selectByVisibleText(fltrProduct);
    }
    public void clickButtonCart1(String button1){
        buttonCart1.click();
    }
    public void clickButtonCart2(String button2){
        buttonCart2.click();
    }
    public void selectShoppingCart(){
        shoppingCart.click();
    }
}
