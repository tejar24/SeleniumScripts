package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[text()='Belagavi Airport']")).click();
	driver.findElement(By.xpath("//div[text()='Kempegowda International Airport']")).click();
	WebElement drop=driver.findElement(By.xpath("//div[text()='Kempegowda International Airport']"));
	
	Select se=new Select(drop);
	
	se.selectByIndex(0);
		
		
		
		
	}
	
}
