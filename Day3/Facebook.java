package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("victoriya");
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("niranjani");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
		
		
	}

}
