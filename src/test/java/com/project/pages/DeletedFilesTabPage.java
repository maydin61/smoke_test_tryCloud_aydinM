package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletedFilesTabPage {

    public DeletedFilesTabPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/index.php/apps/files/']")
    public WebElement filesButton;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//a[.='Deleted']")
    public WebElement deletedButton;

    @FindBy(xpath = "//span[@class='nametext extra-data']")
    public WebElement recentDeletedFile;
}
