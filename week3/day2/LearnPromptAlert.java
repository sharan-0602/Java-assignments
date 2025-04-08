package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//span[text() = 'Show'])[5]")).click();
	Alert ConfirmAlert = driver.switchTo().alert();
	String text = ConfirmAlert.getText();
	ConfirmAlert.sendKeys("Saranya");
	String text1 = ConfirmAlert.getText();
	System.out.println("The typed name is: "+ text1);
	ConfirmAlert.accept();
	
	
		
		
	}

}
