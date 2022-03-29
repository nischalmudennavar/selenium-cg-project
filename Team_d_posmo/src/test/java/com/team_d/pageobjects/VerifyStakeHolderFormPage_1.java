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
public class VerifyStakeHolderFormPage_1 extends BasePage {

	public VerifyStakeHolderFormPage_1(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public boolean verifyFormTest() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"viewStakeholder_addStakeholder_callFn\"]/img")).click();

		Thread.sleep(5000);

		if(driver.findElement(By.xpath("//*[@id=\"addStakeholder_external_name\"]")) != null
				&& 
				driver.findElement(By.xpath("//*[@id=\"addStakeholder_external_designation\"]")) != null
				&&
				driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span")) != null
				&&
				driver.findElement(By.xpath("//*[@id=\"addStakeholder_external_contactNum\"]")) != null
				&&
				driver.findElement(By.xpath("//*[@id=\"addStakeholder_external_email\"]")) != null
				&&
				driver.findElement(By.xpath("//*[@id=\"addStakeholder_external_profileBtn\"]/span/label")) != null
				&&
				driver.findElement(By.xpath("//*[@id=\"addStakeholder_external_text\"]")) != null) {

			System.out.println("Form Verified");
			return true;
		}
		return false;
	}







}
