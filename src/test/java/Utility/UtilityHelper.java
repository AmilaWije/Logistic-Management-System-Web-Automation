package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UtilityHelper {

	private static UtilityHelper utilityHelper;

	private UtilityHelper() {
	}

	public static UtilityHelper getUtilityHelper() {

		utilityHelper = new UtilityHelper();
		return utilityHelper;
	}
	
	
	
	public static void verifyTable(String idName) {
		try{
		WebDriverWait wait = new WebDriverWait(WebDriverHelper.getWebDriver(), 30);
		WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idName)));
		}
		catch(org.openqa.selenium.NoSuchElementException e){

			scrollPage(WebDriverHelper.getWebDriver().findElement(By.id(idName)));
			WebDriverWait wait = new WebDriverWait(WebDriverHelper.getWebDriver(), 30);
			WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idName)));
		}
	}
	
	
	/***
	 * @author: Amila_Wijerathna
	 * @description: this method use to scroll down the web page until visible of given element
	 */
	public static void scrollPage(WebElement a)
	{
		JavascriptExecutor js = (JavascriptExecutor) WebDriverHelper.getWebDriver();
		WebElement Element = a;
		js.executeScript("arguments[0].scrollIntoView();", Element); 
	}
	

}
