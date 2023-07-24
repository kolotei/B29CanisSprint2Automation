package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppreciationPage extends  BasePage{

    public AppreciationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Activity Stream']")
    public WebElement activeStreamModule;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreOptionMessage;

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement appreciationMessage;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileInAppreciation;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadSection;

    @FindBy(xpath = "(//span[@class='insert-btn'])[1]")
    public WebElement firstFileInsert;

    @FindBy(xpath = "(//span[@title='Click to insert file'])[1]")
    public WebElement firstFileName;

    @FindBy(xpath = "//td[@class='files-info']")
    public WebElement inTextMessage;

    @FindBy(css = "span[class='del-but']")
    public WebElement deleteUploadBtn;

    /** I was trying different locators and approaches to load List of WebElements with files that uploaded but website takes vary long time to load that list
     * so I and option out from testing all upload files and go directly for the first one */
    public void insertFiles () {

        wait.until(ExpectedConditions.visibilityOf(firstFileInsert));
        firstFileInsert.click();
        Assert.assertTrue("File was not inserted in message body",inTextMessage.isDisplayed());

    }

    /**
     * This method works is created to delete all file that were inserted and verify that they were removed from attached section,
     * Unfortunate our environment table is loading for long time and neither explicit or implicit wait helps execute this method properly
     *
     */

    public void deleteFile() {

        wait.until(ExpectedConditions.elementToBeClickable(deleteUploadBtn));
        deleteUploadBtn.click();
        Assert.assertTrue(firstFileInsert == null);
        /*List<WebElement> filesToDelete = Driver.getDriver().findElements(By.cssSelector("span[class='del-but']"));
        for (int counter = 1; counter <= filesToDelete.size(); counter++ ) {
            deleteUploadBtn.click();
        }
        Assert.assertTrue(!firstFileInsert.isDisplayed());*/

    }

}
