package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.NavUsersImpl;
import org.testng.annotations.Test;

public class NavUsersTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";
    private final String nameInputKeys = "Bleron";
    private final String lastnameInputKeys = "Automation";
    private final String phoneNumberKeys = "702 123-45670";
    private final String editLastNameInput = "-A";
    private final String hoursInput = "40";
    private final String emailInput = "automationTest47@gmail.com";
    private final String editNameInput = "-B";

    LoginImpl login;
    NavUsersImpl navUsersImpl;

    @Test(priority = 7, description = "This test case tests if user can manage user page successfully")
    public void testMethod() throws InterruptedException {
        login = new LoginImpl(chrome);
        navUsersImpl = new NavUsersImpl(chrome);

        login.loginUser(email, password);
        navUsersImpl.usersBtn();
        navUsersImpl.addNew(nameInputKeys,lastnameInputKeys,phoneNumberKeys,hoursInput,emailInput);
        navUsersImpl.editUser(editNameInput,editLastNameInput);
    }

}
