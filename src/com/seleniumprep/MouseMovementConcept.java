package com.seleniumprep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Desktop\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		 driver.get("https://www.costco.com/");
         
		 Actions action = new Actions(driver); // in actions class we need to put webdriver reference --driver
		 
		 action.moveToElement(driver.findElement(By.linkText("Grocery"))).build().perform();
		 //whenever you use action class always use.build.perform 
		 
		 Thread.sleep(3000);// we use this so that after mouse hower over the grocery link, it does get sometime
		 // to the organic link to display
		 
		 driver.findElement(By.linkText("Organic")).click();
	}

}
