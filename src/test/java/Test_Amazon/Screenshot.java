//package Test_Amazon;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.google.common.io.Files;
//
//import net.bytebuddy.utility.RandomString;
//
//public class Screenshot {
//
//	public void screen() throws Throwable {
//		String rstring = RandomString.make();
//		
//		WebDriver driver = new ChromeDriver();
//		
//		TakesScreenshot ts= ((TakesScreenshot)driver);
//		
//		File src= ts.getScreenshotAs(OutputType.FILE);
//		File trg= new File("C:\\Users\\Sagarlate\\Downloads\\Screenshot\\"+rstring + ".jpeg");
//		
//		Files.copy(src, trg);
//	}
//}
