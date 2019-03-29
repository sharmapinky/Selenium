package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertOperatons {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\webdrivers\\geckodriver-v0.19.0-win32\\geckodriver.exe");
	 driver=new FirefoxDriver();
driver.get("https://mail.rediff.com/");
JavascriptExecutor js=(JavascriptExecutor)driver;
driver.findElement(By.linkText("Sign in")).click();
js.executeScript("document.getElementById('login1').value='sharmapinky'");
js.executeScript("document.getElementById('password').value='riths'");
driver.findElement(By.name("proceed")).click();
driver.findElement(By.name("Login")).click();

Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//alert.dismiss();
alert.sendKeys("oh");
alert.accept();
	}
	

}
