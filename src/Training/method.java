package Training;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class method {
	

	    public void ElementID () {
	    	System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
	    	
	    	WebDriver driver =new ChromeDriver();
	    	    	String url ="http://192.168.14.83:8080/jpetstore/actions/Catalog.action";
	        driver.get(url);
	    	By searchid = new By.ById("Search");
			
			List<WebElement> identifier = driver.findElements(searchid);
			
			System.out.println(identifier.size());
			for(WebElement webElement:identifier) {
				String Tag1 = webElement.getTagName();
				System.out.println(Tag1);
			}}
			public void ElementTag() {
				
				WebDriver driver =new ChromeDriver();
		    	String url ="http://192.168.14.83:8080/jpetstore/actions/Catalog.action";
		        driver.get(url);
				By searchtag =new By.ByTagName("a");
				List<WebElement> identifier1 = driver.findElements(searchtag);
				System.out.println(identifier1.size());
				for(WebElement webElement:identifier1) {
					String Tag2 = webElement.getTagName();
					System.out.println(Tag2);
				}}
			
public void Elementname() {
				
				WebDriver driver =new ChromeDriver();
		    	String url ="http://192.168.14.83:8080/jpetstore/actions/Catalog.action";
		        driver.get(url);
				By searchname =new By.ByName("username");
				List<WebElement> identifier2 = driver.findElements(searchname);
				System.out.println(identifier2.size());
				for(WebElement webElement:identifier2) {
					String Tag3 = webElement.getTagName();
					System.out.println(Tag3);
				}}

public void ElementXPath() {
	
	WebDriver driver =new ChromeDriver();
	String url ="http://192.168.14.83:8080/jpetstore/actions/Catalog.action";
    driver.get(url);
    driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
//	System.out.println(identifier2.size());
//	for(WebElement webElement:identifier2) {
//		String Tag3 = webElement.getTagName();
//		System.out.println(Tag3);
	}}
	
				
			
			
			
	    
			// TODO Auto-generated method stub

		
