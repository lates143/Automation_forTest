package Test_Amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class AmazonScreen {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		   
		//Website initiation
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Homescreen 
		HomeScreen_verify home = new HomeScreen_verify(driver);
		String name= home.homescreename();
		System.out.println(name);
		Thread.sleep(2000);
		home.hoverscreen();
		Thread.sleep(2000);
		
		//Create account
//		Signup_Screen ss= new Signup_Screen(driver);
//		ss.hitcreatenewaccount();
//		Thread.sleep(2000);
//		ss.entername("Sagar Late");
//		Thread.sleep(2000);
//		ss.enternumber("8432656434");
//		Thread.sleep(2000);
//		ss.enterpswd("Lates@143");
//		Thread.sleep(2000);
//		ss.hitverifybtn();
		//ss.puzzlebtn();
		
		//Login Process
		Signin_Verify sign= new Signin_Verify(driver);
		sign.enteremail("8432656434");
		Thread.sleep(2000);
		sign.hitcontinue();
		Thread.sleep(2000);
		ValidPassword_Screen valid= new ValidPassword_Screen(driver);
		valid.enterpass("Lates@143");
		Thread.sleep(2000);
		valid.hitbtn();
		valid.screen();
		Thread.sleep(2000);
		
		//Scrolldown and click on mobile
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		After_Login_ScrollDown scr= new After_Login_ScrollDown(driver);
		scr.selectphone();
		Thread.sleep(2000);
		
		////Scrolldown and click on add to cart
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		
		Add_to_Cart atc= new Add_to_Cart(driver);
		atc.addtocartbtn();
		Thread.sleep(2000);
		atc.closecross();
		
		Thread.sleep(2000);
		
		Search_addtocart sa= new Search_addtocart(driver);
		sa.searchboxop("Dell Laptop");
		//Scrolldown
		js.executeAsyncScript("window.scrollBy(0,document.body.scrollheight)", "");
	}

}
