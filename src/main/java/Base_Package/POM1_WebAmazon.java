package Base_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM1_WebAmazon {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();

	}

}
