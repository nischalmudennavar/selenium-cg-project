package com.team_d.pageobjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.team_d.testclass.LoginToPosmo;
import com.team_d.utility.PropertyManager;

public class Stakeholder extends LoginToPosmo {
	
	WebElement element;
	WebDriver driver;
	BasePage sh= new BasePage(driver);
	
	// TestCase1
	  public void add_null(WebDriver driver) throws Exception { 
		  this.driver=driver;
	  driver.findElement(By.xpath(PropertyManager.getProperty("add_StakeHolder"))).
	  click(); Thread.sleep(3000);
	  driver.findElement(By.xpath(PropertyManager.getProperty("add_StakeBtn"))).
	  click(); Thread.sleep(2000); 
	  String actual_msg=driver.findElement(By.id("mat-error-4")).getText(); 
	  String exp_msg="Field is required*"; 
	  Assert.assertEquals(actual_msg, exp_msg);
	  System.out.println("User is not able to add stakeholders sucessfully");
	  
	  
	  }
	  
	  //TestCase2
	  public void add_validstkholder(WebDriver driver) throws Exception {
	  driver.findElement(By.id("addStakeholder_internal_name")).sendKeys(
	  PropertyManager.getProperty("name")); Thread.sleep(1000);
	  driver.findElement(By.id("addStakeholder_internal_designation")).sendKeys(
	  PropertyManager.getProperty("designation")); Thread.sleep(1000);
	  driver.findElement(By.id("addStakeholder_internal_category")).sendKeys(
	  PropertyManager.getProperty("category")); Thread.sleep(1000);
	  driver.findElement(By.id("addStakeholder_internal_contact_num")).sendKeys(
	  PropertyManager.getProperty("contact")); Thread.sleep(1000);
	  driver.findElement(By.id("addStakeholder_internal_email")).sendKeys(
	  PropertyManager.getProperty("email")); Thread.sleep(1000);
	  driver.findElement(By.id("addStakeholder_internal_addBtn1")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"click-button\"]/div/div/div[2]/button")).click(); 
	  Thread.sleep(3000);
	  System.out.println("User is Sucessfully Created Internal Stakeholder");
	  }
	 
	  //TestCase 3
	  public void select_stkholder(WebDriver driver) throws Exception { 
	 
	  driver.findElement(By.xpath(PropertyManager.getProperty("select_StakeHolder"))).click();
	  Thread.sleep(3000);
	  System.out.println("The user is able to select stakeholder for editing info");
	 
	  		
	  } 
	  
	  //TestCase4
	  public void title(WebDriver driver) throws Exception {
	 driver.findElement(By.xpath("//*[@id=\"click-button\"]/div/div/div[2]/button")).click(); 
	 Thread.sleep(3000);
	  driver.findElement(By.xpath(PropertyManager.getProperty("edit_StakeHolder"))).click();
	  Thread.sleep(3000);
	  String actual_title=driver.findElement(By.id("editStakeholder_header1")).getText();
	  String exp_title="Stakeholder Details";
	  Assert.assertEquals(actual_title, exp_title);
	  System.out.println(driver.findElement(By.id("editStakeholder_header1")).getText());
	  }
	  
	 //TestCase5
	 public void verify_btn(WebDriver driver) {
	 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"editStakeholder_internal_cancelBtn\"]")).isEnabled());	
	 System.out.println("Cansel Button is enabled");
		  try {
			  driver.findElement(By.id("id"));
			  System.out.println("Update Stakeholder and Delete Buttouns are present");
		  }
		  catch(NoSuchElementException e) {
			  System.out.println("Update Stakeholder and Delete Buttouns are not present");
		  }
		  
	  }
	  
	  //Testcase6
	  public void click_radiobtn(WebDriver driver) throws Exception {
		  driver.findElement(By.xpath("//*[@id=\"flexRadioDefault1\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"flexRadioDefault2\"]")).click();
		  System.out.println("User is able to navigate from Internal to External Stakeholder");
	  }
	  
		 //Testcase7
		  public void add_invalid_stkholder(WebDriver driver) throws Exception {
		  driver.findElement(By.xpath(PropertyManager.getProperty("add_StakeHolder"))).
		  click(); Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"click-button\"]/div/div/div[2]/button"
		  )).click(); Thread.sleep(3000);
		  driver.findElement(By.id("addStakeholder_internal_name")).sendKeys(
		  PropertyManager.getProperty("Invalid_name"));
		  Thread.sleep(1000);
		  driver.findElement(By.id("addStakeholder_internal_designation")).sendKeys(
		  PropertyManager.getProperty("Invalid_designation")); 
		  Thread.sleep(1000);
		  driver.findElement(By.id("addStakeholder_internal_category")).sendKeys(
		  PropertyManager.getProperty("Invalid_category")); 
		  Thread.sleep(1000);
		  driver.findElement(By.id("addStakeholder_internal_contact_num")).sendKeys(
		  PropertyManager.getProperty("Invalid_contact"));
		  Thread.sleep(1000);
		  driver.findElement(By.id("addStakeholder_internal_email")).sendKeys(
		  PropertyManager.getProperty("Invalid_email")); 
		  Thread.sleep(1000);
		  driver.findElement(By.id("addStakeholder_internal_addBtn1")).click();
		  Thread.sleep(2000);
		  System.out.println("User is not able to Created Internal Stakeholder");
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"mat-error-8\"]")).getText()); }
		 
		  
	  
	  
	  
	  }

     


