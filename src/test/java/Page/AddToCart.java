package Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	WebDriver driver;
   
	
	public void click_on_add_to_cart_button() {
		driver=new ChromeDriver();
		
WebElement AddToCartBtn=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory'])[1]"));
    AddToCartBtn.click();
	    
	}

		public void click_on_add_to_cart_icon() {
WebElement AddToCartIcon=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    AddToCartIcon.click();
	    
	}

	
	public void click_on_checkout_button() {
WebElement CheckoutBtn=driver.findElement(By.xpath("//button[@id='checkout']"));
    CheckoutBtn.click();
    
	    
	}

	
	public void enter_the_first_name_last_name_and_zip_code() {
		
WebElement FirstName=driver.findElement(By.xpath("//input[@id='first-name']"));
           FirstName.sendKeys("Parvez");
WebElement LastName=driver.findElement(By.xpath("//input[@id='last-name']"));
           LastName.sendKeys("Shaikh");
WebElement ZipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
           ZipCode.sendKeys("110025");
	    
	}

		public void click_on_continue_button() {
WebElement ContinueBtn=driver.findElement(By.xpath("//input[@id='postal-code']"));
           ContinueBtn.click();
	    
	}

		public void click_on_finish_button() {
WebElement FinishBtn=driver.findElement(By.xpath("//button[@id='finish']"));
           FinishBtn.click();
	    
	}

	
	public void click_on_back_home_button() {
WebElement BackHome=driver.findElement(By.xpath("//button[@id='back-to-products']"));
           BackHome.click();
	    
	}

	
	public void validate_successful_add_to_cart_product_or_not() {
WebElement order=driver.findElement(By.xpath("//h2[@class='complete-header']"));
           String SuccessfullyOrder=order.getText();
           assertEquals("Thank you for your order!", SuccessfullyOrder);
	    
	}

}
