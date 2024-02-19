package assignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.bouncycastle.mime.MimeWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Blueshone {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		WebElement coin = driver.findElement(By.xpath("//a[text()='Coins ']"));
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		Actions act =new Actions(driver);
		//act.moveToElement(coin).perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Not now']")).click();
		act.moveToElement(coin).perform();
		driver.findElement(By.xpath("//span[text()='1 gram']")).click();
		
		WebElement goldcoin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		boolean goldpage = goldcoin.isDisplayed();
		System.out.println(goldpage);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/gold.png");
		
		Files.copy(src, dest);
		
		
		
		
		
	







	}

}
