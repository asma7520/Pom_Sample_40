package pages;

import org.openqa.selenium.By;

import base.Base;

public class CustomerLogin_Page extends Base{

	//Locators
	
	public static By menu_Login = By.xpath("//a[text()='LOG IN']");
	public static By menu_CustomerLogin = By.xpath("//a[text()='Customer Login']");
	public static By text_CustomerUserId = By.name("mailuid");
	public static By text_CustomerPassword = By.name("pwd");
	public static By button_CustomerLogin = By.name("login-submit");
	public static By lavel_CustomerWelcome = By.xpath("//h2[2]");
	public static By lavel_CustomerId = By.xpath("//h2[1]");
	public static By menu_CustomerLogout = By.xpath("//a[text()='Log Out']");
	
	
	
	
	//Actions
	public static void action_customerLogin() {
	//go to http://it.microtechlimited.com
		
		navigateURL("http://it.microtechlimited.com");
		
		//click login Menu
		click(CustomerLogin_Page.menu_Login);
		
		//click customer login Menu
		click(CustomerLogin_Page.menu_CustomerLogin);
		
		//enter customer User Id
		sendkeys(CustomerLogin_Page.text_CustomerUserId,"david@gmail.com");
		
		//enter customer password
		sendkeys(CustomerLogin_Page.text_CustomerPassword,"1234");
		
		//click customer login button
		click(CustomerLogin_Page.button_CustomerLogin);
	}
	public static void action_customerLogout() {
		// click customer logout menu
			click(CustomerLogin_Page.menu_CustomerLogout);
		}
}
