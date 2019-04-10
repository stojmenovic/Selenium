package page.objects;

import java.util.List;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.*;

public class PostPage {
	/* Defining of final values for Post (create, modify and delete) */
	public static final String PAGE_URL2 = "https://izlet.000webhostapp.com/izlet/dashboard.php#";
	private static final String CREATEPOST = "//a[contains(text(),'Nova objava')]";
	private static final String TEXTFIELD = "//textarea[@placeholder='Opis']";
	private static final String POSTNAME = "//input[@placeholder='Naziv']";
	private static final String POSTLOCATION = "//input[@id='pac-input']";

	private static final String POSTBUTTON = "//input[@value='Objavi']";
	private static final String POSTMENU = "fa-ellipsis-v";
	private static final String POSTDELETE = "fa-trash-alt";
	private static final String POSTEDIT = "fa-edit";
	private static final String EDITTEXTFIELD = "//textarea[@id='description']";
	private static final String EDITSUBBUTTON = "//div[@class='popupEdit']//input[@value='Post']";

	/* Create new post */
	public static WebElement getCreatePost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(CREATEPOST));
		return wb;
	}

	public static void clickCreatePost(WebDriver driver) {
		getCreatePost(driver).click();

	}

	/* Post text Input */
	public static WebElement getTextField(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(TEXTFIELD));
		return wb;
	}

	public static void clickTextField(WebDriver driver) {
		getTextField(driver).click();

	}

	public static void SendKeysTextField(WebDriver driver, String str) {
		getTextField(driver).sendKeys(str);
	}

	/* Post name Input */
	public static WebElement getPostName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POSTNAME));
		return wb;
	}

	public static void clickPostName(WebDriver driver) {
		getPostName(driver).click();
	}

	public static void SendKeysPostName(WebDriver driver, String str) {
		getPostName(driver).sendKeys(str);
	}

	/* Post Location Input */
	public static WebElement getPostLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POSTLOCATION));
		return wb;
	}

	public static void clickPostLocation(WebDriver driver) {
		getPostLocation(driver).click();

	}

	public static void SendKeysPostLocation(WebDriver driver, String str) {
		getPostLocation(driver).sendKeys(str);
	}

	/* Confirming new post */
	public static WebElement getPostButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POSTBUTTON));
		return wb;
	}

	public static void clickPostButton(WebDriver driver) {
		getPostButton(driver).click();

	}

	/* Post edit button (edit/delete) */
	public static WebElement getPostMenu(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(POSTMENU));
		return wb;
	}

	public static void clickPostMenu(WebDriver driver) {
		getPostMenu(driver).click();

	}

	/* Post delete */
	public static WebElement getPostDelete(WebDriver driver) {
		List<WebElement> deletePost = driver.findElements(By.className(POSTDELETE));
		return deletePost.get(0);
	}

	/* Post edit */
	public static WebElement getPostEdit(WebDriver driver) throws InterruptedException {
		List<WebElement> editPost = driver.findElements(By.className(POSTEDIT));
		Thread.sleep(5000);
		return editPost.get(0);

	}

	public static WebElement getEditText(WebDriver driver) {

		WebElement wb = driver.findElement(By.xpath(EDITTEXTFIELD));
		return wb;

	}

	public static void clickEditText(WebDriver driver) {
		getEditText(driver).click();

	}

	public static void SendKeysEditText(WebDriver driver, String str) {
		getEditText(driver).clear();
		getEditText(driver).sendKeys(str);
	}

	public static WebElement getEditSubButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDITSUBBUTTON));
		return wb;
	}

	public static void clickEditSubButton(WebDriver driver) {
		getEditSubButton(driver).click();

	}
}
