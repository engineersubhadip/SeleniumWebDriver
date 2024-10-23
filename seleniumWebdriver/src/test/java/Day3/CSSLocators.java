package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize(); // maximize the browser window
		
		driver.findElement(By.cssSelector("input.form-control-lg")).sendKeys("Laptop"); // entering "Laptop" in the search box
		
		
		
	}

}
