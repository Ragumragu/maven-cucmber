package Base_class;


import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;

	public static WebDriver Browser_url()
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\ansys dual band\\com.MyMavenProject\\Driver\\chromedriver.exe");
		
		return driver = new ChromeDriver();

	}
	public static void maximize() {

		driver.manage().window().maximize();
	}

	 public static void waitimplecit() {
		 

		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
		public static void close() {
			driver.close();
		}

		public static void quit() {
			driver.quit();
		}

		
		public static void navigateTo(String S) {
			driver.navigate().to(S);
		}

		public static void navigateback() {
			driver.navigate().back();
		}

		public static void navigatefrwd() {
			driver.navigate().forward();
		}

		public static void navigateRefr() {
			driver.navigate().refresh();
		}

		public static void getUrl(String a) {
			driver.get(a);
		}

		public static void Maximize() {
			driver.manage().window().maximize();
		}

		public static void Alertaccept() {
			driver.switchTo().alert().accept();
		}

		public static void AlertDismis() {
			driver.switchTo().alert().dismiss();
		}

		public static void AlertSendkey(String S) {
			driver.switchTo().alert().sendKeys(S);
		}
	    
		public static void ClicktheElement(WebElement sr1)
		{
			sr1.click();
	}
		public static void actionscontet() {
			Actions act = new Actions(driver);
			act.contextClick();
		}

		
		public static void Robot() throws AWTException {
			java.awt.Robot ro = new java.awt.Robot();

			
			ro.keyPress(KeyEvent.VK_DOWN);
			ro.keyRelease(KeyEvent.VK_DOWN);
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
			
		}

		public static void Frames(WebElement F) {
			driver.switchTo().frame(F);
		}

		public static void windowhandling(WebElement win) {
			String windowHandle = driver.getWindowHandle();
			windowHandle.equals(win);
		}

		public static void Dropdown(WebElement AB, WebElement cd) {
			Actions dp1 = new Actions(driver);
			dp1.dragAndDrop(AB, cd);
		}


		public static void Isenable(WebElement A) {
			boolean selected = A.isSelected();
			System.out.println(selected);
		}

		public static void Isdisplayed(WebElement dis) {
			boolean selected = dis.isSelected();
			System.out.println(selected);
		}

		public static void Isselected(WebElement sele) {
			boolean selected = sele.isSelected();
			System.out.println(selected);
		}

		public static void selecttheindex(WebElement element ,int A) {
			Select sc = new Select(element);
			sc.selectByIndex(A);

		}
		public static void Selectbyvaule(WebElement element, String i)
		{

			Select sc = new Select(element);
			sc.selectByValue(i);
					
		}
		
		public static void SelectbyvisibleText(WebElement web , String st) {

			Select sr = new Select(web);
			sr.selectByVisibleText(st);
			
		}
		
		public static void Getoptions(WebElement gto) {

		}

		public static void Gettitle(WebElement w) {
			w.getText();
		}

		public static void Getcurrenturl() {
			driver.getCurrentUrl();
		}

		public static void getText(WebElement text) {
			String text2 = text.getText();
		System.out.println(text2);
		}

		public static void getTageName(WebElement text) {
			String text5 = text.getText();
		System.out.println(text5);
		}
		
		public static void Getattribute(WebElement attr, String Get) {
			attr.getAttribute(Get);
		}
		
		public static void clicktheelement(WebElement element ) {
			
			element.click();
		}

		public static void waitimplicit() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		public static void Scrollupanddown(String expa)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", expa);
		}

		public static void SendKeys(WebElement wb, String S) {
			wb.sendKeys(S);
		}

		public static void Getfirstselectedoptions(WebElement gt, String s) {
			Select sele = new Select(gt);
			WebElement firstSelectedOption = sele.getFirstSelectedOption();
			System.out.println(firstSelectedOption);
		}

		public static void Getallselectedoptions(WebElement L, String K) {
			Select sele = new Select(L);
			List<WebElement> allSelectedOptions = sele.getAllSelectedOptions();
			System.out.println(allSelectedOptions);
		}

	

}

	
   


