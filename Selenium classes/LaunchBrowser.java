//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args)
	{
		
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		
		String Title=d1.getTitle();
		System.out.println(Title);
		d1.quit();
		

		/*EdgeDriver E1=new EdgeDriver();
		E1.get("https://www.amazon.com/");
		String Title=E1.getTitle();
		System.out.println(Title);
		E1.close();*/
		


}

}
 