import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,1);

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();// maximize window
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html"); // url
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}
