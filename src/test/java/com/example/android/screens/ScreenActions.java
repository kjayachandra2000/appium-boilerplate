package com.example.android.screens;

import com.example.android.features.BaseSpec;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenActions {

    private final AndroidDriver driver;
    private final WebDriverWait defaultWait;

    protected ScreenActions() {
        this.driver = BaseSpec.driver;
        this.defaultWait = new WebDriverWait(driver, 120);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    protected void tap(MobileElement mobileElement) {
        mobileElement.click();
    }

    protected void type(MobileElement mobileElement, String setValue) {
        mobileElement.sendKeys(setValue);
    }

    protected String textOf(MobileElement mobileElement) {
        return mobileElement.getText();
    }

    public boolean isDisplayed(WebElement element) {
        try {
            defaultWait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception ignored) {
        }
        return false;
    }
}
