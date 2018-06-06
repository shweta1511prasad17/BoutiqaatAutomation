import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage 
{
	takescreenshot t=new takescreenshot();
	
	public void placeorder(WebDriver dr) throws IOException, InterruptedException
	{

		//cash on delivery
dr.findElement(By.id("cashondelivery")).click();

//place order
dr.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[3]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[3]/div[2]/div[4]/div/button")).click();
t.TakesScreenshot(dr);


Thread.sleep(5000);
t.TakesScreenshot(dr);
Thread.sleep(5000);
t.TakesScreenshot(dr);

	}

}
