package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConst{
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		/*System.setProperty(Chrome_Key, Chrome_value);
		driver = new ChromeDriver();*/
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
@AfterMethod
public void closeapp() {
	//driver.quit();
}
}
