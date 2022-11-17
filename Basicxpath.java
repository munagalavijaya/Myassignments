package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicxpath {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				
				driver.findElement(By.xpath("//a[@style='color: black;']")).click();
				
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");				
				
				
			}







	}


