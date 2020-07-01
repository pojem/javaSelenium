import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e_test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();// maximize window
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); // url
		
		List<WebElement> products  = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(products.size());
		
		String[] itemsNeeded = {"Tomato","Brinjal"}; // this is array 

		List al = Arrays.asList(itemsNeeded); 

		
		
		for (int i=0; i<products.size();i++) {
			
			String[] item = products.get(i).getText().split("-");
			String formatedItem = item[0].trim();
			System.out.println(formatedItem);
			
			if(al.contains(formatedItem)) {
				
				driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
				System.out.println("dela");
				
							}

			

			
			
			
		}

	}

}