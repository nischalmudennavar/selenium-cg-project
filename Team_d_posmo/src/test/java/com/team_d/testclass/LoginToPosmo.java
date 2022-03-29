package com.team_d.testclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.team_d.utility.PropertyManager;

public class LoginToPosmo {
	
	public WebDriver driver;

	File file;

	FileInputStream fin;

	XSSFWorkbook wb;
	XSSFSheet sh;
	
	
	public void basicSetup(WebDriver driver) throws IOException, InterruptedException {
		
		this.driver = driver;
		file = new File("Credentials.xlsx");
		fin= new FileInputStream(file);

		wb = new XSSFWorkbook(fin);
		sh = wb.getSheet("S heet1");
		
		
		
		driver.get(PropertyManager.getProperty("url.app"));
		
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-landing-screen/div/ngx-top-header/div/div/div[3]/div/div[2]/button")).click();
		Thread.sleep(8000);
		for (int i=1;i<=1;i++) {
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
			
			
		}
		
		
		
		 Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href='/POSMO/client']")).click();
		Thread.sleep(8000);

//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]")).click();
		
		driver.findElement(By.name("search")).sendKeys("Team-D");
		  Thread.sleep(30000);
		  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div")).click();
		  Thread.sleep(5000);
	}

}
