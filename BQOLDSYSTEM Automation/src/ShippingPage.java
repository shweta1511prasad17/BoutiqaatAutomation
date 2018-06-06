import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ShippingPage 
{
	takescreenshot t=new takescreenshot();
	public void ShippingAddressGuest(WebDriver dr) throws IOException, InterruptedException

	{
		//shipping address filling 
		
				dr.findElement(By.id("customer-email")).sendKeys("testdemoguest1@gmail.com");
				Thread.sleep(10000);
				
				
				JavascriptExecutor jse = (JavascriptExecutor)dr;
				jse.executeScript("window.scrollBy(0,250)", "");
				
				//first name
				dr.findElement(By.name("firstname")).sendKeys("Abc");
				
				
				
				///db.findElement(By.xpath("//*[@id=\"N3DVFEL\"]")).sendKeys("Abc"); --xpath ,classname etc is not working for thizs
				
				//last name
				dr.findElement(By.name("lastname")).sendKeys("ads");
				
				//Street Address
				dr.findElement(By.name("street[0]")).sendKeys("Alma");
				
				//floornumber
				dr.findElement(By.name("custom_attributes[addr_floornumber]")).sendKeys("1");

				//JavascriptExecutor jse = (JavascriptExecutor)db;
				jse.executeScript("window.scrollBy(0,250)", "");
				
				
				//flatnumber
				dr.findElement(By.name("custom_attributes[addr_flatenumber]")).sendKeys("1");
				
				//block
				dr.findElement(By.name("custom_attributes[addr_block]")).sendKeys("A4");
				
				jse.executeScript("window.scrollBy(0,250)", "");
				//Avenue
				dr.findElement(By.name("custom_attributes[addr_avenue]")).sendKeys("Abc");
				
				
				
				
				jse.executeScript("window.scrollBy(0,250)", "");
				//PACI no
				dr.findElement(By.name("custom_attributes[paci_no]")).sendKeys("12345678");
				
				//Villa Building house number
				dr.findElement(By.name("custom_attributes[add_villa]")).sendKeys("Abc 1234");
				
				//city
				dr.findElement(By.name("city")).sendKeys("Atlanta");
				
				jse.executeScript("window.scrollBy(0,250)", "");
				
				//Area
				dr.findElement(By.name("region_area")).sendKeys("elegant");
				
				//phone
				dr.findElement(By.name("telephone")).sendKeys("98765432");
				
				//time delivery
				dr.findElement(By.name("custom_attributes[pdt]")).click();
				
				jse.executeScript("window.scrollBy(0,250)", "");
				
				dr.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[5]/a")).click();
				
				//notes
				dr.findElement(By.name("custom_attributes[notes]")).sendKeys("Demo test ");
				
				
				t.TakesScreenshot(dr);
				
				
				//db.findElement(By.className("button action continue primary")).click();
				dr.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
				
				Thread.sleep(5000);
				t.TakesScreenshot(dr);
				
	}
	
	
	
	public void shippingAddressLoggedUser(WebDriver dr) throws IOException, InterruptedException

	{
		//shipping address filling 
		
				dr.findElement(By.id("customer-email")).sendKeys("testdemoguest1@gmail.com");
				Thread.sleep(10000);
				
				
				JavascriptExecutor jse = (JavascriptExecutor)dr;
				jse.executeScript("window.scrollBy(0,250)", "");
				
				//first name
				dr.findElement(By.name("firstname")).sendKeys("Abc");
				
				
				
				///db.findElement(By.xpath("//*[@id=\"N3DVFEL\"]")).sendKeys("Abc"); --xpath ,classname etc is not working for thizs
				
				//last name
				dr.findElement(By.name("lastname")).sendKeys("ads");
				
				//Street Address
				dr.findElement(By.name("street[0]")).sendKeys("Alma");
				
				//floornumber
				dr.findElement(By.name("custom_attributes[addr_floornumber]")).sendKeys("1");

				//JavascriptExecutor jse = (JavascriptExecutor)db;
				jse.executeScript("window.scrollBy(0,250)", "");
				
				
				//flatnumber
				dr.findElement(By.name("custom_attributes[addr_flatenumber]")).sendKeys("1");
				
				//block
				dr.findElement(By.name("custom_attributes[addr_block]")).sendKeys("A4");
				
				jse.executeScript("window.scrollBy(0,250)", "");
				//Avenue
				dr.findElement(By.name("custom_attributes[addr_avenue]")).sendKeys("Abc");
				
				
				
				
				jse.executeScript("window.scrollBy(0,250)", "");
				//PACI no
				dr.findElement(By.name("custom_attributes[paci_no]")).sendKeys("12345678");
				
				//Villa Building house number
				dr.findElement(By.name("custom_attributes[add_villa]")).sendKeys("Abc 1234");
				
				//city
				dr.findElement(By.name("city")).sendKeys("Atlanta");
				
				jse.executeScript("window.scrollBy(0,250)", "");
				
				//Area
				dr.findElement(By.name("region_area")).sendKeys("elegant");
				
				//phone
				dr.findElement(By.name("telephone")).sendKeys("98765432");
				
				//time delivery
				dr.findElement(By.name("custom_attributes[pdt]")).click();
				
				jse.executeScript("window.scrollBy(0,250)", "");
				
				dr.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[5]/a")).click();
				
				//notes
				dr.findElement(By.name("custom_attributes[notes]")).sendKeys("Demo test ");
				
				
				t.TakesScreenshot(dr);
				
				
				//db.findElement(By.className("button action continue primary")).click();
				dr.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
				
				Thread.sleep(5000);
				t.TakesScreenshot(dr);
				
	}
	
	

	
	
	public void ShippingAddressGuestArabic(WebDriver dr) throws IOException, InterruptedException

	{
		//shipping address filling 
		
				dr.findElement(By.id("customer-email")).sendKeys("testdemoguest1@gmail.com");
				Thread.sleep(10000);
				
				
				JavascriptExecutor jse = (JavascriptExecutor)dr;
				jse.executeScript("window.scrollBy(0,250)", "");
				
				//first name
				dr.findElement(By.name("firstname")).sendKeys("Abc");
				
				
				
				///db.findElement(By.xpath("//*[@id=\"N3DVFEL\"]")).sendKeys("Abc"); --xpath ,classname etc is not working for thizs
				
				//last name
				dr.findElement(By.name("lastname")).sendKeys("ads");
				
				//Street Address
				dr.findElement(By.name("street[0]")).sendKeys("Alma");
				
				//floornumber
				dr.findElement(By.name("custom_attributes[addr_floornumber]")).sendKeys("1");

				//JavascriptExecutor jse = (JavascriptExecutor)db;
				jse.executeScript("window.scrollBy(0,250)", "");
				
				
				//flatnumber
				dr.findElement(By.name("custom_attributes[addr_flatenumber]")).sendKeys("1");
				
				//block
				dr.findElement(By.name("custom_attributes[addr_block]")).sendKeys("A4");
				
				jse.executeScript("window.scrollBy(0,250)", "");
				//Avenue
				dr.findElement(By.name("custom_attributes[addr_avenue]")).sendKeys("Abc");
				
				
				
				
				jse.executeScript("window.scrollBy(0,250)", "");
				//PACI no
				dr.findElement(By.name("custom_attributes[paci_no]")).sendKeys("12345678");
				
				//Villa Building house number
				dr.findElement(By.name("custom_attributes[add_villa]")).sendKeys("Abc 1234");
				
				//city
				dr.findElement(By.name("city")).sendKeys("Atlanta");
				
				jse.executeScript("window.scrollBy(0,250)", "");
				
				//Area
				dr.findElement(By.name("region_area")).sendKeys("elegant");
				
				//phone
				dr.findElement(By.name("telephone")).sendKeys("98765432");
				
				//time delivery
				dr.findElement(By.name("custom_attributes[pdt]")).click();
				
				jse.executeScript("window.scrollBy(0,250)", "");
				
				//dr.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[5]/a")).click();
				//dr.findElement(By.id("dp1527847310434")).sendKeys("6/1/2018");
				
				//notes
				dr.findElement(By.name("custom_attributes[notes]")).sendKeys("Demo test ");
				
				
				t.TakesScreenshot(dr);
				
				
//				//db.findElement(By.className("button action continue primary")).click();
		dr.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
				//dr.findElement(By.id("shipping-method-buttons-container")).click();
				Thread.sleep(5000);
				t.TakesScreenshot(dr);
				
	}
	
	public void shippingAdressNewUser(WebDriver dr)
	{
		
	}
	
	public void shippingAddressRegisterUser(WebDriver dr) throws IOException
	{
		JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		//first name
		dr.findElement(By.name("firstname")).sendKeys("Abc");
		
		
		
		///db.findElement(By.xpath("//*[@id=\"N3DVFEL\"]")).sendKeys("Abc"); --xpath ,classname etc is not working for thizs
		
		//last name
		dr.findElement(By.name("lastname")).sendKeys("ads");
		
		//Street Address
		dr.findElement(By.name("street[0]")).sendKeys("Alma");
		
		//floornumber
		dr.findElement(By.name("custom_attributes[addr_floornumber]")).sendKeys("1");

		//JavascriptExecutor jse = (JavascriptExecutor)db;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		
		//flatnumber
		dr.findElement(By.name("custom_attributes[addr_flatenumber]")).sendKeys("1");
		
		//block
		dr.findElement(By.name("custom_attributes[addr_block]")).sendKeys("A4");
		
		jse.executeScript("window.scrollBy(0,250)", "");
		//Avenue
		dr.findElement(By.name("custom_attributes[addr_avenue]")).sendKeys("Abc");
		
		
		
		
		jse.executeScript("window.scrollBy(0,250)", "");
		//PACI no
		dr.findElement(By.name("custom_attributes[paci_no]")).sendKeys("12345678");
		
		//Villa Building house number
		dr.findElement(By.name("custom_attributes[add_villa]")).sendKeys("Abc 1234");
		
		//city
		dr.findElement(By.name("city")).sendKeys("Atlanta");
		
		jse.executeScript("window.scrollBy(0,250)", "");
		
		//Area
		dr.findElement(By.name("region_area")).sendKeys("elegant");
		
		//phone
		dr.findElement(By.name("telephone")).sendKeys("98765432");
		
		//time delivery
		dr.findElement(By.name("custom_attributes[pdt]")).click();
		
		jse.executeScript("window.scrollBy(0,250)", "");
		
		dr.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[5]/a")).click();
		
		//notes
		dr.findElement(By.name("custom_attributes[notes]")).sendKeys("Demo test ");
		
		
		t.TakesScreenshot(dr);
		
		
		//db.findElement(By.className("button action continue primary")).click();
		dr.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.TakesScreenshot(dr);
		
	}
}
