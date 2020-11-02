package com.tests;

import com.OpenBrowser;
import com.implementation.LoginImpl;
import com.implementation.NavCalendarImpl;
import com.implementation.SideManagementImpl;
import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.Test;

public class SideManagementTests extends OpenBrowser {
    private final String email = "bleronhasani@yahoo.com";
    private final String password = "123456789";
    private final String locationName = "AutomatedLocation";
    private final String departmentname = "QATesting";
    private final String subNewDepartmentName = "Manual";
    private final String sudEditedName = "Qualityservice";
    private final String positionName = "Bartender";
    private final String templateNameInput = "Spitali";
    private final String chooseLocationInput = "Prishtinë";
    private final String capacityNumber = "1";
    private final String shiftName = "DevShift";
    private final String shiftText = "Shift";
    private final String availibilityName = "Prishtina-PR-01-02";
    private final String availibilityStartDate = "08/22/2020";
    private final String availibilityEndDate = "10/22/2020";
    private final String userSelect = "Camille Skiles";
    private final String availibilityEditName = "Prishtina-PR-01-02-SSD";
    LoginImpl login;
    SideManagementImpl sideManagementImpl;

    @Test(priority=3,description = "This test is for Management Page")
    public void testMethod() throws InterruptedException{
        login = new LoginImpl(chrome);
        sideManagementImpl = new SideManagementImpl(chrome);

        login.loginUser(email,password);
        sideManagementImpl.clickManagement();
        sideManagementImpl.locationPage(locationName);
        sideManagementImpl.departmentPage(departmentname,subNewDepartmentName,sudEditedName);
        sideManagementImpl.positionPage(positionName);
        sideManagementImpl.templatePage(templateNameInput,chooseLocationInput,capacityNumber,shiftName,shiftText);
        sideManagementImpl.draftSchedule();
//        sideManagementImpl.availability(availibilityName,availibilityStartDate,availibilityEndDate,availibilityEditName);
        sideManagementImpl.request();
    }
}
