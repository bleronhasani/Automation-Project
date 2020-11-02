package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.NavFileImpl;
import org.testng.annotations.Test;

public class NavFileTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";
    private final String collectionName = "collection1";
    private final String directoryName= "collectionD1";

    LoginImpl login;
    NavFileImpl navFileImpl;

    @Test(priority = 6, description = "This test case tests if user can navigate in file successfully")
    public void testMethod() throws InterruptedException {
        login = new LoginImpl(chrome);

        navFileImpl = new NavFileImpl(chrome);

        login.loginUser(email, password);
        navFileImpl.filePage(collectionName,directoryName);
    }

}
