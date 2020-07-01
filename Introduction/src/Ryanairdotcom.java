import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.*;

public class Ryanairdotcom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://www.ryanair.com/gb/en");
		driver.findElement(By.id("input-button__departure")).click();
		driver.findElement(By.id("input-button__departure")).clear();
		driver.findElement(By.id("input-button__departure")).sendKeys("trev");
		driver.findElement(By.xpath("//span[contains(text(),'Venice Treviso')]")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//div[@class='actions']/button)[2]")).click();
		driver.findElement(By.xpath("//hp-airport-item[2]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();
		Thread.sleep(2000); 

		for(int i=1; i<5; i++) {
			System.out.println("sem notri");

			driver.findElement(By.xpath("//ry-counter[1]//div[2]//div[3]//ry-counter-button[1]")).click();

		}
		
		


		//Thread.sleep(2000); 
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mumb");
		//Thread.sleep(2000); 
		//driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();

		

	}

}
