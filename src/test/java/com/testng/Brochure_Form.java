package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Brochure_Form {
  @Test
  public void f() {
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "lib/driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://prdxnstaging.com/events/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/a[@class= 'btn btn-default btn-blue' and text()='Brochure']")));
      element.click();
		String pagetitle = driver.getTitle();
		System.out.println("" +pagetitle );	
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
