package com.team_d.testclass;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.team_d.pageobjects.VerifyExitStakeHolderPage_1;

public class VerifyExitStakeHolderTest_1 extends BaseTest {
	
	@Test
	public void verify() throws InterruptedException {
		VerifyExitStakeHolderPage_1 vex = new VerifyExitStakeHolderPage_1(driver);
		boolean result = vex.verifyExit();
		Assert.assertEquals(result,true);
	}
	
	
	
	
	
	
	
	

}
