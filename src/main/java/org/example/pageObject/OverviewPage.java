package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    public static WebDriver webDriver;

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement overviewPage;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement total;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement buttonFinish;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement checkoutComplete;

    public boolean verifyOverviewPage(){
        return overviewPage.isDisplayed();
    }
    public boolean verifyTotal(){
        return total.isDisplayed();
    }
    public void clickButtonFinish(){
        buttonFinish.click();
    }
    public boolean verifycheckoutComplete(){
        return checkoutComplete.isDisplayed();
    }
}
