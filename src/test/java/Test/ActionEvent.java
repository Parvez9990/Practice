package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvent {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement Products=driver.findElement(By.xpath("//button[@data-target='product-menu-dropdown']"));
        Actions a=new Actions(driver);
        a.moveToElement(Products).build().perform();
WebElement LiveBtn=driver.findElement(By.xpath("(//div[@class='dropdown-link-heading'])[2]"));
        LiveBtn.click();
WebElement SearchIcon=driver.findElement(By.xpath("//button[@class='doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle']"));
        SearchIcon.click();
WebElement Searchfield=driver.findElement(By.xpath("//input[@id='doc-search-box-input']"));
        Searchfield.sendKeys("Automation");
        
        a.sendKeys(Keys.ENTER).build().perform();
   
	}

}
