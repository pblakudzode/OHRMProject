package OHRM;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KeyWords.BrowserOpenAndClose;
import KeyWords.BrowserUtil;
import KeyWords.UIkeywords;
import KeyWords.Wait;
import POM.LoginPage;

public class Case_2 extends BrowserOpenAndClose {
	@Test(priority = 0)
	public void LoginWithValidCredentials() throws IOException, InterruptedException {

		LoginPage.ValidUserNamePassword();
		LoginPage.ClickOnLoginBtn();
		UIkeywords.AshotScreenshots("LoginWithValidCredentials");
		LoginPage.ClickOnLogOutBtn();
	}

	@Test(priority = 1)
	public void LoginWithINValidCredentials() throws IOException, InterruptedException {

		LoginPage.INValidUserNamePassword();
		LoginPage.ClickOnLoginBtn();
		UIkeywords.AshotScreenshots("LoginWithINValidCredentials");
	}
}
