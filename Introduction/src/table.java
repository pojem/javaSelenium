import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();// maximize window
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // url
		int sum = 0;
		WebElement table = driver.findElement(By.id("product"));
		int size = table.findElements(By.tagName("tr")).size();
		System.out.println(size);
		for(int row=2; row<size;row++) {
			for (int col=1; col<4;col++) {
				
				if(row==3) {
				
				String path = String.format("//table[@class='table-display']/tbody/tr[%s]/td[%d]", row, col);
				System.out.println(driver.findElement(By.xpath(path)).getText());
				}
	
			}
			
		}	
		
	}

}
