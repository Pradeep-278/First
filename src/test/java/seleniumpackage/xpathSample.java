package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathSample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.heroku.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("First Name");
		driver.findElement(By.xpath("//input[@class='required'][@name='last_name']")).sendKeys("Last Name");
		driver.findElement(By.xpath("//input[contains(@required,'required')][@name='email']")).sendKeys("sample@gmail.com");
		

	}

}
