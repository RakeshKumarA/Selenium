import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxfirst {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/ramritku/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}
