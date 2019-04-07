package page.objects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	/* Defining of final values for web paths */
	private static final String LOGUSERNAME = "//input[@placeholder='username']";
	private static final String LOGPASSWORD = "//input[@placeholder='password']";
	private static final String LOGINBUTTON = "//input[@value='Log in']";
	private static final String LOGOUTBUTTON = "//a[@id='logoutBtn']";

	/* User Login */
	public static WebElement getLogUsername(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGUSERNAME));
		return wb;
	}

	public static void clickLogUsername(WebDriver driver) {
		getLogUsername(driver).click();

	}

	public static void SendKeysLogUsername(WebDriver driver, String str) {
		getLogUsername(driver).sendKeys(str);
	}

	/* User Password */
	public static WebElement getLogPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGPASSWORD));
		return wb;
	}

	public static void clickLogPassword(WebDriver driver) {
		getLogPassword(driver).click();

	}

	public static void SendKeysLogPassword(WebDriver driver, String str) {
		getLogPassword(driver).sendKeys(str);
	}

	/* Login Confirm */
	public static WebElement getLoginButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGINBUTTON));
		return wb;
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();

	}

	/* User Logout */
	public static WebElement getLogoutButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGOUTBUTTON));
		return wb;
	}

	public static void clickLogoutButton(WebDriver driver) {
		getLogoutButton(driver).click();

	}
}
