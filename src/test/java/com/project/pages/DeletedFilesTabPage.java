package com.project.pages;

import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[3]/span")
    public WebElement recentDeletedFileTime;

    @FindBy(xpath = "//div[@id='app-content-trashbin']/table//a/span[.='Name']")
    public WebElement sortByName;

    @FindBy(xpath = "//span[@class='nametext extra-data']")
    public WebElement oldestDeletedFile;

    public static void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,500)");

    }

    public static void scrollUp(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(0,-500)");
    }
    public static String closestTime(){
        BrowserUtils.waitFor(3);
        scrollDown();
        scrollUp();
        List<WebElement> deletedFilesDate = Driver.getDriver().findElements(By.xpath("//*[@id='fileList']/tr/td[3]/span"));
        List<String> dateTime = new ArrayList<>();
        for (WebElement eachElementDate : deletedFilesDate) {
            dateTime.add(eachElementDate.getAttribute("data-original-title"));
        }
        String[] dateTimeStrings = dateTime.toArray(new String[0]);
        // Get the current local date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Initialize the closest date-time as the first parsed date-time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");
        LocalDateTime closestDateTime = LocalDateTime.parse(dateTimeStrings[0], formatter);
        Duration minDifference = Duration.between(currentDateTime, closestDateTime).abs();

        // Iterate through the rest of the date-time strings and update closestDateTime and minDifference if needed
        for (int i = 1; i < dateTimeStrings.length; i++) {
            LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStrings[i], formatter);
            Duration difference = Duration.between(currentDateTime, parsedDateTime).abs();
            if (difference.compareTo(minDifference) < 0) {
                closestDateTime = parsedDateTime;
                minDifference = difference;
            }
        }
        // Convert closestDateTime to string in the format "MMMM d, yyyy h:mm a"
        String closestDateTimeString = closestDateTime.format(formatter);
        return closestDateTimeString;

    }
    public static String expected;


}
