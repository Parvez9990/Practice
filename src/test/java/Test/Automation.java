package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream file = new FileInputStream("C:\\Users\\parve\\Desktop\\ReadData.xlsx");
		XSSFWorkbook Wb=new XSSFWorkbook(file);
		XSSFSheet Sheet=Wb.getSheet("Sheet1");
		
		  //int rowCount=Sheet.getLastRowNum()-Sheet.getFirstRowNum();
		int rowCount=Sheet.getLastRowNum();
		
		
		
		
		//WebElement firstName=driver.findElement(By.id("user-name"));
	   // WebElement lastName=driver.findElement(By.id("password"));
	       



	        //iterate over all the rows in Excel and put data in the form.
	        for(int i=1; i<=rowCount; i++) {
	            
	        	XSSFRow currentRow=Sheet.getRow(i);
	        	
	            Thread.sleep(2000);
	            WebElement UserName=driver.findElement(By.id("user-name"));
	            UserName.clear();
	            UserName.sendKeys(currentRow.getCell(0).getStringCellValue());
	            
	     	    WebElement Password=driver.findElement(By.id("password"));
	     	    Password.clear();
	            Password.sendKeys(currentRow.getCell(1).getStringCellValue());
	        
	            WebElement Login=driver.findElement(By.id("login-button"));
		        Login.click();
		        
		        Thread.sleep(1000);
		        
		        driver.findElement(By.xpath("//button[@class='error-button']")).click();
		        
	            Wb.close();
	        
	        
	        }
	}
}

		
//WebElement heading=driver.findElement(By.xpath("//div[@class='login_logo']"));
           //String Text=heading.getText();
		   //assertEquals("Swag Labs", Text);
	/*	
		
WebElement UserName=driver.findElement(By.id("user-name"));
        UserName.sendKeys("standard_user");
        
WebElement Password=driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        
WebElement Login=driver.findElement(By.id("login-button"));
        Login.click();
        
//boolean Title=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
//assertTrue(Title);

	}

}
*/
