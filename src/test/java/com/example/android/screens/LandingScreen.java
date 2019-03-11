package com.example.android.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;

public class LandingScreen extends ScreenActions {

    @AndroidFindBy(id = "edTitle")
    private MobileElement txtTitle;

    @FindBy(id = "btnNextScreen")
    private MobileElement btnNextScreen;

    public LandingScreen isDisplayed() {
        assert isDisplayed(btnNextScreen);
        return this;
    }

    public void enterWelcomeText(String text) {
        type(txtTitle, text);
    }

    public void continueNext() {
        tap(btnNextScreen);
    }
}
