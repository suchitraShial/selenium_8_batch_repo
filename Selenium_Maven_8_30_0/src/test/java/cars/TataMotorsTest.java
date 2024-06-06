package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotorsTest {
	@Test(groups = "system")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tatamotors.com/");
		Reporter.log("tatamotors launched successfully", true);
	}
}
