package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
driver.getCurrentUrl();
	}

}
