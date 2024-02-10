package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValue_GetTagNmeMethod {
	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=Afc-AhxHUGBDDtUKaMK3XA6V-Y9_2aXFsBrI66j1jnD0KUEeRtesDvicGl1O_SbkdxzNhKqIbB1XhswnBP-W6ru9hMOQVdgX32AdWFWu3UW9cQ&smuh=28330&lh=Ac9NjKhCuj1eUa82lUs");
		
		//get the attribute value of username textBox i.e name attribute
		WebElement usnTB = driver.findElement(By.xpath("//input[@name='email']"));
		String attributeValue = usnTB.getAttribute("class");
		System.out.println(attributeValue);
		
		//get the css property of username textbox i.e color 
		String cssValue = usnTB.getCssValue("width");
		System.out.println(cssValue);
	  
		//get the css property of username 
		String cssValue1 = usnTB.getCssValue("height");
	    System.out.println(cssValue1);
		
		//get the tagName of usernameText box
		String tag = usnTB.getTagName();
		System.out.println(tag);
	}

}


