package registracijaNaSajt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistracijaNaSajt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
String url = "http://newtours.demoaut.com";

driver.get(url);

driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));

firstName.click();
firstName.sendKeys("ivan");

WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));

lastName.click();
lastName.sendKeys("stoj");

WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));

phone.click();
phone.sendKeys("020202");


WebElement email = driver.findElement(By.xpath("//input[@id='userName']"));

email.click();
email.sendKeys("ja@gmail.com");

WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));

address.click();
address.sendKeys("Cara Dusana");

WebElement city = driver.findElement(By.xpath("//input[@name='city']"));

city.click();
city.sendKeys("Beograd");

WebElement state = driver.findElement(By.xpath("//input[@name='state']"));

state.click();
state.sendKeys("Srbija");

WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));

postalCode.click();
postalCode.sendKeys("11000");

Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));

country.selectByVisibleText("SERBIA");

WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

username.click();
username.sendKeys("bootcamp");

WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

password.click();
password.sendKeys("11111");


WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));

confirmPassword.click();
confirmPassword.sendKeys("11111");

WebElement submit = driver.findElement(By.xpath("//input[@name='register']"));

submit.click();

WebElement signOff = driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]"));

signOff.click();

WebElement signIn = driver.findElement(By.xpath("//input[@name='userName']"));

signIn.sendKeys("bootcamp");

WebElement signInPass = driver.findElement(By.xpath("//input[@name='password']"));

signInPass.sendKeys("11111");


WebElement logIn = driver.findElement(By.xpath("//input[@value='Login']"));

logIn.click();

if(driver.getCurrentUrl().equals("http://newtours.demoaut.com/mercuryreservation.php")) {

	System.out.println("TEST JE USPESAN!");}
	 
else System.out.println("TEST NIJE USPESAN!");
	

	driver.quit();


	}}


