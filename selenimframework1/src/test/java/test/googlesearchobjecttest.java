package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.propertiesfile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googlesearchobjects;

public class googlesearchobjecttest {

	static WebDriver driver=null;
	public static String browser;
	
	public static void main(String[] args) {
		propertiesfile.readpropertiesfile();
		configbrowser();
		googlesearchtest();

	}

	public static void configbrowser() {
		try {
		if(browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}

		if(browser.contains("Chorome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void googlesearchtest (){

		googlesearchobjects searchpage=new googlesearchobjects(driver);
		try {
		driver.get("https://google.com");
		
}catch (Exception e) {
			
			e.printStackTrace();
		}
		searchpage.settestsearchbox("A b c D E F");

		searchpage.entersearchbtn();

		driver.close();




	}

}
