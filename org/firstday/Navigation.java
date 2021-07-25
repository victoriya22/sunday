package org.firstday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://en-gb.facebook.com/");
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	

	}

}
