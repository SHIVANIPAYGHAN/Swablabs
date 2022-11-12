package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class ScreenShotMethod extends TestBase{
	
	public static void screenshot(String name) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Frame25June\\ScreenShots\\"+name+".jpeg");
		FileHandler.copy(source, dest);
	}

}
