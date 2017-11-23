package TestScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibraries.CommonHelper;
import PageObjects.SampleFormsPage;
import SupportLibraries.ComplexReportFactory;
import SupportLibraries.SeleniumHelper;

public class ValidateResetButtonFunctionality extends SeleniumHelper{
  @Test
  public void VerifyResetButtonFunctionality() throws Exception{
	  logger = ComplexReportFactory.getTest();	  
	  CommonHelper.gotoSampleFormsPage();
	  CommonHelper.validateSampleFormsPageisDisplayed();
	  
	  
	  boolean bCustServChckStat = driver.findElement(SampleFormsPage.customer_service_chck).isSelected();
	  String sSubjVal = driver.findElement(SampleFormsPage.subject_txt).getAttribute("value");
	  WebElement objDropdown = driver.findElement(SampleFormsPage.dropdownbox_dropdown);
	  Select objSelect = new Select(objDropdown);
	  String sDropdownVal = objSelect.getFirstSelectedOption().getText();
	  boolean bThridOptionRadioStat = driver.findElement(SampleFormsPage.thirdoption_radio).isSelected();
	  
	  driver.findElement(SampleFormsPage.customer_service_chck).click();
	  driver.findElement(SampleFormsPage.subject_txt).sendKeys("Testing");
	  objSelect.selectByVisibleText("Third Option");
	  driver.findElement(SampleFormsPage.thirdoption_radio).click();
	  String sScreenshot = CapturePageScreenshot();
	  logger.log(LogStatus.INFO, "Sample Forms Page is filled with Data",sScreenshot);
	  
	  driver.findElement(SampleFormsPage.reset_btn).click();
	  sScreenshot = CapturePageScreenshot();
	  boolean bCustServChckStat_temp = driver.findElement(SampleFormsPage.customer_service_chck).isSelected();
	  String sSubjVal_temp = driver.findElement(SampleFormsPage.subject_txt).getAttribute("value");
	  String sDropdownVal_temp = objSelect.getFirstSelectedOption().getText();
	  boolean bThridOptionRadioStat_temp = driver.findElement(SampleFormsPage.thirdoption_radio).isSelected();
	  
	  if(bCustServChckStat == bCustServChckStat_temp
		 && sSubjVal.equals(sSubjVal_temp)
		 && sDropdownVal.equals(sDropdownVal_temp)
		 && bThridOptionRadioStat ==bThridOptionRadioStat_temp ){
		  logger.log(LogStatus.PASS,"Reset functionality is working fine",sScreenshot);
	  }else{
		  logger.log(LogStatus.FAIL,"Reset functionality is not working fine",sScreenshot);
	  }
	  
  }
}
