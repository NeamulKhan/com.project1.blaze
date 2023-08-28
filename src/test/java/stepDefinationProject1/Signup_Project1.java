package stepDefinationProject1;

import com.project1.PageAction.HomePageActionProject1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilityProject1.BaseClassProject1;

public class Signup_Project1 extends BaseClassProject1 {
	
	HomePageActionProject1 homePageActionProject1 = new HomePageActionProject1();
	
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	   
		project1LaunchURL(URL);
	}


@Then("^click sign up link$")
public void click_sign_up_link() throws Throwable {
	
	homePageActionProject1.clicksignupLink();
}

@Then("^enter username, password and click signup button$")
public void enter_username_password_and_click_signup_button() throws Throwable {
	
	homePageActionProject1.entercredentials(project1_prop.getProperty("Username"),project1_prop.getProperty("Password"));
   
	}

@Then("^verify signup successfull$")
public void verify_signup_successfull() throws Throwable {
   
}

	
}
