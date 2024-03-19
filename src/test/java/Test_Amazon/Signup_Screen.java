//package Test_Amazon;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Signup_Screen {
//	
//	WebDriver driver;
//	
//	@FindBy(xpath = "//a[@id=\"createAccountSubmit\"]")
//	WebElement crtnwacnt;
//	
//	@FindBy(xpath = "//input[@name=\"customerName\"]")
//	WebElement ownername;
//	
//	@FindBy(xpath = "//input[@name=\"email\"]")
//	WebElement number;
//	
//	@FindBy(xpath = "//input[@name=\"password\"]")
//	WebElement pswrd;
//	
//	@FindBy(xpath = "//input[@id=\"continue\"]")
//	WebElement verifybtn;
//	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/button")
//	WebElement puzzlebtn;
//	
//	
//	public Signup_Screen(WebDriver driver) {
//		this.driver= driver;
//		
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void hitcreatenewaccount() {
//		crtnwacnt.click();
//	}
//	
//	public void entername(String username) {
//		ownername.sendKeys(username);
//	}
//	
//	public void enternumber(String usernumber) {
//		number.sendKeys(usernumber);
//	}
//	
//	public void enterpswd(String pwd) {
//		pswrd.sendKeys(pwd);
//	}
//	
//	public void hitverifybtn() {
//		verifybtn.click();
//	}
//	
//	//public void puzzlebtn() {
//	//	puzzlebtn.click();
////	}
//
//}
