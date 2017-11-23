package PageObjects;

import org.openqa.selenium.By;


public class SampleFormsPage {

	/*
	 * Author: Hemali
	 * Date: 
	 * Description: This is class contains locators for Sample Forms Page objects/elements  
	 *  	
	 */
	
	
	public static By marketing_department_chck = By.xpath("//input[@name='email_to[]' and @value='0']");
	public static By sales_chck = By.xpath("//input[@name='email_to[]' and @value='1']");
	public static By customer_service_chck = By.xpath("//input[@name='email_to[]' and @value='2']");
	public static By subject_txt = By.id("subject");
	public static By dropdownbox_dropdown = By.id("q3");
	public static By firstoption_radio = By.xpath("//input[@id='q4' and @value='First Option']");
	public static By secondoption_radio = By.xpath("//input[@id='q4' and @value='Second Option']");
	public static By thirdoption_radio = By.xpath("//input[@id='q4' and @value='Third Option']");
	public static By fourthoption_radio = By.xpath("//input[@id='q4' and @value='Fourth Option']");
	public static By fifthoption_radio = By.xpath("//input[@id='q4' and @value='Fifth Option']");
	public static By reset_btn = By.name("reset");
}
