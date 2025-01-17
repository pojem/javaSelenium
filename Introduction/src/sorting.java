import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sorting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		System.out.println(driver.findElements(By.tagName("tr")).size());
		
		/*retrive all values of fruit name column
		
		ArrayList-
		3124
		
		ArrayList2 3124 - sort
		1234
		
		ArrayList2 sorted
			
		*/
		List<WebElement> firstColList = driver.findElements(By.cssSelector("td:nth-child(2)"));
		System.out.println(firstColList.get(1).getText());
		
		ArrayList<String> originalList=new ArrayList<String>(); //create string list
		
		
		System.out.println(firstColList.size());
		//driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();

		for(int i=0;i<firstColList.size();i++) {
			
			originalList.add(firstColList.get(i).getText()); //add elements in string
		}
		
		ArrayList<String> copiedList = new ArrayList<String>(); 
		
		for (int i=0;i<originalList.size();i++) {
			
			copiedList.add(originalList.get(i));
		}
			
		Collections.sort(copiedList); //////////// SORT ARRAY
		
		for(String s: originalList) { ////////////////////!!!!!!!!!!!!! print element from array list
			
			System.out.println(s);
			///// trick sysout (ctrl+space) and you get System.out.println(s);
		}

		System.out.println("###########################");
		
		for(String s: copiedList) { ////////////////////!!!!!!!!!!!!! print element from array list
			
			System.out.println(s);
			///// trick sysout (ctrl+space) and you get System.out.println(s);
		}
		
		Assert.assertTrue(originalList.equals(copiedList));
		
			
		}
		


		
	

}
