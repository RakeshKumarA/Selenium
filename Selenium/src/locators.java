import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ramritku/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("r_akes_h05@yahoo.com"); //by xpath
		//driver.findElement(By.xpath("//*[@id='loginbutton']")).click(); // to click login
		driver.findElement(By.linkText("Forgot account?")).click();  // click the linktext
	}

}
