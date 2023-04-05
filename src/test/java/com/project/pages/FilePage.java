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

    @FindBy(css="input[type=file]")
    public WebElement FileUpload;

    @FindBy(xpath = "(//span[@class='nametext'])[2]")
    public WebElement actualUploadedFile;



    public void fileUpload(String fileName) {
        //String desktopFilePath = "C://Users//Administrator//Desktop//"+fileName+".txt";

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/" + fileName + ".txt";
        String projectFilePath = projectPath + "/" + filePath;
        FileUpload.sendKeys(projectFilePath);

    }



    }


