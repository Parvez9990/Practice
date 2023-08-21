package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		
		/*
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		*/
		
WebElement TestingBtn=driver.findElement(By.xpath("(//span[@class='nav-drop-title-wrap'])[1]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(TestingBtn));
		TestingBtn.click();
		
List<WebElement>list=driver.findElements(By.xpath("//ul[@class='sub-menu clicked']/li/a"));
        for(WebElement ele:list) {
        	String text=ele.getText();
        	if(text.equals("JIRA")) {
        		ele.click();
        		break;
        		
        		
        	}
        }
	}
}
