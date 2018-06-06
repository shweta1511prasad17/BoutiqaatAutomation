import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
	takescreenshot t=new takescreenshot();
	
	//Navigation to the home page of the Web site
	
	public boolean HomePagelink(WebDriver dr)
	{
		boolean status =false;
		dr.get("http://v2kw.boutiqaat.com/");
		
//		new WebDriverWait(firefoxDriver, pageLoadTimeout).until(
//		          webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
//		wait till page is loaded completely
		
		String url1=dr.getCurrentUrl();
		System.out.println(url1);
		if(url1.equals("http://v2kw.boutiqaat.com/"))
		{
			status=true;
		}
		return status;
	}
	
	
	// verification to the Country button and switch
	
	public boolean CountryLink(WebDriver dr) throws InterruptedException
	{
		boolean status =false;
		dr.findElement(By.xpath("//*[@class='action toggle switcher-trigger']//*img[contains(@alt,'Qatar')]")).click();
		Thread.sleep(5000);
		String url=dr.getCurrentUrl();
		//System.out.println(url);
		String url2=url.substring(0, 25);
		if(url.equals("http://v2qa.boutiqaat.com"))
		{
			status=true;
		}
		return status;
	}
	
	// verification to the Language button and switch
	
	public boolean LanguageLink(WebDriver dr) throws InterruptedException
	{
		boolean status =false;
		dr.findElement(By.xpath("//*[@class='view-en']//*[text()='English']")).click();
		Thread.sleep(5000);
		String url=dr.getCurrentUrl();
		//System.out.println(url);
		String url2=url.substring(0, 25);
		if(url.equals("http://v2ka.boutiqaat.com"))
		{
			status=true;
		}
		else if(url.equals("http://v2ka.boutiqaat.com")) 
		{
			
		}
		return status;
	}
	
	// Navigation to the login page 
	
	public boolean Loginlink(WebDriver dr) throws InterruptedException
	{
		boolean status =false;
		dr.findElement(By.xpath("//*[@class='link-account' and contains(@title, 'Log In')]")).click();
		Thread.sleep(5000);
		String url=dr.getCurrentUrl();
		//System.out.println(url);
		String url2=url.substring(0, 48);
		System.out.println(url2);
		if(url2.equals("http://v2kw.boutiqaat.com/customer/account/login"))
		{
			status=true;
		}
		else if(url2.equals("http://m2kw.boutiqaat.com/customer/account/login"))
		{
			status=true;
		}
		else
		{
			status=false;
		}
		return status;
	}
	
	
	//Verify Login credentials
	
	public boolean verifyloginUser(WebDriver dr) throws InterruptedException, IOException
	{
		boolean status=this.Loginlink(dr);
		System.out.println(status);
		Thread.sleep(10000);
		
		if(status==true)
		{
			System.out.println("demoa");
			Thread.sleep(10000);
			dr.findElement(By.id("email")).sendKeys("testdemo@gmail.com");
			dr.findElement(By.id("pass")).sendKeys("test@1234");
			dr.findElement(By.id("send2")).click();
			Thread.sleep(30000);
			String url1=dr.getCurrentUrl();
			System.out.println(url1);
			if(url1.equals("http://v2kw.boutiqaat.com/"))
			{
				status=true;
				t.TakesScreenshot(dr);
			}
			else if(url1.equals("http://m2kw.boutiqaat.com/"))
			{
				status=true;
				t.TakesScreenshot(dr);
			}
			else
			{
				status=false;
				t.TakesScreenshot(dr);
			}
		}
		else
		{
			status=false;
		}
		
		return status;
	}
	
	//Navigate to the Registration Page
	
	public boolean Registerlink(WebDriver dr) throws InterruptedException
	{
		boolean status =false;
		dr.findElement(By.xpath("//*[@class='registration-link']//*[contains(@title, 'Register')]")).click();
		Thread.sleep(5000);
		String url=dr.getCurrentUrl();
		//System.out.println(url);
		String url2=url.substring(0, 50);
		System.out.println(url2);
		if(url2.equals("http://v2kw.boutiqaat.com/customer/account/create/"))
		{
			status=true;
		}
		else if(url2.equals("http://m2kw.boutiqaat.com/customer/account/create/"))
		{
			status=true;
		}
		return status;
	}
	
	
	//Verify the registration Page
	public boolean verifyRegisterUser(WebDriver dr) throws InterruptedException, IOException
	{
		boolean status=this.Registerlink(dr);
		Thread.sleep(10000);
		if(status==true)
		{
			//User Information
			dr.findElement(By.id("firstname")).sendKeys("TestName");
			dr.findElement(By.id("lastname")).sendKeys("Demo");
			String x="Yes";
			
			
			//Sign Up for Newsletter
			if(x.equals("Yes"))
			{
				dr.findElement(By.id("is_subscribed")).click();
			}
			else
			{
				
			}
			
			//Sign in Information
			int randon=17;
			
			dr.findElement(By.id("email_address")).sendKeys("Tes"+randon+"@gmail.com");
			dr.findElement(By.id("password")).sendKeys("Test@1234");
			dr.findElement(By.id("password-confirmation")).sendKeys("Test@1234");
			Thread.sleep(5000);
			//dr.findElement(By.xpath("//*[@class='action submit primary' and contains(@title,'Register']")).click();
			
			dr.findElement(By.xpath("//*[@class='primary']//*[text()='Register']")).click();
			
			Thread.sleep(10000);
			String url1=dr.getCurrentUrl();
			
			//*change the url
			if(url1.equals("http://v2kw.boutiqaat.com/customer/account/"))
			{
				status=true;
				t.TakesScreenshot(dr);
			}
			else if(url1.equals("http://m2kw.boutiqaat.com/customer/account/"))
			{
				status=true;
				t.TakesScreenshot(dr);
			}
			else
			{
				status=false;
				t.TakesScreenshot(dr);
			}
		}
		else
		{
			status=false;
			t.TakesScreenshot(dr);
		}
		
		return status;
	}
	
	//Verify the My Account Link if user is logged in 
	public boolean MyAccountLink(WebDriver dr) throws InterruptedException, IOException
	{
		boolean status=false;
		String Name=dr.findElement(By.xpath("//*[@class='myaccount-link']//*[contains(@title,'My Account')]")).getText();
		System.out.println(Name);
		if(Name.isEmpty())
		{
			status=false;
			System.out.println("Please Log In to the application");
		}
		else
		{
		dr.findElement(By.xpath("//*[@class='myaccount-link']//*[contains(@title,'My Account')]")).click();
		Thread.sleep(10000);
		String url=dr.getCurrentUrl();
		if(url.equals("http://v2kw.boutiqaat.com/customer/account"))
		{
			status=true;
		}
		else
		{
			t.TakesScreenshot(dr);
			status=false;
			
		}
		}
		
		return status;
	}
	
	
	
	//Verify the boutiqaat image link 
	
	public boolean Boutiqaatlink(WebDriver dr) throws InterruptedException
	{
		boolean status =false;
		dr.findElement(By.xpath("//*[@class='em-links-item']//*[text()='FAQ']")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@class='logo']//img[contains(@alt,'Boutiquaat')]")).click();
		Thread.sleep(5000);
		String url=dr.getCurrentUrl();
		//System.out.println(url);
		if(url.equals("http://v2kw.boutiqaat.com/"))
		{
			status=true;
		}
		return status;
	}
	
	//Verify the FAQ link on the page 
	
	public boolean VerifyFAQpage(WebDriver dr) throws InterruptedException
	{
		boolean status =false;
		
		dr.findElement(By.xpath("//*[@class='em-links-item']//*[text()='FAQ']")).click();
		Thread.sleep(5000);
		String url2=dr.getCurrentUrl();
		System.out.println(url2);
		if(url2.equals("http://v2kw.boutiqaat.com/order-related"))
		{
			status=true;
		}
		return status;
	}
	
	
	//Verify the LandingBanner on the Live page 
	
	public String LandingBanner(WebDriver dr) throws IOException, InterruptedException
	{
		String b="false";
		String url1=null;
		Thread.sleep(20000);
		dr.findElement(By.xpath("//*[@id=\"desktop_sa_en\"]/div/div/div[1]/div/div[4]/a")).click();
		//dr.findElement(By.)
		url1=dr.getCurrentUrl();
		if (url1.equals("http://v2kw.boutiqaat.com/catalog/category/view/s/negsat-ramadan/id/1949"))
		{
			t.TakesScreenshot(dr);
			b="true";
			
		}
		else if(url1.equals("http://v2kw.boutiqaat.com/catalog/category/view/s/ramadan-daraat-collection/id/1911"))
		{
			b="true";
		}
		
		else
		{
			t.TakesScreenshot(dr);
		}
		
		return b;
	}
	
	
	
	
