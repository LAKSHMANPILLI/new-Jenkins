package com.test.code;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.baseclass.initialiazeChrome;

public class DInsurance extends initialiazeChrome{
	public static Robot r1;// new Robot();
	@FindBy(xpath="//h4[text()='Insurance']/following-sibling::h5[@class='grey--text']/span")
	private WebElement InsuranceOpenCasesCount;
	@FindBy(xpath="(//span[text()='Claims:']/following-sibling::span)[1]")
	private WebElement InsuClaimCount;
	@FindBy(xpath="(//span[text()='Update Claims:']/following-sibling::span)[1]")
	private WebElement InsuUpdateClaimCount;
	@FindBy(xpath="(//h4[text()='Insurance']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Inspection:']//following-sibling::span)[1]")
	private WebElement InsuInspectionCount;
	@FindBy(xpath="(//h4[text()='Insurance']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Resolution:']//following-sibling::span)[1]")
	private WebElement InsuResolutionCount;
	@FindBy(xpath="(//h4[text()='Insurance']/ancestor::tr[@align='center']/parent::tbody/descendant::span[text()='Disposition:']//following-sibling::span)[1]")
	private WebElement InsuDispostionCount;
	
	
	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement monthclick;
	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement yearclick;
	@FindBy(xpath = "(//td//button[contains(@class,'v-btn v-size--default v-date-picker-table__current v-btn--outlined theme--')])[1]")
	private WebElement monthselect;
	@FindBy(xpath = "//li[text()='2024']")
	private WebElement yearSelect;
	@FindBy(xpath = "(//button[contains(@class,'v-btn v-btn--text v-btn--rounded theme--light')])[1]")
	private WebElement dateClick;
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement cok;
		
	
	@FindBy(xpath = "//h5[@class='grey--text']/ancestor::td/child::h4[text()='Insurance']")
	private WebElement Insurance;
	@FindBy(xpath="(//tr/descendant::img[@title='Insurance Submission '])[1]")
	private WebElement InsuSelectItem;
	@FindBy(xpath="//label[text()='Claim Submission Date*']/following-sibling::input")
	private WebElement InsuClaimSubmitionDate;
	@FindBy(xpath="//label[text()='Claim Amount*']/following-sibling::input")
	private WebElement InsuClaimAmount;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea[@name='remark']")
	private WebElement InsuAddRemarks;
	@FindBy(xpath="//label[text()='ATTACH DOCUMENTS']/following-sibling::div[@class='v-file-input__text v-file-input__text--chips']")
	private WebElement InsuAttachDoc;
	@FindBy(xpath="//span[text()='Confirm']")
	private WebElement InsuConfirmFirst;
	
	
	@FindBy(xpath=" (//a[@href='#update_claim_registration'])")
	private WebElement InsuUpdateClaimRegist;
	@FindBy(xpath="(//div[@class='v-input--selection-controls__ripple']/following-sibling::i[@aria-hidden='true'])[2]")
	private WebElement InsuUpdateCallSelectItem;
	@FindBy(xpath="//button[@type='button']/child::span[text()='Update Call Log']")
	private WebElement InsuUpdateClaimCallLog;
	@FindBy(xpath="//label[text()='Enter Call Log']/following-sibling::input")
	private WebElement InsuEnterCallLog;
	@FindBy(xpath="//span[text()='CONFIRM']")
	private WebElement InsuConfirmSecond;
	
	
	
