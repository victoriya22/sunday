package org.firstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("victoriya@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("niranjani");
		WebElement btnName = driver.findElement(By.xpath("//button[@id='u_0_d_XG']"));
		btnName.click();
	
		
		
		
	}

}
