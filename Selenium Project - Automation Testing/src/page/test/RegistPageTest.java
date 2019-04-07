package page.test;

import java.util.Scanner;

import page.objects.RegistrationPage;
import utility.*;
import org.openqa.selenium.WebDriver;

public class RegistPageTest {
	public static void fillForm(WebDriver driver) throws Exception {
		String data;
		// ExcelUtils.setCellData(str, 0, 0);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME);
		// int rowcount=Constant.SHEET_NAME.
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {

			RegistrationPage.clickFirstName(driver);
			data = ExcelUtils.getCellData(i, 0);
			RegistrationPage.SendKeysFirstName(driver, data);

			RegistrationPage.clickLastName(driver);
			data = ExcelUtils.getCellData(i, 1);
			RegistrationPage.SendKeysLastName(driver, data);

			RegistrationPage.clickRegUsername(driver);
			data = ExcelUtils.getCellData(i, 2);
			RegistrationPage.SendKeysRegUsername(driver, data);

			RegistrationPage.clickEmail(driver);
			data = ExcelUtils.getCellData(i, 3);
			RegistrationPage.SendKeysEmail(driver, data);

			RegistrationPage.clickRegPassword(driver);
			data = ExcelUtils.getCellData(i, 4);
			RegistrationPage.SendKeysRegPassword(driver, data);

			RegistrationPage.clickSubmitButton(driver);
		}
	}

	/*
	 * This method is using user input through scanner for registration on webpage
	 */
	public static void ScannerReg(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);

		/* First name registration */
		RegistrationPage.clickFirstName(driver);
		System.out.println("Please, enter your First Name:");
		String FirstName = sc.nextLine();
		RegistrationPage.SendKeysFirstName(driver, FirstName);
		/* Last name registration */
		RegistrationPage.clickLastName(driver);
		System.out.println("Please, enter your Last Name:");
		String LastName = sc.nextLine();
		RegistrationPage.SendKeysLastName(driver, LastName);
		/* Username registration */
		RegistrationPage.clickRegUsername(driver);
		System.out.println("Please, enter your Username:");
		String Username = sc.nextLine();
		RegistrationPage.SendKeysRegUsername(driver, Username);
		/* Email registration */
		RegistrationPage.clickEmail(driver);
		System.out.println("Please, enter your Email:");
		String Email = sc.nextLine();
		RegistrationPage.SendKeysEmail(driver, Email);
		/* Password registration */
		RegistrationPage.clickRegPassword(driver);
		System.out.println("Please, enter your Password:");
		String Password = sc.nextLine();
		RegistrationPage.SendKeysRegPassword(driver, Password);
		/* Confirming registration */
		RegistrationPage.clickSubmitButton(driver);
		sc.close();
	}
}
