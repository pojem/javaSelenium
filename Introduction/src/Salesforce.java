import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://login.salesforce.com/");
		 * driver.findElement(By.id("username")).sendKeys("hello");
		 * driver.findElement(By.name("pw")).sendKeys("zzzzzz");
		 * driver.findElement(By.id("Login")).click();
		 * System.out.println(driver.findElement(By.id("error")).getText());
		 */
		 driver.get("https://www.rediff.com/");
		 driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
		 System.out.println(driver.findElement(By.cssSelector("input#remember")).isEnabled());
		
	}

}
