package com.implementation;

import com.tests.NavCalendarTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.security.Key;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class NavCalendarImpl {
    private final By clickMenagment=By.xpath("//a[@href='/management/locations']");
    private final By addNewDepartment=By.xpath("//button[contains(text(),'Add New')]");
    private final By departmentName=By.xpath("//input[@placeholder='Name']");
    private final By addLocation=By.xpath("//span[contains(text(),'Gjilan')]");
    private final By addLocationn=By.xpath("//input[contains(text(),'Choose Locations')]");
    private final By closeBtn=By.xpath("//button[contains(text(),'Close')]");
    private final By addNewbtn=By.xpath("//button[contains(text(),'Add New')]");
    private final By addNewSubDepartment=By.xpath("//button[@title='Add Subdepartment']");
    private final By subDepartmentName=By.xpath("//input[@placeholder='Name']");
    private final By subDepartmentNamee=By.xpath("//input[@placeholder='Name']");
    private final By subDepartmentLocation=By.xpath("//button[@title='Open']");
    private final By subDepartmentLocationOption=By.xpath("//input[@name='department']");
    private final By editpositiondropdwn=By.xpath("//input[@name='department']");
    private final By positionAssigneUserDrp=By.xpath("//input[@name='assignedUsers']");
    private final By saveNewSubDepartment=By.xpath("//button[contains(text(),'Add New')]");
    private final By editDepartment=By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button[2]");
    private final By saveNewEditbtn=By.xpath("/html/body/div[4]/div[3]/div[2]/form/div[3]/button[2]");
    private final By opendepartmentbtn=By.xpath("//button[@title='Open']");
    private final By editInsideSubDepbtn=By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[5]/div/button[1]");
    private final By scrollView=By.xpath("//input[@name='assignedUsers']");
    private final By yesInsideSubDepbtn=By.xpath("//button[contains(text(),'Yes')]");
    private final By deleteDepartment=By.xpath("//button[@title='Delete Department']");
    private final By positionbtn=By.xpath("//a[@id='Positions']");
    private final By actionBtnAdd=By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div/button[1]");
    private final By colorbtn=By.xpath("/html/body/div[4]/div[3]/div[2]/form/div[3]/div");
    private final By choosecolorbtn=By.xpath("//*[@id=\"test\"]/div[3]/div[2]/div[1]/div/div/div[2]/div");
    private final By closecolor=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/form/div[3]/div[2]/div[1]");
    private final By addNewPositionbtn=By.xpath("//button[contains(text(),'Add Position')]");
    private final By assignUserBtn=By.xpath("//button[@title='Assign User']");
    private final By userDropdown=By.xpath("//button[@title='Open']");
    private final By chooseUser=By.xpath("//button[contains(text(),'Assign')]");
    private final By actionEditbtn=By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button[2]");
    private final By selectUserdrp=By.xpath("//button[@title='Open']");
    private final By editPositionbtn=By.xpath("//button[contains(text(),'Edit Position')]");
    private final By deletePositionbtn=By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button[3]");
    private final By trashdropdwnBtn=By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]");
    private final By untrashbtn=By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button");
    private final By yesInsideUnTrash=By.xpath("//button[contains(text(),'Yes')]");
    private final By locationsbtn=By.xpath("//a[@id='Locations']");
    private final By actionAddbtn =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/button[1]");
    private final By businesAddress =By.xpath("//input[@id='business_address']");
    private final By addnewLocationBtn =By.xpath("//button[contains(text(),'Add Location')]");
    private final By assigneUserInLocation =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div/button[1]");
    private final By assignUserOpenbtn =By.xpath("//button[@title='Open']");
    private final By editLocationActionbtn =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div/button[2]");
    private final By editLocationbtn =By.xpath("//button[contains(text(),'Edit Location')]");
    private final By editNameLocation =By.xpath("//input[@placeholder='Name']");
    private final By deletBtn =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[3]/div/button[3]");
    private final By availabilitybtn =By.xpath("//a[@id='Availability']");
    private final By addNewAvailabilityBtn =By.xpath("//a[@href='/management/availability/create']");
    private final By StartDate =By.xpath("//input[@placeholder='On Going']");
    private final By EndDate =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/form/div[2]/div/div[2]/div/div/input");
    private final By availibilityTeamMemberDropdwn =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/form/div[4]/div/div/div/div/button[2]");
    private final By shiftTime =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]");
    private final By shiftTimeSecond =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[4]");
    private final By shiftTimeThird =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[6]");
    private final By saveBtn =By.xpath("//span[contains(text(),'Save')]");
    private final By filterdrp =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/button[2]");
    private final By filterdrpoption =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/button[2]");
    private final By alertdismis =By.xpath("//button[@aria-label='close']");
    private final By editBtn =By.xpath("//*[@id=\"create-templates\"]/div/div[2]/div/div/div/div[1]/div/img[1]");
    private final By nameInput =By.xpath("//input[@placeholder='Name']");
    private final By teamMemberdrp =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/form/div[4]/div/div/div/div/button[2]");
    private final By editTime =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[7]");
    private final By deleteBtn =By.xpath("//*[@id=\"create-templates\"]/div/div[2]/div/div/div/div[1]/div/img[2]");
    private final By templateBtn =By.xpath("//a[@id='Templates']");
    private final By newTemplateBtn =By.xpath("//button[contains(text(),'Add New')]");
    private final By templateNameInput =By.xpath("//input[@placeholder='Template Name']");
    private final By dateInput = By.xpath("//*[@id=\"create-templates\"]/div[1]/div/form/div[2]/div/div[1]/div/div/input");
    private final By enddateInput = By.xpath("//*[@id=\"create-templates\"]/div[1]/div/form/div[2]/div/div[2]/div/div/input");
    private final By inputlocation = By.xpath("//button[@title='Open']");
    private final By inputlocationOption = By.xpath("//input[@aria-autocomplete='list']");
    private final By valueinputlocation = By.xpath("//option[@value='1002']");
    private final By addnewDepartment = By.xpath("//button[contains(text(),'Add Department')]");
    private final By selectDepartment = By.xpath("//input[@aria-activedescendant='mui-13209-option-1']");
    private final By chooseNewDepartment = By.xpath("/html/body/div[2]/div[3]/form/div[1]/div/div/div/div/button");
    private final By savebtn = By.xpath("//button[contains(text(),'Save')]");
    private final By addPositionbtn  = By.cssSelector("#create-templates > div.shift_part > div.shift_group > div > div.group_ > div.group_icon");
    private final By addPositionbtnsecond  = By.xpath("//*[@id=\"positionId\"]");
    private final By selectPositiondrp  = By.xpath("//select[@id='positionId']");
    private final By selectPositionOptiondrp  = By.xpath("//option[@value='1010']");
    private final By addPositionSavebtn  = By.xpath("//button[contains(text(),'Save')]");
    private final By addshift  = By.xpath("//*[@id=\"create-templates\"]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[2]");
    private final By addPosition  = By.cssSelector("#create-templates > div.shift_part > div.shift_group > div > div:nth-child(3) > div.group_icon");
    private final By addshiftsecond  = By.xpath("//*[@id=\"create-templates\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]");
    private final By recurringPattern  = By.xpath("//input[@name='allWeek']");
    private final By shiftNameInput  = By.xpath("//input[@placeholder='Shift Name']");
    private final By shiftNotesInput  = By.xpath("//textarea[@name='notes']");
    private final By capacity  = By.xpath("//input[@id='capacityNr']");
    private final By deleteBTN  = By.xpath("//*[@id=\"create-templates\"]/div[2]/div[3]/div/div[1]/div/img");
    private final By filterByUser  = By.xpath("//button[@title='Open']");
    private final By filterByUserdrp  = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/button[2]");
    private final By pendingBtn  = By.xpath("//span[contains(text(),'Pending')]");
    private final By departmentPage  = By.xpath("//a[contains(text(),'Departments')]");
    private final By yesbtn  = By.xpath("//button[contains(text(),'Yes')]");
    private final By clearUser  = By.xpath("/html/body/div[4]/div[3]/div[2]/form/div[2]/div/div/div/div[1]/svg");




    private final WebDriver chrome;
    private WebElement element;
    private By select;

    public NavCalendarImpl(WebDriver chrome) {this.chrome = chrome; }

    public NavCalendarImpl clickMenagment()throws InterruptedException{
        chrome.findElement(clickMenagment).click();
        return this;
    }
    public NavCalendarImpl locations(String locationName)throws InterruptedException{
        chrome.findElement(addNewDepartment).click();
        chrome.findElement(departmentName).sendKeys(locationName);
        Assert.assertEquals(chrome.findElement(subDepartmentNamee).getAttribute("value"),locationName);
        chrome.findElement(businesAddress).sendKeys("Paris, France");
        Assert.assertEquals(chrome.findElement(businesAddress).getAttribute("value"),"Paris, France");
        Thread.sleep(2000);
        chrome.findElement(businesAddress).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(businesAddress).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(businesAddress).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        chrome.findElement(addnewLocationBtn).click();

        chrome.findElement(assigneUserInLocation).click();
        chrome.findElement(assignUserOpenbtn).click();
        chrome.findElement(scrollView).sendKeys("Bleroniu3 Hasani");
        Thread.sleep(3000);
        chrome.findElement(scrollView).sendKeys(Keys.ENTER);
        chrome.findElement(chooseUser).click();

        chrome.findElement(editLocationActionbtn).click();
        Thread.sleep(1000);
        chrome.findElement(editNameLocation).sendKeys("-02");
        Thread.sleep(2000);
        Assert.assertEquals(chrome.findElement(editNameLocation).getAttribute("value"),"Prishtina-PR-01-02");
        chrome.findElement(editLocationbtn).click();
        return this;
    }

    public NavCalendarImpl departments(String departmentname)throws InterruptedException{
        chrome.findElement(departmentPage).click();
        Thread.sleep(1000);
        chrome.findElement(addNewDepartment).click();
//      new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(departmentName));
      chrome.findElement(departmentName).sendKeys(departmentname);
      Thread.sleep(1000);
      Assert.assertEquals(chrome.findElement(departmentName).getAttribute("value"),departmentname);
      chrome.findElement(closeBtn).click();
//      ==============================KQYRE APET SE SO MIR__++==============
//      chrome.findElement(addLocationn).sendKeys("Prishtina");
//      Thread.sleep(1000);
//      chrome.findElement(addLocation).sendKeys(Keys.ARROW_DOWN);
//      chrome.findElement(addLocation).sendKeys(Keys.ARROW_DOWN);
//      chrome.findElement(addLocation).sendKeys(Keys.ARROW_DOWN);
//      chrome.findElement(addLocation).sendKeys(Keys.ENTER);



     return this;
    }
    public NavCalendarImpl actionbtns(String subNewDepartmentName,String sudEditedName)throws InterruptedException{
        chrome.findElement(addNewSubDepartment).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(subDepartmentName));
        chrome.findElement(subDepartmentName).sendKeys(subNewDepartmentName);
        Assert.assertEquals(chrome.findElement(subDepartmentName).getAttribute("value"),subNewDepartmentName);
        chrome.findElement(subDepartmentLocation).click();
        Thread.sleep(1000);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ENTER);
        chrome.findElement(saveNewSubDepartment).click();

        chrome.findElement(editDepartment).click();
        chrome.findElement(subDepartmentName).click();
        chrome.findElement(subDepartmentName).clear();
        chrome.findElement(subDepartmentNamee).sendKeys( sudEditedName);
        Thread.sleep(2000);
