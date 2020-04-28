package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googlesearchobjects {
	WebDriver driver=null;
	
	By txt_searchbox=By.xpath("//input[@type='text'][@name='q']");
	By btb_search=By.xpath("//input[@type='submit'][@name='btnK']");
	
	public googlesearchobjects (WebDriver driver) {
		this.driver=driver;
	}
	
	public void settestsearchbox(String text) {
		
		driver.findElement(txt_searchbox).sendKeys(text);
		
		
	}
	
	
	public void entersearchbtn() {
		
		driver.findElement(btb_search).sendKeys(Keys.RETURN);
		

}
	
}
