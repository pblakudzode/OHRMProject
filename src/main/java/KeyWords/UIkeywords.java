package KeyWords;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class UIkeywords extends BrowserUtil {

	public static void ClickMe(By element) {
		driver.findElement(element).click();
	}

	public static void SendKeys(By element, String Text) {
		driver.findElement(element).sendKeys(Text);
	}

	public static void Title(By element) {
		WebElement Title = driver.findElement(element);
		System.out.println(Title);
	}

	public static void AshotScreenshots(String TestCaseName) throws IOException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DDMMYYhhmmss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		String baseDir = System.getProperty("user.dir");

		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot srcshot = ashot.takeScreenshot(driver);
		BufferedImage img = srcshot.getImage();
		ImageIO.write(img, "png", new File(baseDir + "\\Screenshot\\" + TestCaseName + "____" + date + ".png"));
	}

	public static void ParentWindHandle() {

		Set<String> AllWindHadle = driver.getWindowHandles();
		Iterator<String> iterator = AllWindHadle.iterator();
		String ParentWindHandle = iterator.next();
		String ChildHandle = iterator.next();
		driver.switchTo().window(ParentWindHandle);
	}

	public static void ChildWindHandle() {

		Set<String> AllWindHadle = driver.getWindowHandles();
		Iterator<String> iterator = AllWindHadle.iterator();
		String ParentWindHandle = iterator.next();
		String ChildHandle = iterator.next();
		driver.switchTo().window(ChildHandle);
	}

	public static void KeyDown(int EnterDownNumber) throws AWTException {
		Robot robo = new Robot();
		for (int i = 1; i < EnterDownNumber; i++) {
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
		}
	}
}