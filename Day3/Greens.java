package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnClick = driver.findElement(By.xpath("//div[@id='heading20']"));
		btnClick.click();
		WebElement clickCts = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		clickCts.click();
	}

}
