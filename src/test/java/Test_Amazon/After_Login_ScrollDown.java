package Test_Amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class After_Login_ScrollDown {
	
		WebDriver driver;
		
		@FindBy(xpath = "(//span[@class=\"a-color-base\"])[3]")
		WebElement clckphone;
		
		public After_Login_ScrollDown(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
//		public void scroll() {
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,450)", "");
//		}
		
		public void selectphone() {			
			clckphone.click();
		}
}
