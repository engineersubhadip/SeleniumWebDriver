package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
//		NAME Attribute :-
		
//		WebElement searchBox = driver.findElement(By.name("search"));
//		
//		searchBox.sendKeys("MacBook");
		
		driver.findElement(By.name("search")).sendKeys("MacBook"); // single line 
		
		
//		ID Attribute :-
		
		boolean flag = driver.findElement(By.id("logo")).isDisplayed();
		
		System.out.println(flag);
	}

}
