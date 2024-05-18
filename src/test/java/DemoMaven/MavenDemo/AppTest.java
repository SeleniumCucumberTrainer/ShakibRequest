package DemoMaven.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	
	
	@Test
	public void test(){

		String path = System.getProperty("user.dir");
		System.out.println(path);
		//home/ubuntu/akhilesh/ShakibRequest
		///src/test/java/DemoMaven/MavenDemo/AppTest
		//System.setProperty("webdriver.chrome.driver", "Test\\MavenDemo\\Driver\\chromedriver.exe");
	     //System.setProperty("webdriver.chrome.driver", path+"//Driver//chromedriver.exe");
		
		System.out.println("Hi Java Maven");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/in/home");
		
	}
	

	
 
}
