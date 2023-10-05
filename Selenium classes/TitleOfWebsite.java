import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfWebsite {

	public static void main(String[] args) 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		String Title=d1.getTitle();
		System.out.println(Title);
		
		d1.get("https://www.facebook.com/");
		String Title1=d1.getTitle();
		System.out.println(Title1);
		
		d1.get("https://www.selenium.dev/");
		String Title2=d1.getTitle();
		System.out.println(Title2);
		
		d1.close();
		//d1.quit();
	}

}
