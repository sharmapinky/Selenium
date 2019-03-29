package LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchOpera {
     static WebDriver driver;
	public static void main(String[] args) {
		DesiredCapabilities capabilities = DesiredCapabilities.opera();
		capabilities.setCapability("opera.binary","G:\\webdrivers\\operadriver_win64\\operadriver.exe");
		driver = new OperaDriver(capabilities);
		driver.get("https://wwww.google.com");
	}

}
