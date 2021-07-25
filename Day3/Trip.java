package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Trip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement from = driver.findElement(By.xpath("//input[@id='from_station']"));
		from.sendKeys("tambaram");
		WebElement to = driver.findElement(By.xpath("//input[@id='to_station']"));
		to.sendKeys("chidambaram");
		WebElement cls = driver.findElement(By.xpath("//select[@id='trainClass']"));
		cls.click();
		
}		
}