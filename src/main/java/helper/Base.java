package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	
	static {
		try {
			FileInputStream file=new FileInputStream("TestData/ProjectData.properties");
			prop=new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public void setup(){
 String browserName=prop.getProperty("browser");
 System.out.println(browserName);
        if(browserName.equals("chrome")) {
        	WebDriverManager.chromedriver().setup();
    		ChromeOptions option=new ChromeOptions();
    		option.addArguments("--Incognito");
    		driver=new ChromeDriver(option);
    		driver.get(prop.getProperty("Url"));
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
        }
        else if(browserName.equals("firefox")) {
        	WebDriverManager.firefoxdriver().setup();
    		FirefoxOptions option=new FirefoxOptions();
    		option.addArguments("--Incognito");
    		driver=new FirefoxDriver(option);
    		driver.get(prop.getProperty("Url"));
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	
        }
        else if(browserName.equals("edge")) {
        	WebDriverManager.edgedriver().setup();
    		EdgeOptions option=new EdgeOptions();
    		option.addArguments("--Incognito");
    		driver=new EdgeDriver(option);
    		driver.get(prop.getProperty("Url"));
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        else {
        	WebDriverManager.chromedriver().setup();
    		ChromeOptions option=new ChromeOptions();
    		option.addArguments("--Incognito");
    		driver=new ChromeDriver(option);
    		driver.get(prop.getProperty("Url"));
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 	
        }
       

        }
	public void ScreenShot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("ScreenShots/Test.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	public void selectDropdownByText(WebElement ele,String Value) {
		Select s=new Select(ele);
		s.selectByVisibleText(Value);
	}
	
	public void MouseHover(WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
		
	}
	
	public void selectDropdownByIndex(WebElement ele,int Value) {
		Select s=new Select(ele);
		s.selectByIndex(Value);
	}

	
	public void AlertPopup(WebElement ele) {
	Alert a=driver.switchTo().alert();
	a.accept();
	}

}
