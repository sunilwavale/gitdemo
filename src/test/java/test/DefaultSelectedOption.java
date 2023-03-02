package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DefaultSelectedOption {
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
		WebElement dayvalue = s.getFirstSelectedOption();
		
		System.out.println(dayvalue.getText());
		

}}
