package dropDownHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import locators.CssSlectorLoctor;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/New%20folder/wcse2workspace/DropDownButoonMultiple.html");
		
		// To locate the dropdown and store it in a variable
		WebElement multiSelect = driver.findElement(By.name("menu"));
		
		Select sel=new Select(multiSelect);
		
		for(int i=0;i<=7;i++)
		{
			sel.selectByIndex(i);
			
		}
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		for(WebElement we:allOptions)
		{
			String selectedOptions = we.getText();
			System.out.println(selectedOptions);
		}
		

	}

}
