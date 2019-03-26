package languageChangeAndWrongLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanguageChange {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// driver otvara stranicu
		String url = "https://www.laststicker.com/";
		// driver.navigate().to(url);
		driver.get(url);

		// ceka se otvaranje elemenata

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// unos username-a

		WebElement login = driver.findElement(By.cssSelector("#f_login"));
		login.sendKeys("epicurus001");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// unos passworda
		WebElement sifra = driver.findElement(By.cssSelector("#f_password"));
		sifra.sendKeys("12244");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// klik na sign in
		WebElement submit = driver.findElement(By.cssSelector("#form_submit"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// klik na srpski jezik
		WebElement srpski = driver.findElement(
				By.cssSelector("td:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(14) > a:nth-child(2)"));

		srpski.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// klik na norveski jezik
		WebElement norveski = driver.findElement(
				By.cssSelector("td:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(15) > a:nth-child(2)"));
		norveski.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.quit();
		driver.close();

	}

}
