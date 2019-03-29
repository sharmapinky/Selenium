package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
 driver=new FirefoxDriver();
driver.get("https://www.spicejet.com");
seectById(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")), 2);
seectById(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")), 3);
	}
	public static void seectById(WebElement element,int index){
		Select selectbyindex=new Select(element);
		selectbyindex.selectByIndex(index);
		
		
	}

}
