package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedemo {
  static WebDriver driver= null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		 driver = new ChromeDriver();
		 Options myopt= driver.manage();
		 Navigation mynav = driver.navigate();
		 System.out.println(myopt);
		 System.out.println(mynav);
		 System.out.println(myopt.getClass());
		 System.out.println(myopt.getCookies());
		 System.out.println(mynav.getClass());
		 driver.navigate().to("http://192.168.14.83:8080/jpetstore/actions/Catalog.action");
		 System.out.println("going back");
		 mynav.back();
		 System.out.println("going forward");
		 mynav.forward();
		 myopt.window().fullscreen();
		 myopt.window().maximize();
		 
	     

    String baseUrl = "http://192.168.14.83:8080/jpetstore/";
    String expectedTitle = "JPetStore Demo";
    String actualTitle = "";
    
    driver.get(baseUrl);

    actualTitle = driver.getTitle();

    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
   } else {
       System.out.println("Test Failed");
  }
 System.console().readLine();
//    //close Fire fox
   //driver.close();

}}
