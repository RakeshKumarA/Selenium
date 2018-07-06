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
		//driver.findElement(By.linkText("Forgot account?")).click();  // click the linktext
		//driver.findElement(By.xpath("xpath")).getText()         // to get text displayed on the web page
		// for validating, we can just use $x("x-path") or $("css-locator")
		
		/*
		 customized xpath:
		 if the below is the html that is highlighted
		 
		 <input type="email" class="inputtext" name="email" id="email" tabindex="1" data-testid="royal_email">
		  Then xpath is created by
		  
		  //TagName[@attribute='Value']
		  
		  //input[@id="email"]
		   
		   CSS is created as below.
		   
		   input[id="email"]
		   
		   if there is id in the html, then we can have CSS as TagName#id
		   if there is class name in the html, then we can have CSS as TagName.classname
		   
		   XPATH using Regex
		   //TagName[contains(@attribute,'Value')]
		   
		  
		  
		  
		  
		 */
	}

}
