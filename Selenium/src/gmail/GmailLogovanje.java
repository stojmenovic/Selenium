package gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogovanje {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://accounts.google.com/signin";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement mejl = driver.findElement(By.xpath("//input[@id='identifierId']"));
		mejl.sendKeys("korisnikov_mejl");

		driver.findElement(By.id("identifierNext")).click();

		WebElement sifra = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(sifra));
		sifra.sendKeys("sifra_korisnika");

		driver.findElement(By.id("passwordNext")).click();

	}

}
