package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru2 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html ");
	WebElement lnkBank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement amount1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));	
	WebElement account1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	WebElement amount2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement amount3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(lnkBank,account).perform();
	actions.dragAndDrop(amount,amount1).perform();
	actions.dragAndDrop(sales,account1).perform();
	actions.dragAndDrop(amount2,amount3).perform();
	
	
	
	}

}
