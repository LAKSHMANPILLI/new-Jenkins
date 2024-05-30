package com.test.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.initialiazeChrome;

public class ZLogout extends initialiazeChrome {
	@FindBy(xpath = "//span[@class='pull-right']/child::img[@role='button']")
	private WebElement logout;	
	
	@FindBy(xpath  = "//a[text()='Logout']")
	private WebElement logoutbtn;
	public ZLogout() {
		PageFactory.initElements(driver, this);
	}
	
	public void  logout() throws InterruptedException{
		Thread.sleep(1000);
		logout.click();
	}
	
	public void logout1() throws InterruptedException {
		Thread.sleep(1000);
		logoutbtn.click();
	}

}
