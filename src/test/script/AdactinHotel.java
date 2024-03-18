package test.script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement userName =  driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','durga565')",userName);
		String usertxt = userName.getAttribute("value");
		System.out.println(usertxt);
		
		WebElement txtpass = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','7236458')",txtpass);
		String passtxt = txtpass.getAttribute("value");
		System.out.println(passtxt);
		
		WebElement logIn = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()",logIn);
		
		
		
	}
}
