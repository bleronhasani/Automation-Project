package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import org.testng.annotations.Test;

public class LoginTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";

    LoginImpl login;

    @Test(priority = 1, description = "This test case tests if user can Login successfully")
    public void testMethod() throws InterruptedException {
        login = new LoginImpl(chrome);

        login.loginUser(email, password);
    }

}
