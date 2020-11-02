package com.implementation;

import com.tests.NavDepartmentsTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class NavDepartmentsImpl {
    private final By filterByLocation = By.xpath("//*[@id=\"filter-popover\"]/div[2]/div[3]/img");
    private final By shiftsBtn = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/a[3]");
    private final By filterByLocationOption = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/button");
    private final By filterByPositon = By.xpath("//*[@id=\"filter-popover\"]/div[3]/div[5]/img");
    private final By filterByPositonOption = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/div/div/button[2]");
    private final By filterByDepartment = By.xpath("//*[@id=\"filter-popover\"]/div[3]/div[4]/img");
    private final By filterByDepartmentOption = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div/button[2]");
    private final By viewShiftMenagment=By.xpath("//span[contains(text(),'03:00 PM')]");
//    private final By viewShiftGarden=By.xpath("//span[contains(text(),'01:00 AM')]");
    private final By popUp=By.cssSelector("div[id='userShiftPopup']");
    private final By shiftCalendar=By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]");
    private final By shiftCalendarDate=By.xpath("//div[contains(text(),'25')]");
    private final By secondShiftCalendarDate=By.xpath("//div[contains(text(),'26')]");
    private final By clickFilter=By.xpath("//*[@id=\"filter-drop-down\"]");
    private final By clickFilterPosition=By.xpath("//*[@id=\"filter-drop-down\"]/div/img");
    private final By clickFilterDepartment=By.xpath("//*[@id=\"filter-drop-down\"]");


    private final WebDriver chrome;
    private WebElement element;

    public NavDepartmentsImpl(WebDriver chrome) {
        this.chrome = chrome;
    }

    public NavDepartmentsImpl viewShift()throws InterruptedException{
//        Thread.sleep(1000);
//        chrome.findElement(viewShiftMenagment).click();
//        Thread.sleep(1000);
//        chrome.findElement(popUp).sendKeys(Keys.ESCAPE);
//        Thread.sleep(1000);
        return this;
    }

    public NavDepartmentsImpl filterByLocation() throws InterruptedException {
//        Thread.sleep(1000);
//        chrome.findElement(shiftsBtn).click();
//        chrome.findElement(clickFilter).click();
//        chrome.findElement(filterByLocation).click();
//        Thread.sleep(1000);
//        chrome.findElement(clickFilter).sendKeys(Keys.ESCAPE);
        Thread.sleep(1000);
        return this;
     }
     public NavDepartmentsImpl filterByPositon()throws InterruptedException{
//         chrome.findElement(clickFilterPosition).click();
//         chrome.findElement(filterByPositon).click();
//         chrome.findElement(clickFilterPosition).sendKeys(Keys.ESCAPE);
         Thread.sleep(1000);
        return this;
     }
     public NavDepartmentsImpl filterByDepartments()throws InterruptedException{
//         chrome.findElement(clickFilterDepartment).click();
//        chrome.findElement(filterByDepartment).click();
//         chrome.findElement(clickFilterDepartment).sendKeys(Keys.ESCAPE);
         Thread.sleep(1000);

         return this;
     }

    public NavDepartmentsImpl secondOptions()throws InterruptedException{

//        chrome.findElement(filterByLocation).click();
//        Thread.sleep(1000);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ENTER);
//        chrome.findElement(filterByLocationOption).sendKeys(Keys.ESCAPE);
//
//
//        chrome.findElement(filterByPositon).click();
//        Thread.sleep(1000);
//        chrome.findElement(filterByPositonOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByPositonOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByPositonOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByPositonOption).sendKeys(Keys.ENTER);
//        chrome.findElement(filterByPositonOption).sendKeys(Keys.ESCAPE);
//
//        chrome.findElement(filterByDepartment).click();
//        Thread.sleep(1000);
//        chrome.findElement(filterByDepartmentOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByDepartmentOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByDepartmentOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByDepartmentOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByDepartmentOption).sendKeys(Keys.ARROW_DOWN);
//        chrome.findElement(filterByDepartmentOption).sendKeys(Keys.ENTER);
//        chrome.findElement(filterByDepartmentOption).sendKeys(Keys.ESCAPE);

        return this;
    }
    public NavDepartmentsImpl shifts()throws InterruptedException{
//        chrome.navigate().to("https://test.shedwool.com/shifts");
//        chrome.findElement(shiftCalendar).click();
//        Thread.sleep(2000);
//        chrome.findElement(shiftCalendarDate).click();
//        chrome.findElement(secondShiftCalendarDate).click();


        return this;
    }
}


