package KeyWords;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	public static RemoteWebDriver driver;
	public static void BrowserOpen(String BrowserName) {
		
		if(BrowserName.equals("Chrome")) {
			ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			System.out.println(BrowserName+"Browser Launched Sucessfully");
		}
		else if(BrowserName.equals("Edge")) {
			EdgeOptions option = new EdgeOptions();
            option.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(option);
			driver.manage().window().maximize();
			System.out.println(BrowserName+"Browser Launched Sucessfully");
		}
		else if(BrowserName.equals("FireFox")) {
			FirefoxOptions option = new FirefoxOptions();
            option.addArguments("--remote-allow-origins=*");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(option);
			driver.manage().window().maximize();
			System.out.println(BrowserName+"Browser Launched Sucessfully");
		}
		else {
			ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Default Browser Launched Sucessfully ");
		}
	}
	public static void BrowserClose() {
		driver.quit();
	}
	public static void getURL(String EnterURL) {
		driver.get(EnterURL);
	}
}
