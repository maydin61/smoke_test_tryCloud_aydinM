package com.project.pages;

import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US0012_FilePage extends BasePage {

    @FindBy(xpath = "//span[text()='Add to favorites']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//a [@class='nav-icon-favorites svg']")
    public WebElement favorites;


    @FindBy(xpath = "(//span[@class='innernametext'])[13]")
    public WebElement file1;

    @FindBy(xpath = "(//span[@class='innernametext'])[21]")
    public WebElement renameFile;

    @FindBy(xpath = "//span[text()='Details']")
    public WebElement details;

    @FindBy(xpath = "//span[text()='Rename']")
    public WebElement rename;

    @FindBy(xpath = "//a[@id=\"commentsTabView\"]")
    public WebElement commentsTabView;

    @FindBy(xpath = "//div[@class=\"message\"]")
    public WebElement commentBox;

    @FindBy(xpath = "//input[contains(@class, \"submit\")]")
    public WebElement commentSubmit;


    @FindBy(xpath = "//a[@class=\"action more icon icon-more has-tooltip\"]")
    public WebElement commentThreeDot;
    
    

    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> ListOfFiles;

    @FindBy(xpath = "/html/body/div[3]/aside/div/div/section[3]/div/ul/li[1]/div[2]")
    public WebElement commentMessage;

    @FindBy(xpath = "/html/body/div[3]/aside/div/div/section[3]/div/ul/li/div[1]/div[5]/ul/li[2]/a/span[2]")
    public WebElement deleteComment;

    @FindBy(xpath = "(//div[@class='emptycontent'])[2]")
    public WebElement noComment;



    public int getFileIndex(String file){

        BrowserUtils.waitFor(3);

        List<String> actualFolderList = BrowserUtils.getElementsText(ListOfFiles);
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


    public WebElement threeDot(int index) {

        String threeDotLocator = "((//span[@class='nametext'])["+index+"]/..//span)[9]";
        WebElement threeDot = Driver.getDriver().findElement(By.xpath(threeDotLocator));
        return threeDot;
    }

}
