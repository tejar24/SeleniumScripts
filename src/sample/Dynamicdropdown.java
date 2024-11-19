package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("Ind");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='India']")).click();
List<WebElement> values=	driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	
		for(WebElement value :values)
		{
			if(value.getText().equalsIgnoreCase("India"))
			{
				value.click();
				break;
			}
		
		}
		
	}
}
