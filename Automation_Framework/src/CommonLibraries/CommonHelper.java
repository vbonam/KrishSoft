package CommonLibraries;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.CommonObjects;
import SupportLibraries.SeleniumHelper;

public class CommonHelper extends SeleniumHelper {
	
	/*
	 * Author: Krish Soft
	 * Date: 
	 * Description: This is class contains common methods to navigate to different tabs and validations  
	 *  	
	 */
	

	public static void gotoHomePage(){
		driver.findElement(CommonObjects.home_tab).click();
		ValidateBrowserReady();
	}
	
	public static void gotoSampleFormsPage(){
		driver.findElement(CommonObjects.sampleforms_tab).click();
		ValidateBrowserReady();
	}
	
	public static void gotoFeaturesPage(){
		driver.findElement(CommonObjects.features_tab).click();
		ValidateBrowserReady();
	}
	
	public static void gotoPricingPage(){
		driver.findElement(CommonObjects.pricing_tab).click();
		ValidateBrowserReady();
	}
	
	public static void gotoHelpPage(){
		driver.findElement(CommonObjects.help_tab).click();
		ValidateBrowserReady();
	}
	
	public static void gotoAboutUsPage(){
		driver.findElement(CommonObjects.aboutus_tab).click();
		ValidateBrowserReady();
	}
	
	public static void gotoResourcesPage(){
		driver.findElement(CommonObjects.resources_tab).click();
		ValidateBrowserReady();
	}
	
	public static void validateHomePageisDisplayed() throws Exception{
		String sAttrVal = driver.findElement(CommonObjects.home_tab_active).getAttribute("class");
		String sScreenshot = CapturePageScreenshot();		
		if(sAttrVal.equals("highlighttab")){
			logger.log(LogStatus.PASS, "Home Page is Displayed", sScreenshot);
		}else{
			logger.log(LogStatus.FAIL, "Home Page is not Displayed", sScreenshot);
		}
	}
	
	public static void validateSampleFormsPageisDisplayed() throws Exception{
		String sAttrVal = driver.findElement(CommonObjects.sampleforms_tab_active).getAttribute("class");
		String sScreenshot = CapturePageScreenshot();		
		if(sAttrVal.equals("highlighttab")){
			logger.log(LogStatus.PASS, "Sample Forms Page is Displayed", sScreenshot);
		}else{
			logger.log(LogStatus.FAIL, "Sample Forms Page is not Displayed", sScreenshot);
		}
	}
	
	public static void validateFeaturesPageisDisplayed() throws Exception{
		String sAttrVal = driver.findElement(CommonObjects.features_tab_active).getAttribute("class");
		String sScreenshot = CapturePageScreenshot();		
		if(sAttrVal.equals("highlighttab")){
			logger.log(LogStatus.PASS, "Features Page is Displayed", sScreenshot);
		}else{
			logger.log(LogStatus.FAIL, "Features Page is not Displayed", sScreenshot);
		}
	}
	
	public static void validatePricingPageisDisplayed() throws Exception{
		String sAttrVal = driver.findElement(CommonObjects.pricing_tab_active).getAttribute("class");
		String sScreenshot = CapturePageScreenshot();		
		if(sAttrVal.equals("highlighttab")){
			logger.log(LogStatus.PASS, "Pricing Page is Displayed", sScreenshot);
		}else{
			logger.log(LogStatus.FAIL, "Pricing Page is not Displayed", sScreenshot);
		}
	}
	
	public static void validateHelpPageisDisplayed() throws Exception{
		String sAttrVal = driver.findElement(CommonObjects.help_tab_active).getAttribute("class");
		String sScreenshot = CapturePageScreenshot();		
		if(sAttrVal.equals("highlighttab")){
			logger.log(LogStatus.PASS, "Help Page is Displayed", sScreenshot);
		}else{
			logger.log(LogStatus.FAIL, "Help Page is not Displayed", sScreenshot);
		}
	}
	
	public static void validateAboutUsPageisDisplayed() throws Exception{
		String sAttrVal = driver.findElement(CommonObjects.aboutus_tab_active).getAttribute("class");
		String sScreenshot = CapturePageScreenshot();		
		if(sAttrVal.equals("highlighttab")){
			logger.log(LogStatus.PASS, "About Us Page is Displayed", sScreenshot);
		}else{
			logger.log(LogStatus.FAIL, "About Us Page is not Displayed", sScreenshot);
		}
	}
	
	public static void validateResourcesPageisDisplayed() throws Exception{
		String sAttrVal = driver.findElement(CommonObjects.resources_tab_active).getAttribute("class");
		String sScreenshot = CapturePageScreenshot();		
		if(sAttrVal.equals("highlighttab")){
			logger.log(LogStatus.PASS, "Resources Page is Displayed", sScreenshot);
		}else{
			logger.log(LogStatus.FAIL, "Resources Page is not Displayed", sScreenshot);
		}
	}
	
}