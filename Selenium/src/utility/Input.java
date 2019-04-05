package utility;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.LoginPage;
import page.objects.PostPage;
import page.objects.RegistrationPage;
import page.test.LoginPageTest;
import page.test.PostPageTest;
import page.test.RegistPageTest;

public class Input {
	/*
	 * Input method where user is choosing option and this method is called from
	 * Main
	 */
	public static int display_menu() throws Exception {
		Scanner sc = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Please, choose from these choices");
		System.out.println("-------------------------\n");
		System.out.println("1 - Automated Registration Test");
		System.out.println("2 - Manual Registration Test");
		System.out.println("3 - Automated Login Test");
		System.out.println("4 - Manual Login Test");
		System.out.println("5 - Automated Post Creating");
		System.out.println("6 - Manual Post Creating");
		System.out.println("7 - Delete Post");
		System.out.println("8 - Edit Post");
		/* Defining of cases for the options and calling itsown method */
		int selection = sc.nextInt();
		boolean validSelection = false;
		while (!validSelection) {
			switch (selection) {
			case 1:
				RegistrationPage.openPage(driver);
				RegistPageTest.fillForm(driver);
				validSelection = true;
				break;
			case 2:
				RegistrationPage.openPage(driver);
				RegistPageTest.ScannerReg(driver);
				validSelection = true;
				break;
			case 3:
				RegistrationPage.openPage(driver);
				LoginPageTest.fillForm(driver);
				validSelection = true;
				break;
			case 4:
				RegistrationPage.openPage(driver);
				LoginPageTest.ScannerLog(driver);
				validSelection = true;
				break;
			case 5:
				RegistrationPage.openPage(driver);
				LoginPage.SendKeysLogUsername(driver, "ivanst");
				LoginPage.SendKeysLogPassword(driver, "ivanst");
				LoginPage.getLoginButton(driver).click();
				PostPageTest.fillForm(driver);
				validSelection = true;
				break;
			case 6:
				RegistrationPage.openPage(driver);
				LoginPage.SendKeysLogUsername(driver, "ivanst");
				LoginPage.SendKeysLogPassword(driver, "ivanst");
				LoginPage.getLoginButton(driver).click();
				PostPageTest.ScannerPost(driver);
				validSelection = true;
				break;
			case 7:
				RegistrationPage.openPage(driver);
				LoginPage.SendKeysLogUsername(driver, "ivanst");
				LoginPage.SendKeysLogPassword(driver, "ivanst");
				LoginPage.getLoginButton(driver).click();
				PostPage.clickPostMenu(driver);
				PostPage.getPostDelete(driver).click();
				validSelection = true;
				break;
			case 8:
				RegistrationPage.openPage(driver);
				LoginPage.SendKeysLogUsername(driver, "ivanst");
				LoginPage.SendKeysLogPassword(driver, "ivanst");
				LoginPage.getLoginButton(driver).click();
				PostPage.clickPostMenu(driver);
				PostPage.getPostEdit(driver).click();
				PostPage.clickEditText(driver);
				PostPage.SendKeysEditText(driver, "izmena");
				PostPage.clickEditSubButton(driver);
				validSelection = true;
				break;

			default:
				break;

			}
			sc.close();

			driver.close();
		}
		return selection;
	}
}
