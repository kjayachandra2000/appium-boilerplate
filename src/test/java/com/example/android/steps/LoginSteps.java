package com.example.android.steps;

import com.example.android.screens.TextViewScreen;
import com.example.android.screens.LandingScreen;
import io.qameta.allure.Step;
import org.junit.Assert;

public class LoginSteps {

    private final LandingScreen landingScreen = new LandingScreen();
    private final TextViewScreen textViewScreen = new TextViewScreen();

    @Step
    public LoginSteps givenIEnterText(String text) {
        landingScreen
                .isDisplayed()
                .enterWelcomeText(text);
        return this;
    }

    @Step
    public LoginSteps andITapOnContinue() {
        landingScreen
                .continueNext();
        return this;
    }

    @Step
    public void thenIVerifyGivenTextIsDisplayed(String text) {
        Assert.assertEquals(text,textViewScreen.getTitle());
    }
}
