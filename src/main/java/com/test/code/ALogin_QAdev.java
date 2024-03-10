package com.test.code;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.initialiazeChrome;
public class ALogin_QAdev extends initialiazeChrome {
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement pwd;
	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement loginButton;

	public ALogin_QAdev(){
		PageFactory.initElements(driver,this);
	}

	//Excel1 e = new Excel1();
    // public void login() throws InterruptedException {
	// Thread.sleep(1000);
	// email.sendKeys(prop.getProperty("Email"));
    // pwd.sendKeys(prop.getProperty("Password"));
	
	public String getExcelData(String Sheetname, int row, int cell) throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("C:\\Users\\Blubirch\\eclipse-workspace\\QAtest\\src\\main\\resources\\login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return Data;
	}
	
	public void loginWithValid(String USERNAME, String password) throws InterruptedException {
		Thread.sleep(2000);
		email.sendKeys(USERNAME);	
		pwd.sendKeys(password);
		System.out.println(USERNAME);
		System.out.println(password);
		loginButton.click();
		//Reporter.log("Logined succussfully");

	}
	

}
