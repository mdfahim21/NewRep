package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
			driver.manage().window().maximize();
			WebElement email = driver.findElement(By.id("email_create"));
		    email.sendKeys("shamma786@gmail.com");
		    
      	driver.findElement(By.id("SubmitCreate")).click();
	

	   Thread.sleep(10000);
	  WebElement a= driver.findElement(By.id("customer_firstname"));
	  a.sendKeys("rishi");
		
	
	
	}

}
