package week3.day4;

import java.time.Duration;
import java.util.List;

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

//5. Click on Training shoes

driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

//6.Sort the products by low to high - Drop down select - need to learn
//List<WebElement> sort_options = driver.findElements(By.xpath( "//ul[@class='sort-value']//li"));
//7. Check if the displayed items are sorted correctly. 
//8. Select any price range ex:(500-700). 

WebElement fromTxtBox = driver.findElement(By.xpath("//div[@class='price-text-box']//child::input[1]"));
fromTxtBox.clear();
fromTxtBox.sendKeys("500");

WebElement toTxtBox = driver.findElement(By.xpath("//input[@name=\"toVal\"]"));
toTxtBox.clear();
toTxtBox.sendKeys("700");

driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();

//9. Filter by any colour. 
driver.findElement(By.xpath("//span[@class=\"filter-color-tile White&Blue \"]")).click();

//10. Verify all the applied filters. 
//11. Mouse hover on the first resulting "Training Shoes". 





			
	}

}
