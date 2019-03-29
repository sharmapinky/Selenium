package ScreenShotOfAWebpage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot {
static WebDriver driver;
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver", "G:\\webdrivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	sreenShotOfWebpage("FacebookPage");
	
}

public static void sreenShotOfWebpage(String FileName) throws IOException{
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("C:\\Users\\Lenovo\\workspace\\Selenium\\sreenShotOfWebpage" + FileName ));
	
}
}