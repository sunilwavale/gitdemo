package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultSelect {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement multi = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select s=new Select(multi);
		boolean result = s.isMultiple();
		if(result==true) 
		{
		System.out.println("Multi selected option");	
		}
		else 
		{
			System.out.println("Not Multi selected option");	
		}
		
	}}
