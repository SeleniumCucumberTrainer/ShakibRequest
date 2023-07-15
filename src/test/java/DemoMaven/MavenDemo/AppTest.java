package DemoMaven.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	
	@Test
	public void test(){

		String path = System.getProperty("user.dir");
		System.out.println(path);
		//home/ubuntu/akhilesh/ShakibRequest
		///src/test/java/DemoMaven/MavenDemo/AppTest
		//System.setProperty("webdriver.chrome.driver", "Test\\MavenDemo\\Driver\\chromedriver.exe");
	     System.setProperty("webdriver.chrome.driver", "//Driver//chromedriver.exe");
		
		System.out.println("Hi Java Maven");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/in/home");
		
	}
	

	
 
}
