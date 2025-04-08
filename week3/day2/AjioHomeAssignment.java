package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioHomeAssignment {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.xpath("//button[@class=\"_8UwPH gKgxE aPHb5 XVgqV\"]")).click();
		WebElement search = driver.findElement(By.xpath("//input[@name=\"searchVal\"]"));
		search.sendKeys("Bags");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
       
Thread.sleep(3000);

		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();

//Get the total number of bags
String NumberOfBags = driver.findElement(By.xpath("//div[@class='length']")).getText();
System.out.println("Total number of bags"+ NumberOfBags);

List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
int sizeOfBrand = brand.size();
System.out.println("The total number of size: "+sizeOfBrand);

List<String> brandStrings = new ArrayList<String>();
for (int i = 0; i < sizeOfBrand; i++) {
	String textOfBrand = brand.get(i).getText();
	brandStrings.add(textOfBrand);
	System.out.println("The List of Brands : "+brandStrings);

}


				
		
		
	}

}
