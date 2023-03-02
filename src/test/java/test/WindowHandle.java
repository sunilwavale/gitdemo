package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		
//		String id1=driver.getWindowHandle();
//		System.out.println(id1);
		
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> itr=ids.iterator();
		while(itr.hasNext()) 
		{
			String str=itr.next();
			driver.switchTo().window(str);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Hi");
			Thread.sleep(2000);
		}
		
		
	}

}
