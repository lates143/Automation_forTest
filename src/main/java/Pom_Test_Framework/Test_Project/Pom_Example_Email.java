package Pom_Test_Framework.Test_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Example_Email {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name=\"emailid\"]")
			WebElement emailfield;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
			WebElement submit;
	
	//After Login to locate heading
	@FindBy(xpath = "//h2['text()=Guru99 Bank']")
	WebElement heading;
	
	public Pom_Example_Email(WebDriver driver) {
		
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String email) {	
		
		emailfield.sendKeys(email);
	}
	public void submithit() {	
		
		submit.click();
	}
	
	public String headname() {

		return heading.getText();


	}
}
