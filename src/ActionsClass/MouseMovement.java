package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.spicejet.com");
Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
driver.findElement(By.linkText("Sign up")).click();
driver.close();
	}

}
