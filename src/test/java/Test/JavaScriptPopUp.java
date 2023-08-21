package Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		
	   
	     WebDriverManager.chromedriver().setup();
	    
		ChromeOptions option=new ChromeOptions();
		option.addArguments("Incognito");
		
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
WebElement Btn=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        Btn.click();
        
Alert a=driver.switchTo().alert();
        a.sendKeys("Parvez Tester");
        String alertText=a.getText();
        System.out.println(alertText);
        a.dismiss();
 		

	}

}
