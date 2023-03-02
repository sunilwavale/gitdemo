package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		
		
	}
}
