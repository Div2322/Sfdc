package com.brillio.basics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1OrangeLogin {

public static void main(String[] args) {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhivakar.Palanisamy\\Desktop\\Selenium Trainings\\jar-list\\chromedriver.exe");
       
    //ChromeDriver driver=new ChromeDriver();
    
    WebDriver driver= new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    
    driver.get("https://opensource-demo.orangehrmlive.com");
    
    String title = driver.getTitle();
    System.out.println(title);
    
    
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");    
	 driver.findElement(By.id("btnLogin")).click();
	 

	 
	 driver.findElement(By.id("welcome")).click();
	 driver.findElement(By.linkText("Logout")).click();
	 

	}

	}


