/**
 * 
 */
package com.team_d.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.team_d.pageobjects.VerifyStakeHolderFormPage_1;

/**
 * @author Nischal
 *
 */
public class VerifyStakeHolderFormTest_1 extends BaseTest {
	
	
	@Test
	public void verifyForm() throws InterruptedException {
		
		VerifyStakeHolderFormPage_1 vsf = new VerifyStakeHolderFormPage_1(driver);
		boolean result = vsf.verifyFormTest();
		
		Assert.assertEquals(result,true);
		
		
	}
	
	
	
	
	
	

}
