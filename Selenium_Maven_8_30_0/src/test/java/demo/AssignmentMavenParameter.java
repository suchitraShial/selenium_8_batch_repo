package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssignmentMavenParameter {
	@Test
	public void receiveData() {
		String URL = System.getProperty("url");
		
		Reporter.log(URL);
		String EMAIL = System.getProperty("email");
		String PASSWORD = System.getProperty("password");
		Reporter.log(URL);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
		
		
	}

