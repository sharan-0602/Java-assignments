package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show']) [2]")).click();
		Alert ConfirmAlert=driver.switchTo().alert();
		String text = ConfirmAlert.getText();
		System.out.println(text);
		ConfirmAlert.accept();
		
	}

}
