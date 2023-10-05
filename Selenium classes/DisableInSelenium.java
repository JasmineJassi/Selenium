import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DisableInSelenium {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("file:///C:/Users/Jasmine/Downloads/learningHTML1%20(1).html");

		driver.manage().window().maximize();
		WebElement Lastname=driver.findElement(By.id("121"));
		boolean list= Lastname.isEnabled();
		System.out.println(list);
	}

}
