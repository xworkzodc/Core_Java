package com.xworkz.browser;
import com.xworkz.browser.sub.MozillaBrowser;
import com.xworkz.browser.parent.Browser;

public class BrowseRunner extends MozillaBrowser {
	
	public static void main(String[] args) throws InterruptedException {
	
	Browser browser=new MozillaBrowser();

	browser.connect();
	browser.developerTool();
	browser.equals(browser);
	browser.getClass();
	browser.getCompany();
	browser.getName();
	browser.getVersion();
	browser.getName();
	browser.hashCode();
	browser.notify();
	browser.notifyAll();
	browser.showTime();
	browser.toString();
	browser.Browser("ACT ","ACT GOLD","ACT GOLD 123");
	browser.wait(0, 0);
	browser.wait(0);
	browser.Browser();
	browser.showTime();
	((MozillaBrowser) browser).cleanUp();//type casting
	
	
	
	
	
	
	

}
	
	
}
