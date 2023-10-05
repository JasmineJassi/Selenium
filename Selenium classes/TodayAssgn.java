import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TodayAssgn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By)
		WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		  
		WebElement Checkbox=driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
				Checkbox.click();
		Thread.sleep(3000);
		boolean check=Checkbox.isSelected();

	System.out.println(check);
	}

}