//        Assert.assertEquals(chrome.findElement(subDepartmentNamee).getAttribute("value"),sudEditedName);
        chrome.findElement(subDepartmentLocation).click();
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ENTER);
        chrome.findElement(saveNewEditbtn).click();

        chrome.findElement(opendepartmentbtn).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(editInsideSubDepbtn));
        Thread.sleep(1000);
        chrome.findElement(editInsideSubDepbtn).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(subDepartmentName));
        chrome.findElement(subDepartmentName).clear();
        Thread.sleep(1000);
        chrome.findElement(subDepartmentName).sendKeys("TechframeShedwool");
        Thread.sleep(1000);
        chrome.findElement(saveNewEditbtn).click();


        chrome.findElement(opendepartmentbtn).click();
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ENTER);
        chrome.findElement(addNewPositionbtn).click();



//        delete sub department
//        chrome.findElement(editLocationActionbtn).click();
//        chrome.findElement(deleteInsideSubDepbtn).click();
//        chrome.findElement(yesInsideSubDepbtn).click();
        Thread.sleep(1000);
        chrome.findElement(deleteDepartment).click();
        chrome.findElement(yesInsideSubDepbtn).click();
        return this;
    }
    public NavCalendarImpl positionbtn(String positionName,String positionEditName)throws InterruptedException{
        chrome.findElement(positionbtn).click();
        Thread.sleep(1000);
        //Used departamentName cuz they are with the same locators
        chrome.findElement(addNewDepartment).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(departmentName));
        chrome.findElement(departmentName).sendKeys(positionName);
        Assert.assertEquals(chrome.findElement(departmentName).getAttribute("value"),positionName);
