package com.seleniumprep;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Desktop\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000); //pause the script for 5 secs
	   
		Alert alert = driver.switchTo().alert();
		
	//	System.out.println(alert.getText());
		
		String text = alert.getText();
		if(text.equals("please enter a valid username")) {
			System.out.println("correct alert");
		}
		else
		{
			System.out.println("wrong alert message");
		}
		
		alert.accept();
		alert.dismiss();
		
	}

}