//	public boolean verifyboutiqaatlink(WebDriver dr) throws InterruptedException
//	{
//		Boolean status=false;
//		dr.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/strong/img")).click();
//		Thread.sleep(5000);
//		String url1=dr.getCurrentUrl();
//		if(url1.equals("http://v2sa.boutiqaat.com/static/version1526884730/frontend/Emthemes/everything_beauty/en_US/images/logo.svg"))
//		{
//			status=true;
//		}
//		return status;
//	}
	
	
	//Verify the cdelebrity link
	
	public boolean fetchcelebritylink(WebDriver dr) throws InterruptedException, IOException
	{
		boolean status1=false;
		//dr.findElement(By.)
		//dr.findElement(By.xpath("/html/body/div/header/div[2]/div/div[3]/div/div[2]/div/nav/ul/li[2]/a/span[1]")).click();
		//http://m2kw.boutiqaat.com/celebrity
		//dr.findElement(By.partialLinkText("http://m2kw.boutiqaat.com/celebrity")).click();
		//dr.findElement(By.linkText(" Celebrities"));
		//dr.findElement(By.cssSelector("^categorypage cms-everything-home-one-column cms-index-index page-layout-1column ajax-loading$")).click();
	//	dr.findElement(By.className("fa fa-female")).click();
		
		dr.findElement(By.xpath("//*[@class='block ves-menu custom-mega-menu']//*[text()=' Celebrities']")).click();
		
		//dr.findElement(By.className("categorypage cms-everything-home-one-column cms-index-index page-layout-1column ajax-loading")).click();
		
		String url1;
		Thread.sleep(20000);
		url1=dr.getCurrentUrl();
		System.out.println(url1);
		//String url2= url1.substring(33);
		String url2=url1.substring(0,35);
		System.out.println(url2);
		if(url2.equals("http://v2kw.boutiqaat.com/celebrity"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else if(url2.equals("http://m2kw.boutiqaat.com/celebrity"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else
		{
			t.TakesScreenshot(dr);
		}
//		dr.findElement(By.xpath("//*[@class='block ves-menu custom-mega-menu']//*[text()=' Celebrities']")).isDisplayed();
//		
//         dr.findElement(By.xpath("//*[@class='row ln-a']*[text()='                A3jooba Makeup Boutique            ']")).click();
		return status1;
	}
	
	//Verify TV Link
	
	public boolean fetchTVlink(WebDriver dr) throws InterruptedException, IOException
	{
		boolean status1=false;
		
		dr.findElement(By.xpath("//*[@class='block ves-menu custom-mega-menu']//*[text()=' TV']")).click();
		String url1;
		Thread.sleep(20000);
		url1=dr.getCurrentUrl();
		System.out.println(url1);
		if(url1.equals("http://v2kw.boutiqaat.com/boutiqaattv"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else if(url1.equals("http://m2kw.boutiqaat.com/boutiqaattv"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else
		{
			t.TakesScreenshot(dr);
		}
     return status1;
	}
	
	//Verify Brand link 
	
	public boolean fetchBrandlink(WebDriver dr) throws InterruptedException, IOException
	{
		boolean status1=false;
		
		dr.findElement(By.xpath("//*[@class='block ves-menu custom-mega-menu']//*[text()=' Brands']")).click();
		String url1;
		Thread.sleep(20000);
		url1=dr.getCurrentUrl();
		System.out.println(url1);
		if(url1.equals("http://m2kw.boutiqaat.com/brands"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else if(url1.equals("http://v2kw.boutiqaat.com/brands"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else
		{
			t.TakesScreenshot(dr);
		}
     return status1;
	}
	

	public boolean fetchSkinCarelink(WebDriver dr) throws InterruptedException, IOException
	{
		boolean status1=false;
		
		dr.findElement(By.xpath("//*[@class='block ves-menu custom-mega-menu']//*[text()=' Skin Care']")).click();
		String url1;
		Thread.sleep(20000);
		url1=dr.getCurrentUrl();
		System.out.println(url1);
		if(url1.equals("http://m2kw.boutiqaat.com/makeup-skincare"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else if(url1.equals("http://v2kw.boutiqaat.com/makeup-skincare"))
		{
			t.TakesScreenshot(dr);
			status1=true;
		}
		else
		{
			t.TakesScreenshot(dr);
		}
     return status1;
	}
	
	
	
	
	public String VerifyMenuButton(WebDriver dr)
	{
		String status="False";
		
		//Menu List ??
		dr.findElement(By.xpath("")).click();
		return status;
	}

	
	public void pickproductHome(WebDriver dr) throws InterruptedException
	{
		dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/div/div/div/ol/div[1]/div/div[1]/li/div/div[1]/a/span[2]/span/img")).click();
	
		//View cart button
		//dr.findElement(By.xpath("//[@class='action showcart']//*[text()='My Cart']")).click();
		//Thread.sleep(5000);
		
		
	}
	
	public void AddToCart(WebDriver dr) throws InterruptedException
	{
		//dr.findElement(By.)
		Thread.sleep(20000);
		dr.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
		Thread.sleep(5000);
		dr.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div/a")).click();
		//Thread.sleep(2000);
	}
	
	public void ClickCart(WebDriver dr)
	{
		//dr.findElement(By.xpath("//[@class='text']//*[text()='My Cart']")).click();//Class name is defined in span which is not refering to the cart button
		//dr.findElement(By.xpath("//*[@class='action showcart']//*[text()='My Cart']")).click(); //Customized is not working
		//dr.findElement(By.id("top-cart-btn-checkout")).click(); ---This clicks on Checkout button
		
		dr.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div/a")).click(); //Temporary solution to click on cart
		
		//View cart button
				//dr.findElement(By.xpath("//*[@class='action viewcart']//*[text()='View Bag']")).click();
				
				dr.findElement(By.xpath("//[@class='action viewcart']//span[text()='View Bag']")).click();  //not working anymore
		
		//Temporary id for View Bag
		//dr.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a")).click();
		//dr.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span/span")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div/div[3]/div[1]/ul/li/button/span")).click();
				
		
	}
	
	public void ClickMiniCart(WebDriver dr)
	{
		//View Mini cart i.e clicking mini cart button
		//dr.findElement(By.id("top-cart-btn-checkout")).click();  --it stopped working
		
		dr.findElement(By.xpath("//[@class='action showcart active']//*[text()='My Cart']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void ViewBagOnMiniCart(WebDriver dr)
	{
		//View Mini cart i.e clicking mini cart button
			//	dr.findElement(By.id("top-cart-btn-checkout")).isSelected();
				
				
		dr.findElement(By.xpath("//[@class='action viewcart']//*[text()='View Bag']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div/div[3]/div[1]/ul/li/button/span")).click();
		
		
	}
	
	public void CheckoutOnMiniCart(WebDriver dr)
	{
		
	}
	
	public void ClickCartArabic(WebDriver dr)
	{
		dr.findElement(By.id("top-cart-btn-checkout")).click();
		//View cart button
				//dr.findElement(By.xpath("//*[@class='action viewcart']//*[text()='View Bag']")).click();
				
				//dr.findElement(By.xpath("//[@class='action viewcart']//*[text()='View Bag']")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div/div[3]/div[1]/ul/li/button/span")).click();
				
		
	}
	
	
	//Verify the functionality shop by category
	public boolean ShopByCategory(WebDriver dr) throws IOException
	{
		boolean status=false;
		dr.findElement(By.xpath("//*[@class='banner-img' and contains(@title,'Best Selling Makeup')]")).click();
		String url=dr.getCurrentUrl();
		
		String url1=url.substring(0, 60);
		System.out.println(url1);
		if(url1.equals("http://v2kw.boutiqaat.com/catalog/category/view/s/makeup/id/"))
		{
			String name=dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).getTagName();
			System.out.println(name+"demo");
			if(name.isEmpty())
			{
				t.TakesScreenshot(dr);
				status=false;
			}
			else
			{
				status=true;
			}
			
			
		}
		else if(url1.equals("http://m2kw.boutiqaat.com/catalog/category/view/s/makeup/id/"))
		{
			String name=dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).getTagName();
			System.out.println(name+"demo");
			if(name.isEmpty())
			{
				t.TakesScreenshot(dr);
				status=false;
			}
			else
			{
				status=true;
			}
			
			
		}
		else
		{
			status=false;
			t.TakesScreenshot(dr);
		}
		return status;
		
	}
	
	public void SearchPlaceHolder(WebDriver dr, String SKU) throws InterruptedException
	{
		//Selecting the Search Holder
		dr.findElement(By.id("search")).isSelected();
		
		//Providing the SKU for the product
		dr.findElement(By.id("search")).sendKeys(SKU);
		
		//Click on the Search
		dr.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button")).click();
		
		//dr.findElement(By.xpath("//*[text()='Search' and contains[@class='action search primary']]")).click();
		
		Thread.sleep(5000);
	}

}
