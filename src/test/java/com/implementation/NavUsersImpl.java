package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Reporter.clear;

public class NavUsersImpl {
    private final By sideBarUsersBtn = By.xpath("//a[@href='/users']");
    private final By editBtn = By.xpath("//button[@tabindex='0']");
    private final By addNewBtn = By.xpath("//button[contains(text(),'Add New')]");
    private final By nameInput = By.xpath("//input[@placeholder='First Name']");
    private final By lastnameInput = By.xpath("//input[@placeholder='Last Name']");
    private final By phoneNumber = By.xpath("//input[@value='+1']");
    private final By maxHours = By.xpath("//input[@name='maxHours']");
    private final By email = By.xpath("//input[@name='email']");
    private final By locationdrp = By.xpath("//button[@title='Open']");
    private final By locationdrpOption = By.xpath("//input[@placeholder='Select Locations']");
    private final By position = By.xpath("//button[@title='Open']");
    private final By positiondrpOption = By.xpath("//input[@name='positions']");
    private final By roles = By.xpath("//button[@title='Open']");
    private final By rolesdrpotpion = By.xpath("//*[@id=\"mui-78681\"]");
    private final By addAccountBtn = By.xpath("//*[@id=\"root\"]/div/form/div[1]/div[2]/button");
    private final By editName = By.xpath("//input[@name='firstName']");
    private final By clearNameInput = By.xpath("//*[@id=\"root\"]/div/form/div[2]/div[2]/div/div[1]/div/div/input");
    private final By clearHoursInput = By.xpath("//*[@id=\"root\"]/div/form/div[2]/div[2]/div/div[3]/div/div/input");
    private final By editLastName = By.xpath("//input[@placeholder='Last Name']");
    private final By updateAccBtn = By.xpath("//button[contains(text(),'Update User')]");
    private final By deletebtn = By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]/div/button[2]");
    private final By roleDrp = By.xpath("//input[@placeholder='Select Role']");


    private final WebDriver chrome;
    private WebElement element;

    public NavUsersImpl(WebDriver chrome){this.chrome = chrome;}

    public NavUsersImpl usersBtn() throws InterruptedException{
        Thread.sleep(3000);
        chrome.findElement(sideBarUsersBtn).click();
//        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(editBtn));
        return this;
    }
    public NavUsersImpl addNew(String nameInputKeys,String lastnameInputKeys,String phoneNumberKeys,String hoursInput,String emailInput)throws InterruptedException{
        chrome.findElement(addNewBtn).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(nameInput));
        chrome.findElement(nameInput).sendKeys(nameInputKeys);
        Assert.assertEquals(chrome.findElement(nameInput).getAttribute("value"),nameInputKeys);

        chrome.findElement(lastnameInput).sendKeys(lastnameInputKeys);
        Thread.sleep(1000);
        Assert.assertEquals(chrome.findElement(lastnameInput).getAttribute("value"),lastnameInputKeys);

        chrome.findElement(maxHours).sendKeys(hoursInput);
//        Thread.sleep(2000);
//        Assert.assertEquals(chrome.findElement(maxHours).getAttribute("value"),maxHoursInput);

        chrome.findElement(phoneNumber).sendKeys(phoneNumberKeys);
//        Thread.sleep(1000);
//        Assert.assertEquals(chrome.findElement(phoneNumber).getAttribute("value"),phoneNumberKeys);

        chrome.findElement(email).sendKeys(emailInput);
        Thread.sleep(1000);
        Assert.assertEquals(chrome.findElement(email).getAttribute("value"),emailInput);

        chrome.findElement(locationdrp).click();
        chrome.findElement(locationdrpOption).sendKeys("Prishtina");
        chrome.findElement(locationdrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(locationdrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(locationdrpOption).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        chrome.findElement(locationdrp).click();
        chrome.findElement(locationdrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(locationdrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(locationdrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(locationdrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(locationdrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(locationdrpOption).sendKeys(Keys.ENTER);


        chrome.findElement(position).click();
        chrome.findElement(positiondrpOption).sendKeys("ARKA");
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ENTER);
        chrome.findElement(position).click();
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positiondrpOption).sendKeys(Keys.ENTER);


        chrome.findElement(roleDrp).sendKeys("TENANT");
        chrome.findElement(roleDrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(roleDrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(roleDrp).sendKeys(Keys.ENTER);

        chrome.findElement(addAccountBtn).click();



        return this;
    }
    public NavUsersImpl editUser(String editNameInput,String editLastNameInput)throws InterruptedException{
            chrome.navigate().to("https://test.shedwool.com/users");
            chrome.findElement(editBtn).click();
            new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(editName));
            Thread.sleep(1000);
            chrome.findElement(clearNameInput).clear();
            chrome.findElement(editName).sendKeys(editNameInput);
            chrome.findElement(clearHoursInput).clear();
            chrome.findElement(editLastName).sendKeys(editLastNameInput);
//        Thread.sleep(1000);
//        chrome.findElement(roles).clear();
//        chrome.findElement(roles).sendKeys("Tenant");
//        chrome.findElement(rolesdrpotpion).sendKeys(Keys.ENTER);
//        Thread.sleep(11000);
//        chrome.findElement(roles).click();
//        chrome.findElement(rolesdrpotpion).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(rolesdrpotpion).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(rolesdrpotpion).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(rolesdrpotpion).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(rolesdrpotpion).sendKeys(Keys.ENTER);

         Thread.sleep(5000);
        chrome.findElement(updateAccBtn).click();
        chrome.navigate().to("https://test.shedwool.com/users");
        chrome.findElement(deletebtn).click();
            return this;
    }
}
