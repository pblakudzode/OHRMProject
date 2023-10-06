package KeyWords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Wait extends BrowserUtil{
	
	public static void ImplicitlyWait(int Time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));
	}
	public static void ExpliciltyWait(By element) {
		FluentWait wait= new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public static void ThreadSleep(int second) throws InterruptedException {
		Thread.sleep(second);
	}
}