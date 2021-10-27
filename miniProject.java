package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class miniProject {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fahim\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
			driver.manage().window().maximize();
			WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("shamma786@gmail.com");
	driver.findElement(By.id("SubmitCreate")).click();
	
	Thread.sleep(10000);
	
		driver.findElement(By.name("customer_firstname")).sendKeys("fahim");
					driver.findElement(By.id("customer_lastname")).sendKeys("Akthar");
			driver.findElement(By.id("password")).sendKeys("Sabakarim@21");
			WebElement date = driver.findElement(By.id("days"));
			Select da = new Select (date);
			da.selectByValue("08");
			
			WebElement month = driver.findElement(By.id("months"));
	Select mn = new Select(month);
	mn.selectByIndex(1);
	 
	WebElement year =driver.findElement(By.id("year"));
	Select yr = new Select(year);
	yr.selectByValue("1989");
	
	driver.findElement(By.id("uniform_newsletter")).click();
	driver.findElement(By.id("uniform-option")).click();
	driver.findElement(By.id("company")).sendKeys("CAMS");
	
	driver.findElement(By.id("address1")).sendKeys("chennai");
	driver.findElement(By.id("address2")).sendKeys("Mathur");
	driver.findElement(By.id("city")).sendKeys("chennai");
	
	WebElement state = driver.findElement(By.id("id_state"));
	Select st= new Select(state);
	st.selectByIndex(3);
	
	driver.findElement(By.id("postcode")).sendKeys("74074");
	driver.findElement(By.id("other")).sendKeys("we launching the project");
	driver.findElement(By.id("phone")).sendKeys("9940159144");
	
	driver.findElement(By.id("phone_mobile")).sendKeys("9940159144");
	driver.findElement(By.id("alias")).sendKeys("chennai");
	driver.findElement(By.xpath("//button@name='Submitaccount']")).click();
				
			
	
}}
