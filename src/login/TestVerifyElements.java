package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestVerifyElements {
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void VerifyElements() throws Exception{
		 
		 driver.navigate().to(PageURL.HTEC_LOGIN);
		 Assert.assertTrue(new LoginPage(driver).visibleEmail());
		 Assert.assertTrue(new LoginPage(driver).visiblePassword());
		 Assert.assertTrue(new LoginPage(driver).visibleSubit());
}
}