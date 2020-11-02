package com.tests;

import com.OpenBrowser;
import com.implementation.NavDepartmentsImpl;
import com.implementation.LoginImpl;
import org.testng.annotations.Test;

public class NavDepartmentsTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";
    private final String userOptionName = "Xavi hernandez";
    private final String userOptionSecondName = "Endrit";

    LoginImpl login;
    NavDepartmentsImpl navDepartmentsImpl;

    @Test(priority = 4, description = "This test case tests if user can navigate in Department successfully")
    public void testMethod() throws InterruptedException {
        login = new LoginImpl(chrome);
        navDepartmentsImpl = new NavDepartmentsImpl(chrome);

        login.loginUser(email, password);
        navDepartmentsImpl.viewShift();
        navDepartmentsImpl.shifts();
        navDepartmentsImpl.filterByLocation();
        navDepartmentsImpl.filterByPositon();
        navDepartmentsImpl.filterByDepartments();
        navDepartmentsImpl.secondOptions();




    }
}


