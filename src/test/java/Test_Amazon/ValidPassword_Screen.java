package Test_Amazon;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;


public class ValidPassword_Screen {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Passtext;
	
	@FindBy(xpath = "//input[@id=\"signInSubmit\"]")
	WebElement SignBtn;
	
	public ValidPassword_Screen(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterpass(String passkey) {
		Passtext.sendKeys(passkey);
	}
	public void hitbtn() {
		SignBtn.click();
	}
	
	public void screen() throws Throwable {
		String rstring = RandomString.make();
		
		//WebDriver driver = new ChromeDriver();
		
		TakesScreenshot ts= ((TakesScreenshot)driver);
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\Sagarlate\\Downloads\\Screenshot\\"+rstring + ".jpeg");
		
		Files.copy(src, trg);
	}
	
	

}
