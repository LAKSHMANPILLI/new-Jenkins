package com.testserver.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.test.baseclass.initialiazeChrome;
import com.test.code.ZLogout;

public class ZLogout_Test extends initialiazeChrome {
	ZLogout kl;

	@BeforeMethod
	public void Logout() {
		kl = new ZLogout();
	}

	@Test(priority = 1)
	public void logout() throws InterruptedException {
		kl.logout();
	}

	@Test(priority = 2)
	public void Logout_Test() throws InterruptedException {
		kl.logout1();
	}

}
