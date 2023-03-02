package com.sample01.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersLoginPage 
{
	WebDriver ldriver;
	
	public ShoppersLoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//i[@Class='user-icon']")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(xpath="(//a[@title='Login with Email'])[2]")
	@CacheLookup
	WebElement emailclick;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="(//button[@type='submit'])[7]")
	@CacheLookup
	WebElement afterenteringemailclick;
	
	@FindBy(xpath="(//input[@type='password'])[3]")
	@CacheLookup
	WebElement enterpassword;
	
	@FindBy(xpath="(//button[@class='primary-cta show_desktop'])[3]")
	@CacheLookup
	WebElement continueclick;
	
	public void setUserNameClick() 
	{
		UserName.click();
	}
	public void eclick() 
	{
		emailclick.click();
	}
	public void enterEmail(String emailid) 
	{
		email.sendKeys(emailid);
	}
	public void afterenteringemailclick01() 
	{
		afterenteringemailclick.click();
	}
	
	public void Enterpasswrd(String pass) 
	{
		enterpassword.sendKeys(pass);
	}
	public void ctclick() 
	{
		continueclick.click();	
	}
}
