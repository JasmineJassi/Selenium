import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login");

		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Jasminen@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("QWERT123");
		driver.findElement(By.id("loginbutton")).click();
}

}
