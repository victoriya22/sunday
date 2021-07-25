package org.firstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btn = driver.findElement(By.xpath("//a[@id='home-tab']"));
		btn.click();
		WebElement txtContains = driver.findElement(By.xpath("//p[contains(text(),'America')]"));
		String name = txtContains.getText();
		System.out.println(name);
		
	}

}
