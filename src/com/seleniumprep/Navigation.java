package com.seleniumprep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Desktop\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		//used for swithcing from one domain to another domain 
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.bestbuy.com/");
		driver.navigate().back();
		
		driver.navigate().forward();

	}

}
