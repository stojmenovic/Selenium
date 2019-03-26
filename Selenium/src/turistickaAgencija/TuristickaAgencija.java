package turistickaAgencija;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*Vrsi se preuzimanje svih PDF cenovnika sa sajta turisticke agencije preko metode pdf .Takodje, ukoliko postoje cenovnici 
 * koji nisu u PDF formatu, vec se nalaze u telu sajta, postoji metoda uz pomoc koje se moze vrsiti screenshot dela stranice
 */


public class TuristickaAgencija {

	public static <pdf> void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String urlArgus = "https://argus.rs/";

		//Cenovnici sa Argus-a
		
		//driver otvara pocetnu
		
		driver.manage().window().maximize();
		
		driver.get(urlArgus);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//klik na  Letovanje + SS ekrana

		WebElement letovanje = driver.findElement(By.xpath("//a[contains(text(),'Letovanje')]"));

		uslikajEkran(driver, "C:\\Users\\stojmenovic\\Desktop\\test.png");

		letovanje.click();

		// u slucaju da je potrebna selekcija strane(CTR+A) aktivirati sledecu liniju koda
		
		// letovanje.sendKeys(Keys.chord(Keys.CONTROL, "a"));

		
		// otvara se polje Halkidiki-hoteli-2019 i snima donjom metodom pdf()

		WebElement halkidikiHoteli = driver.findElement(By.xpath("//a[contains(text(),'HALKIDIKI Hoteli Bus 2019')]"));

		halkidikiHoteli.click();

		pdf(driver);
		
		// kraj ispisa i metoda vraca driver stranu nazad i ide se do sledeceg letovalista ciji je pdf cenovnik potrebno skinuti

		// katerini
		
		WebElement kateriniHoteli = driver.findElement(By.xpath("//a[contains(text(),'KATERINI Hoteli Bus 2019')]"));

		kateriniHoteli.click();

		pdf(driver);

		// Krf

		WebElement krfHoteli = driver.findElement(By.xpath("//a[contains(text(),'KRF Hoteli Bus 2019')]"));

		krfHoteli.click();

		pdf(driver);

		// Sitonija

		WebElement sitonijaHoteli = driver.findElement(By.xpath("//a[contains(text(),'SITONIJA Hoteli Bus 2019')]"));

		sitonijaHoteli.click();

		pdf(driver);

		// Tasos

		WebElement tasosHoteli = driver.findElement(By.xpath("//a[contains(text(),'TASOS Hoteli Bus 2019')]"));

		tasosHoteli.click();

		pdf(driver);

		// Zakintos
		WebElement zakintosHoteli = driver.findElement(By.xpath("//a[contains(text(),'ZAKINTOS Hoteli Bus 2019')]"));

		zakintosHoteli.click();

		pdf(driver);
		
		//Bugarska - 3 pdf-a
		
		WebElement kitenHoteli = driver.findElement(By.xpath("//a[contains(text(),'KITEN/PRIMORSKO 2019')]"));

		kitenHoteli.click();

		pdf(driver);
		
		WebElement suncevBregHoteli = driver.findElement(By.xpath("//a[contains(text(),'SUNCEV BREG/NESEBAR 2019')]"));

		suncevBregHoteli.click();

		pdf(driver);
		
		WebElement zlatniPjasciHoteli = driver.findElement(By.xpath("//a[contains(text(),'ZLATNI PJASCI/CAIKA 2019')]"));

		zlatniPjasciHoteli.click();

		pdf(driver);
		
		//Egipat
		
//		WebElement egipatHoteli = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/ul[1]/li[1]/a[1]"));
//
//		egipatHoteli.click();
//
//		pdf(driver);
		
		//Turska
		
		WebElement turska1 = driver.findElement(By.xpath("//a[contains(text(),'ALANJA 2019 (10 ili 11 noći)')]"));

		turska1.click();

		pdf(driver);
		
		WebElement turska2 = driver.findElement(By.xpath("//a[contains(text(),'ANTALIJA 2019 (10 ili 11 noći)')]"));

		turska2.click();

		pdf(driver);
		
		WebElement turska3 = driver.findElement(By.xpath("//a[contains(text(),'BELEK 2019 ( 10 ili 11 noći)')]"));

		turska3.click();

		pdf(driver);
		
		WebElement turska4 = driver.findElement(By.xpath("//a[contains(text(),'BODRUM 2019 (10 ili 11 noći)')]"));

		turska4.click();

		pdf(driver);
		
		WebElement turska5 = driver.findElement(By.xpath("//a[contains(text(),'KEMER 2019 (10 ili 11 noći)')]"));

		turska5.click();

		pdf(driver);
		
		WebElement turska6 = driver.findElement(By.xpath("//a[contains(text(),'KUŠADASI 2019 (10 ili 11 noći)')]"));

