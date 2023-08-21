package Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helper.Base;

public class LoginPage extends Base  {
	
	public void user_launch_site_url() { 
		setup();
	    
	}

	
	public void enter_correct_username_and_password(String uname,String Pass) {
		WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		//UserName.sendKeys(prop.getProperty("username"));
		UserName.sendKeys(uname);
		ScreenShot();
		
        
        WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
        //Password.sendKeys(prop.getProperty("pass"));
        Password.sendKeys(Pass);
        
        
      /*  
       WebElement country=driver.findElement(By.xpath(null));
        
        selectDropdownByText(country,"India");
        MouseHover(country);
        selectDropdownByIndex(country, 1);
        MouseHover(country);
        AlertPopup(country);
        
        
	   */
       
	}
	

	
	public void click_on_login_button() {
		WebElement Login=driver.findElement(By.xpath("//input[@id='login-button']"));
        Login.click();
        
           
	}

	
	public void validate_successful_login() {
		boolean Title=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		assertTrue(Title);
	    
	}


}
