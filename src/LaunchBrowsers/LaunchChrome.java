package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","G:\\webdrivers\\chromedriver_win32 (3)\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
	}

}
