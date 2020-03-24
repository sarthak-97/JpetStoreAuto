package Training;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class capability {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		 String baseUrl = "http://192.168.14.83:8080/jpetstore/";
		 ////driver.get(baseUrl);
//		String cap = driver.getCapabilities().getCapability("deviceName").toString();
//		System.out.println("Current Device: " + cap);
		 String browserName = "mobileOS";
		 DesiredCapabilities capabilities = new DesiredCapabilities(browserName, "", Platform.ANY);String
		 host = args[0];
		 capabilities.setCapability("user", args[1]);
		 capabilities.setCapability("password", args[2]);
		 capabilities.setCapability("deviceName", "30E9D3E3");
		 RemoteWebDriver drivers = new RemoteWebDriver(new URL("https://" + host + "/nexperience/perfectomobile/wd/hub"), capabilities);

	}

}
