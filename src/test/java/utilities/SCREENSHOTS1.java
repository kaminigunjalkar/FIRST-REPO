package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOTS1 {
	
	
	
public static void CaptureScreen(WebDriver driver, String name) throws IOException	{
	//step-1
	TakesScreenshot tcs=(TakesScreenshot)driver;
	
	//step-2
	File source=tcs.getScreenshotAs(OutputType.FILE);
	
     String path= System.getProperty("user.dir")+"\\Screenshots1\\"+name+".png";
     
   //step-3
     File dest=new File(path);
     
     //step-4
     FileHandler.copy(source, dest);
     System.out.println("Screenshot capture");
     
}

}
