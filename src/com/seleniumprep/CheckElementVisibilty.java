package com.seleniumprep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementVisibilty {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Desktop\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3A8d5a9ca4-f65c-11e8-ac00-005056ae4214");
		
		boolean b = driver.findElement(By.className("btn-text")).isDisplayed();
		System.out.println(b);
		
		boolean b1 = driver.findElement(By.className("js-recovery-phone")).isEnabled();
		System.out.println(  " b1 "+ b1);
		
		boolean b3 = driver.findElement(By.className("ca-use-recovery-phone")).isSelected();
		System.out.println(b3);
		
	}

}
