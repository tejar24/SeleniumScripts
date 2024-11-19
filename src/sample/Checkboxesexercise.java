package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxesexercise {
 public static void main(String[] args) {
	
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 
	 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

	 Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	 
	 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	 Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	 
System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	 
	 
}
}
