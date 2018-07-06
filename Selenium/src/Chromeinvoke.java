import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeinvoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ramritku/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
