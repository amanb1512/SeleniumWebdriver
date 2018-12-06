package com.seleniumprep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Desktop\\SeleniumWebdriver\\Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		// wait for 20 secs for the page to download .dynamic wait
		//dynamic wait---if the wait is fully loaded before that given time ignore the rest of the time
		//explicit, implicit, timeout are all dynamic waits
		//thread.sleep() is static wait
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		//driver pls manage the timeout that is implicit. it is always applied globally to all elements for which driver is interacting.
        // no such element exception or element not found
		//if you dont use waits, its not gonna wait and just gives error
		
		driver.get(" https://www.facebook.com/");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement mobNum = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		WebElement forgotAccount = driver.findElement(By.linkText("Forgot account?"));
		
		
		sendKeys(driver, firstName, 10, "aman");
		sendKeys(driver, lastName, 10, "kaur");
		sendKeys(driver, mobNum, 10, "134");
		sendKeys(driver, password, 10, "jsfd");
		
		clickOn(driver, forgotAccount, 5 );
	}

//Explicit wait:
	//no explicit keyword or method
	//avaialble with wbdriver wait with some expected conditions
	//specific to element
	//dynamic in nature






public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
	new WebDriverWait(driver, timeout).
	until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
	
	
}

public static void clickOn(WebDriver driver, WebElement element, int timeout) {
	new WebDriverWait(driver, timeout).
	until(ExpectedConditions.elementToBeClickable(element));
	element.click();
	
	
}





}

