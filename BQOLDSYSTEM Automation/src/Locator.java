import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public String locatorCelebrity()
	{
		String a="";
		
//		LocatorBuilders.add("labeltext", function(e) {
//			if (e.id) {
//				var locator = "xpath=" + "//" + "label[@for='" + e.id +"']" + "/span/text()";
//				var label = this.findElement(locator);
//				return "labeltext=" + label.textContent;
//			}
//			return null;
//		}
		WebDriver dr=new ChromeDriver();
		dr.findElement(By.ByXPath.partialLinkText("")).click();
		return a;
	}

}
