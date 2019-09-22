package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestIdentity {
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void VerifyElements() throws Exception{
	 
     driver.navigate().to(PageURL.HTEC);	
     new LoginPage(driver).clickCentarLogin();
     String url1 = driver.getCurrentUrl();
     new LoginPage(driver).clickNavLogin();
     String url2 = driver.getCurrentUrl();
     Assert.assertEquals(url1, url2);

}
}