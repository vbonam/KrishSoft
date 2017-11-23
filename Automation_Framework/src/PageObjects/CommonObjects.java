package PageObjects;

import org.openqa.selenium.By;


public class CommonObjects {

	/*
	 * Author: Hemali
	 * Date: 
	 * Description: This is class contains locators for common objects/elements  
	 *  	
	 */
	
	
	public static By home_tab = By.xpath("//a[text()='Home']");
	public static By sampleforms_tab = By.xpath("//a[text()='Sample Forms']");
	public static By features_tab = By.xpath("//a[text()='Features']");
	public static By pricing_tab = By.xpath("//a[text()='Pricing']");
	public static By help_tab = By.xpath("//a[text()='Help']");
	public static By aboutus_tab = By.xpath("//a[text()='About Us']");
	public static By resources_tab = By.xpath("//a[text()='Resources']");
	
	public static By home_tab_active = By.xpath("//span[text()='Home']");
	public static By sampleforms_tab_active = By.xpath("//span[text()='Sample Forms']");
	public static By features_tab_active = By.xpath("//span[text()='Features']");
	public static By pricing_tab_active = By.xpath("//span[text()='Pricing']");
	public static By help_tab_active = By.xpath("//span[text()='Help']");
	public static By aboutus_tab_active = By.xpath("//span[text()='About Us']");
	public static By resources_tab_active = By.xpath("//span[text()='Resources']");
	
	
}
