import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateReportsAutomation
{
	takescreenshot t=new takescreenshot();
	ExtentReports reports;
	ExtentTest testInfo;
	ExtentHtmlReporter htmlreporter;
	WebDriver dr;
	HomePage hp=new HomePage();
	ShippingPage sp=new ShippingPage();
	PaymentPage pp=new PaymentPage();
	CheckoutPage  cp=new CheckoutPage();
	ProductPage prp=new ProductPage();
	CelebrityPage CelP=new CelebrityPage();
	public static ExtentTest logger;
	
	//ExtentWordReporter wordrepoter;
	//dr=new ChromeDriver();
//	public WebDriver drdeclare()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		//System.setProperty("webdriver.gecko.driver", "./Gecko/geckodriver.exe");
//		  dr=new ChromeDriver();
//		  dr.manage().window().maximize();
//		return dr;
//	}
	static int count =1;
	
	@BeforeTest
	public void generatereport()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		htmlreporter=new ExtentHtmlReporter(new File(System.getProperty("./Reports for testcases/")+"AutomationReportsdeo1"+count+".html"));
			// ExtentReports extent=ExtentReports.get(Generatereportsautomation.class);
		htmlreporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		reports=new ExtentReports();
		reports.setSystemInfo("Environment", "User Acceptance Testing");
		reports.attachReporter(htmlreporter);
		dr=new ChromeDriver();
		count=count+1;
		//System.out.println(dr);
    }
	
	
	@Test (priority=0)
	public void VerifyHomepageLink() throws IOException, InterruptedException
	{
		//dr=new ChromeDriver();
		//hp.HomePagelink(dr);
		
		dr.manage().window().maximize();
		boolean status1=hp.HomePagelink(dr);
		Assert.assertTrue(status1);
		testInfo.log(Status.INFO,"HomePage is working as expected");
		t.TakesScreenshot(dr);
	    
        //dr.findElement(By.xpath("//*[@class='ms-slide-bgcont']//*[img()='http://v2cdn.boutiqaat.com/media/emthemes/resized/frontend/emthemes/slideshow/l/o/loreal-web-banner_12.jpg']\r\n" + 
       //				"")).click();
	}
	
	
	
	@Test (priority=1)
	public void verifyLoginlink() throws InterruptedException, IOException
	{
//		boolean status1;
//		Thread.sleep(20000);
//		status1 =hp.Loginlink(dr);
//		System.out.println(status1);
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"Login link is working fine");
//		t.TakesScreenshot(dr);
	}
	

	@Test (priority=2)
	public void verifyLoginPage() throws InterruptedException, IOException
	{
//		boolean status1;
//		Thread.sleep(20000);
//		status1 =hp.verifyloginUser(dr);
//		System.out.println(status1);
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"Login Page is working fine");
//		t.TakesScreenshot(dr);
	}
