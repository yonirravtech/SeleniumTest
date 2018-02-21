package com.lazerycode.selenium.config;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public enum DriverType implements DriverSetup {


    CHROME {
        public MutableCapabilities getDesiredCapabilities() {
            ChromeOptions options = new ChromeOptions();
            return options;
        }

        public RemoteWebDriver getWebDriverObject(MutableCapabilities capabilities) {
            String chromePath = System.getProperty("user.dir") + "/chromedriver";
            System.out.println(chromePath);
            System.setProperty("webdriver.chrome.driver", chromePath);
            return new ChromeDriver(capabilities);
        }
    },

}