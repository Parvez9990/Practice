package Test;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String ParentWindowId=driver.getWindowHandle();
		System.out.println(ParentWindowId);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
WebElement WindowBtn=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
        WindowBtn.click();
        
Set<String>AllWindowId=driver.getWindowHandles();
        
        for(String ele:AllWindowId) {
        	if(!ParentWindowId.equals(ele)){
        		driver.switchTo().window(ele);
        		
        	}
        }
        JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,700)", "");
		
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
		

	}

}
