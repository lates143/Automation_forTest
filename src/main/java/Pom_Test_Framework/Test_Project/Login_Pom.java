package Pom_Test_Framework.Test_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Pom {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		
		Pom_Example_Email p= new Pom_Example_Email(driver);
		
		p.enteremail("Admin@gmail.com");
		p.submithit();
		
		String nameofpage= p.headname();
		
		System.out.println(nameofpage);

	}

}
