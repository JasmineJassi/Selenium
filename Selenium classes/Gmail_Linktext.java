import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Linktext {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("Gmail")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
	}
}
