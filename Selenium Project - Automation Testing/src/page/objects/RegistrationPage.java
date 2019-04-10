package page.objects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	/* Defining of final values for user registration page */
	public static final String PAGE_URL = "https://izlet.000webhostapp.com/izlet/index.php";
	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME = "//input[@name='lastname']";
	private static final String REGUSERNAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String REGPASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	private static final String SUBMITBUTTON = "//input[@id='blue_btn']";

	public static void openPage(WebDriver driver) {
		driver.get(PAGE_URL);
	}

	/* First name input */
	public static WebElement getFirstName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(FIRSTNAME));
		return wb;
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();

	}

	public static void SendKeysFirstName(WebDriver driver, String str) {
		getFirstName(driver).sendKeys(str);
	}

	/* Last name input */
	public static WebElement getLastName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LASTNAME));
		return wb;
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();

	}

	public static void SendKeysLastName(WebDriver driver, String str) {
		getLastName(driver).sendKeys(str);
	}

	/* Email input */
	public static WebElement getEmail(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EMAIL));
		return wb;
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();

	}

	public static void SendKeysEmail(WebDriver driver, String str) {
		getEmail(driver).sendKeys(str);
	}

	/* Registering of desired username for user registration */
	public static WebElement getRegUsername(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(REGUSERNAME));
		return wb;
	}

	public static void clickRegUsername(WebDriver driver) {
		getRegUsername(driver).click();

	}

	public static void SendKeysRegUsername(WebDriver driver, String str) {
		getRegUsername(driver).sendKeys(str);
	}

	/* Registering of user password */
	public static WebElement getRegPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(REGPASSWORD));
		return wb;
	}

	public static void clickRegPassword(WebDriver driver) {
		getRegPassword(driver).click();

	}

	public static void SendKeysRegPassword(WebDriver driver, String str) {
		getRegPassword(driver).sendKeys(str);
	}

	/* Confirmation of Registration */
	public static WebElement getSubmitButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(SUBMITBUTTON));
		return wb;
	}

	public static void clickSubmitButton(WebDriver driver) {
		getSubmitButton(driver).click();

	}

}
