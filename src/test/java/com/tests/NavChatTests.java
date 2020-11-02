package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.NavCalendarImpl;
import com.implementation.NavChatImpl;
import org.testng.annotations.Test;

public class NavChatTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";
    private final String searchBarinput = "Melos Bojku";
    private final String chanelName = "ShedwoolAutomation";
    private final String descriptionTextArea = "ShedwoolAutomation JavaSelenium";
    private final String directMessageinput = "ShedwoolAutomation Automation";

    LoginImpl login;
    NavChatImpl navChatImpl;

    @Test(priority = 5, description = "This test case tests if user can speak successfully in chat")
    public void testMethod() throws InterruptedException {
        login = new LoginImpl(chrome);
        navChatImpl = new NavChatImpl(chrome);

        login.loginUser(email, password);
        navChatImpl.sideBarChatBtn();
        navChatImpl.newGroup(searchBarinput);
        navChatImpl.newChanel(chanelName,descriptionTextArea,searchBarinput,directMessageinput);

    }

}
