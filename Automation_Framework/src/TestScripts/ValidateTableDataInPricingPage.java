package TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibraries.CommonHelper;
import SupportLibraries.ComplexReportFactory;
import SupportLibraries.SeleniumHelper;

public class ValidateTableDataInPricingPage extends SeleniumHelper{
  @Test
  public void ValidateTableData_PricingPage() throws Exception{
	  logger = ComplexReportFactory.getTest();	
	  CommonHelper.gotoPricingPage();
	  CommonHelper.validatePricingPageisDisplayed();
	  
	  String sAdvStandTxt = driver.findElement(By.xpath("//td[starts-with(text(),'Advertisements')]/../td[2]")).getText();
	  String sAdvPremiumTxt = driver.findElement(By.xpath("//td[starts-with(text(),'Advertisements')]/../td[3]")).getText();
	  if(sAdvStandTxt.equals("Advertisement Upon Submission")
		 && sAdvPremiumTxt.equals("None")){
		  logger.log(LogStatus.PASS, "Data is displayed as expected for Advertisement Feature", "");
	  }else{
		  logger.log(LogStatus.FAIL, "Data is not displayed as expected for Advertisement Feature", "");
	  }
	  
	  String sFileAttachStandTxt = driver.findElement(By.xpath("//td[starts-with(text(),'File Attachments')]/../td[2]")).getText();
	  String sFileAttachPremiumTxt = driver.findElement(By.xpath("//td[starts-with(text(),'File Attachments')]/../td[3]")).getText();
	  if(sFileAttachStandTxt.equals("No")
		 && sFileAttachPremiumTxt.equals("Yes, 5000kb limit per attachment")){
		  logger.log(LogStatus.PASS, "Data is displayed as expected for File Attachments Feature", "");
	  }else{
		  logger.log(LogStatus.FAIL, "Data is not displayed as expected for File Attachments Feature", "");
	  }
  }
}
