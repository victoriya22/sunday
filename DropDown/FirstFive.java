package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstFive {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement dDndays = driver.findElement(By.xpath("//select[@id='day']"));
		Select select = new Select(dDndays);
		List<WebElement>allOptions = select.getOptions();
		int p = allOptions.size();
		for (int i=p-5; i<p; i++) {
		String lastFive = allOptions.get(i).getText();
			System.out.println(lastFive);
		}}
		
}