import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		String T=d1.getWindowHandle();
		System.out.println(T);
		System.out.println(d1.getWindowHandles());
	}

}
