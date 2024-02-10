package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod_ClickMethod_ClearMethod_Submitmethod {
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =	new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://127.0.0.1/login.do;jsessionid=14hfggjl8cj1h");
    WebElement usnTB = driver.findElement(By.name("username"));
    //use sendkeys method to send some in in usernametextbox
    usnTB.sendKeys("Admin");
    Thread.sleep(1000);
    WebElement usnTB1 = driver.findElement(By.xpath("//input[@name='pwd']"));
    usnTB1.sendKeys("manager");
    Thread.sleep(1000);
    
    //use clear methos to remove input from text field
    usnTB.clear();
    Thread.sleep(1000);
    usnTB1.clear();
    
  //  WebElement usnTB2 = driver.findElement(By.partialLinkText("Log"));
   // usnTB2.click();
    
	}

}
