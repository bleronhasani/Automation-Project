package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.NavFileImpl;
import com.implementation.NavSettingsImpl;
import org.testng.annotations.Test;

public class NavSettingsTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";
    private final String newName="Bumja";
    private final String maxHoursKeys="38";

    LoginImpl login;
    NavSettingsImpl navSettingsImpl;
    @Test(priority = 9,description = "This Test case tests if user can use settings successfully")
    public void testMethod()throws InterruptedException{
        login = new LoginImpl(chrome);
        navSettingsImpl=new NavSettingsImpl(chrome);

        login.loginUser(email,password);
        navSettingsImpl.settingsPage(newName,maxHoursKeys);
    }
}
