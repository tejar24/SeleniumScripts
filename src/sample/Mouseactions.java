package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejar\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.com/");
		 Actions a=new Actions(driver);
		 a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		
		
		
		
		
		
	}
}
