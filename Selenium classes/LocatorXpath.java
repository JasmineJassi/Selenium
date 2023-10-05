import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Jasmine/Downloads/learningHTML1%20(1).html");

	    driver.findElement(By.name("username")).sendKeys("Jasmine");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("(html/body/input)[2]")).sendKeys("Hello");
	    driver.findElement(By.xpath("html/body/form[1]/input[1]")).sendKeys("Jasmine");
	   // driver.findElement(By.name("lname")).sendKeys("XX123");

	   driver.findElement(By.xpath("html/body/form[1]/input[2]")).sendKeys("123xxx");
	   driver.findElement(By.xpath("html/body/form[1]/input[3]")).click();
	    
	
	}

}
