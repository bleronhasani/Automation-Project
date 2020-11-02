package com.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class LoginImpl {

    private final By emailHolder = By.cssSelector("input[placeholder='E-mail']");
    private final By passwordHolder = By.cssSelector("input[placeholder='Password']");
    private final By loginBtn2 = By.xpath("//button[contains(text(),'Login')]");
    private final By cookiesBanner = By.cssSelector("#root > div.auth > div.loginAuth.active > div > div.login_page_left.wow.fadeInRight.animated > div.not_registred > span > a");

    WebDriver chrome;

    public LoginImpl(WebDriver chrome) {
        this.chrome = chrome;
    }

    public void loginUser(String email, String password) throws InterruptedException {
        chrome.findElement(emailHolder).sendKeys(email);
        Thread.sleep(1000);
        chrome.findElement(passwordHolder).sendKeys(password);
        chrome.findElement(loginBtn2).click();
        assertTrue(chrome.getCurrentUrl().contains("https://kdev.shedwool.com"), "User was not redirected to Shedwool  page");

    }

//    public void chooseOption(String optionName) {
//        List<WebElement> options = chrome.findElements(optionHolder);
//
//        for (WebElement option : options) {
//            String name = option.findElement(By.tagName("h4")).getText();
//            if (name.equalsIgnoreCase(optionName)) {
//                option.click();
//                break;
//            }
//        }
//    }
//
//    public void checkOption()
//    {
//      try
//      {
//          new WebDriverWait(chrome, 60)
//                  .until(ExpectedConditions.visibilityOf(chrome.findElement(By.cssSelector(".front-door-selection.ng-star-inserted"))));
//      }
//      catch(Exception e)
//      {
//          fail("User was not redirected to Storage");
//      }
//
//      assertTrue(chrome.getCurrentUrl().contains(storageLink), "link is not the same");
//
//    }
//
//    public void dropdown(String drowpdownName)
//    {
//        List<WebElement> options = chrome.findElements(dropdownOption);
//
//        assertNotNull(options, "this is null");
//
//        chrome.findElement(dropdownOption).click();
//
//        List<WebElement> optionss = chrome.findElements(dropdownItem);
//
//        for(WebElement option :optionss)
//        {
//            String name = option.getText();
//            if (name.equalsIgnoreCase(drowpdownName)){
//                option.click();
//                break;
//            }
//        }


}
