package org.firstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
	txt.sendKeys("iphone");
	WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
	btn.click();
	

	
	}

}
