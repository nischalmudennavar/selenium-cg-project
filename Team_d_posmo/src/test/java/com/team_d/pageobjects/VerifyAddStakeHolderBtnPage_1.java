package com.team_d.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyAddStakeHolderBtnPage_1 extends BasePage{

	
	public VerifyAddStakeHolderBtnPage_1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public boolean isBtnAvailable() {
		
		
		if(driver.findElement(By.xpath("//*[@id=\"viewStakeholder_addStakeholder_callFn\"]/img")) != null) {
			
			return true;
			
		}
		return false;
	}
	
	
	

}
