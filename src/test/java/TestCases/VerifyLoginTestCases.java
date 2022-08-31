package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifyLoginTestCases extends BaseClass {
	// We have achieved inheritance here
	@Test
	public void login() throws IOException {

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickLogin().click();

		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

		String actual = driver.findElement(By.xpath("//div[@id='error']")).getText();

		CommonUtilities.AssertionHandling(actual, expected);
	}

}
