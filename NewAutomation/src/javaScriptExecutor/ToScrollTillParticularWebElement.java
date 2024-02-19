package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToScrollTillParticularWebElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		WebElement scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
        // js.executeScript("arguments[0].scrollIntoView(flase)",scrollTarget);
         js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
         
       TakesScreenshot ts= (TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File dest=new File("./screenshots/selenium.jpg");
       Files.copy(src, dest);

	}

}
