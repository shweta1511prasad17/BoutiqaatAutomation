import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;


public class takescreenshot 
{
	
	public void TakesScreenshot(WebDriver driver)throws IOException
	{
		 File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);         
		 try {
		 // now copy the  screenshot to desired location using copyFile method
		  
		 FileUtils.copyFile(srcfile, new File("./images/"+System.currentTimeMillis()+".png"));                              } catch (IOException e)
		  
		 {
		   System.out.println(e.getMessage()) ;
		  
		   }
	}
	
	 public static String capture(WebDriver driver,String screenShotName) throws IOException
	    {
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+screenShotName+".png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);        
	                     
	        return dest;
	    }

}
