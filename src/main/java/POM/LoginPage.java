package POM;

import org.openqa.selenium.By;

import KeyWords.BrowserUtil;
import KeyWords.UIkeywords;
import KeyWords.Wait;
import Util.Proputil;

public class LoginPage extends Proputil{
	
	public static void ValidUserNamePassword() {
		Wait.ExpliciltyWait(By.xpath(Proputil.getObjectFromRepo("username")));
		UIkeywords.SendKeys(By.xpath(Proputil.getObjectFromRepo("username")), Proputil.getUserAndPassword("ValidUserName"));
		Wait.ExpliciltyWait(By.xpath(Proputil.getObjectFromRepo("password")));
		UIkeywords.SendKeys(By.xpath(Proputil.getObjectFromRepo("password")),Proputil.getUserAndPassword("ValidPassword"));
	}

	public static void INValidUserNamePassword() {
		Wait.ExpliciltyWait(By.xpath(Proputil.getObjectFromRepo("username")));
		UIkeywords.SendKeys(By.xpath(Proputil.getObjectFromRepo("username")), Proputil.getUserAndPassword("InValidUserName"));
		Wait.ExpliciltyWait(By.xpath(Proputil.getObjectFromRepo("password")));
		UIkeywords.SendKeys(By.xpath(Proputil.getObjectFromRepo("password")),Proputil.getUserAndPassword("InValidPassword"));
	}

	public static void ClickOnLoginBtn() {
		Wait.ExpliciltyWait(By.xpath(Proputil.getObjectFromRepo("LoginButton")));
		UIkeywords.ClickMe(By.xpath(Proputil.getObjectFromRepo("LoginButton")));
	}

	public static void ClickOnLogOutBtn() {
		Wait.ExpliciltyWait(By.xpath(Proputil.getObjectFromRepo("LogOutTab")));
		UIkeywords.ClickMe(By.xpath(Proputil.getObjectFromRepo("LogOutTab")));
		Wait.ExpliciltyWait(By.xpath(Proputil.getObjectFromRepo("LogOutBtn")));
		UIkeywords.ClickMe(By.xpath(Proputil.getObjectFromRepo("LogOutBtn")));
	}

}
