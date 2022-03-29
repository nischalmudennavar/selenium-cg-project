package com.team_d.testclass;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {


	public WebDriver driver;

	File file;

	FileInputStream fin;

	XSSFWorkbook wb;
	XSSFSheet sh;
	
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			driver = new EdgeDriver();
		}


		driver.manage().window().maximize();//Maximize the window
		
		LoginToPosmo ltp = new LoginToPosmo();
		ltp.basicSetup(driver);
		
		

	}
//	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
//		
//		

}



	


