import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_Xpath {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		//Launch google and search for India using relative Xpath
		
		//driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[1]")).sendKeys("India");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("India");
		
		
		
		// click on Gmail link using Relative Xpath
		//driver.findElement(By.xpath("(/html/body/div/div[1]/div/div/div/div/div/div/a)[1]")).click();
		
		driver.findElement(By.xpath("(//a[@class='gb_y'])[1]")).click();
		
		
		

	}

}
