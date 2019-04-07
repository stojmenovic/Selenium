package page.test;

import java.util.Scanner;

import org.openqa.selenium.*;
import page.objects.PostPage;
import utility.*;

public class PostPageTest {
	public static void fillForm(WebDriver driver) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME2);

		/*
		 * Calling this method program is copying all post text from Excel table(from
		 * 0-i) and publish it on behalf logged in user
		 */
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum(); i++) {
			PostPage.clickCreatePost(driver);

			PostPage.clickPostName(driver);
			data = ExcelUtils.getCellData(i, 1);
			PostPage.SendKeysPostName(driver, data);

			PostPage.clickPostLocation(driver);
			data = ExcelUtils.getCellData(i, 2);
			PostPage.SendKeysPostLocation(driver, data);

			PostPage.clickTextField(driver);
			data = ExcelUtils.getCellData(i, 0);
			PostPage.SendKeysTextField(driver, data);

			PostPage.clickPostButton(driver);

		}
	}

	/* Making post by user input through scanner */
	public static void ScannerPost(WebDriver driver) throws Exception {
		Scanner sc = new Scanner(System.in);
		PostPage.clickCreatePost(driver);

		PostPage.clickPostName(driver);
		System.out.println("Please, enter the name of your post:");
		String PostName = sc.nextLine();
		PostPage.SendKeysPostName(driver, PostName);

		PostPage.clickPostLocation(driver);
		System.out.println("Please, enter the location you want to describe:");
		String PostLocation = sc.nextLine();
		PostPage.SendKeysPostLocation(driver, PostLocation);

		PostPage.clickTextField(driver);
		System.out.println("Please, tell something about that " + PostLocation + ":");
		String PostText = sc.nextLine();
		PostPage.SendKeysTextField(driver, PostText);

		PostPage.clickPostButton(driver);
		sc.close();
	}

}
