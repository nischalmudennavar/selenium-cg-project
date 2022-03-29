/**
 * 
 */
package com.team_d.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

/**
 * @author Nischal
 *
 */
public class TestSuite extends BaseTest {
	
	@Test(priority = 1)
	public void verifyingTitle() throws IOException, InterruptedException {
		
		Thread.sleep(5000);
		VerifyTitleTest_1 test = new VerifyTitleTest_1();
		test.testingVerifyTitle();
		
		
		
	}
	
	@Test(priority = 2)
	public void verifyingstb() throws InterruptedException {
		
		Thread.sleep(5000);
		VerifyAddStakeHolderBtnTest_1 btn = new VerifyAddStakeHolderBtnTest_1();
		btn.verifyBtnAvailability();
		
		
		
	}
	
	
	
	

}
