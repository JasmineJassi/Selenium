import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown_Printalltheoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ClickDrop=driver.findElement(By.id("searchDropdownBox"));
		ClickDrop.click();
		Select s=new Select(ClickDrop);
		List<WebElement> options=s.getOptions();
		int count=options.size();
		System.out.println(count);
		
		for(int i=1;i<count;i++)
		{
			WebElement o1=options.get(i);
			String Components_Dropdown=o1.getText();
			System.out.println(Components_Dropdown);
			
		}
	}

}
