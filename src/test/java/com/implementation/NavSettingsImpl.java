package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class NavSettingsImpl {
  private final By settingsBtnPage = By.xpath("//a[@href='/settings']");
  private final By businessBtn = By.xpath("//input[@placeholder='Business Name']");
  private final By industrySelect = By.xpath("//select[@name='industry']");
  private final By industrySelectOption = By.xpath("//option[@value='Investment Banking']");
  private final By removeLogo = By.xpath("//span[contains(text(),'Remove logo')]");
  private final By scheduleBtn = By.xpath("//span[contains(text(),'Schedule')]");
  private final By selectTimezone = By.xpath("//option[@value='Europe/Skopje']");
  private final By timeZone = By.xpath("//select[@name='timezone']");
  private final By maxHours = By.xpath("//input[@name='maxHours']");
  private final By startDayDrp = By.xpath("//select[@name='startDay']");
  private final By startDayDrpSelect = By.xpath("//option[@value='MONDAY']");
  private final By availability = By.xpath("//select[@name='employeeAvailability']");
  private final By availabilityoption = By.xpath("//option[@value='false']");
  private final By scheduleView = By.xpath("//select[@name='employeeFullSchedules']");
  private final By scheduleViewoption = By.xpath("//option[@value='false']");
  private final By saveBtn = By.xpath("//button[contains(text(),'Save')]");
  private final By logout = By.xpath("//a[@href='/logout']");


    private final WebDriver chrome;
    private WebElement element;

    public NavSettingsImpl(WebDriver chrome){this.chrome = chrome;}

   public NavSettingsImpl settingsPage(String newName,String maxHoursKeys) throws InterruptedException{
     Thread.sleep(1000);
     chrome.findElement(settingsBtnPage).click();
//     new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(businessBtn));
     Thread.sleep(1000);
     chrome.findElement(businessBtn).clear();
     chrome.findElement(businessBtn).sendKeys(newName);
     Assert.assertEquals(chrome.findElement(businessBtn).getAttribute("value"),newName);
     chrome.findElement(industrySelect).click();
     Thread.sleep(1000);
     chrome.findElement(industrySelectOption).click();
     chrome.findElement(removeLogo).click();

     chrome.findElement(scheduleBtn).click();
     new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(selectTimezone));

     chrome.findElement(timeZone).click();
     chrome.findElement(selectTimezone).click();

    Thread.sleep(1000);
     chrome.findElement(maxHours).clear();
     chrome.findElement(maxHours).sendKeys(maxHoursKeys);

     chrome.findElement(startDayDrp).click();
     chrome.findElement(startDayDrpSelect).click();

     chrome.findElement(availability).click();
     chrome.findElement(availabilityoption).click();

     chrome.findElement(scheduleView).click();
     chrome.findElement(scheduleViewoption).click();
     Thread.sleep(5000);
     chrome.findElement(saveBtn).click();

     chrome.findElement(logout).click();
        return this;
}

}
