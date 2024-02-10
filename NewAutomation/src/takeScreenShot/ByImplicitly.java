package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByImplicitly {

	public static void main(String[] args) throws IOException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.flipkart.com/");
		 
		 TakesScreenshot tScreenshot =(TakesScreenshot)driver; //to perform typecasting
		 
		 File src = tScreenshot.getScreenshotAs(OutputType.FILE); //to take the screenshot of webpage
		 
		 File dest = new File("./screenshots/flipkart.png");
		 
		 Files.copy(src, dest);
		}

}
