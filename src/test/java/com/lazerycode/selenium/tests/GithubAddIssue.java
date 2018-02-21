package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.config.DriverFactory;
import com.lazerycode.selenium.page_objects.LoginPage;
import com.lazerycode.selenium.page_objects.CreateIssuePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GithubAddIssue {

    @Test
    public void addIssue() {

        WebDriver driver = new DriverFactory().getDriver();
        LoginPage login = new LoginPage(driver);
        login.login();
        CreateIssuePage createIssue = new CreateIssuePage(driver);
        createIssue.setTitle("cool selenium project!");
        createIssue.setDdescription("bla bla bla");
        createIssue.setLable();
        driver.quit();

    }
}