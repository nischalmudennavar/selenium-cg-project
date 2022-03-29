/**
 * 
 */
package com.team_d.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.team_d.pageobjects.VerifyListofStakeHoldersPage_1;

/**
 * @author Nischal
 *
 */
public class VerifyListofStakeHolders_1 extends BaseTest {
	
	
	@Test
	public void verifyListofSH() throws InterruptedException {
		
		
		VerifyListofStakeHoldersPage_1 vlsh = new VerifyListofStakeHoldersPage_1(driver);
		boolean result = vlsh.verifyList();
		
		Assert.assertEquals(result, true);
		
		
		
	}
	

}
