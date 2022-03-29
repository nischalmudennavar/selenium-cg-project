package com.team_d.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VerifyHeaderPage_1 extends BasePage {

	public VerifyHeaderPage_1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"loginInfo_componentNameContainer\"]")
	@CacheLookup
	WebElement header;
	
	public boolean verifyAddStakeHolderHeader() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"viewStakeholder_addStakeholder_callFn\"]/img")).click();
		Thread.sleep(5000);
		
		if(header.getText().contains("Add Stakeholder")) {
			return true;
		}
		return false;
		
		
		
	}

}
