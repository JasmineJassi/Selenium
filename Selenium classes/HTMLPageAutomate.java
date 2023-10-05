import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HTMLPageAutomate {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/Jasmine/Downloads/learningHTML1%20(1).html");
		
		driver.switchTo().alert().dismiss();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='1']")).sendKeys("Jasmine");
		driver.findElement(By.xpath("//input[@id='2']")).sendKeys("Hello,Learn Locating elements");
		driver.findElement(By.xpath("//input[@id='3']")).sendKeys("Ax123");
		driver.findElement(By.xpath("//body/form[1]/input[1]")).sendKeys("Nathad");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//body/form[1]/input[2]")).sendKeys("Jasmine");
		
		driver.findElement(By.xpath("//body/form[2]/input[2]")).click();
		driver.findElement(By.xpath("//body/input[5]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/input[6]")).click();
		driver.findElement(By.xpath("//select[@id='Relegion']")).click();
		
		
		
		

	}

}
