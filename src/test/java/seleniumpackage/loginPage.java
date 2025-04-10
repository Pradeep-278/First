package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {

	public static void main(String[] args) throws Exception  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Tom");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Man");
		//Day Selection
		WebElement day = driver.findElement(By.xpath("//Select[@id=\"day\"]"));
		Select date = new Select(day);
		date.selectByIndex(26);
		//Month Selection
		WebElement months = driver.findElement(By.xpath("//Select[@id=\"month\"]"));
		Select month = new Select(months);
		month.selectByIndex(7);
		// Year Selection 
		WebElement years = driver.findElement(By.xpath("//Select[@id=\"year\"]"));
		Select year = new Select(years);
		year.selectByValue("2000");
		
		//Select Gender
		driver.findElement(By.cssSelector("input[value='2']")).click();
		//Email
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("new@gmail.com");
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("7676R3");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	
		
		
	}

}
