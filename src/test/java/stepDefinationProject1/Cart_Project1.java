package stepDefinationProject1;

import com.project1.PageAction.HomePageActionProject1;
import com.project1.PageAction.ProductpageActionProject1;

import cucumber.api.java.en.Then;
import utilityProject1.BaseClassProject1;
import utilityProject1.UtilityProject1;

public class Cart_Project1 extends BaseClassProject1 {
	
	HomePageActionProject1 homePageActionProject1 = new HomePageActionProject1();
	ProductpageActionProject1 productpageActionProject1 = new ProductpageActionProject1();
	
	@Then("^click samsung(\\d+) and click addtocart button$")
	public void click_samsung_and_click_addtocart_button(int arg1) throws Throwable {
		
		homePageActionProject1.clicksamsung7Link();
		
		productpageActionProject1.clickaddtoCart();
	   
	}

	@Then("^click cart link$")
	public void click_cart_link() throws Throwable {
		
		productpageActionProject1.clickCartLink();
	    
		
	}
	@Then("^verify item added in the cart$")
	public void verify_item_added_in_the_cart() throws Throwable {
		
		productpageActionProject1.verifyItemsAdded();
		
		UtilityProject1.takeMyScreenshot(driver, "Product Page");
  
}



}
