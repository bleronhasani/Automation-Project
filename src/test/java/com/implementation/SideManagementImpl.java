package com.implementation;

import com.github.javafaker.Faker;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.ByteArrayInputStream;

public class SideManagementImpl {
    private final By clickMenagment=By.xpath("//a[@href='/management/locations']");
    private final By addNewBtn=By.xpath("//button[contains(text(),'Add New')]");
    private final By nameInput=By.xpath("//input[@placeholder='Name']");
    private final By businesAddress =By.xpath("//input[@id='business_address']");
    private final By addnewLocationBtn =By.xpath("//button[contains(text(),'Add Location')]");
    private final By assigneUserInLocation =By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div/button[1]");
    private final By assignUserOpenbtn =By.xpath("//button[@title='Open']");
    private final By asgUDropDwon=By.xpath("//input[@name='assignedUsers']");
    private final By asignBtn=By.xpath("//button[contains(text(),'Assign')]");
    private final By editLocationActionbtn =By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div/button[2]");
    private final By editNameLocation =By.xpath("//input[@placeholder='Name']");
    private final By editLocationbtn =By.xpath("//button[contains(text(),'Edit Location')]");
    private final By departmentPage  = By.xpath("//a[contains(text(),'Departments')]");
    private final By departmentName=By.xpath("//input[@placeholder='Name']");
    private final By departmentLocation=By.xpath("//input[@name='location']");
    private final By addDepartmentBtn=By.xpath("//button[contains(text(),'Add Department')]");
    private final By addNewSubDepartment=By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button[1]");
    private final By subDepartmentName=By.xpath("//input[@placeholder='Name']");
    private final By subDepartmentLocation=By.xpath("//button[@title='Open']");
    private final By subDepartmentLocationOption=By.xpath("//input[@placeholder='Choose Locations']");
    private final By positionLocationOption=By.xpath("//input[@name='department']");
    private final By saveNewSubDepartment=By.xpath("//button[contains(text(),'Add Sub Department')]");
    private final By editDepartment=By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button[2]");
    private final By subDepartmentNamee=By.xpath("//input[@placeholder='Name']");
    private final By saveNewEditbtn=By.xpath("//button[contains(text(),'Edit Sub Department')]");
    private final By savedepartmentEditbtn=By.xpath("//button[contains(text(),'Edit Department')]");
    private final By opendepartmentbtn=By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]/button");
    private final By addNewPositionbtn=By.xpath("//button[contains(text(),'Add Position')]");
    private final By deleteDepartment=By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[2]/td[5]/div/button[2]");
    private final By yesInsideSubDepbtn=By.xpath("/html/body/div[4]/div[3]/div/button[2]");
    private final By yesInsidePositionbtn=By.xpath("//button[contains(text(),'Yes')]");
    private final By editInsideSubDepbtn=By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[2]/td[5]/div/button[1]");
    private final By positionbtn=By.xpath("//a[@id='Positions']");
    private final By assignUserBtn=By.xpath("//button[@title='Assign User']");
    private final By userDropdown=By.xpath("//button[@title='Open']");
    private final By positionAssigneUserDrp=By.xpath("//input[@name='assignedUsers']");
    private final By chooseUser=By.xpath("//button[contains(text(),'Assign')]");
    private final By actionEditbtn=By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button[2]");
    private final By selectUserdrp=By.xpath("//button[@title='Open']");
    private final By editpositiondropdwn=By.xpath("//input[@name='department']");
    private final By editPositionbtn=By.xpath("//button[contains(text(),'Edit Position')]");
    private final By deletePositionbtn=By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[5]/div/button[3]");
    private final By templatePage=By.xpath("//a[@id='Templates']");
    private final By deleteBtn=By.xpath("//*[@id=\"table-templates\"]/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]/div/button[1]");
    private final By duplicateBtn=By.xpath("//*[@id=\"table-templates\"]/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]/div/button[2]");
    private final By createBtn=By.xpath("//button[contains(text(),'Add New')]");
    private final By yesBtn=By.xpath("//span[contains(text(),'Yes')]");
    private final By templateName=By.xpath("//input[@placeholder='Template Name']");
    private final By loactionchoose=By.xpath("//input[@aria-autocomplete='list']");
    private final By addnewDepartmentDrp=By.xpath("//button[contains(text(),'Add Department')]");
    private final By selectDepartmentBtn =By.cssSelector("body > div:nth-child(7) > div.popup_.select_div.add > form > div.buttons > span:nth-child(2)");
    private final By addBtn =By.xpath("/html/body/div[2]/div[3]/form/div[2]/span[2]");
    private final By addPositionBtn =By.xpath("//*[@id=\"create-templates\"]/div[1]/div[2]/div/div/div[1]/img");
    private final By choosePosition =By.xpath("//select[@id='positionId']");
    private final By nextChoosePosition =By.xpath("//option[@value='1448']");
    private final By searchMember =By.xpath("//input[@placeholder='Search']");
    private final By memberPreview =By.xpath("//input[@placeholder='Search']");
    private final By saveBtn =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/span");
    private final By addshift  = By.xpath("//*[@id=\"create-templates\"]/div[1]/div[2]/div/div/div[3]/img");
    private final By addPosition  = By.cssSelector("#create-templates > div.shift_part > div.shift_group > div > div > div.group_icon > span");
    private final By selectaddPosition  = By.xpath("//li[contains(text(),'Add Position')]");
    private final By addshiftsecond  = By.xpath("//*[@id=\"create-templates\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]");
    private final By recurringPattern  = By.xpath("//input[@name='allWeek']");
    private final By shiftNameInput  = By.xpath("//input[@placeholder='Shift Name']");
    private final By shiftNotesInput  = By.xpath("//textarea[@name='notes']");
    private final By capacity  = By.xpath("//input[@id='capacityNr']");
    private final By deleteBTN  = By.xpath("//*[@id=\"create-templates\"]/div[2]/div[3]/div/div[1]/div/img");
    private final By addPositionbtnsecond  = By.xpath("//*[@id=\"positionId\"]");
    private final By selectPositiondrp  = By.xpath("//select[@id='positionId']");
    private final By selectPositionOptiondrp  = By.xpath("//option[@value='1010']");
    private final By addPositionSavebtn  = By.xpath("/html/body/div[5]/div[3]/div/div/form/div/div[3]/div/span");
    private final By addshiftbtn  = By.xpath("//li[contains(text(),'Add Shifts')]");
    private final By saveShift  = By.xpath("/html/body/div[4]/div[3]/div/div[2]/form/div[2]/div[7]/div/button");
    private final By editPosition  = By.xpath("/html/body/div[3]/div[3]/ul/li[2]");
    private final By cancleBtn  = By.xpath("/html/body/div[4]/div[3]/div/div/form/div/div[3]/div/button");
    private final By addnewDepartment = By.xpath("//span[contains(text(),'Add new department')]");
    private final By secondSelectDepartmentBtn = By.xpath("/html/body/div[4]/div[3]/form/div[1]/div/div/div/div/button");
    private final By secondAddBtn = By.xpath("/html/body/div[4]/div[3]/form/div[2]/span[2]");
    private final By backOfHouse = By.xpath("//*[@id=\"create-templates\"]/div[1]/div[3]/div/div/div[1]/span");
    private final By minimizeBtn = By.xpath("/html/body/div[4]/div[3]/ul/li[2]");
    private final By deleteBTNShift = By.xpath("/html/body/div[4]/div[3]/ul/li[3]");
    private final By shitSaveBtn = By.xpath("//button[contains(text(),'Save')]");
    private final By generateBtn = By.xpath("//*[@id=\"root\"]/div/form/div/div[2]/button[3]");
    private final By yesGenerate = By.xpath("//button[contains(text(),'Yes')]");
    private final By reviewPublishBtn = By.xpath("//*[@id=\"table-templates\"]/div/div[2]/div/div/div/table/tbody/tr[1]/td[7]/div/button/span[1]/span");
    private final By publishBtn = By.xpath("//button[contains(text(),'Publish')]");
    private final By lastYesBtn = By.xpath("/html/body/div[2]/div[3]/div/button[2]");
    private final By availabilitybtn =By.xpath("//a[@id='Availability']");
    private final By addNewAvailabilityBtn =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/button");
    private final By StartDate =By.xpath("//input[@placeholder='On Going']");
    private final By EndDate =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/form/div[2]/div/div[2]/div/div/input");
    private final By availibilityTeamMemberDropdwn =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/form/div[4]/div/div/div/div/button[2]");
    private final By shiftTime =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]");
    private final By shiftTimeSecond =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[4]");
    private final By shiftTimeThird =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[6]");
    private final By availibilitySave =By.xpath("//span[contains(text(),'Save')]");
    private final By alertdismis =By.xpath("//button[@aria-label='close']");
    private final By filterdrp =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div/button[2]");
    private final By editBtn =By.xpath("//*[@id=\"create-templates\"]/div/div[2]/div/div/div/div[1]/div/img[1]");
    private final By filterdrpoption =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div/button[2]");
    private final By teamMemberdrp =By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/form/div[4]/div/div/div/div/button[2]");
    private final By editTime =By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[7]");
    private final By swapShift  = By.xpath("//*[@id=\"requests\"]/div[2]/div/span[2]");
    private final By deleteAvailiblity  = By.xpath("//*[@id=\"create-templates\"]/div/div[3]/div/div/div/div[1]/div/img[2]");
    private final By yesAvailiblity  = By.xpath("//span[contains(text(),'Yes')]");
    private final By saveNewDepEditbtn  = By.xpath("//button[contains(text(),'Edit Department')]");

    Faker faker = new Faker();
    private final WebDriver chrome;
    private WebElement element;
    private By select;

    public SideManagementImpl(WebDriver chrome) {this.chrome = chrome; }

