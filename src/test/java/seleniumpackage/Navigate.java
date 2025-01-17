package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.navigate().to("https://www.selenium.dev/");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	   
	    	
	}
}
