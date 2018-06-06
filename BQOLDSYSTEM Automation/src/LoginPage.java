import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	
	public void SignUp(WebDriver dr)
	{
		dr.get("http://v2kw.boutiqaat.com/customer/account/create/");
		dr.manage().window().maximize();
		
		//Sign Up Fields 
		
		//Personal Fields
		dr.findElement(By.id("firstname")).sendKeys("");
		dr.findElement(By.id("lastname")).sendKeys("");
		String x=null;
		
		
		//Sign Up for Newsletter
		if(x.equals("Yes"))
		{
			dr.findElement(By.id("is_subscribed")).click();
		}
		else
		{
			
		}
		
		//Sign in Information
		
		dr.findElement(By.id("email_address")).sendKeys("");
		dr.findElement(By.id("password")).sendKeys("");
		dr.findElement(By.id("password-confirmation")).sendKeys("");
	}
	
	public void GuestUser(WebDriver dr)
	{
		
	}
	
	public void SignIn(WebDriver dr)
	{
		//dr.get("");
		dr.findElement(By.name("login[username]")).sendKeys("testdemo@gmail.com");
		dr.findElement(By.name("login[password]")).sendKeys("test@1234");
		dr.findElement(By.className("action login primary")).click();
		
	}
	
	public void ForgetPassword(WebDriver dr)
	{
	    dr.get("http://v2kw.boutiqaat.com/customer/account/forgotpassword/");	
	    dr.findElement(By.id("email_address")).sendKeys("testdemo@gmail.com");
	    dr.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
	    
	  // it should be redirected to this page (for validation)  dr.get("http://v2kw.boutiqaat.com/customer/account/login/referer/aHR0cDovL3Yya3cuYm91dGlxYWF0LmNvbS9jdXN0b21lci9hY2NvdW50L2luZGV4Lw%2C%2C/");
	    
	}

}
