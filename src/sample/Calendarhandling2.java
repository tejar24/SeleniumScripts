package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandling2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://spicejet.com");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Agartala Airport']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		
		
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		
	
	}

}
