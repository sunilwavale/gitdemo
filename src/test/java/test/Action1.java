package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
	WebElement lg=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	act.moveToElement(lg).perform();
		
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[13]")).click();
		
		
		
		

}}
