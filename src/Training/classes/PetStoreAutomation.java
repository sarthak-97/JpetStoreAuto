package Training.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class PetStoreAutomation {

	public void autoFlow(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement EntertheStore = driver.findElement(new By.ByLinkText("Enter the Store"));
		EntertheStore.click();
		
		Thread.sleep(1000);
		
		
		WebElement signinLink = driver.findElement(new By.ByLinkText("Sign In"));
		signinLink.click();
		
		Thread.sleep(1000);
		
		WebElement registerLink = driver.findElement(new By.ByLinkText("Register Now!"));
		registerLink.click();
		
		driver.findElement(By.name("username")).sendKeys("Rasika");
		driver.findElement(By.name("password")).sendKeys("rasi123@");
		driver.findElement(By.name("repeatedPassword")).sendKeys("rasi123@");
		driver.findElement(By.name("account.firstName")).sendKeys("Rasika");
		driver.findElement(By.name("account.lastName")).sendKeys("Thakare");
		driver.findElement(By.name("account.email")).sendKeys("rasika@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("708284512");
		driver.findElement(By.name("account.address1")).sendKeys("Newtown");
		driver.findElement(By.name("account.address2")).sendKeys("Newtown");
		driver.findElement(By.name("account.city")).sendKeys("Kolkata");
		driver.findElement(By.name("account.state")).sendKeys("West Bengal");
		driver.findElement(By.name("account.zip")).sendKeys("700077");
		driver.findElement(By.name("account.country")).sendKeys("India");
		driver.findElement(By.name("account.languagePreference")).sendKeys("English");
		driver.findElement(By.name("account.favouriteCategoryId")).sendKeys("FISH");
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("newAccount")).click();
		Thread.sleep(2000);

		//System.console().readLine();
		Thread.sleep(2000);
		driver.close();
		
	}
	
	

}
