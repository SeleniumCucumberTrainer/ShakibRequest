package DemoMaven.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	
	@Test
	public void test(){

		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+"\\Test\\MavenDemo\\Driver\\chromedriver.exe");
		
		System.out.println("Hi Java Maven");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/in/home");
		
	}
	

	
 
}
