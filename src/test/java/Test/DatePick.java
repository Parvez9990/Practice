package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePick {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
       
        String Years="October 2024";
        String DataVal="20";
        
        
        WebElement Header=driver.findElement(By.xpath("//input[@id='second_date_picker']"));
        Header.click();
        
        
        while(true)
        {
        
WebElement year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
String date=year.getText();
        
        
	if(date.equals(Years)) {

        	
        	break;
        	
        }
        else {
        	
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

	   }
List <WebElement> ele=driver.findElements(By.xpath("(//tbody)[2]//tr//td"));
      for(WebElement abc:ele) {
    	  String date=abc.getText();
    	  if(date.equals(DataVal)) {
    		  abc.click();
    		  break;
    		  
    	  }

    	 
	}
 }
}

