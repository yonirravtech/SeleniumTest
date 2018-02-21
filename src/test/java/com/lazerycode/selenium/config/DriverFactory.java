package com.lazerycode.selenium.config;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.lazerycode.selenium.config.DriverType.CHROME;

public class DriverFactory {

    private RemoteWebDriver webdriver;

    private final DriverType browser = CHROME;

    public WebDriver getDriver() {
        if (null == webdriver) {
            MutableCapabilities mutableCapabilities = browser.getDesiredCapabilities();
            webdriver = browser.getWebDriverObject(mutableCapabilities);
            Query.initQueryObjects(webdriver);
        }

        return webdriver;
    }


}

