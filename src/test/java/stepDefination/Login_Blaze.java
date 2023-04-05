package stepDefination;

import cucumber.api.java.en.Given;
import utility.Base_Blaze;

public class Login_Blaze extends Base_Blaze {
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	   
		launchURL(URL);
		
				
		
	}
	
	

}
