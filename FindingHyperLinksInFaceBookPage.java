package wek3.day2assignments;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingHyperLinksInFaceBookPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriverManager.chromedriver().setup();
  
  ChromeDriver driver= new ChromeDriver();
  driver.get("https://www.facebook.com/");
  
 int noOfLinks=driver.findElements(By.tagName("a")).size();
 System.out.println(noOfLinks);
 driver.close();
	}

}
