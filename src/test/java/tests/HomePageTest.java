package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;

public class HomePageTest extends BaseTest {
	
	HomePage hp;
    SoftAssert sa;
	
	@BeforeClass
	public void initObject() {
		
	         hp=new HomePage(driver);
	        sa=new SoftAssert();
	
	}
	
	@Test(priority=1)
	public void GoTotab() {
		hp.adminMenu();
		
		sa.assertFalse(true);
		sa.assertAll();
	}
	@Test(priority=2)
	public void Logout() {
		hp.logout();
	}
	
	
}
