package Step_Definition;

import com.Pom_Class.Login;

import Base_class.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends Base_Class {
	
	Login first_Action = new Login(driver);
	
	@Given("user launch the application")
	public void user_launch_the_application() {
		getUrl("https://adactinhotelapp.com/");
	    
	}
	@When("user enter the username")
	public void user_enter_the_username() {
		SendKeys(first_Action.getUser(),"raguragu");
	   
	}
	@When("user enter the password")
	public void user_enter_the_password() {
	   SendKeys(first_Action.getPass(),"Ragu@123");
	}
	@Then("user click the login botton and navigate to home page")
	public void user_click_the_login_botton_and_navigate_to_home_page() {
		clicktheelement(first_Action.getLog());
	    
	}




}
