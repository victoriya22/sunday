package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class PrintAllText {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/r.php");
	driver.manage().window().maximize();
	WebElement dDnyear = driver.findElement(By.xpath("//select[@id='year']"));
	Select select = new Select(dDnyear);
	List<WebElement>allOptions = select.getOptions();
	for (WebElement element : allOptions) {
		String years = element.getText();
		System.out.println(years); 
		
	}
	
	}

    }
