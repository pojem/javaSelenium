import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//https://www.selenium.dev/selenium/docs/api/java/

public class testCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.si/");
		String title;
		title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl()); //get current url
		System.out.println(driver.getPageSource()); //print page source
		driver.get("https://www.worldometers.info/coronavirus/?#countries");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close(); //close current browser
		driver.quit(); //close all browsers
				
	}

}
