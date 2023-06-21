package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.CustomerLogin_Page;

import pages.CustomerOrder_page;


public class Test_CustomerOrder extends Hooks{
	
@Test
public void verify_customerId_InOrderPage() {
	//login as customer
	CustomerLogin_Page.action_customerLogin();
	
	//click Order Product Menu
	click(CustomerOrder_page.menu_Order);
	
	//verify customer Id
	String cid = getAttributeValue(CustomerOrder_page .label_customer_Id, "value");
	assertEquals("4",cid);
}
}