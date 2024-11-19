package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Marketing_app {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://apptest.eoxvantage.com/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("tejar");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Teja@1234");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='logo-here']")).click();
		driver.findElement(By.xpath("//div[text()='Marketing']")).click();
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.id("el71tup-itemProjectRequested")).sendKeys("Test it 1");
		driver.findElement(By.cssSelector(".formio-component-department div.formio-choices div.dropdown")).click();
		driver.findElement(By.cssSelector("#eedguw8-contactEmail")).sendKeys("test@123.com");
		driver.findElement(By.id("e994tdf-printQty")).sendKeys("10");
		driver.findElement(By.id("eel860b-intendedAudience")).sendKeys("test intended audience");
		driver.findElement(By.id("elnzpxl-useScenario")).sendKeys("test in which scenarios would this be used");
		driver.findElement(By.id("e2vovpr-additionalDescription")).sendKeys("test additional description");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
		driver.findElement(By.className("profile-img")).click();
	    
		
		
	}

}
