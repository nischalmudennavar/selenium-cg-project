
// TC021 by Nischal Jagadish Mudennavar
package com.team_d.testclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.team_d.pageobjects.VerifyTitlePage_1;


public class VerifyTitleTest_1 extends BaseTest {
	
	@Test
	public void testingVerifyTitle() throws IOException, InterruptedException {

		VerifyTitlePage_1 vtp = new VerifyTitlePage_1(driver);
		boolean result = vtp.verifyTitle();
		Assert.assertEquals(result, true);
		

	}






}
