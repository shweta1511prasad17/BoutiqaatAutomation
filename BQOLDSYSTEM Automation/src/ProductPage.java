import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage 
{

	public void selectProduct(WebDriver dr) throws InterruptedException
	{
		Thread.sleep(10000);
		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).click();
	}
	
	public void selectCart(WebDriver dr) throws InterruptedException
	{
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div/a")).click();
	}
	
	public void checkoutbutton(WebDriver dr)
	{
		dr.findElement(By.id("top-cart-btn-checkout")).click();
	}
	
	public void AddToWishlist(WebDriver dr) throws InterruptedException
	{
		//dr.findElement(By.xpath("//dic[@class='product-addto-links']//*[text()='Add to Wishlist']")).click();
		dr.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div/div/div[2]/div[1]/a/span")).click();
		Thread.sleep(5000);
	}
}
