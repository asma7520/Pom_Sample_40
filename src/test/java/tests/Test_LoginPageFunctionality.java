package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import pages.CustomerLogin_Page;

public class Test_LoginPageFunctionality extends Hooks {

	@Test
	public void verify_customerLoginwithValidLoginPassword() {
		//login as customer
	    CustomerLogin_Page.action_customerLogin();
		
		//verify Welcome message
		String wc = getElementText(CustomerLogin_Page.lavel_CustomerWelcome);
		assertEquals("Welcome David", wc);
		
		//logout as customer
		CustomerLogin_Page.action_customerLogout();
		
	}
	@Test
	public void verify_customerIdAtCustomerHomePage() {
		
		//login as customer
		CustomerLogin_Page.action_customerLogin();
		
		//verify customer Id
		String customerId = getElementText(CustomerLogin_Page.lavel_CustomerId);
		assertEquals("Customer Id: 4", customerId);
		
		//logout as customer
		CustomerLogin_Page.action_customerLogout();
				
		
	}
	
	
}
