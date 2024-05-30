package com.testserver.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.baseclass.initialiazeChrome;
import com.test.code.BDisposition;

public class BDisposition_Test extends initialiazeChrome {
	BDisposition dispo;
	@BeforeTest
	public void dispositonBCL() {
		dispo=new BDisposition();
	}
//	public void disposition1() {
//		object = new warehousepage();
//	}

	@Test(priority = 1)
	public void clickOnDispositionlinkTest() throws InterruptedException {
		Thread.sleep(2000);
		dispo.clickOnDidposition();
	}

}
