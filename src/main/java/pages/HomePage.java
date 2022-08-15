package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage<WebElements> {
	
	
	 //Webelement
	@FindBy(xpath="//*[@id='mainMenuFirstLevelUnorderedList']//Chlid::a[@class='firstLevelMenu']")
	private WebElement Tabs;
	
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
	private WebElement Admin;
	
	@FindBy(xpath="//*[@id='branding']//a[2]")
	private WebElement welcometab;
	
	@FindBy(xpath="//*[@id='welcome-menu']//ul//li//a[text()='Logout']")
	private WebElement logoutlink;
	
	//constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//action
	public void adminMenu() {
		Admin.click();
		
		
	}
	
	public void logout() {
		welcometab.click();
		logoutlink.click();
	}
	
}
