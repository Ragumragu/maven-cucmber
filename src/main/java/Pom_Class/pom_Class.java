package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_Class {
	private static WebDriver driver;
	
		
	public pom_Class(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="username")
	WebElement user;
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		pom_Class.driver = driver;
	}
	public WebElement getUser() {
		return user;
	}
	public void setUser(WebElement user) {
		this.user = user;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}
	public WebElement getLog() {
		return log;
	}
	public void setLog(WebElement log) {
		this.log = log;
	}

	@FindBy(id="password")
	WebElement pass;
	@FindBy(id="login")
	WebElement log;
	
	

}
