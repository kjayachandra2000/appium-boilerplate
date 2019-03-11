package com.example.android.features;

import com.example.android.steps.LoginSteps;
import org.junit.Test;

public class LoginSpec extends BaseSpec {

    private final LoginSteps loginSteps = new LoginSteps();

    @Test
    public void tc_1() {
        loginSteps
                .givenIEnterText("Hello World")
                .andITapOnContinue()
                .thenIVerifyGivenTextIsDisplayed("Hello World");
    }
}
