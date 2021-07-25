package org.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	
	 driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	 driver.manage().window().maximize();
	
	 WebElement element = driver.findElement(By.xpath("//frame[@name='login_page']"));
	
	 driver.switchTo().frame(element);
	
	 WebElement login = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	 
	 login.sendKeys("victoriya");
	
	 WebElement btnClick = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
	
	 btnClick.click();
	 
	 
	 
	 
	 
	 }

}

