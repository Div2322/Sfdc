package com.brillio.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) {

		    
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhivakar.Palanisamy\\Desktop\\Selenium Trainings\\jar-list\\chromedriver.exe");
		       
		    //ChromeDriver driver=new ChromeDriver();
		    
		    WebDriver driver= new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    
		    driver.get("https://www.facebook.com/");
		    
		    String title = driver.getTitle();
		    System.out.println(title);
		    
		    
		     driver.findElement(By.linkText("Create New Account")).click();
		     driver.findElement(By.name("firstname")).sendKeys("John");
		     driver.findElement(By.name("lastname")).sendKeys("wick");
		     driver.findElement(By.id("password_step_input")).sendKeys("Admin123");
		     
		     Select selectDay=new Select( driver.findElement(By.id("day")));
		     selectDay.selectByVisibleText("15");
		     
		     Select selectMonth=new Select( driver.findElement(By.id("month")));
		     selectMonth.selectByVisibleText("Nov");
		     
		     Select selectYear=new Select( driver.findElement(By.id("year")));
		     selectYear.selectByVisibleText("1945");
		     
		          
		     	     
		     driver.findElement(By.xpath("//input[@value='2']")).click();
		     
		    // Select selectPro=new Select(driver.findElement(By.name("preferred_pronoun")));
		     //selectPro.selectByVisibleText("2");
		     
		     
		     driver.findElement(By.name("websubmit")).click();
		     
		     
		   
		     
		     
		     

	}

}
