package Pom_Test_Framework.Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class App{
	public static void main(String[] args) throws Throwable {
		WebDriver d= new ChromeDriver();
		
		String title = "Dashboard";
		
		d.get("https://scf-dev.approd.ca/");
		d.manage().window().maximize();
		
		System.out.println(d.getCurrentUrl());
		
		d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("admin@123");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id=\"submit-btn\"]")).click();
		
		Thread.sleep(4000);
		String acttitle= d.getTitle(); 
		System.out.println(acttitle);
		
		if (title.equals(acttitle)) {
			System.out.println("Landed on correct page");
		}
		else {
			System.out.println("Test failed");
		}
		
		
		
		
	}
}