		turska6.click();

		pdf(driver);
		
		WebElement turska7 = driver.findElement(By.xpath("//a[contains(text(),'KUŠADASI BUS 2019')]"));

		turska7.click();

		pdf(driver);
		
		WebElement turska8 = driver.findElement(By.xpath("//a[contains(text(),'MARMARIS 2019 (10 ili 11 noći)')]"));

		turska8.click();

		pdf(driver);
		
		WebElement turska9 = driver.findElement(By.xpath("//a[contains(text(),'MARMARIS BUS 2019')]"));

		turska9.click();

		pdf(driver);
		
		WebElement turska10 = driver.findElement(By.xpath("//a[contains(text(),'SIDE/MANAVGAT 2019 (10 ili 11 noći)')]"));

		turska10.click();

		pdf(driver);
		
		//ide na gradove Evrope - izlazi iz letovanja
		
		WebElement gradoviEvrope = driver.findElement(By.xpath("//a[contains(text(),'Gradovi Evrope')]"));
		gradoviEvrope.click();
		
		//preuzima cenovnike od svih gradova
		
		WebElement grad1 = driver.findElement(By.xpath("//a[contains(text(),'BEČ VIKEND PAKET 2019')]"));

		grad1.click();

		pdf(driver);
		
		WebElement grad2 = driver.findElement(By.xpath("//a[contains(text(),'PRAG APRIL-MAJ-JUN 2019')]"));

		grad2.click();

		pdf(driver);
		
		WebElement grad3 = driver.findElement(By.xpath("//a[contains(text(),'PRAG MART 2019')]"));

		grad3.click();

		pdf(driver);
		
		WebElement grad4 = driver.findElement(By.xpath("//a[contains(text(),'PARIZ BUS 2019')]"));

		grad4.click();

		pdf(driver);
		
		WebElement grad5 = driver.findElement(By.xpath("//a[contains(text(),'CINQUE TERRE 3BB 2019')]"));

		grad5.click();

		pdf(driver);
		
		WebElement grad6 = driver.findElement(By.xpath("//a[@href='/aranzmani/gradovi-evrope/italija/milano-2bb-2019']"));

		grad6.click();

		pdf(driver);
		
		WebElement grad7 = driver.findElement(By.xpath("//a[contains(text(),'RIM AVIO - 4 NOĆENJA 2019')]"));

		grad7.click();

		pdf(driver);
		
		WebElement grad8 = driver.findElement(By.xpath("//a[@href='/aranzmani/gradovi-evrope/italija/rim-bus-2019']//span[@class='transportType'][contains(text(),'(Autobus)')]"));

		grad8.click();

		pdf(driver);
		
		WebElement grad9 = driver.findElement(By.xpath("//a[@href='/aranzmani/gradovi-evrope/italija/toskana-2019']"));

		grad9.click();

		pdf(driver);
		
		WebElement grad10 = driver.findElement(By.xpath("//a[contains(text(),'VENECIJA PAKET 2019')]"));

		grad10.click();

		pdf(driver);
		
		
		WebElement grad11 = driver.findElement(By.xpath("//a[contains(text(),'BUDIMPEŠTA PAKET 2019')]"));

		grad11.click();

		pdf(driver);
		
		
		WebElement grad12 = driver.findElement(By.xpath("//a[contains(text(),'MAJ 2019')]"));

		grad12.click();

		pdf(driver);
		
		WebElement grad13 = driver.findElement(By.xpath("//a[@href='/aranzmani/gradovi-evrope/slovenija/portoroz-mart-2019']"));

		grad13.click();

		pdf(driver);
		
		WebElement grad14 = driver.findElement(By.xpath("//a[contains(text(),'SPA VIKEND TERME ČATEŽ 2019')]"));

		grad14.click();

		pdf(driver);
		
		WebElement grad15 = driver.findElement(By.xpath("//a[contains(text(),'ISTANBUL AVIO 2019')]"));

		grad15.click();

		pdf(driver);
		
		driver.close();
		driver.quit();
	}

	public static void pdf(WebDriver driver) throws InterruptedException, AWTException {

		// pozivanjem ove metode nakon izabrane lokacije za letovanje, vrsi se download
		// PDF cenocnika za tu lokaciju

		// definisana klasa Robot
		Robot robot = new Robot();
		robot.setAutoDelay(200);

		// klik na download link da otvori stranu sa PDF-om
		driver.findElement(By.xpath("//a[contains(text(),'Pogledajte aranžman u PDF formatu')]")).click();

		// komanda CTRL+S
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);

		Thread.sleep(1000L);

		// press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// vracanje na stranu nazad

		driver.navigate().back();

	}

	public static void uslikajEkran(WebDriver driver, String fileWithPath) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

}
