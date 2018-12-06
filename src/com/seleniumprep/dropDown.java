package com.seleniumprep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Desktop\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cheapoair.com/");
	
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		select.selectByIndex(0);
	

	}

}
