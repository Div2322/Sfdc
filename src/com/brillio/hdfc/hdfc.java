package com.brillio.hdfc;

import java.awt.Frame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hdfc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dhivakar.Palanisamy\\Desktop\\Selenium Trainings\\jar-list\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");		
	
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//swith to out of the Frame Or Main frame
		
		driver.switchTo().defaultContent();
		
	}

}
