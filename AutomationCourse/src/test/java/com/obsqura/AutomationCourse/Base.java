package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	
	public void initialiseBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KuAp\\git\\SeleniumTest\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	public void driverCloseOrQuit(){
		//driver.close();
		driver.quit();
	}
	public static void main(String args[]) {
		Base base=new Base();
		base.initialiseBrowser();
	}
}
