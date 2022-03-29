package com.team_d.testclass;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.team_d.pageobjects.VerifyAddStakeHolderBtnPage_1;

public class VerifyAddStakeHolderBtnTest_1 extends BaseTest  {
	
	
	@Test
	public void verifyBtnAvailability() {
		
		
		VerifyAddStakeHolderBtnPage_1 vtb = new VerifyAddStakeHolderBtnPage_1(driver);
		boolean result = vtb.isBtnAvailable();
		Assert.assertEquals(result,true);
	
		
	}

}
