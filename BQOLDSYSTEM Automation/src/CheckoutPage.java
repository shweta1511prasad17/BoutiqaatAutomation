	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage 
{
	public void CheckOutPage(WebDriver dr)

	{
		dr.findElement(By.xpath("//*[@class='checkout methods items checkout-methods-items']//*[text()='Checkout']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
