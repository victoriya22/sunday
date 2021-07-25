package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	text.sendKeys("iphone");
	WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	search.click();
}
}
