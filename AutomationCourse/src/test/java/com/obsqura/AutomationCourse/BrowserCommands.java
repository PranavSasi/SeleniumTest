package com.obsqura.AutomationCourse;

public class BrowserCommands extends Base{
	
	public void browserCommands() {
		
		String Title=driver.getTitle();
		
	}

	public static void main(String[] args) {
	
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initialiseBrowser();
		browsercommands.browserCommands();
		browsercommands.driverCloseOrQuit();
		
	}

}
