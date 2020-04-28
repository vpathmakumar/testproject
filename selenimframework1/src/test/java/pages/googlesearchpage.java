package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage {
	
	private static WebElement element=null;
	
	public static WebElement text_searchbox(WebDriver driver){
		
		element=driver.findElement(By.name("q"));
		
		return element;
		
	}
	
	public static WebElement btn_search(WebDriver driver) {
		
		element=driver.findElement(By.name("btnK"));
		
		return element;
		
	}
	}


