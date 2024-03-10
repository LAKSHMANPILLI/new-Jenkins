package com.testserver.testcases;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;
import com.test.baseclass.initialiazeChrome;
import com.test.code.ALogin_QAdev;

public class ALogin_QATest extends initialiazeChrome {
	ALogin_QAdev cc;

	
	@BeforeSuite
	public void setUp() throws InterruptedException {
		initialization();
		// login = new Sign_In();
	}

	@BeforeTest
	public void signIn() throws InterruptedException {
		cc = new ALogin_QAdev();
   		 //Thread.sleep(2000);
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		Thread.sleep(1000);
	   //.loginWithValid("lakshman_central","blubirch123");
		//Thread.sleep(3000);

	    try {
			cc.loginWithValid(cc.getExcelData("login",1,0),cc.getExcelData("login", 1, 1));
		} catch (EventException | InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}	/*
	@DataProvider(name="loginWithValid")
	public Object[][] loginWithValid(){
		Object[][] data=new Object[0][1];
		data[0][0]="lakshman_central";
		data[0][1]="blubirch123";
		return data;
	}*/


	
	@AfterSuite
	public void tearDown() {
		 //driver.quit();

	}
}