//	
	
	@Test (priority=4)
	public void verifyMyAccountlink() throws InterruptedException, IOException
	{
//		boolean status1;
//		Thread.sleep(20000);
//		status1 =hp.MyAccountLink(dr);
//		System.out.println(status1);
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"Login link is working fine");
//		t.TakesScreenshot(dr);
	}
	
	
	
	@Test(priority=3)
	public void verifycelebritylink() throws InterruptedException, IOException
	{
//		System.out.println(dr);
//		//dr=new ChromeDriver();
//		boolean status1;
//		//hp.HomePagelink(dr);
//		Thread.sleep(20000);
//		status1 =hp.fetchcelebritylink(dr);
//		System.out.println(status1);
//		
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"Celebrity link exist on the menu bar");
//		t.TakesScreenshot(dr);
	}
	
	@Test (priority=5)
	public void verifyFAQlink() throws InterruptedException, IOException
	{
//		boolean status1;
//		Thread.sleep(20000);
//		status1 =hp.VerifyFAQpage(dr);
//		System.out.println(status1);
//		
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"FAQ is working fine");
//		t.TakesScreenshot(dr);
	}

	@Test (priority=6)
	public void verifyBoutiqaatlink() throws InterruptedException, IOException
	{
//		boolean status1;
//		Thread.sleep(20000);
//		status1 =hp.Boutiqaatlink(dr);
//		System.out.println(status1);
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"Boutiqaat link is working fine");
//		t.TakesScreenshot(dr);
	}
	
	@Test(priority=7)
	public void verifybrandlink() throws InterruptedException, IOException
	{
//		boolean status1;
//		Thread.sleep(20000);
//		status1 =hp.fetchBrandlink(dr);
//		System.out.println(status1);
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"Celebrity link exist on the menu bar");
//		t.TakesScreenshot(dr);
	}
	
	@Test(priority=8)
	public void verifyTVlink() throws InterruptedException, IOException
	{
//		boolean status1;
//		Thread.sleep(20000);
//		status1 =hp.fetchTVlink(dr);
//		System.out.println(status1);
//		
//		Assert.assertTrue(status1);
//		testInfo.log(Status.INFO,"TV link exist on the menu bar");
//		t.TakesScreenshot(dr);
	}

	@Test (priority=3)
	public void VerfyplaceOrder() throws InterruptedException, IOException
	{
//		//boolean status=hp.Boutiqaatlink(dr);
//		hp.HomePagelink(dr);
//		hp.pickproductHome(dr);
//		Thread.sleep(12000);
//		cp.CheckOutPage(dr);
//        sp.shippingAddressRegisterUser(dr);
//		Thread.sleep(10000);
//	    pp.placeorder(dr);
//		
	}
	
	@Test(priority=4)
	public void PlaceOrderThroughCelebrity() throws IOException, InterruptedException
	{
//		hp.HomePagelink(dr);
//		hp.fetchcelebritylink(dr);
//		CelP.selectProductOnCelebrityPage(dr);
//		hp.AddToCart(dr);
//		hp.ClickCart(dr);
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
	}
	
	@Test(priority=18)
	public void placeOrderOneProduct() throws InterruptedException, IOException
	{
//		hp.HomePagelink(dr);
//		dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/div/div/div/ol/div[1]/div/div[2]/li/div/div[1]/a/span[2]/span/img")).click();
//		hp.AddToCart(dr);
//		hp.ClickCart(dr);
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
	}
	
	@Test(priority=19)
	public void placeOrderTwoProductWithFilter() throws IOException, InterruptedException
	{
//		//hp.HomePagelink(dr);
//		//Thread.sleep(20000);
//		hp.ShopByCategory(dr);
//		
//		//Filter selection
//		
//		dr.findElement(By.xpath("//*[@id=\"sorter\"]/option[2]")).click();
//		//dr.findElement(By.xpath("//*[@id='sorter']//option[contains(@value,'                Best Selling            ')]")).click();
//		//dr.findElement(By.xpath("//*[@id='sorter']//*[text()='                Best Selling            ']")).click();
//		//selecting first product
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).click();
//		Thread.sleep(5000);
//		hp.AddToCart(dr);
//		
//		//Back button browser
//		//dr.findElement(By.xpath("")).click();
//		dr.navigate().back();
//		
//		//Filter selection
//		dr.findElement(By.xpath("//*[@id=\"sorter\"]/option[2]")).click();
//				//dr.findElement(By.xpath("//*[@id,'sorter']//*[text()='                Best Selling            ']")).click();
//				
//		
//		//Selecting Second product
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[2]/div/div[1]/a/span/span/img")).click();
//		Thread.sleep(5000);
//		
//		hp.AddToCart(dr);
//		hp.ClickCart(dr);
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
//		
//		
	}
	
