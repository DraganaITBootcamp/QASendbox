package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements
	
	private static WebElement centarLogin() {
		return driver.findElement(By.cssSelector("a.btn:nth-child(4)"));
	}
	private static WebElement navLogin() {
		return driver.findElement(By.cssSelector("li.nav-item:nth-child(2) > a:nth-child(1)"));
	}
	private static WebElement emailAddress() {
		return driver.findElement(By.name("email"));
	}
	private static WebElement password() {
		return driver.findElement(By.name("password"));
	}
	private static WebElement submitButton() {
		return driver.findElement(By.cssSelector(".btn"));
	}
    
	//Action
	
	public void clickCentarLogin() {
		centarLogin().click();
	}
	public void clickNavLogin() {
		navLogin().click();
	}
	public void clickEmail() {
		emailAddress().click();
	}
	public void inputEmail(String text) {
		emailAddress().sendKeys(text);
	}
	public void clickPassword() {
		password().click();
	}
	public void inputPassword(String text) {
		password().sendKeys(text);
	}
	public void clickSubmit() {
		submitButton().click();
	}
	public boolean visibleEmail(){
	    return driver.findElement(By.name("email")).isDisplayed();
    }	
	public boolean visiblePassword(){
	    return driver.findElement(By.name("password")).isDisplayed();
    }	
	public boolean visibleSubit(){
	    return driver.findElement(By.cssSelector(".btn")).isDisplayed();
    }	
	
	
	
}
