import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoeAss {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("s-image")).click();  
		
		//Assignment-2  Click on Mobiles using Linktext or partial linktext
		//driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.partialLinkText("Mobi")).click();
		
		
		

	}

}
