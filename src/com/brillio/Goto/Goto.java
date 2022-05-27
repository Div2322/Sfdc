package com.brillio.Goto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Goto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhivakar.Palanisamy\\Desktop\\Selenium Trainings\\jar-list\\chromedriver.exe");
	       
	    //ChromeDriver driver=new ChromeDriver();
	    
	    WebDriver driver= new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    
	    driver.get("https://www.goto.com/meeting/");
	    
	    //String title = driver.getTitle();
	    //System.out.println(title);
	    
	    
	    driver.findElement(By.id("truste-consent-close")).click();
	    driver.findElement(By.linkText("Try Free")).click();
	    driver.findElement(By.id("truste-consent-close")).click();
	    
	    driver.findElement(By.id("first-name")).sendKeys("John");
	    driver.findElement(By.id("last-name")).sendKeys("wick");
	    driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");
	    
	    Select selectSize=new Select( driver.findElement(By.id("CompanySize")));
	    selectSize.selectByVisibleText("10 - 99"); 
	    
	     driver.findElement(By.className("common-button__button")).click();
	     	         	    
	}
	
}

