package selenimframework1;

import org.junit.Test;
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
public class browsertest {

	static WebDriver driver;




	public static void main(String [] args) {

		propertiesfile.readpropertiesfile();
		configbrowser();
		googlesearchtest();

	}


	public static void configbrowser() {
		if(tetsngdemo.browsername1.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}

		if(tetsngdemo.browsername1.contains("Chorome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	public static void runtest () {
		driver.get("https://google.com");
		googlesearchpage.text_searchbox(driver).sendKeys("Automation step by step");
		googlesearchpage.btn_search(driver).sendKeys(Keys.RETURN);


		driver.close();

	}

	public static void googlesearchtest (){

		googlesearchobjects searchpage=new googlesearchobjects(driver);

		driver.get("https://google.com");
		searchpage.settestsearchbox("A b c D E F");

		searchpage.entersearchbtn();

		driver.close();
	}

}