package Selenium.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		//Alert with OK
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		driver.switchTo().alert().accept();
		
		
		//Alert with OK & Cancel
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
		
		
		//Alert with Textbox 
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("TestData");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"demo1\"]")).getText());
		
		
		
		
		
		
		
		
	}

}
