package Newtours;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Newtours_library.newTours;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Register_form {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "c:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testRegisterForm() throws Exception{
		
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		newTours.contractInformation("firstName", "Bahdur", "lastName", "Father", "phone", 
				"1234567", "userName", "deneme3@deneme.com", driver);
		newTours.mailingInformation("address1", "Acton", "city", "london", "state", "Acton", 
				"postalCode", "W3 AB", "country", driver);
		newTours.userInformation("email", "deneme3@deneme.com", "password", "12345", 
				"confirmPassword", "12345", driver);
		driver.findElement(By.name("register")).submit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.linkText("sign-in")).click();
		newTours.signon("userName","deneme3@deneme.com", "password", "12345", driver);
		driver.findElement(By.name("login")).click();
	}

	
	@AfterMethod
	public void tearDown() throws Exception{
		driver.close();
	}
	
	

}
