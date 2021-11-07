package JenkinsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Firstlogin {
	
@Test
	public void login() throws Exception {
		
		WebDriverManager.chromedriver().setup();;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("www.youtube.com");
		
		driver.findElement(By.name("email")).sendKeys("automation");
		driver.findElement(By.name("login")).click();
Thread.sleep(3000);

driver.quit();
		

		
	}
}
	
	
