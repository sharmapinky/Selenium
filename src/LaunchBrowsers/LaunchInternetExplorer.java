package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchInternetExplorer {

	public static void main(String[] args) {
System.setProperty("webdriver.ie.driver", "G:\\webdrivers\\IEDriverServer.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("https://wwww.google.com");
System.out.println(driver.getCurrentUrl());
	}

}
