package com.sample01.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static String baseUrl="https://www.shoppersstop.com";
	public String email="sunildwavale@gmail.com";
	public String enterpassword="Sunil18@sh";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
}
