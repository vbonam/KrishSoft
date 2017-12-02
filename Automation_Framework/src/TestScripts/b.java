package TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CommonLibraries.CommonHelper;
import SupportLibraries.ComplexReportFactory;
import SupportLibraries.SeleniumHelper;

public class b extends SeleniumHelper{
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
	  
	  
	  
	  
	  
	  
	  
	// ***********************************************************
	  
	  boolean help = driver.findElement(By.xpath("//*[@id='header']/ul/li[3]/span")).isSelected();
	  
	  if(!help)driver.findElement(By.xpath("//*[@id='header']/ul/li[3]/span")).click();
	  		
	   help = driver.findElement(By.xpath("//*[@id='header']/ul/li[3]/span")).isSelected();
	  
			   
	// ********************************************		   
			   
			   boolean faq = driver.findElement(By.xpath("//*[@id='left_col_top']/ul/li[1]/a")).isSelected();
				  
				  if(!faq)driver.findElement(By.xpath("//*[@id='left_col_top']/ul/li[1]/a")).click();
				  		
				   faq = driver.findElement(By.xpath("//*[@id='left_col_top']/ul/li[1]/a")).isSelected();
				   
	//			   ***************************************************
				   
				   boolean helpFourm = driver.findElement(By.xpath("//*[@id='left_col_top']/ul/li[2]/a")).isSelected();
					  
					  if(!helpFourm)driver.findElement(By.xpath("//*[@id='left_col_top']/ul/li[2]/a")).click();
					  		
					   helpFourm = driver.findElement(By.xpath("//*[@id='left_col_top']/ul/li[2]/a")).isSelected();
				  
     //  ********************************************************
					   
					   
		boolean email = driver.findElement(By.xpath("//a[text()='E-mail Filtering Issues']")).isSelected();
						  
		if(!email)driver.findElement(By.xpath("//a[text()='E-mail Filtering Issues']")).click();
						  		
		email = driver.findElement(By.xpath("//a[text()='E-mail Filtering Issues']")).isSelected();			   
  
		
     //   ************************************************************
		
		
		boolean AolYahoo = driver.findElement(By.xpath("//a[text()='AOL and Yahoo! Messages']")).isSelected();
		  
		if(!AolYahoo)driver.findElement(By.xpath("//a[text()='AOL and Yahoo! Messages']")).click();
						  		
		AolYahoo = driver.findElement(By.xpath("//a[text()='AOL and Yahoo! Messages']")).isSelected();		
		
	//   ************************************************************
		
		 boolean FAQPage = driver.findElement(By.xpath("//a[text()='Frequently Asked Questions (FAQ)']")).isSelected();
		  
		 if(!FAQPage)driver.findElement(By.xpath("//a[text()='Frequently Asked Questions (FAQ)']")).click();
		  		
		 FAQPage = driver.findElement(By.xpath("//a[text()='Frequently Asked Questions (FAQ)']")).isSelected();
		  
     //    ******************************************
		 
		 boolean HelpForumPage = driver.findElement(By.xpath("//*[@id='center_col']/h6[2]/a")).isSelected();
		  
		 if(!HelpForumPage)driver.findElement(By.xpath("//*[@id='center_col']/h6[2]/a")).click();
		  		
		 HelpForumPage = driver.findElement(By.xpath("//*[@id='center_col']/h6[2]/a")).isSelected();
		  
	//    *************************************************	
		 boolean EmailFilterPage = driver.findElement(By.xpath("//*[@id='center_col']/h6[3]/a")).isSelected();
		  
		 if(!EmailFilterPage)driver.findElement(By.xpath("//*[@id='center_col']/h6[3]/a")).click();
		  		
		 EmailFilterPage = driver.findElement(By.xpath("//*[@id='center_col']/h6[3]/a")).isSelected();
		
	//     **************************************************
		 
		 boolean AOlYahooPage = driver.findElement(By.xpath("//a[text()='AOL and Yahoo! Messages']")).isSelected();
		  
		 if(!AOlYahooPage)driver.findElement(By.xpath("//a[text()='AOL and Yahoo! Messages']")).click();
		  		
		 AOlYahooPage = driver.findElement(By.xpath("//a[text()='AOL and Yahoo! Messages']")).isSelected();
		 
		
}

}
  



