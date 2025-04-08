package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNGAnnotation {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
//2.   - Click on the toggle menu button from the left corner  
//Step1 - Create Object for action class
//Actions act = new Actions(driver);
//Step2 - Find element
//WebElement ToggleBar =
driver.findElement(By.xpath("//button[@class=\"slds-button slds-context-bar__button slds-icon-waffle_container slds-show\"]")).click();
//Step3 - Perform Action class
//act.moveToElement(ToggleBar).perform();

//Step4 - View all and search Legal entities
driver.findElement(By.xpath("//input[@class=\"slds-input\"]")).sendKeys("Legal entities");
driver.findElement(By.xpath("//p[@class=\"slds-truncate\"]")).click();
//Click on new entity
driver.findElement(By.xpath("//div[text()='New']")).click();
//Enter Legal entity name
driver.findElement(By.className("slds-input")).sendKeys("TestLeaf");

//Click on Status button
//driver.findElement(By.xpath("//button[@class=\"slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value\"]")).click();
//boolean Status = driver.findElement(By.xpath("//button[@class=\"slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value\"]")).isSelected();
//if(Status==true) {
	
//}

//Click on Save button
driver.findElement(By.xpath("//button[text()='Save']")).click();


	}

}