//        =========================
        chrome.findElement(subDepartmentLocation).click();
        chrome.findElement(subDepartmentLocationOption).sendKeys("Biology");
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ENTER);
//        =========================
//        chrome.findElement(colorbtn).click();
//        chrome.findElement(choosecolorbtn).click();
//        chrome.findElement(choosecolorbtn).sendKeys(Keys.ESCAPE);
        chrome.findElement(addNewPositionbtn).click();

        Thread.sleep(2000);
        chrome.findElement(assignUserBtn).click();
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(userDropdown));
        chrome.findElement(userDropdown).click();
        chrome.findElement(positionAssigneUserDrp).sendKeys("Andi Gashi");
        chrome.findElement(positionAssigneUserDrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positionAssigneUserDrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(positionAssigneUserDrp).sendKeys(Keys.ENTER);
        chrome.findElement(chooseUser).click();

        Thread.sleep(2000);
        chrome.findElement(actionEditbtn).click();
        chrome.findElement(selectUserdrp).click();
        chrome.findElement(editpositiondropdwn).sendKeys("Development");
        chrome.findElement(editpositiondropdwn).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(editpositiondropdwn).sendKeys(Keys.ARROW_DOWN);

        chrome.findElement(editpositiondropdwn).sendKeys(Keys.ENTER);
        chrome.findElement(editPositionbtn).click();

        chrome.findElement(deletePositionbtn).click();
        chrome.findElement(yesInsideSubDepbtn).click();
        return this;
    }

    public NavCalendarImpl availability(String availibilityName,String availibilityStartDate,String availibilityEndDate,String userSelect,String availibilityEditName)throws InterruptedException{
     chrome.findElement(availabilitybtn).click();
     chrome.findElement(addNewAvailabilityBtn).click();
     chrome.findElement(subDepartmentName).sendKeys(availibilityName);
     Assert.assertEquals(chrome.findElement(subDepartmentName).getAttribute("value"),availibilityName);
     chrome.findElement(StartDate).sendKeys(availibilityStartDate);
     Assert.assertEquals(chrome.findElement(StartDate).getAttribute("value"),availibilityStartDate);
     chrome.findElement(EndDate).sendKeys(availibilityEndDate);
     Assert.assertEquals(chrome.findElement(EndDate).getAttribute("value"),availibilityEndDate);


        chrome.findElement(availibilityTeamMemberDropdwn).click();
        chrome.findElement(availibilityTeamMemberDropdwn).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(availibilityTeamMemberDropdwn).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(availibilityTeamMemberDropdwn).sendKeys(Keys.ENTER);
        chrome.findElement(availibilityTeamMemberDropdwn).sendKeys(Keys.ESCAPE);

        chrome.findElement(shiftTime).click();
        chrome.findElement(shiftTimeSecond).click();
        chrome.findElement(shiftTimeThird).click();
        chrome.findElement(saveBtn).click();
        Thread.sleep(1000);
        chrome.findElement(alertdismis).click();

        chrome.findElement(filterdrp).click();
        chrome.findElement(filterdrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrp).sendKeys(Keys.ENTER);

        chrome.findElement(editBtn).click();
        Thread.sleep(2000);
        new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(nameInput));
        chrome.findElement(subDepartmentName).clear();
        chrome.findElement(subDepartmentName).sendKeys(availibilityEditName);

        chrome.findElement(subDepartmentLocation).click();
        chrome.findElement(teamMemberdrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(teamMemberdrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(teamMemberdrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(teamMemberdrp).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(teamMemberdrp).sendKeys(Keys.ENTER);

        chrome.findElement(editTime).click();
        chrome.findElement(saveBtn).click();

        Thread.sleep(1000);
        chrome.findElement(alertdismis).click();
        chrome.findElement(filterdrp).click();
        chrome.findElement(filterdrpoption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrpoption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrpoption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrpoption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrpoption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrpoption).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(filterdrpoption).sendKeys(Keys.ENTER);

        chrome.findElement(deleteBtn).click();
        chrome.findElement(yesInsideSubDepbtn).click();
        return this;
    }
    public NavCalendarImpl templates(String newTemplateName,String shiftText,String shiftName,String capacityNumber)throws InterruptedException{

//      chrome.findElement(alertdismis).click();
      chrome.findElement(templateBtn).click();
      new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(newTemplateBtn));
      chrome.findElement(newTemplateBtn).click();

      chrome.findElement(templateNameInput).sendKeys(newTemplateName);
      Assert.assertEquals(chrome.findElement(templateNameInput).getAttribute("value"),newTemplateName);

      chrome.findElement(inputlocation).click();
      Thread.sleep(1000);
      chrome.findElement(inputlocationOption).sendKeys("Prishtinë");
        Thread.sleep(1000);
        Assert.assertEquals(chrome.findElement(inputlocationOption).getAttribute("value"),"Prishtinë");
      chrome.findElement(inputlocationOption).sendKeys(Keys.ARROW_DOWN);
      chrome.findElement(inputlocationOption).sendKeys(Keys.ARROW_DOWN);
      chrome.findElement(inputlocationOption).sendKeys(Keys.ENTER);
//      chrome.findElement(valueinputlocation).click();
//     ========================TEMPLATE HAVE ONE BUG INTO DROP DOWN====================================
//      chrome.findElement(addnewDepartment).click();
//      Thread.sleep(3000);
//      new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(selectDepartment));
//      chrome.findElement(selectDepartment).sendKeys("asdasad");
//      chrome.findElement(selectDepartment).sendKeys(Keys.ARROW_DOWN);
//      chrome.findElement(selectDepartment).sendKeys(Keys.ARROW_DOWN);
//      chrome.findElement(selectDepartment).sendKeys(Keys.ENTER);
//        Thread.sleep(1000);
//      chrome.findElement(chooseNewDepartment).click();
////       chrome.findElement(chooseNewLocation).click();
//      chrome.findElement(yesInsideSubDepbtn).click();
//
//       chrome.findElement(addPositionbtn).click();
//       chrome.findElement(selectPositiondrp).click();
////       chrome.findElement(selectPositiondrp).sendKeys(Keys.ARROW_DOWN);
////       chrome.findElement(selectPositiondrp).sendKeys(Keys.ARROW_DOWN);
////       chrome.findElement(selectPositiondrp).sendKeys(Keys.ENTER);
//       chrome.findElement(selectPositionOptiondrp).click();
//       Thread.sleep(1000);
//       chrome.findElement(addPositionSavebtn).click();
//
//
//       chrome.findElement(addshift).click();
//       chrome.findElement(recurringPattern).click();
//       chrome.findElement(shiftNameInput).sendKeys(shiftName);
//       Assert.assertEquals(chrome.findElement(shiftNameInput).getAttribute("value"),shiftName);
//
//       chrome.findElement(shiftNotesInput).sendKeys(shiftText);
//       Assert.assertEquals(chrome.findElement(shiftNotesInput).getAttribute("value"),shiftText);
//        Thread.sleep(1000);
//       chrome.findElement(capacity).clear();
//       chrome.findElement(capacity).sendKeys(capacityNumber);
//       Thread.sleep(1000);
//       chrome.findElement(savebtn).click();
//
//        chrome.findElement(addPosition).click();
//        chrome.findElement(addPositionbtnsecond).click();
//        chrome.findElement(selectPositiondrp).click();
//        chrome.findElement(selectPositionOptiondrp).click();
//        Thread.sleep(1000);
//        chrome.findElement(addPositionSavebtn).click();
//        chrome.findElement(addshiftsecond).click();
//        chrome.findElement(recurringPattern).click();
//        chrome.findElement(shiftNameInput).sendKeys(shiftName);
//        Assert.assertEquals(chrome.findElement(shiftNameInput).getAttribute("value"),shiftName);
//        chrome.findElement(shiftNotesInput).sendKeys(shiftText);
//        Assert.assertEquals(chrome.findElement(shiftNotesInput).getAttribute("value"),shiftText);
//        chrome.findElement(savebtn).click();
//
////==========================NEXT POSITION ADDED===========================
//        chrome.findElement(addnewDepartment).click();
//        Thread.sleep(1000);
//        chrome.findElement(chooseNewDepartment).click();
////       chrome.findElement(chooseNewLocation).click();
//        chrome.findElement(yesInsideSubDepbtn).click();
//        chrome.findElement(deleteBTN).click();
//        chrome.findElement(yesInsideSubDepbtn).click();
//        chrome.findElement(saveBtn).click();
        return this;
    }
    public NavCalendarImpl timeOff()throws InterruptedException{
       chrome.navigate().to("https://test.shedwool.com/management/time-off");
       chrome.findElement(filterByUser).click();
       chrome.findElement(filterByUserdrp).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(filterByUserdrp).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(filterByUserdrp).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(filterByUserdrp).sendKeys(Keys.ENTER);
       chrome.findElement(filterByUserdrp).sendKeys(Keys.ESCAPE);
       chrome.findElement(pendingBtn).click();
        return this;
    }
}
