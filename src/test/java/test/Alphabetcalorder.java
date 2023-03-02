package test;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphabetcalorder {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select s1=new Select(month);
		
		List<WebElement> monthlist = s1.getOptions();
		
		TreeSet tr=new TreeSet();
		for(WebElement ml:monthlist) 
		{
			tr.add(ml.getText());
		}
		for(Object str:tr) 
		{
			System.out.println(str);
		}

}}
