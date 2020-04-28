package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenimframework1.browsertest;
import selenimframework1.tetsngdemo;

public class propertiesfile {
	static Properties prop= new Properties();
	
	
	
	public static void main(String[] args) {
		readpropertiesfile();
		writeproperties();
		readpropertiesfile();
	}
	
	public static void readpropertiesfile() {
		
		Properties prop= new Properties();
		try {
			InputStream input=new FileInputStream("C:\\javaprojects\\selenimframework1\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		tetsngdemo.browsername1=browser;
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void writeproperties() {
			OutputStream output;
			try {
				output = new FileOutputStream("C:\\javaprojects\\selenimframework1\\src\\test\\java\\config\\config.properties");
				prop.setProperty("browser","chrome");
				prop.store(output,"test selenim");
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	
		
		
		
		
	}


