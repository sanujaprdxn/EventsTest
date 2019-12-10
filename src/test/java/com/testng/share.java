package com.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class share
{
	@Test
	public void demoFunction() throws InterruptedException
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
//		System.out.println("Opening Browser");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[contains (text(), 'WAR ON CANCER 2016')]")).click();
//		String Actualeventtitle = driver.getTitle();
//		System.out.println("Event title is "  + Actualeventtitle);
//		driver.close();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
	      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/a[@class= 'btn btn-default btn-blue' and text()='Brochure']")));
	      element.click();
			String pagetitle = driver.getTitle();
			System.out.println("" +pagetitle );	
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 WebElement demo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h4[@class='after-success' and text()='Download Brochure']")));
			String formname = demo.getText();
			System.out.println(""+formname);
			String actualname = "DOWNLOAD BROCHURE";
			System.out.println(""+actualname);
			if(formname.equals(actualname)) {
				System.out.println("Brochure form is opened test case is passed");
			}else {
				System.out.println("Brochure form not opened");
			}
		
	}
}
