/**
 * 
 */
package com.team_d.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Nischal
 *
 */
public class VerifyListofStakeHoldersPage_1 extends BasePage {

	public VerifyListofStakeHoldersPage_1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public boolean verifyList() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"viewStakeholder_addStakeholder_callFn\"]/img")).click();
		
		Thread.sleep(5000);
		
		if(driver.findElement(By.xpath("//*[@id=\"viewStakeholder_stakeholderData_loop\"]"))!= null) {
			return true;
		}
		
		return false;
	}
	

}
