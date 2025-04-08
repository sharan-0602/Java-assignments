package week4.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void login() {
	
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	}
