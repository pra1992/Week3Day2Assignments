package wek3.day2assignments;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramToImplementKList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		
		Actions actions= new Actions(driver);
	WebElement menCheckBox=	driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
	WebElement menFashonBags=	driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
	
	actions.moveToElement(menCheckBox).click().build().perform();
	actions.moveToElement(menFashonBags).click().build().perform();
		String totalItemLabel=driver.findElement(By.xpath("//div[@class=' filter-container']//div[@class='length']")).getText();
		String[] totalItemLabelSplit= totalItemLabel.split("\\ ");
		System.out.println(totalItemLabelSplit[0]);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='contentHolder']//div[@class='brand']"));
		for(int i=0; i<(list.size())-1; i++){
			System.out.println(list.get(i).getText());
		}
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='contentHolder']//div[@class='nameCls']"));
		for(int i=0; i<(list1.size())-1; i++){
			System.out.println(list1.get(i).getText());
		}
		driver.close();
		
		

	}

}
