package com.team_d.testclass;

import org.testng.annotations.Test;

import com.team_d.pageobjects.Stakeholder;

public class StakeholderTest extends BaseTest{
	Stakeholder st= new Stakeholder();
	
	
   @Test(priority =1 )
   public void add_null_test() throws Exception {
	   st.add_null(driver);
   }
   @Test(priority =2 )
   public void valid_stakeholder_test() throws Exception {
	   st.add_validstkholder(driver);
   }
   @Test(priority =3 )
   public void select_stakeholder_test() throws Exception {
	   st.select_stkholder(driver);
   }
   @Test(priority =4 )
   public void title_stakeholder_test() throws Exception {
	   st.title(driver);
   }
  
   @Test(priority =5 )
   public void verify_btn_test() throws Exception {
	   st.verify_btn(driver);
   }
   @Test(priority =6 )
   public void click_radiobtn_test() throws Exception {
	   st.click_radiobtn(driver);
   }
	
	  @Test(priority =7 ) 
	  public void add_invalid_stkldr_test() throws Exception {
	  st.add_invalid_stkholder(driver); }
	 
   
}
