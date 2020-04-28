package selenimframework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.propertiesfile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googlesearchobjects;

public class googletest {

	static WebDriver driver;
	public static String browser;
	
	public static void main(String[] args) {
		propertiesfile.readpropertiesfile();
		configbrowser();
		googlesearchtest();

	}

	public static void configbrowser() {
		if(browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}

		if(browser.contains("Chorome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	public static void googlesearchtest (){

		googlesearchobjects searchpage=new googlesearchobjects(driver);

		driver.get("https://google.com");
		searchpage.settestsearchbox("A b c D E F");

		searchpage.entersearchbtn();

		driver.close();




	}
	
}
