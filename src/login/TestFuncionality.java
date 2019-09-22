package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFuncionality {
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test
	 public void Test1() throws Exception{
		 
		 driver.navigate().to(PageURL.HTEC);
		 new LoginPage(driver).clickCentarLogin();
		 new LoginPage(driver).clickEmail();
		 new LoginPage(driver).clickPassword();
		 new LoginPage(driver).clickSubmit();
}
}