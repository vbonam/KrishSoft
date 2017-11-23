package TestScripts;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonLibraries.CommonHelper;
import SupportLibraries.ComplexReportFactory;
import SupportLibraries.SeleniumHelper;

public class ValidateLinksShouldnotDisplayISE extends SeleniumHelper{

	
	@Test
	public void ValidateLinksShouldnotDisplayISEinSampleFormsPage() throws Exception{
		logger = ComplexReportFactory.getTest();	
		CommonHelper.gotoSampleFormsPage();
		CommonHelper.validateSampleFormsPageisDisplayed();
		
		int iGenContFormLinkCnt = driver.findElements(By.xpath("//div[@id='left_col_top']/ul[1]/li")).size();
		for(int i=1;i<=iGenContFormLinkCnt;i++){
			String sLinkName = driver.findElement(By.xpath("//div[@id='left_col_top']/ul[1]/li["+i+"]/a")).getText();
			driver.findElement(By.xpath("//div[@id='left_col_top']/ul[1]/li["+i+"]/a")).click();
			String sScreenshot = CapturePageScreenshot();
			String sTitle = driver.getTitle();
			if(sTitle.equals("500 Internal Server Error")){
				//System.out.println("Fail: Link "+sLinkName+" displayed 500 Internal Server Error");
				logger.log(LogStatus.FAIL, "Link "+sLinkName+" displayed 500 Internal Server Error", sScreenshot);
				
			}else{
				//System.out.println("Pass: Link "+sLinkName+" Functioning as expected");
				logger.log(LogStatus.PASS, "Link "+sLinkName+" Functioning as expected", sScreenshot);
			}
			driver.navigate().back();
		}
		
		int iWebFeedbackFormLinkCnt = driver.findElements(By.xpath("//div[@id='left_col_top']/ul[2]/li")).size();
		for(int i=1;i<=iWebFeedbackFormLinkCnt;i++){
			String sLinkName = driver.findElement(By.xpath("//div[@id='left_col_top']/ul[2]/li["+i+"]/a")).getText();
			driver.findElement(By.xpath("//div[@id='left_col_top']/ul[2]/li["+i+"]/a")).click();
			String sScreenshot = CapturePageScreenshot();
			String sTitle = driver.getTitle();
			if(sTitle.equals("500 Internal Server Error")){
				//System.out.println("Fail: Link "+sLinkName+" displayed 500 Internal Server Error");
				logger.log(LogStatus.FAIL, "Link "+sLinkName+" displayed 500 Internal Server Error", sScreenshot);
				
			}else{
				//System.out.println("Pass: Link "+sLinkName+" Functioning as expected");
				logger.log(LogStatus.PASS, "Link "+sLinkName+" Functioning as expected", sScreenshot);
			}
			driver.navigate().back();
		}
		
		int iBusinessFormLinkCnt = driver.findElements(By.xpath("//div[@id='left_col_top']/ul[3]/li")).size();
		for(int i=1;i<=iBusinessFormLinkCnt;i++){
			String sLinkName = driver.findElement(By.xpath("//div[@id='left_col_top']/ul[3]/li["+i+"]/a")).getText();
			driver.findElement(By.xpath("//div[@id='left_col_top']/ul[3]/li["+i+"]/a")).click();
			String sScreenshot = CapturePageScreenshot();
			String sTitle = driver.getTitle();
			if(sTitle.equals("500 Internal Server Error")){
				//System.out.println("Fail: Link "+sLinkName+" displayed 500 Internal Server Error");
				logger.log(LogStatus.FAIL, "Link "+sLinkName+" displayed 500 Internal Server Error", sScreenshot);
				
			}else{
				//System.out.println("Pass: Link "+sLinkName+" Functioning as expected");
				logger.log(LogStatus.PASS, "Link "+sLinkName+" Functioning as expected", sScreenshot);
			}
			driver.navigate().back();
		}
		
		int iRegResrvationsLinkCnt = driver.findElements(By.xpath("//div[@id='left_col_top']/ul[4]/li")).size();
		for(int i=1;i<=iRegResrvationsLinkCnt;i++){
			String sLinkName = driver.findElement(By.xpath("//div[@id='left_col_top']/ul[4]/li["+i+"]/a")).getText();
			driver.findElement(By.xpath("//div[@id='left_col_top']/ul[4]/li["+i+"]/a")).click();
			String sScreenshot = CapturePageScreenshot();
			String sTitle = driver.getTitle();
			if(sTitle.equals("500 Internal Server Error")){
				//System.out.println("Fail: Link "+sLinkName+" displayed 500 Internal Server Error");
				logger.log(LogStatus.FAIL, "Link "+sLinkName+" displayed 500 Internal Server Error", sScreenshot);
				
			}else{
				//System.out.println("Pass: Link "+sLinkName+" Functioning as expected");
				logger.log(LogStatus.PASS, "Link "+sLinkName+" Functioning as expected", sScreenshot);
			}
			driver.navigate().back();
		}
		
		int iSurveysLinkCnt = driver.findElements(By.xpath("//div[@id='left_col_top']/ul[5]/li")).size();
		for(int i=1;i<=iSurveysLinkCnt;i++){
			String sLinkName = driver.findElement(By.xpath("//div[@id='left_col_top']/ul[5]/li["+i+"]/a")).getText();
			driver.findElement(By.xpath("//div[@id='left_col_top']/ul[5]/li["+i+"]/a")).click();
			String sScreenshot = CapturePageScreenshot();
			String sTitle = driver.getTitle();
			if(sTitle.equals("500 Internal Server Error")){
				//System.out.println("Fail: Link "+sLinkName+" displayed 500 Internal Server Error");
				logger.log(LogStatus.FAIL, "Link "+sLinkName+" displayed 500 Internal Server Error", sScreenshot);
				
			}else{
				//System.out.println("Pass: Link "+sLinkName+" Functioning as expected");
				logger.log(LogStatus.PASS, "Link "+sLinkName+" Functioning as expected", sScreenshot);
			}
			driver.navigate().back();
		}
  }
}
