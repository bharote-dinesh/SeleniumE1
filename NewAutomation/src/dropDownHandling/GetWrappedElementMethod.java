package dropDownHandling;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/New%20folder/wcse2workspace/DropDownButoonMultiple.html");
		
		// To locate the dropdown and store it in a variable
		WebElement multiSelect = driver.findElement(By.name("menu"));
		
		Select sel=new Select(multiSelect);
		WebElement elements = sel.getWrappedElement();
	    String textOptions = elements.getText();
	    System.out.println(textOptions);
	
		

	}

}
