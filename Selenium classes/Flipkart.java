import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch Flipkart from guest mode and enter mobile number ,click request OTP and close login popup using relative xpath

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Enter Email/Mobile number']")).sendKeys("9182046015");
		driver.findElement(By.xpath("//button[.='Request OTP']")).click();
		driver.findElement(By.xpath("//span[@role='button']")).click();
	}

}
