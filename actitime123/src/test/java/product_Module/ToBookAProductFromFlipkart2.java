package product_Module;

import org.testng.annotations.Test;

public class ToBookAProductFromFlipkart2 {
	
	@Test(priority = -15)
	public void login() {
		System.out.println("The user has logged in to the app");

		System.out.println("The user has logged in to the app");
	}
	
	@Test(priority = 2)
	public void searchProduct() {
		System.out.println("The Product is found");
	}
	
	@Test(priority = 3)
	public void selectProduct() {
		System.out.println("The product is selected");
		
		System.out.println("The product is selected");

		
		System.out.println("The product is selected");

		
		System.out.println("The product is selected");

	}
	
	
	@Test(priority = 8)
	public void addToCart() {
		System.out.println("The product is added to the cart");
	}
	
	@Test(priority = 11)
	public void payment() {
		System.out.println("Payment is succesfull");
	}
	
	@Test(priority = 15)
	public void logout() {
		System.out.println("The user has logged out");
	}

}
