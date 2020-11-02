package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SideChatPageImpl {

    // ========== LOCATORS ==========
    private final By userPage = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/a[2]");
    //    private final By searchBar = By.cssSelector("input[placeholder='Search']");
    private final By selectLocation = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/div[2]/div");
    private final By selectLocationBtn = By.xpath("//span[contains(text(),'Afrikaans')]");
    private final By searchBtn = By.xpath("//span[contains(text(),'Search')]");
    private final By skillInputFilter = By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[1]/div[1]/input");
    private final By languageInputFilter = By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[1]/div[2]/input");
    private final By languageInputFilterDeleteBtn = By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[1]/div[2]/i");
    private final By skillsInputFilterDeleteBtn = By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[1]/div[1]/i");
    private final By gridBtn = By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[2]/div[2]");
    private final By favortieBtn = By.xpath("//*[@id=\"root\"]/div[4]/div/div[3]/div[1]/div[1]/div[2]/span[2]/img");
    private final By viewBtn = By.xpath("//*[@id=\"root\"]/div[4]/div/div[3]/div[1]/div[1]/div[2]/span[1]/img");
    private final By chatBtn = By.xpath("//a[@href='/message']");
    private final By createChat = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/div");
    private final By newChatbtn = By.xpath("//span[contains(text(),'New Group')]");
    private final By searchBar = By.xpath("//input[@placeholder='Search here']");
    private final By selectAllBtnForChat = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[3]");
    private final By selectAllBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/div[3]");
    private final By selectAllBtn2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/div/div[3]");
    private final By selectAllBtn3 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[4]/div/div[3]");
    private final By createGroup = By.xpath("//span[contains(text(),'Create Group')]");
    private final By createChanel = By.xpath("//span[contains(text(),'New Channel')]");
    private final By inputName = By.xpath("//input[@placeholder='Name']");
    private final By chooseLink = By.xpath("//select[@id='status']");
    private final By chooseLinkdrpOption = By.xpath("//option[@value='false']");
    private final By descriptionText = By.xpath("//textarea[@id='description']");
    private final By updateBtn = By.xpath("//span[contains(text(),'Create Channel')]");
    private final By dmMessage = By.xpath("//span[contains(text(),'ShedwoolAutomation')]");
    private final By directMessage = By.xpath("//input[@placeholder='Write your message…']");
    private final By sendMsgBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/button/img");
    private final By editGroup = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/a/img");
    private final By addMember = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div/div[3]/div[2]/div[2]/div[3]");
    private final By convertToChannelbtn = By.xpath("//span[contains(text(),'Convert to channel')]");
    private final By convertToChannelBTN = By.xpath("//span[contains(text(),'Convert to channel')]");
    private final By alertDismiss = By.xpath("//*[@id=\"f0rurtt9jw\"]/button/svg/path");
    private final By leavChannel = By.xpath("//span[contains(text(),'Leave Channel')]");
    private final By yesBtn = By.xpath("//span[contains(text(),'Yes')]");
    //    private final By directMSG = By.xpath("//span[contains(text(),'ShedwoolAutomation')]");
    private final By directMSG = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/a[80]/div/div[2]");
    private final By XbtnAttach = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/button");
    private final By selectAllBtnForGroup = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[3]");
    private final By selectAllBtnForGroup2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div/div[3]");
    private final By selectAllBtnForGroup3 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[5]/div/div[3]");





    private final WebDriver chrome;


    public SideChatPageImpl(WebDriver chrome) {
        this.chrome = chrome;
    }

    // ========== METHODS ==========
    public SideChatPageImpl sideBarChatBtn() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(chatBtn).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(createChat));
        chrome.findElement(createChat).click();
        return this;
    }
    public SideChatPageImpl newGroup(String chanelName,String descriptionTextArea)throws InterruptedException{
//        chrome.findElement(searchBar).sendKeys(searchBarinput);
//        Assert.assertEquals(chrome.findElement(searchBar).getAttribute("value"),searchBarinput);
//        Thread.sleep(4000);
//        chrome.findElement(backBtn).click();
        chrome.navigate().to("https://test.shedwool.com/message/new");
        chrome.findElement(newChatbtn).click();
//        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(selectAllBtnForChat));
        Thread.sleep(2000);
        chrome.findElement(selectAllBtnForGroup).click();
        chrome.findElement(selectAllBtnForGroup2).click();
        chrome.findElement(selectAllBtnForGroup3).click();
        Thread.sleep(3000);
        chrome.findElement(createGroup).click();

//        chrome.findElement(convertToChannelBTN).click();
//        chrome.findElement(inputName).sendKeys(chanelName +"Test");
//        Assert.assertEquals(chrome.findElement(inputName).getAttribute("value"),chanelName +"Test");
//
//        chrome.findElement(chooseLink).click();
//        chrome.findElement(chooseLinkdrpOption).click();
//
//        chrome.findElement(descriptionText).sendKeys(descriptionTextArea);
//        Assert.assertEquals(chrome.findElement(descriptionText).getAttribute("value"),descriptionTextArea);
//        chrome.findElement(convertToChannelbtn).click();
        return this;
    }
    public SideChatPageImpl newChanel(String chanelName,String descriptionTextArea,String searchBarinput,String directMessageinput)throws InterruptedException{
        chrome.navigate().to("https://test.shedwool.com/message/new");
//        chrome.findElement(newChatbtn).click();
        Thread.sleep(1000);
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(createChanel));
        chrome.findElement(createChanel).click();
        Thread.sleep(2000);
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(inputName));
        chrome.findElement(selectAllBtn).click();
        chrome.findElement(selectAllBtn2).click();
        chrome.findElement(selectAllBtn3).click();
        chrome.findElement(inputName).sendKeys(chanelName);
        Assert.assertEquals(chrome.findElement(inputName).getAttribute("value"),chanelName);

        chrome.findElement(chooseLink).click();
        chrome.findElement(chooseLinkdrpOption).click();

        chrome.findElement(descriptionText).sendKeys(descriptionTextArea);
        Assert.assertEquals(chrome.findElement(descriptionText).getAttribute("value"),descriptionTextArea);

        chrome.findElement(descriptionText).sendKeys(descriptionTextArea);
        chrome.findElement(updateBtn).click();


        chrome.findElement(searchBar).sendKeys(searchBarinput);
        Assert.assertEquals(chrome.findElement(searchBar).getAttribute("value"),searchBarinput);
        Thread.sleep(3000);
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(dmMessage));
        chrome.findElement(dmMessage).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(directMessage));
        chrome.findElement(directMessage).sendKeys(directMessageinput);
        Assert.assertEquals(chrome.findElement(directMessage).getAttribute("value"),directMessageinput);
        chrome.findElement(sendMsgBtn).click();
        Thread.sleep(5000);
        chrome.findElement(XbtnAttach).click();
        chrome.findElement(editGroup).click();
//        chrome.findElement(addMember).click();

        chrome.findElement(leavChannel).click();
        chrome.findElement(yesBtn).click();

        Thread.sleep(2000);
        chrome.findElement(directMSG).click();
        Thread.sleep(5000);


        chrome.findElement(editGroup).click();
//        chrome.findElement(convertToChannelBTN).click();
//        chrome.findElement(inputName).sendKeys(chanelName +"Test");
//        Assert.assertEquals(chrome.findElement(inputName).getAttribute("value"),chanelName +"Test");
//
//        chrome.findElement(chooseLink).click();
//        chrome.findElement(chooseLinkdrpOption).click();
//
//        chrome.findElement(descriptionText).sendKeys(descriptionTextArea);
//        Assert.assertEquals(chrome.findElement(descriptionText).getAttribute("value"),descriptionTextArea);
//        chrome.findElement(convertToChannelbtn).click();
        Thread.sleep(10000);
        return this;
    }



}
