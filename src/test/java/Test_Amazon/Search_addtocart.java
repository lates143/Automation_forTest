package Test_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search_addtocart {
	
	WebDriver driver;
	
	@FindBy(xpath ="//input[@id=\"twotabsearchtextbox\"]")
	WebElement searchbox;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement searchbtn;
	
	public Search_addtocart(WebDriver Driver) {
		this.driver = Driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void searchboxop(String product) throws Throwable {
		searchbox.sendKeys(product);
		Thread.sleep(2000);
		searchbtn.click();
	}
	
	

}
