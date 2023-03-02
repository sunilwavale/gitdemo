package com.sample01.TestCases;

import org.testng.annotations.Test;

import com.sample01.PageObject.ShoppersLoginPage;

public class TestCase_TC001 extends Baseclass 
{
	@Test
	
	public void test011()
	{
		
		driver.get(baseUrl);
		ShoppersLoginPage lp=new ShoppersLoginPage(driver);
		lp.setUserNameClick();
		lp.eclick();
		lp.enterEmail(email);
		lp.afterenteringemailclick01();
		lp.Enterpasswrd(enterpassword);
		lp.ctclick();
		
	}
}
