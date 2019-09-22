package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
	
	WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver",
				 "C:\\Users\\GaGa\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
}
	 @Test(dataProviderClass=Helper.class,dataProvider="LoginData")
	 
	 public void ValidData(String email, String password) throws Exception{
		 
		 driver.navigate().to(PageURL.HTEC);
		 new LoginPage(driver).clickCentarLogin();
		 new LoginPage(driver).clickEmail();
		 new LoginPage(driver).inputEmail(email);
		 new LoginPage(driver).clickPassword();
		 new LoginPage(driver).inputPassword(password);
		 new LoginPage(driver).clickSubmit();
}
}
