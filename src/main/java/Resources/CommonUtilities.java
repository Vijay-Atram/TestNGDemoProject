package Resources;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	public static void DropDownHandling(WebElement DropDownXpath , int DropDownValue ) {
		Select s= new Select(DropDownXpath);
		s.selectByIndex(DropDownValue);
	}
	
	public static void AssertionHandling(String Actual, String Expected) {
		 SoftAssert assertion=new SoftAssert();
		   assertion.assertEquals(Actual, Expected);
		  
		     assertion.assertAll();//This is mandatory line
	}
	

}
