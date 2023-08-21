package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--Incognito");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
WebElement Products=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
           Products.click();
        Select s=new Select(Products);
        s.selectByVisibleText("Iphone");
        
WebElement Animals=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
        Select a=new Select(Animals);
       // a.selectByIndex(3);
        a.selectByValue("babycat");
        
WebElement MultiValueDropdown=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
        Select M=new Select(MultiValueDropdown);
        M.selectByIndex(1);
        

	}

}
