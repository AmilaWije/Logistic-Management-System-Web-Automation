package Utility;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WebDriverHelper {
	static WebDriverHelper wHelper;
	public static WebDriver Wdriver, driver;

	


	/***
	 * @author Amila_Wijerathna This is private constructor. It is prevent creating the
	 *         objects in out side.
	 */
	private WebDriverHelper() {
	}

	/***
	 * 
	 * @author Amila_Wijerathna
	 * @param Browser
	 * @param Os
//	 * @param paths
	 * @return
	 * @throws MalformedURLException
	 */
	public static WebDriver startUpWebDriver(String Browser,String Os)
			throws MalformedURLException {
		
		System.out.println("Startup Web Driver Method_______________");
		if (Os.equals("Mac")) {
			if(Browser.equals("Chrome")) {
			System.out.println("Chrome browser identified for Mac");
			System.setProperty("webdriver.chrome.driver", PropertyFileHandler.readProperty("MacPath"));
			Wdriver = new ChromeDriver();

			}
			else if(Browser.equals("Safari"))
			{
				System.out.println("Safari browser identified for Mac");
				Wdriver = new SafariDriver();
			}
		}
		else if (Os.equals("Windows")) {
			if(Browser.equals("Chrome")) {
			System.out.println("Chrome browser identified for Windows");
			System.setProperty("webdriver.chrome.driver", PropertyFileHandler.readProperty("WindowsPath"));
			Wdriver = new ChromeDriver();
		
		}
		}

		Wdriver.manage().window().maximize();
		Wdriver.manage().timeouts().implicitlyWait(ConfigUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		zoomOut(Wdriver, 0.8); // Set zoom level to 80%
		return Wdriver;
	
	}

	public static void zoomOut(WebDriver driver, double zoomLevel) {
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("document.body.style.zoom='" + zoomLevel + "'");
		} else {
			System.out.println("JavaScript execution is not supported in this WebDriver instance.");
		}
	}

	public static WebDriverHelper getWebDriverHelper() {
		if (wHelper == null) {
			wHelper = new WebDriverHelper();
		}
		return wHelper;
	}

	public void enterUrl(String url) throws InterruptedException {
		Wdriver.navigate().to(url);
		Thread.sleep(3000);
	}
	
	public void openURL(String url) throws InterruptedException {
		Wdriver.get(url);
		Thread.sleep(3000);
	}

	public static WebDriver getWebDriver() {
		return Wdriver;
	}

	public void switchWindowByName(String windowName) {
		Wdriver.switchTo().window(windowName);
	}

	public void switchFrame(String frameName) {
		Wdriver.switchTo().frame(frameName);
	}

	public void switchAlert() {

		Alert alert = Wdriver.switchTo().alert();

	}

	public static void setDriver(WebDriver driver) {
		Wdriver = driver;
	}

	public static void teardown() {
		Wdriver.quit();
	}
	
	 /**
		 * @author Amila_Wijerathna
		 * @description: this method use to switch web driver to newly open web tab
		 * 
		 */
	
	 public void switchTab()
	 {
		 String oldTab = Wdriver.getWindowHandle();
		 ArrayList<String> newTab = new ArrayList<String>(Wdriver.getWindowHandles());
		 newTab.remove(oldTab);
		 Wdriver.switchTo().window(newTab.get(0));
	 }
	 
	 /**
		 * @author Amila_Wijerathna
		 * @description: this method use to wait till expected element is visible.
		 * 
		 */
	 public void waitPageLoad(WebElement x)
	 {
		 WebDriverWait wait = new WebDriverWait(Wdriver, 30);
		 wait.until(ExpectedConditions.elementToBeClickable(x));
	 }

	 public void waitElementUntilClickable(WebElement x) {
		 WebDriverWait wait = new WebDriverWait(Wdriver, 30);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(x));
	 }

	 /**
		 * @author Amila_Wijerathna
		 * @description: this method use to wait till  every component in the web page is loaded.
		 * 
		 */
	 
	 public void waitForPageLoad() {

		    Wait<WebDriver> wait = new WebDriverWait(Wdriver, 30);
		    wait.until(new Function<WebDriver, Boolean>() {
		        public Boolean apply(WebDriver driver) {
		            return String
		                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
		                .equals("complete");
		        }
		    });
	 }

}
