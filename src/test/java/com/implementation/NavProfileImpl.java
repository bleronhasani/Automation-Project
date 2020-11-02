package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavProfileImpl {
    private final By changePasswordBtn = By.xpath("//span[contains(text(),'Change Password')]");
    private final By oldPassword = By.xpath("//input[@placeholder='Old Password']");
    private final By newPassword = By.xpath("//input[@name='password']");
    private final By confirmNewPassword = By.xpath("//input[@placeholder='Confirm Password']");
    private final By changePassword = By.xpath("//button[contains(text(),'Change Password')]");
    private final By editname = By.xpath("//input[@name='firstName']");
    private final By editMaxHours = By.xpath("//input[@placeholder='Max Hours']");
    private final By updateBtn = By.xpath("//button[contains(text(),'Update Profile')]");

    private final WebDriver chrome;
    private WebElement element;

    public NavProfileImpl(WebDriver chrome){this.chrome=chrome;}

    public NavProfileImpl profile(String oldPasswordKeys,String editNameInput,String maxHours)throws InterruptedException{
      Thread.sleep(5000);
        chrome.navigate().to("https://test.shedwool.com/profile");
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(changePasswordBtn));
        chrome.findElement(changePasswordBtn).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(oldPassword));
//        chrome.findElement(oldPassword).clear();
        chrome.findElement(oldPassword).sendKeys(oldPasswordKeys);

//        chrome.findElement(newPassword).clear();
        chrome.findElement(newPassword).sendKeys(oldPasswordKeys);

//        chrome.findElement(confirmNewPassword).clear();
        chrome.findElement(confirmNewPassword).sendKeys(oldPasswordKeys);

        chrome.findElement(changePassword).click();


        chrome.findElement(editname).clear();
        Thread.sleep(2000);
        chrome.findElement(editname).sendKeys(editNameInput);
        chrome.findElement(editname).clear();
        chrome.findElement(editMaxHours).clear();
//        Thread.sleep(2000);
        chrome.findElement(editMaxHours).sendKeys(maxHours);
        chrome.findElement(editMaxHours).clear();
        Thread.sleep(5000);
        chrome.findElement(updateBtn).click();
        return this;
    }
}
