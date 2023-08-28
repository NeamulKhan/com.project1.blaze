package stepDefinationProject1;

import com.project1.PageAction.HomePageActionProject1;

import cucumber.api.java.en.Then;
import utilityProject1.BaseClassProject1;

public class Contact_Project1 extends BaseClassProject1 {
	
	HomePageActionProject1 homePageActionProject1 = new HomePageActionProject1();
	
	
	@Then("^click contactLink$")
	public void click_contactLink() throws Throwable {
		
		homePageActionProject1.contactLink();	
	    
	}

	@Then("^enter email,name and msg and click send msg button$")
	public void enter_email_name_and_msg_and_click_send_msg_button() throws Throwable {
		
		homePageActionProject1.enterInfo(project1_prop.getProperty("Email"),project1_prop.getProperty("Name") ,project1_prop.getProperty("Message") );
	    
	}

	@Then("^verify received msg$")
	public void verify_received_msg() throws Throwable {
		
		
	   
	}



}
