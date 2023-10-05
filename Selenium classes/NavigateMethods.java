import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

}
