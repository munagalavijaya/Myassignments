package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("leaf");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("learning");
		
		driver.findElement(By.xpath("//select[@id=\"day\"]/option[@value=\"1\"]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"month\"]/option[@value=\"6\"]")).click();
		
		driver.findElement(By.xpath("//select[@id=\"year\"]/option[@value=\"2021\"]")).click();
		
		driver.findElement(By.linkText("Female")).click();
		
	}

}
