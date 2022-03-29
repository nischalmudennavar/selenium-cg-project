//TC021 by Nischal Jagadish Mudennavar

package com.team_d.pageobjects;

import java.io.IOException;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.team_d.testclass.LoginToPosmo;

public class VerifyTitlePage_1 extends BasePage{




	public VerifyTitlePage_1(WebDriver driver) throws IOException, InterruptedException {
		super(driver);
		this.driver = driver;


	}



	public boolean verifyTitle() throws InterruptedException {

		
		driver.findElement(By.xpath("/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-view-client-dashboard/div[2]/div[4]/ngx-view-stakeholder/div/div[3]/div[2]/a/img")).click();
		
		Thread.sleep(5000);
		String titleString = driver.findElement(By.xpath("//*[@id=\"addStakeholder_header1\"]")).getText();
	

		if(titleString.contains("Stakeholder Details")) {

			return true;				
		}
		return false;



	}

}


