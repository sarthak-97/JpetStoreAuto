package Training;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeservice {
	private ChromeDriverService chromeDriverService;
	WebDriver webDriver;
	public void service() throws IOException
	{

chromeDriverService = new ChromeDriverService.Builder().usingDriverExecutable(new File("resources/chromedriver.exe")).usingAnyFreePort().build();
chromeDriverService.start();
webDriver = new RemoteWebDriver(chromeDriverService.getUrl(), DesiredCapabilities.chrome());
webDriver.get("http://192.168.14.83:8080/jpetstore/actions/Catalog.action");
	
	}
}
