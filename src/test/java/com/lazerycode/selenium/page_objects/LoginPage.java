package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    String url = "https://github.com/login";

    Query userName = new Query(By.id("login_field"));
    Query password = new Query(By.name("password"));


    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.get(url);
    }
    public void login() {
        userName.findWebElement().clear();
        #enter git login details 
        userName.findWebElement().sendKeys("");
        password.findWebElement().clear();
        password.findWebElement().sendKeys("");
        password.findWebElement().submit();

    }



}
