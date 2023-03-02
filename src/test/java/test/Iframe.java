package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst\r\n");
	Thread.sleep(2000);
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(2000);
	
	
	
	}
}
