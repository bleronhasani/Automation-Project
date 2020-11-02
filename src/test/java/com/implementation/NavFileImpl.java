package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NavFileImpl {
    private final By sdieBarFileBtn = By.xpath("//a[@href='/files']");
    private final By addNew = By.xpath("//span[contains(text(),'Add New')]");
    private final By collectionInputName = By.xpath("//input[@name='name']");
    private final By addCollectionBtn = By.xpath("//button[contains(text(),'Add Collection')]");
    private final By selectOneCollection = By.xpath("//span[contains(text(),'automationPRR_(055)')]");
    private final By addNewBtn = By.xpath("//button[contains(text(),'New Folder')]");
    private final By directoryNameInput = By.xpath("//input[@name='name']");
    private final By addDirectoryBtn = By.xpath("//button[contains(text(),'Add Directory')]");
    private final By goInsideFolder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]");
    private final By addFileBtn = By.xpath("//button[contains(text(),'Add Files')]");
    private final By cancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
    private final By backBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[2]/img");
    private final By deleteBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]");
    private final By addFolder = By.xpath("//button[contains(text(),'New Folder')]");


    private final WebDriver chrome;
    private WebElement element;

    public NavFileImpl(WebDriver chrome) {
        this.chrome = chrome;
    }

  public NavFileImpl filePage(String collectionName,String directoryName)throws InterruptedException{
        chrome.findElement(sdieBarFileBtn).click();
        Thread.sleep(1000);
        chrome.findElement(addNew).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(collectionInputName));
        chrome.findElement(collectionInputName).sendKeys(collectionName);
        Assert.assertEquals(chrome.findElement(collectionInputName).getAttribute("value"),collectionName);
        chrome.findElement(addCollectionBtn).click();
        Thread.sleep(2000);
        chrome.findElement(selectOneCollection).click();
        chrome.findElement(addNewBtn).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(directoryNameInput));
        chrome.findElement(directoryNameInput).sendKeys(directoryName);
        chrome.findElement(addDirectoryBtn).click();
        chrome.findElement(goInsideFolder).click();
        chrome.findElement(addFileBtn).click();
        chrome.findElement(cancelBtn).click();
//        chrome.findElement(backBtn).click();
        chrome.findElement(deleteBtn).click();
        return this;
  }


}
