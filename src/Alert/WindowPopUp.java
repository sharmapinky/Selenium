package Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WindowPopUp {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("https://www.popuptest.com//goodpopup.html");

	}

}