	@FindBy(xpath="//a[@href='#pending_surveyor_inspection']")
	private WebElement InsuSurveyorInspection;
	@FindBy(xpath="(//tr/descendant::img[@title='Insurance Inspection'])[1]")
	private WebElement InsuSurveyorSelectItem;
	@FindBy(xpath="//button[@class='ma-2 v-btn v-btn--contained theme--light v-size--default primary']/parent::div")
	private WebElement InsuSurveyorUpdateInfo;
	@FindBy(xpath="//label[text()='Claim Inspection Date*']/following-sibling::input/parent::div")
	private WebElement InsuSurveyorClaimInspectionDate;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea[@name='remark']")
	private WebElement InsuSurveyorAddRemarks;
	@FindBy(xpath="//button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement InsuConfirmThird;
	
	
	@FindBy(xpath="//a[@href='#pending_claim_resolution']")
	private WebElement InsuClaimResolution;
	@FindBy(xpath="(//span[text()='Approve']/parent::button)[1]")
	private WebElement InsuClaimResolutionApprove;
	@FindBy(xpath="//label[text()='Approval Date*']/following-sibling::input")
	private WebElement InsuClaimResolutionApprovelDate;
	@FindBy(xpath="//label[text()='Enter Approved Amount*']/following-sibling::input")
	private WebElement InsuClaimResolutionApprovedAmount;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea[@name='remark']")
	private WebElement InsuClaimResolutionAddRemarks;
	@FindBy(xpath="//button[@class='v-btn v-btn--contained theme--light v-size--small primary']/child::span[text()='Approve']")
	private WebElement InsuConfirmFourth;
	
	
	
	
	@FindBy(xpath="//a[@href='#pending_liquidation']")
	private WebElement InsuPendingLiquidation;
	@FindBy(xpath="(//td[@class='text-start']/child::input[@type='checkbox'])[1]")
	private WebElement InsuPendingLiquidationSelectItem;
	@FindBy(xpath="//label[text()='SET DISPOSITION']/following-sibling::input[@target='#set-disposition']")
	private WebElement InsuPendingLiquidSetDisposition;
	@FindBy(xpath="//div[@class='v-list-item__content']/child::div[text()='Brand Call-Log']")
	private WebElement InsuSetDispositionLiquidation;
	//@FindBy(xpath="(//i[@class='v-icon notranslate mdi mdi-radiobox-blank theme--light']/following-sibling::input[@role='radio'])[1]")
	//private WebElement InsuInPolicyRadio;
	@FindBy(xpath="//label[text()='Add Remarks*']/following-sibling::textarea[@name='input-7-4']")
	private WebElement InsuPendingLiquidationAddRemarks;
	@FindBy(xpath="//label[text()='ATTACH DOCUMENT']/following-sibling::div[@class='v-file-input__text v-file-input__text--chips']")
	private WebElement InsuAttachDocPendingLiq;
	@FindBy(xpath="//span[text()='Confirm']/parent::button[@class='v-btn v-btn--contained theme--light v-size--small primary']")
	private WebElement InsuConfirm5th;
	
	
	@FindBy(xpath = "(//td//button[contains(@class,'v-btn v-size--default v-date-picker-table__current v-btn--')])[1]")
	private WebElement monthselectapproval;

	
	
	public  DInsurance() {
		PageFactory.initElements(driver, this);//constructor
	}
	
	public void Insurance1() throws InterruptedException {

		System.out.println(InsuranceOpenCasesCount.getText());
		Thread.sleep(500);
		 int insuranceOpenCasesCount = Integer.parseInt(InsuranceOpenCasesCount.getText());
		 int insuClaimCount = Integer.parseInt(InsuClaimCount.getText());
		 int insuUpdateClaimCount = Integer.parseInt(InsuUpdateClaimCount.getText());
		 int insuInspectionCount = Integer.parseInt(InsuInspectionCount.getText());
		 int insuResolutionCount = Integer.parseInt(InsuResolutionCount.getText());
		 int insuDispostionCount = Integer.parseInt(InsuDispostionCount.getText());
		int totalSum = insuClaimCount+insuUpdateClaimCount+insuInspectionCount+insuResolutionCount+insuDispostionCount;
		System.out.println(totalSum);
		Assert.assertEquals(totalSum, insuranceOpenCasesCount);
		System.out.println("Open cases count validated");
		Thread.sleep(1000);
		Insurance.click();
	}
	public void insuSelectItem() throws InterruptedException {
		Thread.sleep(1000);
		InsuSelectItem.click();
	}
	public void insuClaimSubmitionDate() throws InterruptedException {
		InsuClaimSubmitionDate.click();
		Thread.sleep(500);
		monthclick.click();
		Thread.sleep(500);
		yearclick.click();
		Thread.sleep(500);
		yearSelect.click();
		Thread.sleep(1000);
		monthselect.click();
		Thread.sleep(500);
		dateClick.click();
		Thread.sleep(500);
		cok.click();

	}
	public void insuClaimAmount() throws InterruptedException {
		Thread.sleep(500);
		InsuClaimAmount.click();
		Thread.sleep(500);
		InsuClaimAmount.sendKeys("1000");
	}
	public void insuAddRemarks() throws InterruptedException {
		InsuAddRemarks.click();
		Thread.sleep(500);
		InsuAddRemarks.sendKeys("Test");
	}
	public void insuAttachDoc() throws AWTException, InterruptedException {
		InsuAttachDoc.click();
		Thread.sleep(500);
		r1 = new Robot();
		r1.delay(500);
		StringSelection s = new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
		r1.keyPress(KeyEvent.VK_V);// press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
	}
	public void insuConfirmFirst() throws InterruptedException {
		InsuConfirmFirst.click();
		Thread.sleep(1500);
		System.out.println("Pending claim registration succussfully updated");
	}
	
	
	//SECOND SCREEN
	public void insuUpdateClaimRegist() throws InterruptedException {
		Thread.sleep(500);
		InsuUpdateClaimRegist.click();
	}
	public void insuUpdateCallSelectItem() throws InterruptedException {
		Thread.sleep(2000);
		InsuUpdateCallSelectItem.click();
	}
	public void insuUpdateClaimCallLog() throws InterruptedException {
		Thread.sleep(1000);
		InsuUpdateClaimCallLog.click();
	}
	public void insuEnterCallLog() throws InterruptedException {
		InsuEnterCallLog.click();
		Thread.sleep(500);
		InsuEnterCallLog.sendKeys("CallLogNO204050");
	}
	public void insuConfirmSecond() throws InterruptedException {
		InsuConfirmSecond.click();
		System.out.println("CallLog No. updated succussfully");
		Thread.sleep(500);
	}
	
	//THIRD SCREEN
	public void insuSurveyorInspection() throws InterruptedException {
		Thread.sleep(500);
		InsuSurveyorInspection.click();
	}
	public void insuSurveyorSelectItem() throws InterruptedException {
		Thread.sleep(2000);
		InsuSurveyorSelectItem.click();
		Thread.sleep(500);
	}
//	public void insuSurveyorUpdateInfo() throws InterruptedException{
//		Thread.sleep(2000);
//		InsuSurveyorUpdateInfo.click();
//	}
	public void insuSurveyorClaimInspectionDate() throws InterruptedException {
		Thread.sleep(1500);
		InsuSurveyorClaimInspectionDate.click();
		Thread.sleep(500);
		monthclick.click();
		Thread.sleep(500);
		yearclick.click();
		Thread.sleep(500);
		yearSelect.click();
		Thread.sleep(1000);
		monthselect.click();
		Thread.sleep(1000);
		dateClick.click();
		Thread.sleep(500);
		cok.click();
	}
	public void InsuSurveyorAddRemarks() throws InterruptedException {
		InsuSurveyorAddRemarks.click();
		Thread.sleep(500);
		InsuSurveyorAddRemarks.sendKeys("Remarks added");
	}
	public void insuAttachDocInspection() throws AWTException, InterruptedException {
		InsuAttachDoc.click();
		Thread.sleep(1000);
		r1 = new Robot();
		r1.delay(500);
		StringSelection s = new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
		r1.keyPress(KeyEvent.VK_V);// press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
	}
	public void insuConfirmThird() throws InterruptedException {
		Thread.sleep(500);
		InsuConfirmThird.click();
		Thread.sleep(500);
		System.out.println("Pending surveyor inspection verifyied succusfully");
	}
	
	//FOURTH SCREEN
	
	public void insuClaimResolution() throws InterruptedException {
		Thread.sleep(500);
		InsuClaimResolution.click();
	}
	public void insuClaimResolutionApprove() throws InterruptedException {
		Thread.sleep(1000);
		InsuClaimResolutionApprove.click();
	}
	public void insuClaimResolutionApprovelDate() throws InterruptedException {
		Thread.sleep(500);
		InsuClaimResolutionApprovelDate.click();
		monthclick.click();
		Thread.sleep(500);
		yearclick.click();
		Thread.sleep(500);
		yearSelect.click();
		Thread.sleep(1000);
		monthselectapproval.click();
		Thread.sleep(1000);
		dateClick.click();
		Thread.sleep(500);
		cok.click();
	}
	public void insuClaimResolutionApprovedAmount() {
		InsuClaimResolutionApprovedAmount.click();
		InsuClaimResolutionApprovedAmount.sendKeys("500");
	}
	public void insuClaimResolutionAddRemarks() {
		InsuClaimResolutionAddRemarks.click();
		
		InsuClaimResolutionAddRemarks.sendKeys("Remarks Added");
	}
	public void insuAttachDocClaimresolution() throws AWTException, InterruptedException {
		InsuAttachDoc.click();
		Thread.sleep(1000);
		r1 = new Robot();
		r1.delay(500);
		StringSelection s = new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
		r1.keyPress(KeyEvent.VK_V);// press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
	}
	public void insuConfirmFourth() throws InterruptedException {
		Thread.sleep(1000);
		InsuConfirmFourth.click();
		Thread.sleep(500);
		System.out.println("Pending claim resolution updated succussfully");
	}
	
	
	//555Th SCREEN
	public void insuPendingLiquidation() throws InterruptedException {
		Thread.sleep(500);
		InsuPendingLiquidation.click();
	}
	public void insuPendingLiquidationSelectItem() throws InterruptedException {
		Thread.sleep(2000);
		InsuPendingLiquidationSelectItem.click();
	}
	public void insuPendingLiquidSetDisposition() throws InterruptedException {
		Thread.sleep(1000);
		InsuPendingLiquidSetDisposition.click();
	}
	public void insuSetDispositionLiquidation() throws InterruptedException {
		Thread.sleep(500);
		InsuSetDispositionLiquidation.click();
	}
	public void insuPendingLiquidationAddRemarks() throws InterruptedException {
		Thread.sleep(1000);
		InsuPendingLiquidationAddRemarks.click();
		Thread.sleep(500);
		InsuPendingLiquidationAddRemarks.sendKeys("Insu AddRemarks");
	}
	public void insuAttachDocPendingLiqui() throws AWTException, InterruptedException {
		InsuAttachDocPendingLiq.click();
		Thread.sleep(1000);
		r1 = new Robot();
		r1.delay(500);
		StringSelection s = new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// ctrl+V
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_CONTROL);// press the ctrl key
		r1.keyPress(KeyEvent.VK_V);// press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
	}
	public void insuConfirm5th() throws InterruptedException {
		Thread.sleep(1000);
		InsuConfirm5th.click();
		Thread.sleep(500);
		System.out.println("Pending liquidation item succussfully moved ");
	}

	@FindBy(xpath="//span[text()='Disposition']/parent::div/ancestor::div[@class='list-unstyled components']")
	private WebElement DispositionGoback;

	public void DispositionGoback() throws InterruptedException {
		Thread.sleep(2000);
		DispositionGoback.click();
	}


}