//    @Attachment(value = "Screenshot", type = "image/png")
//    public byte[] screenshot() {
//        return ((TakesScreenshot) chrome).getScreenshotAs(OutputType.BYTES);
//    }

    //...
    @Step("Step 1")
    public void step1(){
        //...

        Allure.addAttachment("Shedwool Screenshot", new ByteArrayInputStream(((TakesScreenshot) chrome).getScreenshotAs(OutputType.BYTES)));
    }

   public SideManagementImpl clickManagement()throws InterruptedException{
       step1();
        chrome.findElement(clickMenagment).click();
        step1();
        return this;
   }
   public SideManagementImpl locationPage(String locationName)throws InterruptedException{
       step1();
       chrome.findElement(addNewBtn).click();
       chrome.findElement(nameInput).sendKeys(faker.address().stateAbbr());
//       Assert.assertEquals(chrome.findElement(nameInput).getAttribute("value"),locationName);
       chrome.findElement(businesAddress).sendKeys(faker.address().country());
//       Assert.assertEquals(chrome.findElement(businesAddress).getAttribute("value"),"Paris, France");
       Thread.sleep(1000);
       chrome.findElement(businesAddress).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(businesAddress).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(businesAddress).sendKeys(Keys.ENTER);
       Thread.sleep(1000);
       step1();
       chrome.findElement(addnewLocationBtn).click();

       chrome.findElement(assigneUserInLocation).click();
       chrome.findElement(assignUserOpenbtn).click();

       chrome.findElement(asgUDropDwon).sendKeys("Bleron2 Hasanii");
       chrome.findElement(asgUDropDwon).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(asgUDropDwon).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(asgUDropDwon).sendKeys(Keys.ENTER);

       chrome.findElement(asignBtn).click();
       chrome.findElement(editLocationActionbtn).click();
       Thread.sleep(1000);
       chrome.findElement(editNameLocation).sendKeys("Q");
       Thread.sleep(2000);
//       Assert.assertEquals(chrome.findElement(editNameLocation).getAttribute("value"),"AutomatedLocationQ");
       chrome.findElement(editLocationbtn).click();
       step1();
       return this;

   }

   public SideManagementImpl departmentPage(String departmentname,String subNewDepartmentName,String sudEditedName)throws InterruptedException{
       step1();
        chrome.findElement(departmentPage).click();
       Thread.sleep(1000);
       chrome.findElement(addNewBtn).click();
       chrome.findElement(departmentName).sendKeys(faker.name().title());
       Thread.sleep(1000);
//       Assert.assertEquals(chrome.findElement(departmentName).getAttribute("value"),departmentname);
       chrome.findElement(departmentLocation).sendKeys("Prishtina");
       Thread.sleep(1000);
       chrome.findElement(departmentLocation).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(departmentLocation).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(departmentLocation).sendKeys(Keys.ENTER);
       step1();
       chrome.findElement(addDepartmentBtn).click();

       Thread.sleep(2000);
       chrome.findElement(addNewSubDepartment).click();
       new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(subDepartmentName));
       chrome.findElement(subDepartmentName).sendKeys(faker.name().title());
