package com.seleniumnew.Apitestpayslips;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException; 

@SuppressWarnings("deprecation")
public class Apigetemploy2109 {
/////	private WebDriver driver;
	WebDriver driver = new ChromeDriver();

	/////private String baseUrl;
   
	@BeforeMethod
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "usr/local/bin/chromedriver");
		/////baseUrl = "http://localhost:8080/employee-management/employees/getEmployees";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.close();
		//driver.quit();
	}
      
	@Test
	public void test() throws ClientProtocolException, IOException {
		/////driver.get(baseUrl);
		driver.navigate().to("http://localhost:8080/employee-management/employees/getEmployees");
		WebElement webElement = driver.findElement(By.tagName("body"));
		Apitests2111 employApiResponse = new Apitests2111();
		String ExpectedString = employApiResponse.GetResponse();
		System.out.println("#########"+webElement.getText());
		System.out.println("#####*****####"+ExpectedString);
		AssertJUnit.assertTrue(webElement.getText().equals(ExpectedString));
		
	}
}
