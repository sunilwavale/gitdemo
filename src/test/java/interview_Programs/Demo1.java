package interview_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s=new Select(month);
		s.selectByValue("8");
		Thread.sleep(2000);
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByVisibleText("Jun");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Thread.sleep(2000);
		Select s1=new Select(day);
		WebElement dayvalue = s1.getFirstSelectedOption();
		Thread.sleep(2000);
		System.out.println(dayvalue.getText());
		
		
		
		
		
		
		
		
		
	}

}
