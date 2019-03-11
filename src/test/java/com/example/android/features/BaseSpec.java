package com.example.android.features;

import com.example.android.support.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;

public class BaseSpec {

    public static AndroidDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = new DriverManager().getDriver();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    @Before
    public void before() {
    }

    @After
    public void after() {
        takeScreenshot();
    }

    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Attachment
    private byte[] takeScreenshot() {
        try {
            return (driver).getScreenshotAs(OutputType.BYTES);
        } catch (WebDriverException ignore) {
        }
        return null;
    }
}
