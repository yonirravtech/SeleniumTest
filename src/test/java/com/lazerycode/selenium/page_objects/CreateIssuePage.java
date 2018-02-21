package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.util.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateIssuePage {


    WebDriver driver;
    String issue;
    String url = "https://github.com/yonirravtech/Expedia/issues/new";

    Query title = new Query(By.id("issue_title"));
    Query description = new Query(By.id("issue_body"));
    Query lablebtn = new Query(By.className("js-new-issue-labels-container"));
    Query lable = new Query(By.xpath("//*[@class=\"select-menu-item label-select-menu-item js-navigation-item\"][1]"));
    Query submitBTN = new Query(By.id("new_issue"));

    public CreateIssuePage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
    }

    public void setTitle(String title) {
        this.title.findWebElement().clear();
        this.title.findWebElement().sendKeys(title);

    }

    public void setDdescription(String description) {
        this.description.findWebElement().clear();
        this.description.findWebElement().sendKeys(description);

    }

    public void setLable() {
        this.lablebtn.findWebElement().click();
        this.lable.findWebElement().click();
        this.submitBTN.findWebElement().submit();

    }
}
