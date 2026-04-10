import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement move=driver.findElement(By.cssSelector("div[id='nav-link-accountList']"));
        Actions action=new Actions(driver);
        //to specific element
      
		action.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).doubleClick().sendKeys("mobile").build().perform();
		//selecting the word "mobile" in capital letter and then double click of mouse to 
		/*cancatting action . composite action
		 */
		  action.moveToElement(move).build().perform();
		  
		  /*want to right click on above element */
		  action.moveToElement(move).contextClick().build().perform();
	        

	}

}
