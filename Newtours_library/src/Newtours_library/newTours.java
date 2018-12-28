package Newtours_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class newTours {
	
	public static void contractInformation(String fn, String firstname, String ln, String lastname, String phn, 
			String phone, String em, String email, WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.name(fn)).sendKeys(firstname);
		driver.findElement(By.name(ln)).sendKeys(lastname);
		driver.findElement(By.name(phn)).sendKeys(phone);
		driver.findElement(By.name(em)).sendKeys(email);
	}
	
	public static void mailingInformation(String ad, String address, String ct, String city,String st, 
			String state, String pc, String postalcode, String cntry, WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.name(ad)).sendKeys(address);
		driver.findElement(By.name(ct)).sendKeys(city);
		driver.findElement(By.name(st)).sendKeys(state);
		driver.findElement(By.name(pc)).sendKeys(postalcode);
		Select c = new Select(driver.findElement(By.name(cntry)));
		c.selectByVisibleText("UNITED KINGDOM");
	}
	
	public static void userInformation(String un, String username, String ps, String password, String cp,
			String cpassword, WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.name(un)).sendKeys(username);
		driver.findElement(By.name(ps)).sendKeys(password);
		driver.findElement(By.name(cp)).sendKeys(cpassword);
	}
	
	public static void signon(String us, String username, String pw, String password, WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.name(us)).sendKeys(username);
		driver.findElement(By.name(pw)).sendKeys(password);
	}

}
