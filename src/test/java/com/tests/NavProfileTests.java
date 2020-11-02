package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.NavProfileImpl;
import org.testng.annotations.Test;

public class NavProfileTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";
    private final String oldPasswordKeys = "ubuntu1234";
    private final String editNameInput = "ii";
    private final String maxHours = "38";


    LoginImpl login;
    NavProfileImpl navProfileImpl;

    @Test(priority = 8,description = "This test case tests if user manage profile page successfully")
    public void testMethod()throws InterruptedException{
        login = new LoginImpl(chrome);
        navProfileImpl= new NavProfileImpl(chrome);

        login.loginUser(email,password);
        navProfileImpl.profile(oldPasswordKeys,editNameInput,maxHours);
    }
}
