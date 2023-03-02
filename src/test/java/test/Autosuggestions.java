package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {
	public static void main(String[] args) throws InterruptedException 
	{
		String keyword="realme";
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(keyword);
		Thread.sleep(2000);
List<WebElement> multi = driver.findElements(By.xpath("//div[@class='aajZCb']"));

for(WebElement ml:multi) 
{
	System.out.println(ml.getText());
	}
System.out.println(multi.size());

String exp="realme 9 Pro";
for(WebElement ml:multi) 
{
	String act=ml.getText();
	if(exp.equals(act)) 
	{
		ml.click();
		break;
	}
	}


	}

}
