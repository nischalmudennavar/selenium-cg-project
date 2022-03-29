package com.team_d.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyExitStakeHolderPage_1  extends BasePage{

	public VerifyExitStakeHolderPage_1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);	
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"addStakeholder_external_cancelBtn\"]")
	@CacheLookup
	WebElement ExitBtn;
	
	
	public boolean verifyExit() throws InterruptedException  {

		driver.findElement(By.xpath("//*[@id=\"viewStakeholder_addStakeholder_callFn\"]/img")).click();
		Thread.sleep(5000);

		


		
		if(ExitBtn.isDisplayed() && ExitBtn.isEnabled()) {
			
			ExitBtn.click();
			System.out.println("clickable");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"click-button\"]/div/div/div[2]/button")).click();
			
			return true;
		}
		return false;



	}





}
