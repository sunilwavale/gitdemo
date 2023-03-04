package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassMethods {
	
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
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s=new Select(day);
		
		s.selectByIndex(29);
		Thread.sleep(2000);
		s.selectByValue("27");
		Thread.sleep(2000);
		s.selectByVisibleText("23");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		
		Select s1=new Select(month);
		s1.selectByIndex(10);
		Thread.sleep(2000);
		s1.selectByValue("12");
		Thread.sleep(2000);
		s1.selectByVisibleText("Nov");
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s2=new Select(year);
		s2.selectByIndex(10);
		Thread.sleep(2000);
		s2.selectByValue("1983");
		Thread.sleep(2000);
		s2.selectByVisibleText("1947");
		
		System.out.println("ajsfgahjsgf");

		System.out.println("efreweahjsgf");

		System.out.println("ssxxsxxxx");
		
		driver.close();
		
	}

}
