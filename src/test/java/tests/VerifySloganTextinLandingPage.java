package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import pages.LandingPage;



public class VerifySloganTextinLandingPage extends Hooks {
	//LandingPage landingPage = new LandingPage();
	@Test
	public void verifySloganTextinLandingPage() {
	//go to http://it.microtechlimited.com
	navigateURL("http://it.microtechlimited.com");
	
	//get text of 'Your One Stop Solution' label
	String actualSlogan = getElementText( LandingPage.slogan);
	
	// verify its text is 'Your One Stop Solution'
	assertEquals("Your One Stop Soloution",actualSlogan);
  }
	@Test // End To End Test
	public void verifySloganTextinLandingPageLengthLessThan200Char() {
	//go to http://it.microtechlimited.com
	navigateURL("http://it.microtechlimited.com");
	
	//get text of 'Your One Stop Solution' label
	String actualSlogan = getElementText( LandingPage.slogan);
	
	// verify its slogan length is less than 200 chars
	assertTrue(actualSlogan.length()<200);
  }
}
