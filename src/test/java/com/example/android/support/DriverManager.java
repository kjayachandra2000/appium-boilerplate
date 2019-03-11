package com.example.android.support;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class DriverManager {

    private static final int COMMAND_TIMEOUT = 180;

    private final File app;

    public DriverManager() {
        this.app = new File(Settings.get("app"));
    }

    public AndroidDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Settings.get("deviceName"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.APP, app);

        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, COMMAND_TIMEOUT);
        capabilities.setCapability("clearDeviceLogsOnStart", true);

        return getDriver(capabilities);
    }

    private AndroidDriver getDriver(DesiredCapabilities capabilities) {
        try {
            return new AndroidDriver(new URL(Settings.get("hub")), capabilities);
        } catch (Exception ex) {
            throw new Error(ex);
        }
    }
}
