
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMIxKWj87CRgQMVYQ17Bx23LgcvEAAYASAAEgLZHPD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@name='google-register']")).click();
		System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());
		Set<String> ParentAndChild=driver.getWindowHandles();
		System.out.println(ParentAndChild);
		
		Iterator<String> PC=ParentAndChild.iterator();
		String ParentID=PC.next();
		String ChildID=PC.next();
		Thread.sleep(3000);
	driver.switchTo().window(ChildID);
	Thread.sleep(3000);
	driver.findElement(By.id("identifierId")).sendKeys("Jasmine@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='Next']")).click();
	Thread.sleep(3000);
	driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(ParentID);
		Thread.sleep(3000);
	    driver.close();
		//driver.quit();  */
		
		//driver.findElements("C:\Users\Jasmine\Documents\\GroTechMinds File Upload pdf.pdf);
	
	}

}
