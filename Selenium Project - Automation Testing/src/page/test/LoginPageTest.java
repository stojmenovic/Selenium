package page.test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import page.objects.LoginPage;
import utility.*;

public class LoginPageTest {
	public static void fillForm(WebDriver driver) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);

		/*
		 * Loop that is initiating pass through the Excel table where is collecting data
		 * and using for automated login from 0-i
		 */
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			LoginPage.clickLogUsername(driver);
			data = ExcelUtils.getCellData(i, 2);
			LoginPage.SendKeysLogUsername(driver, data);

			LoginPage.clickLogPassword(driver);
			data = ExcelUtils.getCellData(i, 4);
			LoginPage.SendKeysLogPassword(driver, data);

			LoginPage.clickLoginButton(driver);

			LoginPage.clickLogoutButton(driver);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}

	/*
	 * User is asked to create login by scanner and those data are used for
	 * automated login on website
	 */
	public static void ScannerLog(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);

		LoginPage.clickLogUsername(driver);
		System.out.println("Please, enter your Username:");
		String Username = sc.nextLine();
		LoginPage.SendKeysLogUsername(driver, Username);

		LoginPage.clickLogPassword(driver);
		System.out.println("Please, enter your Password:");
		String Password = sc.nextLine();
		LoginPage.SendKeysLogPassword(driver, Password);

		LoginPage.clickLoginButton(driver);
		LoginPage.clickLogoutButton(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sc.close();
	}

}
