package com.team_d.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.team_d.pageobjects.VerifyHeaderPage_1;

public class VerifyHeaderTest_1 extends BaseTest {
	
	@Test
	public void verify() throws InterruptedException {
		
		VerifyHeaderPage_1 vhp = new VerifyHeaderPage_1(driver);
		boolean result = vhp.verifyAddStakeHolderHeader();
		Assert.assertEquals(result,true);
	}
	
	

}
