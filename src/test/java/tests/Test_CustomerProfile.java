package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.CustomerLogin_Page;
import pages.CustomerProfile_Page;

public class Test_CustomerProfile extends Hooks {
	
	@Test
	public void verify_customerProfileName() {
	//login as Customer
		CustomerLogin_Page.action_customerLogin();
		
	//click profile menu
	click(CustomerProfile_Page.menu_profile);
	
	//Verify Customer First name
	String firstName = getAttributeValue(CustomerProfile_Page.profile_firstName, "value");
	assertEquals("David" ,firstName);
	
	//logout as customer
	CustomerLogin_Page.action_customerLogout();
	}
}
