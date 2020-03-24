package Training;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
 
public class takess {
 
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

String baseUrl = "http://192.168.14.83:8080/jpetstore/";
driver.get(baseUrl);

TakesScreenshot ts = (TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File("resources/Screen.jpg");
Files.copy(source, destination);
System.out.println("the Screenshot is taken");

String expectedTitle = "JPetStore Demo";
String actualTitle = "";


actualTitle = driver.getTitle();

if (actualTitle.contentEquals(expectedTitle)){
    System.out.println("Test Passed!");
} else {
   System.out.println("Test Failed");
}
System.console().readLine();

}
 
}
