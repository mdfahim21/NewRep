package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fahim {
 
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https:www.Facebook.com");
		
		String title = driver.getCurrentUrl();
				
			
	}
	

}
