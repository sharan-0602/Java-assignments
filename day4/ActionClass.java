package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//Search for oneplus 9pro
WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
Searchbox.sendKeys("oneplus 9pro");

//Click on search icon
Actions act = new Actions(driver);
WebElement Searchicon = driver.findElement(By.id("nav-search-submit-button"));
act.moveToElement(Searchicon).perform();
Searchicon.click();

//Get the price of first shown mobile
WebElement Price = driver.findElement(By.xpath("//span[text()='20,998']"));
String text1 = Price.getText();
System.out.println("Price of mobile: "+text1);

//Get the customer ratings
WebElement CustomerRatings = driver.findElement(By.xpath("//span[text()='5,488'][1]"));
//WebElement CustomerRatings = driver.findElement(By.linkText("a-link-normal s-underline-text s-underline-link-text s-link-style"));
String text2 = CustomerRatings.getText();
System.out.println("Total number of customer ratings: "+ text2);

//Get the link on first shown mobile using action class
Actions mousehover = new Actions(driver);
WebElement element = driver.findElement(By.xpath("//span[text()='OnePlus Nord CE4 Lite 5G (Super Silver, 8GB RAM, 256GB Storage)']"));
mousehover.moveToElement(element).perform();
element.click();

//To get all window address

String windowHandle = driver.getWindowHandle();
System.out.println("Address of parent: "+windowHandle);

//Step1 - To get the address of all window handle
Set<String> WinodwHandles = driver.getWindowHandles();
//Step2 - Convert the set into list
List<String> allWindows = new ArrayList<String>(WinodwHandles);
//Step3 - Transfer the window focus to child window
driver.switchTo().window(allWindows.get(1));
//Step4 - To get the title of child window
String titleOfChild = driver.getTitle();
System.out.println("After Switching: "+titleOfChild);


//6. Take screenshot of first image
// Step1 : Convert WebDriver Object to TakesScreenshot: 

TakesScreenshot scrShot = ((TakesScreenshot)driver);

//Step2: Call getScreenshotAs Method to Create Image File: 

File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

//Step3: Copy File to Desired Location: 
	
File destFile = new File("C:\\Saranya/destination.png"); 
FileUtils.copyFile(srcFile, destFile);

//7. Click on Add to cart button

WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
addToCart.click();

//Get the cart subtotal and verify if it is correct
String price = driver.findElement(By.className("a-price-whole")).getText();
String subtotal = driver.findElement(By.xpath("//span[@class='ewc-subtotal-amount']/h2")).getText();
if (subtotal.contains(price)) {
	System.out.println("Price was Same as Shown");
} else {
	System.out.println("Price was NOT Same");
}



	}

}
