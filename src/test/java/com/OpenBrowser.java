package com;

import com.initialize.InitializeUser;
import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.Attachment;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OpenBrowser {

    public WebDriver chrome;
    InitializeUser browser = new InitializeUser();

    @BeforeMethod
    public void openChrome() {
        chrome = browser.initializeInstance();
        chrome.get("https://kdev.shedwool.com");
        System.out.println("------- Opening Browser -------");
    }


    @AfterMethod
    public void cleanUp() {
//        attachScreenshot();
        chrome.quit();
    }
//
//    @Attachment(value = "screenshot", type = "image/png")
//    public byte[] attachScreenshot() throws IOException {
//        BufferedImage image = Shutterbug.shootPage(chrome, ScrollStrategy.WHOLE_PAGE).getImage();
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        ImageIO.write(image, "png", outputStream);
//        return outputStream.toByteArray();
//    }



}