//	
	@Test(priority=1)
	public void OrderWithMultipleproductMutlipleQntity() throws IOException, InterruptedException
	{
//		hp.HomePagelink(dr);
//		hp.ShopByCategory(dr);
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).click();
//		
//		//Increasing the quantity
//		for(int i=0;i<5;i++)
//		{
//		
//		//dr.findElement(By.xpath("//*[@class='qty-ctl' and contains(@title,'increase')]")).click();
//		dr.findElement(By.xpath("//*[@class='qty-ctl']//*[contains(@title,'increase')]")).click();
//		
//		i=i+1;
//		}
//		
//		
//
//		hp.AddToCart(dr);
//		
//		dr.navigate().back();
//		
//		//filter
//		dr.findElement(By.xpath("//*[@id=\"sorter\"]/option[2]")).click();
//		
//		//select product
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[2]/div/div[1]/a/span/span/img")).click();
//        Thread.sleep(5000);
//		hp.AddToCart(dr);
//		
//		hp.ClickCart(dr);
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
//		
	}
	
	
	
	@Test(priority=17)
	public void OrderWithsingleproductMutlipleQntity() throws IOException, InterruptedException
	{
//		hp.HomePagelink(dr);
//		hp.ShopByCategory(dr);
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).click();
//		
//		//Increasing the quantity
//		for(int i=0;i<5;i++)
//		{
//		
//		//dr.findElement(By.xpath("//*[@class='qty-ctl' and contains(@title,'increase')]")).click();
//		dr.findElement(By.xpath("//*[@class='qty-ctl']//*[contains(@title,'increase')]")).click();
//		
//		i=i+1;
//		}
//		
//
//		hp.AddToCart(dr);
//		hp.ClickCart(dr);
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
//		
	}
	
	
	
	@Test(priority=1)
	public void PlaceOrderWithTVinArabic() throws InterruptedException, IOException
	{
//		dr.get("http://m2.boutiqaat.com/");
//		Thread.sleep(20000);
//		//hp.HomePagelink(dr);
//		//Select Langugage Arabic 
//		//dr.findElement(By.xpath("//*[@id=\"vesitem-7540015278391561107847563\"]/a/span")).click();
//		
//		//dr.findElement(By.xpath("//*[@id='switcher-language-trigger']//*[contains(text()='                            العربية')]")).click();
//		//WebElement element=dr.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front mage-dropdown-dialog']//*[@id='ui-id-1']"));
//		
//	//	WebElement element=dr.findElement(By.xpath("//div[@class='dropdown switcher-dropdown ui-dialog-content ui-widget-content']//*[contains(@id='ui-id-1')]"));
//		
//		WebElement dropdown=dr.findElement(By.id("switcher-language-trigger"));
//        dropdown.click();
//		
//		
//		WebElement element=dr.findElement(By.xpath("//*[@class='dropdown switcher-dropdown ui-dialog-content ui-widget-content']"));
//		Thread.sleep(5000);
//		WebDriverWait wait=new WebDriverWait(dr,60);
//		//wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.id("ui-id-1"))));
//		wait.until(ExpectedConditions.visibilityOf(element));
//		
//		//dr.findElement(By.id("ui-id-1")).click();
//		element.click();
//		
//		
//		Thread.sleep(5000);
//		//Select link TV
//		dr.findElement(By.xpath("//*[@class='block ves-menu custom-mega-menu']//*[text()='تلفزيون']")).click();
//		
//		Thread.sleep(10000);
//	    //Select TV
//		dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[1]/div[5]/div[2]/ol/li[201]/div/div[2]/strong/a")).click();
//		Thread.sleep(5000);
//		
//		//Select product from TV
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).click();
//		Thread.sleep(5000);
//		
//		hp.AddToCart(dr);
//		//hp.AddToCart(dr);
//		hp.ClickCart(dr);
//		
//		//cp.CheckOutPage(dr); ---we are going on shipping page directly
//		Thread.sleep(10000);
//		sp.ShippingAddressGuestArabic(dr);
//		Thread.sleep(2000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
//		
//		
	}
	
	@Test(priority=1)
	public void PlacedOrderTVelebWithRegistration() throws InterruptedException, IOException
	{
//		dr.get("http://m2.boutiqaat.com/");
//		
//		Thread.sleep(10000);
//		hp.fetchTVlink(dr);
//		Thread.sleep(5000);
//		
//		//Select a TV
//		
//		dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[1]/div[5]/div[2]/ol/li[294]/div/div[1]/a/span/span/img")).click();
//		Thread.sleep(10000);
//		
//		//Select a product
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[3]/div/div[1]/a/span/span/img")).click();
//		Thread.sleep(10000);
//		
//		hp.AddToCart(dr);
//		Thread.sleep(5000);
//		hp.verifyRegisterUser(dr);
//		Thread.sleep(2000);
//		hp.fetchcelebritylink(dr);
//		
//		//Select a Celebrity
//		
//		//Thread.sleep(10000);
//		//Select celebrity
//	//	dr.findElement(By.)
//		
//		///Select Celebrity
//		dr.findElement(By.xpath("//img[@class='product-image-photo lazy' and contains(@alt,'Abeer Ahmed Boutique')]")).click();
//		Thread.sleep(10000);
//		
//		
//		//Select Product
//		WebDriverWait wait=new WebDriverWait(dr,60);
//		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Anastasia Blush - Berry Adore ')]"))));
//		                                                         
//		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Anastasia Blush - Berry Adore ')]")).click();
//		
//		Thread.sleep(10000);
//		hp.AddToCart(dr);
//		
//		hp.ClickCart(dr);
//	
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
//	
	}
	
	@Test(priority=8)
	public void PlaceOrder2WishlistWithbrand() throws InterruptedException, IOException
	{
//		dr.get("http://m2.boutiqaat.com/");
//		Thread.sleep(5000);
//		hp.verifyloginUser(dr);
//		
//		//Select brand link
//		hp.fetchBrandlink(dr);
//		
//		//Select brand
//		
//		//dr.findElement(By.className("lazy img-responsive")).click();
//		dr.findElement(By.xpath("//img[@class='lazy img-responsive' and contains(@alt,'Abeer Alyaseen')]")).click();
//		Thread.sleep(5000);
//		
//		//select the product
//		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Abeer Alyaseen Eyelashes - HL011')]")).click();
//		Thread.sleep(5000);
//		
//		prp.AddToWishlist(dr);
//		
//		
//		dr.navigate().back();
//		Thread.sleep(5000);
//		dr.navigate().back();
//		Thread.sleep(5000);
////		WebDriverWait wait1=new WebDriverWait(dr,30);
////		wait1.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Abdul Samad Al Qurashi Saudi Blend Eau De Parfum 90 ml - Unisex')]"))));
//		//Add product 1 to wishlist
//		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Abdul Samad Al Qurashi Saudi Blend Eau De Parfum 90 ml - Unisex')]")).click();
//		Thread.sleep(5000);
//		
//		prp.AddToWishlist(dr);
//		
//		dr.navigate().back();
//		Thread.sleep(5000);
//		dr.navigate().back();
//		Thread.sleep(10000);
//		
//		
//		////Add product 2nd to wishlist
//	//	wait1.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Abdul Samad Al Qurashi Saudi Blend Eau De Parfum 90 ml - Unisex')]"))));
//		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Abdul Samad Al Qurashi Alqurashi Blend Eau De Parfum 150 ml - Unisex')]")).click();
//		Thread.sleep(5000);
//		
//		hp.AddToCart(dr);
//		
//		hp.ClickCart(dr);
//		
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);	
//		
//		
//		
		
	}
	
	
	@Test(priority=1)
	public void PlaceOrderCategorywithloggedin() throws InterruptedException, IOException
	{
//		dr.get("http://m2.boutiqaat.com/");
//		hp.verifyloginUser(dr);
//		
//		//Select Category
//
//		hp.ShopByCategory(dr);
//		Thread.sleep(5000);
//		
//		
//	//	dr.findElement(By.xpath("")).click();
//		//Select product
//		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Sylveco Firming Set')]")).click();
//		Thread.sleep(10000);
//		
//		
//		hp.AddToCart(dr);
//		
//		hp.ClickCart(dr);
//		
//		cp.CheckOutPage(dr);
//		sp.shippingAddressLoggedUser(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);	
//		
		
		
	}
	
	@Test(priority=1)
	public void PlaceOrderBySKUSearch() throws InterruptedException, IOException
	{
//		dr.get("http://m2.boutiqaat.com/");
//		Thread.sleep(1000);
//		hp.SearchPlaceHolder(dr, "000784");
//		
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li/div/div[1]/a/span/span/img")).click();
//		
//		Thread.sleep(5000);
//		
//		hp.AddToCart(dr);
//		
//		hp.ClickCart(dr);
//		
//		cp.CheckOutPage(dr);
//		sp.shippingAddressLoggedUser(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);	
		
	}
	
	@Test (priority=1)
	public void OrderBySlectingSKincarewithalphabet() throws InterruptedException, IOException
	{
//		dr.get("http://m2.boutiqaat.com/");
//		Thread.sleep(10000);
//		//Fetch Skincare link
//		hp.fetchSkinCarelink(dr);
//		
//		//Selecting  page number /or alphabet
//		dr.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[3]/div[1]/div[3]/div[2]/ul/li[3]/a/span[2]")).click();
//		Thread.sleep(10000);
//		
//		//Select product
//		dr.findElement(By.xpath("//*[@id=\"em-grid-mode\"]/ol/li[1]/div/div[1]/a/span/span/img")).click();
//		
//		Thread.sleep(10000);
//		
//		//Selecting the link Add to cart
//		hp.AddToCart(dr);
//		
//		hp.ClickCart(dr);
//	
//		cp.CheckOutPage(dr);
//		sp.shippingAddressRegisterUser(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);	
//		
		
//		//Clicking on Click on mini cart
//		hp.ClickMiniCart(dr);
//		
//		//Clicking on the View Bag link or checkout link
//		hp.ViewBagOnMiniCart(dr);  //This is clicking on checkout button ---??
//		
//		//Click on checkout button on checkout page
//		//cp.CheckOutPage(dr);
//		
//		//Fill Shipping Address Form
//		sp.ShippingAddressGuest(dr);
//		
//		//Continue to payment form
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		
//		//Report log insertion
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);	
		
	}
	
	@Test(priority=2)
	public void PlaceOrder2proWishlistWithbrand() throws InterruptedException, IOException
	{
		dr.get("http://m2.boutiqaat.com/");
		Thread.sleep(5000);
		hp.verifyloginUser(dr);
		
		//Select brand link
		hp.fetchBrandlink(dr);
		Thread.sleep(10000);
		//Select brand
		
		//dr.findElement(By.className("lazy img-responsive")).click();
		dr.findElement(By.xpath("//img[@class='lazy img-responsive' and contains(@alt,'Abdulsamad Al Qurashi')]")).click();
		Thread.sleep(5000);
		
		//select the product
		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Abdul Samad Al Qurashi Sadeen Eau De Parfum 12 ml - Unisex')]")).click();
		Thread.sleep(5000);
		
		prp.AddToWishlist(dr);
		
		Thread.sleep(5000);
		dr.navigate().back();
		Thread.sleep(5000);
		
		hp.fetchcelebritylink(dr);
		
		Thread.sleep(10000);
		//Select celebrity
	//	dr.findElement(By.)
		
		///Select Celebrity
		dr.findElement(By.xpath("//img[@class='product-image-photo lazy' and contains(@alt,'Abeer Ahmed Boutique')]")).click();
		Thread.sleep(10000);
		
		
		//Select Product
		WebDriverWait wait=new WebDriverWait(dr,60);
//		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Anastasia Blush - Berry Adore ')]"))));
//		                                                         
//		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Anastasia Blush - Berry Adore ')]")).click();
		
		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Laura Mercier -  Invisible Loose Setting Powder Translucent')]")).click();
		
		
		
		
		Thread.sleep(10000);
		
	prp.AddToWishlist(dr);
		
		Thread.sleep(5000);
		dr.navigate().back();
		Thread.sleep(5000);
		
		//hp.HomePagelink(dr);
		hp.Boutiqaatlink(dr);
		Thread.sleep(5000);
		hp.ShopByCategory(dr);
		Thread.sleep(5000);
		
		
	//	dr.findElement(By.xpath("")).click();
		//Select product
		dr.findElement(By.xpath("//img[@class='product-image-photo' and contains(@alt,'Sylveco Detox Set - 01')]")).click();
		Thread.sleep(10000);
		
		
		hp.AddToCart(dr);
		
		hp.ClickCart(dr);
		
		cp.CheckOutPage(dr);
		sp.shippingAddressRegisterUser(dr);
		Thread.sleep(5000);
		pp.placeorder(dr);
		Assert.assertTrue(true);
		testInfo.log(Status.INFO,"HomePage is working as expected");
		t.TakesScreenshot(dr);	
		
		
		
		
	}
	
	@Test(priority=16)
	public void PlaceOrderThroughCelebrityforQatar() throws IOException, InterruptedException
	{
//		//To click pn dropdown for kuwait
//		
//		WebElement dropdown=dr.findElement(By.id("switcher-store-trigger"));
//        dropdown.click();
//		
//		//To select the country Qatar
//		WebDriverWait wait= new WebDriverWait(dr,30);
//        wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//img[@src='http://v2cdn.boutiqaat.com/media/flags/2.jpg' and contains (@alt,'Qatar')]"))));
//		
//		//dr.findElement(By.xpath("//img[@alt='Qatar' and contains (@src,'http://v2cdn.boutiqaat.com/media/flags/2.jpg')]")).click();
//        dr.findElement(By.xpath("//img[@src='http://v2cdn.boutiqaat.com/media/flags/2.jpg' and contains (@alt,'Qatar')]")).isSelected();
//		dr.findElement(By.xpath("//img[@src='http://v2cdn.boutiqaat.com/media/flags/2.jpg' and contains (@alt,'Qatar')]")).click();
//		
//		Thread.sleep(5000);
//		//By.xpath("//img[@alt='smthg' and contains(@src,'path/to/img')]")
//		
//		
//		
//		//	hp.fetchcelebritylink(dr);
//		dr.findElement(By.xpath("//*[@class='block ves-menu custom-mega-menu']//*[text()=' Celebrities']")).click();
//		
//	
//		CelP.selectProductOnCelebrityPage(dr);
//		hp.AddToCart(dr);
//		hp.ClickCart(dr);
//		cp.CheckOutPage(dr);
//		sp.ShippingAddressGuest(dr);
//		Thread.sleep(5000);
//		pp.placeorder(dr);
//		Assert.assertTrue(true);
//		testInfo.log(Status.INFO,"HomePage is working as expected");
//		t.TakesScreenshot(dr);
	}
	
	
	
	
	
	
	@BeforeMethod
	public void Registermethod(Method method)
	{
		String testname=method.getName();
		testInfo=reports.createTest(testname);
	}
	
	
