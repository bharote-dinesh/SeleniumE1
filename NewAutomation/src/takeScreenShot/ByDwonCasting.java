package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDwonCasting {

	public static void main(String[] args) throws IOException, InterruptedException {
	
	 		WebDriver driver=new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 		driver.get("https://www.facebook.com/login/");
	 		
	 		RemoteWebDriver rwd= (RemoteWebDriver)driver; // To perform Downcasting
	 		
	 		File src = rwd.getScreenshotAs(OutputType.FILE); // To take the screenshot of WebPage
	 		
	 		File dest = new File("./screenshots/Facebook.jpg"); // To Specify the location, name and extension of the screenshot
	 		
	 		Files.copy(src, dest); // To copy and paste the screenshot in the specified folder.

	}

}
