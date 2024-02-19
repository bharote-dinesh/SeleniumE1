package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontalScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();//to launch the browser
		//driver.manage().window().maximize();//to maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//to provide implicit wait
		driver.get("http://omayo.blogspot.com/");//to launch the web Application
		
		JavascriptExecutor js =(JavascriptExecutor)driver;//to typecast from webDriver to JavaScriptExecutor
		js.executeScript("window.scrollBy(200,0)");//to perform scroll right operation
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-200,0)");//to perform scroll left operation

	}

}
