package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class Guru {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement lnkPrime = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(lnkPrime).perform();
	Thread.sleep(5000);
	WebElement lnkData = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	lnkData.click();
	
	
 
	}

}
