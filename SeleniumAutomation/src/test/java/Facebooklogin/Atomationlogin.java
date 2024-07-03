package Facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atomationlogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		WebElement usernameField = driver.findElement(By.id("email"));
		
		//for some time delay
		   Thread.sleep(1000);
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        Thread.sleep(1000);
	        
	        usernameField.sendKeys("yourusername");
	        Thread.sleep(1000);
	        passwordField.sendKeys("password");
	       driver.findElement(By.name("login")).click();
	       
	       driver.quit();
	       
		
		
	}

}
