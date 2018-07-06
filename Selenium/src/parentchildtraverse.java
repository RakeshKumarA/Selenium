import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parentchildtraverse {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/ramritku/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input")).sendKeys("r_akes_h05@yahoo.com"); //Find email using parent child relationship
		//driver.findElement(By.xpath("//tbody/tr[2]/td[1]/following-sibling::td[2]/input")).sendKeys("1234"); // Find email using parent child
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input")).sendKeys("1234"); // Find email using parent child
	}

}
