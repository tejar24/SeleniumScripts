package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demopractice {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
driver.get("https://hubdriveonlinetest.eoxvantage.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trophytrucking@email.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome2eox!");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();	
Thread.sleep(5000);
//driver.findElement(By.cssSelector("a[title='Contractor Management']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@page-id='a1ab5238-cab1-4a95-9eae-8df856efbe83']")).click();
driver.findElement(By.xpath("//*[text()='Add Contractors']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//input[@name='data[contractorCompanyName]']")).click();
driver.findElement(By.xpath("//input[@name='data[contractorCompanyName]']")).sendKeys("TestCCN009");

driver.findElement(By.xpath("//input[@name='data[contractorFirstName1]']")).click();
driver.findElement(By.xpath("//input[@name='data[contractorFirstName1]']")).sendKeys("Testfnse01");

driver.findElement(By.xpath("//input[@name='data[contractorLastName1]']")).click();
driver.findElement(By.xpath("//input[@name='data[contractorLastName1]']")).sendKeys("Testfnse01");
	
driver.findElement(By.xpath("//div[@class='form-control ui fluid selection dropdown']")).click();
driver.findElement(By.xpath("//div[@class='choices__list choices__list--dropdown']")).click();
driver.findElement(By.cssSelector(".formio-component-coverageDescription div div.choices__list--dropdown div div.is-highlighted")).click();

driver.findElement(By.xpath("//input[@class='form-control form-control input']")).click();






	}
}
