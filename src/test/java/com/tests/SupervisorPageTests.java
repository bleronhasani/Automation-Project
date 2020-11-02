package com.tests;
import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.SupervisorPageImpl;
import org.testng.annotations.Test;

public class SupervisorPageTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";

    LoginImpl login;
    SupervisorPageImpl supervisorPageImpl;

    @Test(priority = 2,description = "This test is for Manager/Supervisor Dashboard")
    public void testMethod()throws InterruptedException{
        login = new LoginImpl(chrome);
        supervisorPageImpl = new SupervisorPageImpl(chrome);

        login.loginUser(email,password);
        supervisorPageImpl.supervisor();

    }
}
