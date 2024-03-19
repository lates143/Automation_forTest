package Test_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Verify {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement email; 
	
	@FindBy(xpath = "//input[@id=\"continue\"]")
	WebElement continu; 
	
	public Signin_Verify(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String email1) {
		email.sendKeys(email1);
	}
	public void hitcontinue() {
		continu.click();
	}
	

}
