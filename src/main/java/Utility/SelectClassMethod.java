package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {

	public static void selectclass(WebElement ele,String value)
	{
		Select s =  new Select(ele);
		s.selectByVisibleText(value);
	}
}
