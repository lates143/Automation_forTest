package Test_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_Cart {

	WebDriver driver;
	
	@FindBy(xpath = "(//input[@id=\"add-to-cart-button\"])[2]")
	WebElement atc;
	
	@FindBy(xpath = "//a[@id=\"attach-close_sideSheet-link\"]")
	WebElement cross;
	
	public Add_to_Cart(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void addtocartbtn() {
		atc.click();
	}
	
	public void closecross() {
		cross.click();
	}
}
