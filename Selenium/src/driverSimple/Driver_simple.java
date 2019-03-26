package driverSimple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_simple {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());

		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

		if (driver.getCurrentUrl().equals("http://newtours.demoaut.com/"))
			System.out.println("OK");
		else {
			System.out.println("no");
		}
		driver.getPageSource();
		System.out.println(driver.getPageSource().length());

		driver.close();


	}

}
