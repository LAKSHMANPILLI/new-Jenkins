package com.testserver.testcases;

import java.awt.AWTException;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.test.baseclass.initialiazeChrome;
import com.test.code.CBrandCallLog;

public class CBrandcalllog_Test extends initialiazeChrome{
	CBrandCallLog object1;
	//BrandCallLog object1;: Declares an instance variable named object1 of type BrandCallLog. 
	//This variable will be used to create an object of the class.
	
	//For non static methods we creating the objects with class name 
	@BeforeTest
	
	public void dispositonBCL1() {
		object1=new CBrandCallLog();
		//This method initializes the object1 by creating a new instance of the BrandCallLog class.
	}
	/*

	@Test(priority = 1)
	public void clickOnDispositionlinkTest() throws InterruptedException {
		object1.clickOnDidposition();
	}
	*/
	////////// @@@@@@@@@@@\\\\\\\\\\\\\\
	
	@Test(priority = 1)
	public void clickBCL() throws InterruptedException {
		object1.BCL();
	}
	@Test(priority = 2)
	public void bclSelectTag() throws InterruptedException {
		object1.bclSelectTag();
	}
	@Test(priority = 3)
	public void bclUpdateIntiation() throws InterruptedException {
		object1.bclUpdateIniation();
	}
	@Test(priority = 4)
	public void bclEmailDate() throws InterruptedException {
		object1.bclEmail();
	}
	@Test(priority = 5)
	public void bclInitiationLocation() throws InterruptedException {
		Thread.sleep(500);
		object1.bclBclInitiationLocation();
	}
	@Test(priority = 6)
	public void bclLocationInhouse() {
		object1.bclInhouse();
	}
	@Test(priority = 7)
	public void bclAddremarks()throws InterruptedException  {
		object1.bclAddRemarks();
	}
	@Test(priority = 8)
	public void bclFirstConfirm() throws InterruptedException {
		object1.bclFirstConfirm();
	}
	
	
//	@Test(priority = 9)
//	public void bclUpdateCallLog() {
//		object1.bclUpdateCallLog();
//	}
	@Test(priority = 9)
	public void bclSelectItem() throws InterruptedException {
		object1.bclSelectTag();
	}
	
	@Test(priority = 10)
	public void bclUpdateCallLogTag() throws InterruptedException {
		object1.bclUpdateCallLogTag();
	}
	@Test(priority = 11)
	public void bclEnterCallLog() throws InterruptedException {
		object1.bclEnterCallLog();
	}
	@Test(priority = 12)
	public void bclUpdateSecond() throws InterruptedException {
		object1.bclUpdateSecond();
	}
	@Test(priority = 13)
	public void bclInspectionSelectTag() throws InterruptedException {
		object1.bclInspectionSelectTag();
	}
	@Test(priority = 14)
	public void bclInspectionUpdate() throws InterruptedException {
		Thread.sleep(500);
		object1.bclInspectionUpdate();
	}
	@Test(priority = 15)
	public void bclEnterInvoice() throws InterruptedException {
		object1.bclEnterInvoice();
	}
	@Test(priority = 16)
	public void bclInspectionThird()throws InterruptedException  {
		object1.bclInspectionThird();
	}
	@Test(priority = 17)
	public void bclSelectTagBrand() throws InterruptedException {
		object1.bclSelectTagBrand();
	}
	
	
	@Test(priority = 18)
	public void bclInspectionBrandInspection() throws InterruptedException {
		object1.bclInspectionBrandInspection();
	}
	@Test(priority = 19)
	public void bclBrandInspectionDate() throws InterruptedException {
		object1.bclBrandInspectionDate();
	}
	@Test(priority = 20)
	public void bclBrandInspectionLocation() throws InterruptedException {
		object1.bclBrandInspectionLocation();
	}
	
	@Test(priority = 21)
	public void bclBrandLocationInhouse() throws InterruptedException {
		object1.bclBrandLocationInhouse();
	}
	@Test(priority = 22)
	public void bclBrandInspectionRemarks() throws InterruptedException {
		object1.bclBrandInspectionRemarks();
	}
	@Test(priority = 23)
	public void bclBrandInspectionAttachDoc() throws InterruptedException, AWTException {
		object1.bclBrandInspectionAttachDoc();
	}
	@Test(priority = 24)
	public void bclBrandInspectionConfirm() throws InterruptedException, AWTException{
		object1.bclBrandInspectionConfirm();
	}
	@Test(priority = 25)
	public void bclResolutionSelectItem() throws InterruptedException {
		object1.bclResolutionSelectItem();
	}
	@Test(priority = 26)
	public void bclBrandResolution() throws InterruptedException {
		object1.bclBrandResolution();
	}
	@Test(priority = 27)
	public void bclBrandInspectionSetDisposition()throws InterruptedException  {
		object1.bclBrandInspectionSetDisposition();
	}
	@Test(priority = 28)
	public void bclBrandSetDispoInsurance() throws InterruptedException {
		object1.bclBrandSetDispoInsurance();
	}
	
	
	@Test(priority = 29)
	public void bclBrandResolutionRemarks() throws InterruptedException {
		object1.bclBrandResolutionRemarks();
	}
	@Test(priority = 30)
	public void bclBrandResolutionAttachDoc() throws InterruptedException, AWTException {
		object1.bclBrandResolutionAttachDoc();
	}
	@Test(priority = 31)
	public void bclBrandResolutionConfirm() throws InterruptedException {
		object1.bclBrandResolutionConfirm();
	}


	
	@Test(priority = 32)
	public void Disposition() throws InterruptedException {
		object1.DispositionGoback();
	}
	
	
}

