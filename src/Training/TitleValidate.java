package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidate {

	public void validateTitle(String url,String expectedTitle) {
		
		
		
		/*
		 * System.out.println("Got the gecko driver details from commandline");
		 * System.out.println(System.getProperty("webdriver.gecko.driver"));
		 */
		
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe"); // alternately launch the java by passing the system property by using -D option
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		
    
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(url);

        // get the actual value of the title
        actualTitle = driver.getTitle();

 
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
            System.out.println("Actual :" + actualTitle);
        } else {
            System.out.println("Test Failed");
            System.out.println("Actual :" + actualTitle);
        }
  //    System.console().readLine();
        //close Fire fox
        driver.close();
		
	}
	
}
