package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		System.out.println(driver.getPageSource());
		driver.close();
		

	}

}
