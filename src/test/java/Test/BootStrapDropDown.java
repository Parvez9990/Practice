package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException{
		
		
		
		 WebDriverManager.chromedriver().setup();
		 
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement Dropdown=driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
        Dropdown.click();
        
List<WebElement>Dropdownlist=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
        
        for(WebElement ele:Dropdownlist) {
        String list=ele.getText();
        if(list.equals("JavaScript"))
        {
        	ele.click();
        	break;
        	
        }

        }
	
	
	}

}
