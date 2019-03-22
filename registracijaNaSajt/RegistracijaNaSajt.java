package registracijaNaSajt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

WebElement country = driver.findElement(By.xpath("//select[@name='country']"));

postalCode.click();
postalCode.sendKeys("SER");

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

	}

}
