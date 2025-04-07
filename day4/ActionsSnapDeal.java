package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapDeal {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//2. Go to Men's Fashion

		//Step1: Create Object for Actions Class
				Actions act=new Actions(driver);
				
				//Step2: Finding the WebElement
				WebElement mouseHoverElement = driver.findElement(By.xpath("//span[contains(text(), 'Men')]"));
				
				//Step3: Use the method - moveToElement(Actions Class)
				act.moveToElement(mouseHoverElement).perform();
//3. Go to sports shoes
			driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
//4. To get the total number of counts
WebElement toalShoeCount = driver.findElement(By.xpath("//h1[contains(text(), 'Sports Shoes for Men')]/following-sibling::span"));
String text = toalShoeCount.getText();
System.out.println("Total sports shoe count :"+ text);
			
	}

}
