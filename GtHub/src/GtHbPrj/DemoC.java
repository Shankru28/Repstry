package GtHbPrj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoC {
	@Test
	void testScript() {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
