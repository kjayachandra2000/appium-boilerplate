# Automated Functional Tests for Android App

### Summary
This repository contains the tests for the Emirates Android app, these tests are developed using Appium & JUnit4

### Getting Started
Install Node

    > brew install node

Install appium using node

    > npm install -g appium

Start an android emulator based on these capabilities

    capabilities.setCapability("platformName", "android");
    capabilities.setCapability("platformVersion", "6");
    capabilities.setCapability("deviceName", "Nexus 6 API 23");

Run all tests:

    > mvn clean test -Dappium.app=/path-to-apk
