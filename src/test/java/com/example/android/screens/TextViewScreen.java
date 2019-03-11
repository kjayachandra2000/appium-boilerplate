package com.example.android.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TextViewScreen extends ScreenActions {

    @AndroidFindBy(id = "tvEnterTitle")
    private MobileElement txtTitle;

    public String getTitle() {
        return textOf(txtTitle);
    }
}
