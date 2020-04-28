package selenimframework1;

import org.testng.annotations.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import config.propertiesfile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googlesearchobjects;
import pages.googlesearchpage;
public class tetsngdemo {

	public static String browsername1=null;
	
	WebDriver driver=null;


	@BeforeTest
	public void configbrowser() {
		
		propertiesfile.readpropertiesfile();

		if(browsername1.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}

		if(browsername1.contains("Chorome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

	}


	@Test
	public void googlesearchtest (){

		googlesearchobjects searchpage=new googlesearchobjects(driver);
		try {
			driver.get("https://google.com");
			searchpage.settestsearchbox("A b c D E F");

			searchpage.entersearchbtn();

		}catch (Exception e) {

			e.printStackTrace();
		}
	}
	@AfterTest
	public void teardowntest() {
		try {
			driver.close();
			driver.quit();
			System.out.println("Testing completed");
		}catch (Exception e) {

			e.printStackTrace();
		}
	}
}
