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

public class DemoMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
String ParentWindowId=driver.getWindowHandle();
        System.out.println(ParentWindowId);
        
WebElement WindowBtn=driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
        WindowBtn.click();
         
Set<String>AllWindowId=driver.getWindowHandles();
        for(String ele:AllWindowId) {
        	if(!ParentWindowId.equals(AllWindowId));
        	{
             driver.switchTo().window(ele);
             String Title=driver.getTitle();
             if(Title.contains("AlertsDemo")) {
            	 WebElement clickMebtn=driver.findElement(By.xpath("//button[@id='promptBox']"));
        	     clickMebtn.click();
        	     Alert demo=driver.switchTo().alert();
        	     demo.sendKeys("Parvez Test");
        	     demo.accept();
        	     driver.close();
   }
   
   
        	}

        }
           
           String Title=driver.getTitle();
        if(Title.contains("Basic Controls")) 
        {
            WebElement FirstName=driver.findElement(By.xpath("//input[@id='firstName']"));
            FirstName.sendKeys("Parvez");
            
    WebElement LastName=driver.findElement(By.xpath("//input[@id='lastName']"));
            LastName.sendKeys("Khan");
            
    WebElement Gender=driver.findElement(By.xpath("//input[@id='malerb']"));
            Gender.click();
            
    WebElement LanguageEng=driver.findElement(By.xpath("//input[@id='englishchbx']"));
            LanguageEng.click();
            
    WebElement LanguageHindi=driver.findElement(By.xpath("//input[@id='hindichbx']"));
            LanguageHindi.click();
            	
    WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
            Email.sendKeys("Parvezmd991@gmail.com");
            
    WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
            Password.sendKeys("Parvez@991");
            
    WebElement link =driver.findElement(By.linkText("Click here to navigate to the home page"));
            link.click();
            driver.close();
        	}
    }
       	
 }