//       Assert.assertEquals(chrome.findElement(subDepartmentName).getAttribute("value"),subNewDepartmentName);
       chrome.findElement(subDepartmentLocation).click();
       Thread.sleep(1000);
       chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(subDepartmentLocationOption).sendKeys(Keys.ENTER);
       chrome.findElement(saveNewSubDepartment).click();

       Thread.sleep(2000);
//       chrome.findElement(editDepartment).click();
//       chrome.findElement(subDepartmentName).clear();
//       chrome.findElement(subDepartmentNamee).sendKeys( sudEditedName);
//       Thread.sleep(2000);
//       chrome.findElement(saveNewEditbtn).click();
//       Thread.sleep(2000);

       chrome.findElement(opendepartmentbtn).click();
       new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(editInsideSubDepbtn));
       Thread.sleep(1000);
       chrome.findElement(editInsideSubDepbtn).click();
       new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(subDepartmentName));
       chrome.findElement(subDepartmentName).clear();
       Thread.sleep(1000);
       chrome.findElement(subDepartmentName).sendKeys(" quality");
       Thread.sleep(1000);
       chrome.findElement(saveNewEditbtn).click();
//       Thread.sleep(1000);
//       chrome.findElement(saveNewDepEditbtn).click();

       chrome.findElement(deleteDepartment).click();
       chrome.findElement(savedepartmentEditbtn).click();
