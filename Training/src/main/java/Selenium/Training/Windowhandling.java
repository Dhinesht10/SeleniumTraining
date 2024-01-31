package Selenium.Training;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		String firstwindow = driver.getWindowHandle();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles.size());
		for (String windowhandle:windowhandles) {
			driver.switchTo().window(windowhandle);
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(firstwindow);
		
		
		

	}

}
