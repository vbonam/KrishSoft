package TestScripts;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibraries.CommonHelper;
import PageObjects.SampleFormsPage;
import SupportLibraries.ComplexReportFactory;
import SupportLibraries.ExcelHelper;
import SupportLibraries.SeleniumHelper;

public class ValidateFieldsinSampleFormsPage extends SeleniumHelper{
	/*
	 * Author: Hemali 
	 * Date: 26/02/2017
	 * TC Description: Verify Different Fields in Sample Forms Page
	 * Comments:
	 * Revision History: 
	 */	
	
  @Test
  public void ValidateDifferentFieldsinSampleFormsPage() throws Exception{
	  logger = ComplexReportFactory.getTest();
	  Map<String, String> TestData = ExcelHelper.GetData("2");
	  
	  CommonHelper.gotoSampleFormsPage();
	  CommonHelper.validateSampleFormsPageisDisplayed();
	  
	  boolean bChkStat = driver.findElement(SampleFormsPage.marketing_department_chck).isSelected();
	  if(!bChkStat)driver.findElement(SampleFormsPage.marketing_department_chck).click();
	  bChkStat = driver.findElement(SampleFormsPage.marketing_department_chck).isSelected();
	  String sScreenshot = CapturePageScreenshot();		
	  if(bChkStat){
		  logger.log(LogStatus.PASS, "Marketing Department Checkbox is selected", sScreenshot);
	  }else{
		  logger.log(LogStatus.FAIL, "Marketing Department Checkbox is not selected", sScreenshot);
	  }
	  
	  driver.findElement(SampleFormsPage.subject_txt).sendKeys(TestData.get("Subject"));
	  String sSubjectVal = driver.findElement(SampleFormsPage.subject_txt).getAttribute("value");
	  sScreenshot = CapturePageScreenshot();	
	  if(sSubjectVal.equals(TestData.get("Subject"))){
		  logger.log(LogStatus.PASS, "Entered Value in subject field is displayed", sScreenshot); 
	  }else{
		  logger.log(LogStatus.FAIL, "Entered Value in subject field is not displayed", sScreenshot);
	  }
	  
	  WebElement objDropDown = driver.findElement(SampleFormsPage.dropdownbox_dropdown);
	  Select objSelect = new Select(objDropDown);
	  objSelect.selectByVisibleText(TestData.get("DropdownValue"));
	  String sSelectedVal = objSelect.getFirstSelectedOption().getText();
	  sScreenshot = CapturePageScreenshot();	
	  if(sSelectedVal.equals(TestData.get("DropdownValue"))){
		  logger.log(LogStatus.PASS, "Selected Value is displayed in the dropdown", sScreenshot); 
	  }else{
		  logger.log(LogStatus.FAIL, "Selected Value is not displayed in the dropdown", sScreenshot);
	  }
	  
	  driver.findElement(SampleFormsPage.fifthoption_radio).click();
	  boolean bRadioStat = driver.findElement(SampleFormsPage.fifthoption_radio).isSelected();
	  sScreenshot = CapturePageScreenshot();		
	  if(bRadioStat){
		  logger.log(LogStatus.PASS, "Fifth Option Radio button is selected", sScreenshot);
	  }else{
		  logger.log(LogStatus.FAIL, "Fifth Option Radio button is not selected", sScreenshot);
	  }
	  
  }
}
