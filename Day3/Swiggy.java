package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		public class Swiggy {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement clickSignUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		clickSignUp.click();
		WebElement mobNum = driver.findElement(By.xpath("//input[@id='mobile']"));
		mobNum.sendKeys("6381120878");
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("victoriya");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("victoriya2207@gmail.com");
	}

}
