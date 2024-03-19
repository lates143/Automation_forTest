package Test_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen_verify {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	WebDriver driver;
	
	@FindBy(xpath = "//a[@id=\"nav-logo-sprites\"]")
	WebElement homepage;
	
	@FindBy(xpath = "//span[@class=\"nav-line-2 \"]")
	WebElement hover;
	
	public HomeScreen_verify(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public String homescreename() {
		return homepage.getText();
		
	}
	public void hoverscreen() {
		hover.click();
	}

	}

