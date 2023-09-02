package Test_Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\ansys dual band\\Maven_Project\\src\\test\\java\\com\\Features_Class\\Features.feature",
glue = "com.Step_Definition")



public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public  static void set_up() {
		driver=Base_Class.Browser_url();
		Base_Class.maximize();
				
	}
	

}
