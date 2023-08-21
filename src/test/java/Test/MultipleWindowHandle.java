package Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		
         WebDriverManager.chromedriver().setup();
         
         ChromeOptions option=new ChromeOptions();
         option.addArguments("--Incognito");
         
         WebDriver driver=new ChromeDriver(option);
         driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
String ParentWindow=driver.getWindowHandle();
         System.out.println(ParentWindow);
         
WebElement Btn2=driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
         Btn2.click();
         
Set<String>ChildWindow=driver.getWindowHandles();
         
         for(String ele:ChildWindow) {
        	 if(!ParentWindow.equals(ChildWindow))
        	 {
        		 driver.switchTo().window(ele);
        		 String childTitle=driver.getTitle();
        		 if(childTitle.contains("AlertsDemo")) {
        		 WebElement clickMebtn=driver.findElement(By.xpath("//button[@id='promptBox']"));
        	     clickMebtn.click();
        	     Alert demo=driver.switchTo().alert();
        	     demo.sendKeys("Parvez Test");
        	     demo.accept();
        		 break;
        		 
        		 
        	 }
         }
         

	}
 }
}


