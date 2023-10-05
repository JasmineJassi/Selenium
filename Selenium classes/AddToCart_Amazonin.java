import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddToCart_Amazonin {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("9182046015");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Amazon@12345");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(1000);
		WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[.='Mens Shuttle Walking Shoe']")).click();
		
		
		Set<String> ParentandChild=driver.getWindowHandles();
		Iterator<String> PC1=ParentandChild.iterator();
		Thread.sleep(1000);
		String Addtocart=PC1.next();
		String Buynow=PC1.next();
		Thread.sleep(1000);
		driver.switchTo().window(Buynow);
		driver.findElement(By.id("buy-now-button")).click();
		
		//driver.findElement(By.id("pp-1wKp8F-101")).click();
		
		//driver.findElement(By.xpath("//span[.='Cash on Delivery/Pay on Delivery']")).click();
		//driver.findElement(By.id("pp-cjBG5E-133")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")).click();
		//driver.findElement(By.id("bottomSubmitOrderButtonId")).click();
		driver.findElement(By.xpath("//input[@name='placeYourOrder1']")).click();
	/*driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/span[1]/span[1]/input[1]")).click();
		/*Set<String> ProceedBtn=driver.getWindowHandles();
		Iterator<String> PB=ParentandChild.iterator();
		String Main=PB.next();
		String ProceedPg=PB.next();
		driver.switchTo().window(ProceedPg);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby=('attach-sidesheet-checkout-button-announce')")).click();
		*/
		
	}

}
