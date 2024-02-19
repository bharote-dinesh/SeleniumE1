package locators;

import org.bouncycastle.crypto.generators.BaseKDFBytesGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement passTextBox = driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
		passTextBox.sendKeys("Rohit");
		

	}

}
