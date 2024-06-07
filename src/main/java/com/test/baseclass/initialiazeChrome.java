package com.test.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;

import com.google.common.io.Files;
import com.project.Utils.TestUtil;
import com.test.listeners.listener;


/**
 * Hello world!
 *
 */
@Listeners(listener.class)
public class initialiazeChrome 
{
	
	public static WebDriver driver;
	public static Properties prop;
	public static ClassLoader _class;
	
	public initialiazeChrome(){
		_class = getClass().getClassLoader();
	}
	
	public static void initialization() throws InterruptedException  
	{
		try {
			
			//InputStream is = _class.getResourceAsStream("data.properties");
<<<<<<< HEAD
			FileInputStream is=new FileInputStream("C:\\Users\\Blubirch\\eclipse-workspace\\QAtest\\src\\main\\resources\\data.properties");
=======
			FileInputStream is=new FileInputStream("C:\\Users\\laksh\\eclipse-workspace\\Jenkin22-main\\src\\main\\resources\\data.properties");
>>>>>>> d10113d (First commit msg)
			prop = new Properties();
			prop.load(is);
			//System.out.println(prop.getProperty("d1"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("Browser");
		if (browserName.equals("chrome")) {
			//ChromeOptions co=new ChromeOptions();
			//co.setBinary("C:\\Users\\Blubirch\\Downloads\\chrome-win32\\chrome-win32");
<<<<<<< HEAD
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Blubirch\\eclipse-workspace\\QAtest\\src\\main\\resources\\chromedriver.exe");
=======
			System.setProperty("webdriver.chrome.driver","C:\\Users\\laksh\\eclipse-workspace\\Jenkin22-main\\src\\main\\resources\\chromedriver.exe");
>>>>>>> d10113d (First commit msg)
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

	  }
     else if (browserName.equals("FF")) {
	 System.setProperty("webdriver.edge.driver","C:\\Users\\Blubirch\\Downloads\\QEProject\\QEProject\\src\\main\\resources\\msedgedriver.exe");
	 driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	}
		
		
		public void failed(String testMethodName) {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
<<<<<<< HEAD
				Files.copy(srcFile, new File("C:\\Users\\Blubirch\\eclipse-workspace\\QAtest\\ScreenShoots\\Abc"+testMethodName+"_"+".jpg"));
=======
				Files.copy(srcFile, new File("C:\\Users\\laksh\\eclipse-workspace\\Jenkin22-main\\ScreenShoots\\Abc"+testMethodName+"_"+".jpg"));
>>>>>>> d10113d (First commit msg)
			} catch (IOException e) {
				e.printStackTrace();
			}
		}    
}
