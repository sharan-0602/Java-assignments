package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksinWebpage {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//return all the elements in a page
		List<WebElement> findelement =   driver.findElements(By.tagName("a"));
		System.out.println(findelement);
		
		
	}

}
