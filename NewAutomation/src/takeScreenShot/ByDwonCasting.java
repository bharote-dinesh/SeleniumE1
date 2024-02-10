package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDwonCasting {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	RemoteWebDriver	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/Amazon/png");

	     Files.copy(src, dest);
	}

}
