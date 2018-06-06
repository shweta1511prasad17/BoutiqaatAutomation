import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import junit.framework.Assert;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
public class TestCases
{
	GenerateReportsAutomation gra=new GenerateReportsAutomation();
	HomePage hp=new HomePage();
	WebDriver dr;
	
  @BeforeTest
  public void Configurationtest() 
  {
	  System.setProperty("webdriver.gecko.driver", "./Gecko/geckodriver.exe");
	  dr=new FirefoxDriver();
	  gra.generatereport();  
  }
//  
//  @Test
//  public void landingbannertest() throws IOException, InterruptedException
//  {
//	  dr=new FirefoxDriver();
//	 hp.HomePagelink(dr);
//	//String t=hp.LandingBanner(dr)  ;
//	 boolean t=hp.verifyboutiqaatlink(dr);
//	//Assert.assertTrue(message, condition);
//	if (t.equals(true))
//	{
//		//TestInfo.log(Status.INFO,"this is pass")
//	}
//  }
}