//	@AfterTest
//	public void captureImageForEachTestCase(ITestResult result1) throws IOException
//	{
//		if(result1.getStatus()==ITestResult.SUCCESS)
//		{
//			testInfo.log(Status.PASS,"The Test method named as  :"+result1.getName()+" is Passed");
//			testInfo.log(Status.PASS, "Test Passed :"+result1.getThrowable());
//			testInfo.addScreenCaptureFromPath(t.capture(dr, "demo"));
//		}
//		else if(result1.getStatus()==ITestResult.FAILURE)
//		{
//			testInfo.log(Status.FAIL,"The Test method named as  :"+result1.getName()+" is Failed");
//			testInfo.log(Status.FAIL, "Test FAilure :"+result1.getThrowable());
//			testInfo.addScreenCaptureFromPath(t.capture(dr, "demo"));
//		}
//		else if(result1.getStatus()==ITestResult.SKIP)
//		{
//			testInfo.log(Status.SKIP,"The Test method named as  :"+result1.getName()+" is Passed");
//			testInfo.log(Status.SKIP, "Test skipped :"+result1.getThrowable());
//			testInfo.addScreenCaptureFromPath(t.capture(dr, "demo"));
//		}
//		
//	}
	
	@AfterMethod
	public void capturestatus(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			testInfo.log(Status.PASS,"The Test method named as  :"+result.getName()+" is Passed");
			testInfo.log(Status.PASS, "Test FAilure :"+result.getThrowable());
			//testInfo.log(Status.FAIL, "SnapShot Below ", testInfo.addScreenCaptureFromPath(t.capture(dr, "demo1")));
			testInfo.addScreenCaptureFromPath(t.capture(dr, "demo"));
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
//			String res = captureScreenshot(dr, result.getName());
//            String image= logger.addScreenCapture(res);
//            System.out.println(image);
//            String TestCaseName = this.getClass().getSimpleName() + " Test Case Failure and Title/Boolean Value Failed";
//            logger.log(LogStatus.FAIL, TestCaseName  + logger.addScreenCapture(res));
//			
			//File imagepath=new File ("", "");
			
			
			String imagePath;
			testInfo.log(Status.FAIL,"The Test method named as  :"+result.getName()+" is Failed");
			testInfo.log(Status.FAIL, "Test FAilure :"+result.getThrowable());
			//testInfo.log(Status.FAIL, "SnapShot Below ", testInfo.addScreenCaptureFromPath(t.capture(dr, "demo1")));
			testInfo.addScreenCaptureFromPath(t.capture(dr, "demo"));
			//testInfo.log(Status.FAIL,"Snapshot below" , testInfo.addScreenCaptureFromPath(t.capture(dr, "demo")));
			//testInfo.log(Status.FAIL, "Snapshot below", testInfo.addScreenCaptureFromPath("./images/", ""))
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			testInfo.log(Status.PASS,"The Test method named as  :"+result.getName()+" is Passed");
		}
	}
	
	
	@AfterTest
	public void cleanup()
	{
		reports.flush();
		dr.close();
	}
}
