package rezervacijaKarte;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class Rezervacija {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.phptravels.net/public/expedia/#";

		driver.get(url);

		WebElement searchbar = driver.findElement(By.xpath("//input[@id='citiesInput']"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		searchbar.sendKeys("Oslo");

		WebElement dateBox1 = driver.findElement(By.xpath("//input[@placeholder='Check in']"));
		dateBox1.sendKeys("03/28/2019");

		WebElement dateBox2 = driver.findElement(By.xpath("//input[@placeholder='Check out']"));
		dateBox2.sendKeys("03/29/2019");

		WebElement guests = driver.findElement(By.xpath("//input[@id='totalGuestsInput']"));
		guests.clear();
		guests.sendKeys("2 Adults 2 Child");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

//        WebElement adultNr = driver.findElement(By.xpath("//input[@id='adultInput']"));
//        adultNr.sendKeys("2");
//        
//        WebElement childNr = driver.findElement(By.xpath("//input[@id='childInput']"));
//        childNr.sendKeys("2");

		WebElement searchbutton = driver.findElement(
				By.xpath("//div[@class='bgfade col-md-2 go-right col-xs-12 search-button']//button[@type='submit']"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		searchbutton.click();

		List<WebElement> hoteli = driver.findElements(
				By.xpath("//button[@class='btn btn-primary loader loader btn-block'][contains(text(),'Details')]"));
		hoteli.get(0).click();

//		WebElement hotel = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[5]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/a[1]/button[1]"));
//		hotel.click();

		WebElement book = driver
				.findElement(By.xpath("//section[@id='ROOMS']//form[3]//div[1]//div[3]//div[2]//span[1]"));
		book.click();

		WebElement asGuest = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/div[6]/section[1]/div[13]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		asGuest.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@id='card-holder-firstname']"));
		firstName.sendKeys("Ivan");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='card-holder-lastname']"));
		lastName.sendKeys("Stojmenovic");

		WebElement email = driver.findElement(By.xpath("//input[@id='card-holder-email']"));
		email.sendKeys("ivan@gmail.com");

		WebElement phone = driver.findElement(By.xpath("//input[@id='card-holder-phone']"));
		phone.sendKeys("060000011112");

		Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByVisibleText("Serbia");

		WebElement state = driver.findElement(By.xpath("//input[@id='card-holder-state']"));
		state.sendKeys("Srbija");

		WebElement city = driver.findElement(By.xpath("//input[@id='card-holder-city']"));
		city.sendKeys("Beograd");

		WebElement postCode = driver.findElement(By.xpath("//input[@id='card-holder-postalcode']"));
		postCode.sendKeys("11000");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Address']"));
		address.sendKeys("Cara Dusana bb");

		Select card = new Select(driver.findElement(By.xpath("//select[@id='cardtype']")));
		card.selectByVisibleText("Visa");

		WebElement cardNr = driver.findElement(By.xpath("//input[@id='card-number']"));
		cardNr.sendKeys("4485108839470942");

		WebElement cardExpM = driver.findElement(By.xpath("//select[@id='expiry-month']"));
		cardExpM.sendKeys("Apr (04)");
		
		WebElement cardExpY = driver.findElement(By.xpath("//select[@id='expiry-year']"));
		cardExpY.sendKeys("2023");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cvv']"));
		cvv.sendKeys("367");
		
		WebElement policy = driver.findElement(By.xpath("//input[@id='policy']"));
		policy.click();

		WebElement payAsGuest = driver.findElement(By.xpath("//button[@name='guest']"));
		payAsGuest.click();

		driver.quit();
	}

}
