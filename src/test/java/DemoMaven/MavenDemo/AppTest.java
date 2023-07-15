package DemoMaven.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	
	@Test
	public void test(){

		//String path = System.getProperty("user.dir");
		//home/ubuntu/akhilesh/ShakibRequest
		//System.setProperty("webdriver.chrome.driver", "Test\\MavenDemo\\Driver\\chromedriver.exe");
	     System.setProperty("webdriver.chrome.driver", "//home//ubuntu//akhilesh//ShakibRequest//Driver//chromedriver.exe");
		
		System.out.println("Hi Java Maven");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/in/home");
		
	}
	

	
 
}
