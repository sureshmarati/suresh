package project_K;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement dri=  driver.findElement(By.name("q"));
		dri.sendKeys("xyz");
		dri.click();
		
	}
	
	

}
