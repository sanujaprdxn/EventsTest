package com.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class share
{
	@Test
	public void demoFunction()
	{
		System.setProperty("webdriver.chrome.driver", "lib/driver/ChromeDriver/chromedriver");
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.addArguments("--test-type");
		ChromeOptions.addArguments("--no-sandbox");
		ChromeOptions.addArguments("--disable-gpu");
		ChromeOptions.addArguments("--disable-dev-shm-usage");
		ChromeOptions.addArguments("--headless"); 
		WebDriver driver = new ChromeDriver(ChromeOptions);
		driver.get("http://prdxnstaging.com/events/");
		System.out.println("Opening Browser");
		driver.close();
	}
}
