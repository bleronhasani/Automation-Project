package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.NavCalendarImpl;
import com.implementation.NavDepartmentsImpl;
import org.testng.annotations.Test;

public class NavCalendarTests extends OpenBrowser {
    private final String email = "devtestiing+30@gmail.com";
    private final String password = "12341234";
    private final String departmentname = "Techframe";
    private final String positionName = "Bartender";
    private final String subNewDepartmentName = "TechframeSecond";
    private final String sudEditedName = "Techframees";
    private final String positionEditName = "QAAAAAAAA";
    private final String locationName = "Prishtina-PR-01";
    private final String availibilityName = "Prishtina-PR-01-02";
    private final String availibilityStartDate = "08/22/2020";
    private final String availibilityEndDate = "10/22/2020";
    private final String userSelect = "Camille Skiles";
    private final String availibilityEditName = "Prishtina-PR-01-02-SSD";
    private final String newTemplateName = "Spitali";
    private final String shiftName = "Shift-Shefki";
    private final String shiftText = "Shift-Shefki-spirro";
    private final String capacityNumber = "125";

    LoginImpl login;
    NavCalendarImpl navCalendarImpl;

    @Test(priority = 2, description = "This test case tests if user can navigate in Management successfully")
    public void testMethod() throws InterruptedException {
        login = new LoginImpl(chrome);
        navCalendarImpl = new NavCalendarImpl(chrome);

        login.loginUser(email, password);
        navCalendarImpl.clickMenagment();
        navCalendarImpl.locations(locationName);
        navCalendarImpl.departments(departmentname);
        navCalendarImpl.positionbtn(positionName,positionEditName);
        navCalendarImpl.templates(newTemplateName,shiftName,shiftText,capacityNumber);
        navCalendarImpl.actionbtns(subNewDepartmentName,sudEditedName);
        navCalendarImpl.availability(availibilityName,availibilityStartDate,availibilityEndDate,userSelect,availibilityEditName);
        navCalendarImpl.timeOff();
    }

}
