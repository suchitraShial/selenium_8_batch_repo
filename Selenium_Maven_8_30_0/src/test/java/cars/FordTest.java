package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FordTest {
	@Test(groups = "Smoke")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.india.ford.com/");
		Reporter.log("FordTest executeed  successfully", true);
	}
}
