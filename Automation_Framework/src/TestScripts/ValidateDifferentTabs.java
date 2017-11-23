package TestScripts;

import org.testng.annotations.Test;

import CommonLibraries.CommonHelper;
import SupportLibraries.ComplexReportFactory;
import SupportLibraries.SeleniumHelper;

public class ValidateDifferentTabs extends SeleniumHelper{
	
	/*
	 * Author: Krish Soft 
	 * Date: 26/02/2017
	 * TC Description: Validate Different tabs in my contact form application
	 * Comments:
	 * Revision History: 
	 */	
	
  @Test
  public void ValidateDifferentTabsNavigation() throws Exception{
	  logger = ComplexReportFactory.getTest();	  
	  CommonHelper.gotoSampleFormsPage();
	  CommonHelper.validateSampleFormsPageisDisplayed();
	  CommonHelper.gotoFeaturesPage();
	  CommonHelper.validateFeaturesPageisDisplayed();
	  CommonHelper.gotoPricingPage();
	  CommonHelper.validatePricingPageisDisplayed();
	  CommonHelper.gotoHelpPage();
	  CommonHelper.validateHelpPageisDisplayed();
	  CommonHelper.gotoAboutUsPage();
	  CommonHelper.validateAboutUsPageisDisplayed();
	  CommonHelper.gotoResourcesPage();
	  CommonHelper.validateResourcesPageisDisplayed();	  
  }
}
