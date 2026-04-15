import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandler {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		

	}

}
