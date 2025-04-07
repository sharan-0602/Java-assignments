package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElement {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/)");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		WebElement FromStation = driver.findElement(By.id("txtStationFrom"));
		FromStation.clear();
		FromStation.sendKeys("MAS");
		
		WebElement ToStation = driver.findElement(By.id("txtStationTo"));
		ToStation.clear();
		ToStation.sendKeys("MDU");
		
        WebElement sortOnDateCheckbox = driver.findElement(By.id("chkSelectDateOnly"));
        if (sortOnDateCheckbox.isSelected()) {
            sortOnDateCheckbox.click();
        }
		
        List<WebElement> trainNameElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[2]/td"));
    
        for (int i = 0; i < trainNameElements.size(); i++) {
           String text = trainNameElements.get(i).getText();
           System.out.println(text);
        }

        		
	

	}
}

