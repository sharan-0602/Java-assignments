package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Click on flight link		
driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

//Get the address of all open windows
Set<String> windowHandles = driver.getWindowHandles();
System.out.println("Address of all open windows"+windowHandles);

//Convert set into list
List<String> allWindows = new ArrayList<String>(windowHandles);
System.out.println("The list are: "+allWindows);

//Transfer the focus to child window
driver.switchTo().window(allWindows.get(1));
//Get title of child
String TitleOfChild = driver.getTitle();
System.out.println(TitleOfChild);

//Transfer the focus to parent window
driver.switchTo().window(allWindows.get(0));
driver.close();
		
	}

}
