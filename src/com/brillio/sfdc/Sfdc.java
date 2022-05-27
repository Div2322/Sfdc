package com.brillio.sfdc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sfdc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dhivakar.Palanisamy\\Desktop\\Selenium Trainings\\jar-list\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");

		Select selectTitle = new Select(driver.findElement(By.name("UserTitle")));
		selectTitle.selectByVisibleText("IT Manager");

		driver.findElement(By.name("CompanyName")).sendKeys("Brillio");

		Select selectEmp = new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmp.selectByVisibleText("101 - 500 employees");

		Select selectCon = new Select(driver.findElement(By.name("CompanyCountry")));
		selectCon.selectByVisibleText("United Kingdom");

		driver.findElement(By.className("checkbox-ui")).click();

		driver.findElement(By.name("start my free trial")).click();

	}

}
