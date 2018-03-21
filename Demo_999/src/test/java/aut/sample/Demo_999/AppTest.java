package aut.sample.Demo_999;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	
	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");
	}
}
