import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CelebrityPage
{

	
	public void selectCelebrity(WebDriver dr) 
	{
		
		
		dr.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div[4]/ol/li[2]/div/div[1]/a/span/span/img")).click();
		String url1=dr.getCurrentUrl();
		
	}
	
	public void selectProductOnCelebrityPage(WebDriver dr)
	{
		dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div/div[4]/ol/li[1]/div/div[1]/a")).click();
		//dr.findElement(By.xpath("//*[@class='product-shop-top']//a[@href,'http://v2kw.boutiqaat.com/celebrity/index/productlist/id/9039']")).click();
		//dr.findElement(By.xpath("//a[@href,'http://v2kw.boutiqaat.com/celebrity/index/productlist/id/102']")).click();
		//dr.findElement(By.xpath("//a[@href,'http://v2kw.boutiqaat.com/celebrity/index/productlist/id/102'][@class,'product photo product-item-photo']")).click();
		//dr.findElement(By.xpath("//div[@class='product-item-info']//a[@href,'http://v2kw.boutiqaat.com/celebrity/index/productlist/id/102'][@class,'product photo product-item-photo']")).click();
		System.out.println(dr.findElement(By.xpath("//span[@class='product-image-wrapper']")).getAttribute("alt"));
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[3]/div/div[1]/a/span/span/img")).click();
		//dr.findElement(By.xpath("//*[@class='product-image-wrapper']//*[@alt,'Laura Mercier Foundation Primer Oil Free - 50ml']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
