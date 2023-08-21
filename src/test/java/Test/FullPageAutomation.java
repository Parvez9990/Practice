package Test;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageAutomation {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.vuse.com/gb/en/create-account");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		FileInputStream file = new FileInputStream("C:\\Users\\parve\\Desktop\\Read Auto.xlsx");
		XSSFWorkbook Wb=new XSSFWorkbook(file);
		XSSFSheet Sheet=Wb.getSheet("Sheet2");
		
		int rowCount=Sheet.getLastRowNum();
		for(int i=1; i<=rowCount; i++) {
	            
	    XSSFRow currentRow=Sheet.getRow(i);
		
WebElement FirstName=driver.findElement(By.xpath("//input[@autocomplete='given-name']"));
        FirstName.clear();
        FirstName.sendKeys(currentRow.getCell(0).getStringCellValue());
        
WebElement LastName=driver.findElement(By.xpath("//input[@autocomplete='family-name']"));
        LastName.clear();
        LastName.sendKeys(currentRow.getCell(1).getStringCellValue());
        
WebElement Email=driver.findElement(By.xpath("//input[@autocomplete='email']"));
        Email.clear();
        Email.sendKeys(currentRow.getCell(2).getStringCellValue());
        
WebElement DOB=driver.findElement(By.xpath("//input[@autocomplete='date']"));
        DOB.clear();
        //DOB.sendKeys(currentRow.getCell(3).getNumericCellValue());
        
WebElement AddressFinder=driver.findElement(By.xpath("//input[@autocomplete='nope']"));
        AddressFinder.clear();
        AddressFinder.sendKeys(currentRow.getCell(4).getStringCellValue());
        
//WebElement AddOpt=driver.findElement(By.xpath("(//li[@class='jss4 addressLookupListItem'])[1]"));
        //AddOpt.click();
        
WebElement SwitchToggle=driver.findElement(By.xpath("//span[@class='checkbox-switchToggle-3tC left']"));
        SwitchToggle.click();
        
WebElement Password=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
        Password.clear();
        Password.sendKeys(currentRow.getCell(5).getStringCellValue());
        
WebElement PasswordIcon=driver.findElement(By.xpath("(//button[@class='password-passwordButton-3Al button-root-wXq clickable-root-2gB'])[1]"));
        PasswordIcon.click();
        
WebElement ConfirmPassword=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        ConfirmPassword.clear();
        ConfirmPassword.sendKeys(currentRow.getCell(6).getStringCellValue());
        
WebElement Termandcondition=driver.findElement(By.xpath("//span[@class='checkbox-switchToggle-3tC right']"));
        Termandcondition.click();
        
WebElement EmailToggle=driver.findElement(By.xpath("(//span[@class='checkbox-switchToggle-3tC right'])[2]"));
        EmailToggle.click();
        
//WebElement SmsToggle=driver.findElement(By.xpath("((//span[@class='checkbox-switchToggle-3tC right'])[3]"));
       // SmsToggle.click();
        
WebElement CreateYourAccount=driver.findElement(By.xpath("//button[@class='createAccountExtend-submitButton-3RD button-root_highPriority-3u6 button-root-16x clickable-root-2gB']"));
        CreateYourAccount.click();
        
        JavascriptExecutor k = (JavascriptExecutor) driver;
        k.executeScript("window.scrollBy(0,500)");
        

	}

}
}

