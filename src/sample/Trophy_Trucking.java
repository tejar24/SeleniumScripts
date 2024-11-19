package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Trophy_Trucking {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://hubdriveonlinetest.eoxvantage.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("trophytrucking@email.com");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Welcome2eox!");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[@page-id='a1ab5238-cab1-4a95-9eae-8df856efbe83']]")).click();
	
	
}
}
