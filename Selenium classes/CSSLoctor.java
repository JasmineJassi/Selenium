import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLoctor {

	public static void main(String[] args) {
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.in/");
		driver.manage().window().maximize();
		//Css using Tagname#id
		WebElement Search=driver.findElement(By.cssSelector("textarea#APjFqb"));
		Search.sendKeys("Jasmine");
		Search.sendKeys(Keys.ENTER);
		
		

	}

}
