package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignUpTestCases extends BaseClass {
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.ClickTryForFree().click();

		Thread.sleep(5000);
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle=TestCaseData.ExpectedTitle; 
		
		CommonUtilities.AssertionHandling(ActualTitle, ExpectedTitle);

		SignUpPageObjects spo = new SignUpPageObjects(driver);
		spo.EnterFirstname().sendKeys(TestCaseData.Firstname);

		spo.EnterLastname().sendKeys(TestCaseData.Lastname);

		spo.EnterWorkEmail().sendKeys(TestCaseData.WorkEmail);

		CommonUtilities.DropDownHandling(spo.SelectJobTitle(), 5);

		spo.EnterComapanyname().sendKeys(TestCaseData.Comapanyname);

		CommonUtilities.DropDownHandling(spo.SelectJobTitle(), 5);

		spo.EnterPhoneNo().sendKeys(TestCaseData.Phone);

		//Select q = new Select(spo.SelectCountry());
		//q.selectByVisibleText("India");
		
		System.out.println(driver.getTitle());
	}

}
