package KeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Util.Proputil;

public class BrowserOpenAndClose extends BrowserUtil {

	Proputil pro = new Proputil();

	@BeforeMethod
	public void BrowserLaunch() {
		BrowserUtil.BrowserOpen(pro.getObjectFromRepo("BrowserName"));
		BrowserUtil.getURL(pro.getObjectFromRepo("OHRM"));
	}

	@AfterMethod
	public void BrowserTeardown() {
		BrowserUtil.BrowserClose();
	}
}
