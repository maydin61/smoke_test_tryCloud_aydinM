package com.project.pages;

import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FilesPage extends BasePage {


    @FindBy(className = "app-sidebar-tabs__content")
    public WebElement sideBar;


    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement folderIcon;

    @FindBy(xpath = "//span[@class='icon icon-add']")

    public WebElement plusIcon;

    @FindBy(xpath = "(//span[@class='displayname'])[1]")
    public WebElement uploadFileIcon;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement FileUpload;

    @FindBy(xpath = "(//span[@class='nametext'])[1]")
    public WebElement actualUploadedFile;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[21]")
    public WebElement threeDot;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement threeDotDocument;

    @FindBy(css = "[data-action='Delete']")
    public WebElement deleteFileButton;


    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderSelect;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement arrowIconClick;

    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement newFolderLocate;

    @FindBy(xpath = "(//span[text()='New text document'])")
    public WebElement newTextDocument1;

    @FindBy(xpath = "(//span[text()='New text document'])[2]")
    public WebElement newTextDocument2;

    @FindBy(xpath = "(//span[text()='Move or copy'])[2]")
    public WebElement moveOrCopyButton;

    @FindBy(xpath = "//td[@class='filename']")
    public WebElement chooseTargetfolder;

    @FindBy(xpath = "//button[text()='Move to 11']")
    public WebElement moveToButton;

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement closeIcon;

    @FindBy(xpath = "(//h2[text()='No files in here'])[1]")
    public WebElement NoFilesText;

    @FindBy(xpath = "//td[@class='filesummary']")
    public WebElement NumberOfFile;

    @FindBy(xpath = "//span[text()='Add to favorites']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//div[@class='icon-menu']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//a [@class='nav-icon-favorites svg']")
    public WebElement favoritesMenu;

    @FindBy(xpath = "//span[text()='11']")
    public WebElement talkFolder;

    @FindBy(xpath = "(//span[text()='11'])[2]")
    public WebElement talkFolderAssert;


    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> folderlist;

    @FindBy(css="input[type=load]")
    public WebElement fileUpload;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public  WebElement uploadFileDropDown;


    public void fileUpload (String fileName) {
        //String desktopFilePath = "C://Users//Administrator//Desktop//"+fileName+".txt";


        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/" + fileName;
        String projectFilePath = projectPath + "/" + filePath;

        uploadFileDropDown.sendKeys(projectFilePath);

    }

    public WebElement threeDotMethod(int index) {

        String deleteButtonLocator = "((//span[@class='nametext'])[" + index + "]/..//span)[9]";
        return Driver.getDriver().findElement(By.xpath(deleteButtonLocator));
    }

    public int getFileIndex(String file){

        BrowserUtils.waitFor(3);

        List<String> actualFolderList = BrowserUtils.getElementsText(folderlist);
        int count = 1;

        for (int i = 0; i < actualFolderList.size(); i++) {

            if(actualFolderList.get(i).contains(file)) {
                break;
            }
            count++;
            System.out.println("count = " + count);

        }
        return count;
    }

    @FindBy(xpath = "//tr[@data-mime='image/jpeg']")
    public List<WebElement> imagesFromFiles;
}
