package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base2 {
	WebDriver driver;
	public void initialiseBrowser2() {
		System.setProperty("webdriver.msedge.driver","C:\\Users\\KuAp\\git\\SeleniumTest\\AutomationCourse\\src\\main\\java\\Resources\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	
	}
	public void driverCloseOrQuit() {
		driver.close();
	}
	public static void main(String args[]) {
		Base2 base2=new Base2();
		base2.initialiseBrowser2();
		base2.driverCloseOrQuit();
	}
}
