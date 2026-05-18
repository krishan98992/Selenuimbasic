import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

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
		Set<String> window=driver.getWindowHandles(); //Parent and child window
	     Iterator<String> it= window.iterator();
	     String parentid=it.next();
	     String childid=it.next();
	     System.out.println(childid);
	     driver.switchTo().window(childid);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
	     		System.out.println(emailid);
	     		
	     		driver.switchTo().window(parentid);
	     		driver.findElement(By.id("username")).sendKeys(emailid);
	     		
	    
		}

}
