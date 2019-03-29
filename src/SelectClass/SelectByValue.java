package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
public static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://www.spicejet.com");
selectbyvalue(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")), "USD");
selectbyvalue(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")), "INR");
selectbyvalue(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")), "AED");
	}
	public static void selectbyvalue(WebElement element,String Value){
		Select selectbyvalue=new Select(element);
		selectbyvalue.selectByValue(Value);
		
			
		}
	}


