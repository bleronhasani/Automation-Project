package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SupervisorPageImpl {
  private final By shiftBtn = By.xpath("//*[@id=\"dashboards\"]/div[1]/div[1]/div/div[2]/a");
   private final By timeOff = By.xpath("//*[@id=\"dashboards\"]/div[1]/div[2]/div/div[2]/a");
   private final By location = By.xpath("//*[@id=\"dashboards\"]/div[1]/div[3]/div/div[2]/a");
   private final By users = By.xpath("//*[@id=\"dashboards\"]/div[1]/div[4]/div/div[2]/a");

    private final WebDriver chrome;
    private WebElement element;
    private By select;
    public SupervisorPageImpl(WebDriver chrome) {this.chrome = chrome; }


 public SupervisorPageImpl supervisor() throws InterruptedException{
        chrome.findElement(shiftBtn).click();
        chrome.navigate().to("https://test.shedwool.com/");
        chrome.findElement(timeOff).click();
         chrome.navigate().to("https://test.shedwool.com/");
         chrome.findElement(location).click();
         chrome.navigate().to("https://test.shedwool.com/");
         chrome.findElement(users).click();
        return this;
 }

}