//       chrome.findElement(yesInsideSubDepbtn).click();
       step1();
       return this;
   }

   public SideManagementImpl positionPage(String positionName)throws InterruptedException{
       step1();
        chrome.findElement(positionbtn).click();
       Thread.sleep(1000);
       //Used departamentName cuz they are with the same locators
       chrome.findElement(addNewBtn).click();
       new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(departmentName));
       chrome.findElement(departmentName).sendKeys(faker.job().position());
//        =========================
       chrome.findElement(subDepartmentLocation).click();
       chrome.findElement(positionLocationOption).sendKeys("Corporate Meeting Planner");
       chrome.findElement(positionLocationOption).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       chrome.findElement(positionLocationOption).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       chrome.findElement(positionLocationOption).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(1000);
       chrome.findElement(positionLocationOption).sendKeys(Keys.ENTER);
//        ========================
       step1();
       chrome.findElement(addNewPositionbtn).click();

       Thread.sleep(2000);
       chrome.findElement(assignUserBtn).click();
       new WebDriverWait(chrome,20).until(ExpectedConditions.visibilityOfElementLocated(userDropdown));
       chrome.findElement(userDropdown).click();
       chrome.findElement(positionAssigneUserDrp).sendKeys("Bleron2 Hasanii");
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
       chrome.findElement(yesInsidePositionbtn).click();
       step1();
        return this;
   }
   public SideManagementImpl templatePage(String templateNameInput,String chooseLocationInput,String capacityNumber,String shiftName, String shiftText) throws InterruptedException{
       step1();
        chrome.findElement(templatePage).click();
        chrome.findElement(deleteBtn).click();
        Thread.sleep(1000);
        chrome.findElement(yesBtn).click();
        chrome.findElement(duplicateBtn).click();
        chrome.findElement(createBtn).click();
        chrome.findElement(templateName).sendKeys(templateNameInput);
        Assert.assertEquals(chrome.findElement(templateName).getAttribute("value"),templateNameInput);
        chrome.findElement(loactionchoose).sendKeys(chooseLocationInput);
        Assert.assertEquals(chrome.findElement(loactionchoose).getAttribute("value"),chooseLocationInput);
       Thread.sleep(1000);
        chrome.findElement(loactionchoose).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(loactionchoose).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(loactionchoose).sendKeys(Keys.ARROW_DOWN);
        chrome.findElement(loactionchoose).sendKeys(Keys.ENTER);
        chrome.findElement(addnewDepartmentDrp).click();
       Thread.sleep(10000);

       chrome.findElement(selectDepartmentBtn).click();
       chrome.findElement(selectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(selectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(selectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(selectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(selectDepartmentBtn).sendKeys(Keys.ENTER);
       chrome.findElement(addBtn).click();
       step1();
       chrome.findElement(addPositionBtn).click();
       chrome.findElement(choosePosition).sendKeys("QA");
       chrome.findElement(choosePosition).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(choosePosition).sendKeys(Keys.ENTER);
       chrome.findElement(memberPreview).sendKeys("Andi Gashi");
       chrome.findElement(saveBtn).click();


       chrome.findElement(addshift).click();
       chrome.findElement(addshiftbtn).click();
       chrome.findElement(recurringPattern).click();
       chrome.findElement(shiftNameInput).sendKeys(shiftName);
       Assert.assertEquals(chrome.findElement(shiftNameInput).getAttribute("value"),shiftName);

       chrome.findElement(shiftNotesInput).sendKeys(shiftText);
       Assert.assertEquals(chrome.findElement(shiftNotesInput).getAttribute("value"),shiftText);
        Thread.sleep(1000);
       chrome.findElement(capacity).clear();
//       chrome.findElement(capacity).sendKeys(capacityNumber);
       chrome.findElement(saveShift).click();


       chrome.findElement(addshift).click();
       chrome.findElement(editPosition).click();
       chrome.findElement(cancleBtn).click();

       chrome.findElement(addnewDepartment).click();
       Thread.sleep(1000);
       chrome.findElement(secondSelectDepartmentBtn).click();
       chrome.findElement(secondSelectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(secondSelectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(secondSelectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(secondSelectDepartmentBtn).sendKeys(Keys.ARROW_DOWN);
       chrome.findElement(secondSelectDepartmentBtn).sendKeys(Keys.ENTER);
       chrome.findElement(secondAddBtn).click();

       chrome.findElement(backOfHouse).click();
       chrome.findElement(minimizeBtn).click();
       chrome.findElement(backOfHouse).click();
       chrome.findElement(deleteBTNShift).click();
       chrome.findElement(yesBtn).click();
//       chrome.findElement(shitSaveBtn).click();
       Thread.sleep(5000);
       chrome.findElement(generateBtn).click();
       Thread.sleep(2000);
       chrome.findElement(yesGenerate).click();
       step1();
       return this;
   }

   public SideManagementImpl draftSchedule()throws InterruptedException{
        chrome.navigate().to("https://test.shedwool.com/management/draft-templates");
       step1();
       Thread.sleep(3000);
//        chrome.findElement(reviewPublishBtn).click();
//        Thread.sleep(3000);
//        chrome.findElement(publishBtn).click();
//        Thread.sleep(1000);
//        chrome.findElement(lastYesBtn).click();
//       step1();
//


        return this;
   }
  public SideManagementImpl availability(String availibilityName,String availibilityStartDate,String availibilityEndDate,String availibilityEditName)throws InterruptedException{
      step1();
        chrome.findElement(availabilitybtn).click();
      Thread.sleep(2000);
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
      chrome.findElement(availibilitySave).click();
      chrome.findElement(alertdismis).click();
      Thread.sleep(3000);
      chrome.findElement(filterdrp).click();
      chrome.findElement(filterdrp).sendKeys(Keys.ARROW_DOWN);
      chrome.findElement(filterdrp).sendKeys(Keys.ARROW_DOWN);
      chrome.findElement(filterdrp).sendKeys(Keys.ENTER);
      step1();
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
      chrome.findElement(filterdrpoption).sendKeys(Keys.ENTER);

      chrome.findElement(deleteAvailiblity).click();
      Thread.sleep(2000);
      chrome.findElement(yesAvailiblity).click();
      step1();
       return this;
  }
  public SideManagementImpl request()throws InterruptedException{
      chrome.navigate().to("https://test.shedwool.com/management/requests/time-off");
      chrome.findElement(swapShift).click();
      step1();
        return this;
  }
}
