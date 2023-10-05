import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AnotherWay2LaunchBrowser {
static WebDriver driver;
	static public void chrome()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement S1=driver.findElement(By.id("APjFqb"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		S1.sendKeys("India");
		S1.sendKeys(Keys.ENTER);
		driver.close();
	}
	
	static public void edge()
	{
		 driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		
		WebElement S1=driver.findElement(By.id("APjFqb"));
		S1.sendKeys("France");
		S1.sendKeys(Keys.ENTER);
		driver.close();
	}
	static public void firefox()
	{
		 driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement S1=driver.findElement(By.id("APjFqb"));
		S1.sendKeys("nepal");
		S1.sendKeys(Keys.ENTER);
		driver.close();
	}
	/*static public void opera()
	{
		 driver=new WebDriver();
		driver.get("https://www.google.com/");
		
		WebElement S1=driver.findElement(By.id("APjFqb"));
		S1.sendKeys("Australia");
		S1.sendKeys(Keys.ENTER);
		driver.close();}*/
	
	public static void main(String[] args) {
		chrome();
		edge();
		firefox();
		//safari();
		System.out.println("Another way to launch browser");
		
	}

}
