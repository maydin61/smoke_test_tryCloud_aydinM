package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class FilePage extends BasePage{


     @FindBy(xpath = "(//li[@data-id='files'])[1]")
        public WebElement folderIcon;

    @FindBy(xpath = "//span[@class='icon icon-add']")

    public WebElement plusIcon;

    @FindBy(xpath = "//span[@class='displayname']")

    public WebElement uploadFileIcon;


    }


