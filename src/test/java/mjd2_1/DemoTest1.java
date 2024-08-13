package mjd2_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest1 {
	@Test
	public void demoTest1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("Launching Browser");
		driver.manage().window().maximize();
		System.out.println("Opening Microsoft");
		driver.get("https://www.microsoft.com/en-in/");
		System.out.println("Closing Browsing");
		//closing current browser
		driver.close();
		
	}
}
