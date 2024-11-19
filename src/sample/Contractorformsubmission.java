package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contractorformsubmission {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://hubdriveonlinetest.eoxvantage.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trophytrucking@email.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome2eox!");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='id_43ef58ca-626d-46cb-a4e6-85f470055223']//a[text()='Launch']")).click();
		driver.findElement(By.xpath("//div[text()='Add Contractors']")).click();
		// driver.findElement(By.xpath("//div[@data-type='select-multiple']")).click();
		// //div[@data-value='nontruckingliability']")).click();
		driver.findElement(By.xpath("//input[@id='e8otldo-contractorCompanyName']")).click();
		driver.findElement(By.xpath("//input[@id='e8otldo-contractorCompanyName']")).sendKeys("Testcontractors");
		driver.findElement(By.xpath("//input[@id='e7trl1-contractorFirstName1']")).click();
		driver.findElement(By.xpath("//input[@id='e7trl1-contractorFirstName1']")).sendKeys("ContractorFirstname");
		driver.findElement(By.xpath("//input[@id='e5vonkg-contractorLastName1']")).click();
		driver.findElement(By.xpath("//input[@id='e5vonkg-contractorLastName1']")).sendKeys("Contractorlastname");
		driver.findElement(By.xpath("//input[@class='form-control input']")).click();
		driver.findElement(By.xpath("//input[@class='form-control input']")).sendKeys("08-12-2024");
		driver.findElement(By.xpath("//button[@name='data[submit]']")).click();
	}

}
