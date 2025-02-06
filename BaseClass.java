package com.cardddle.testcase;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;

	@BeforeClass
	
	public void setUp()
	{
		//WebDriverManager().chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://cardddle.com");
		
	}
	
	
	/*public void TakeScreenshot()
	{
		File src = ((TakeScreenshot).driver).getScreenShotAs(Output.File);
		FileUtils(src,new File("D:\\eclipse\\Screenshot"));
	}*/



@AfterClass

public void tearDown() {
	
	driver.close();
	driver.quit();
	
}
}
