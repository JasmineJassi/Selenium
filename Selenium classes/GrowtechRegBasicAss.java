import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class GrowtechRegBasicAss {

	public static void main(String[] args) {
		
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		
		driver.manage().window().maximize();
		//username
		driver.findElement(By.name("your-name")).sendKeys("Jasmine N");
		//Password
		driver.findElement(By.name("Password")).sendKeys("Password");
		//Hint
		driver.findElement(By.id("2")).sendKeys("Welcome to Growtechmind");
		//Your First name
		driver.findElement(By.id("4")).sendKeys("Jasmine");
		//Your Last name
		driver.findElement(By.id("5")).sendKeys("N");
		//Who Are You
		driver.findElement(By.name("radio-45")).click();
		//checkbox-Are you ready to relocate to bangalore?
		driver.findElement(By.name("checkbox-833[]")).click();
		//submit button
		//driver.findElement(By.className("wpcf7-form-control wpcf7-submit has-spinner btn btn-default")).click();
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
