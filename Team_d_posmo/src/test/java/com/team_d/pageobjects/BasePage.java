package com.team_d.pageobjects;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;// calling web driver
	}

}
