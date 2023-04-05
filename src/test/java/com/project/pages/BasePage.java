package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public WebElement navigateModul(String modulName){

       String element = "//a[@href='/index.php/apps/"+modulName.toLowerCase()+"/']";

        WebElement modul = Driver.getDriver().findElement(By.xpath(element));

        return modul;


    }

}
