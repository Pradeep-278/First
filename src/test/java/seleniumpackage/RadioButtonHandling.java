package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/prade/OneDrive/Documents/GUVI/Automation/File/PracticeRadioButton.html");
		driver.manage().window().maximize();
	    Thread.sleep(3000);

		List<WebElement> radio = driver.findElements(By.xpath("//form/label"));
		System.out.println("Total Butoons:" + radio.size());		
		driver.findElement(By.xpath("//input [contains (@value, 'apple')]")).click();
		System.out.println(radio.get(0).isEnabled());
		System.out.println(radio.get(0).isDisplayed());
		System.out.println(radio.get(0).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [contains (@value, 'banana')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [contains (@value, 'orange')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [contains (@value, 'grape')]")).click();
		Thread.sleep(3000);

		List<WebElement> radio = driver.findElements(By.xpath("//form/label"));
		String ExpectedResult = "Apple";
		for (int i=0; i<radio.size(); i++)
		{
			if(radio.get(i).getText().equals(ExpectedResult)) {
					radio.get(i).click();
					System.out.println(ExpectedResult +"Clicked");
					break;
			
				
			}
		
		}
}
}
