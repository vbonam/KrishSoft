package TestScripts;



import org.junit.Test;
import org.openqa.selenium.By;

import CommonLibraries.CommonHelper;
import SupportLibraries.ComplexReportFactory;
import SupportLibraries.SeleniumHelper;

public class a extends SeleniumHelper{
	/*
	 * Author: venky
	 * Date: 26/02/2017
	 * TC Description: Verify Different Fields in Sample Forms Page
	 * Comments:
	 * Revision History: 
	 */	
	
  @Test
  public void ValidateDifferentFieldsinSampleFormsPage() throws Exception{
	  logger = ComplexReportFactory.getTest();
	 // Map<String, String> TestData = ExcelHelper.GetData("2");
	  
	  CommonHelper.gotoSampleFormsPage();
	  CommonHelper.validateSampleFormsPageisDisplayed();
	  
	  boolean features = driver.findElement(By.xpath("//*[@id='header']/ul/li[5]/span")).isSelected();
	  
	  if(!features)driver.findElement(By.xpath("//*[@id='header']/ul/li[5]/span")).click();
	  		
	   features = driver.findElement(By.xpath("//*[@id='header']/ul/li[5]/span")).isSelected();
	  
	  
	  
	  String sScreenshot = CapturePageScreenshot();		
	  if(features){
		  logger.log(LogStatus.PASS, "features is selected", sScreenshot);
	  }else{
		  logger.log(LogStatus.FAIL, "features is not selected", sScreenshot);
	  }
	  
	 
	  
	  boolean login  = driver.findElement(By.xpath("//*[@id='center_col']/p[19]/a")).isDispaly();
	  
	  if(!login)driver.findElement(By.xpath("//*[@id='center_col']/p[19]/a")).click();
	  		
	   login  = driver.findElement(By.xpath("//*[@id='center_col']/p[19]/a")).isDispaly();	
	   
	   
	   
	   String sScreenshot = CapturePageScreenshot();		
		  if(login){
			  logger.log(LogStatus.PASS, "sign up is selected", sScreenshot);
		  }else{
			  logger.log(LogStatus.FAIL, "sign up is not selected", sScreenshot);
		  }

  }}