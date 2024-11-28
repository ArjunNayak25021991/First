package Arjun;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IdeaLab {
	WebDriver driver;

	public static void main(String[] args) throws Exception  {
			WebDriver driver = new ChromeDriver();
			driver.get("https://practice.expandtesting.com/dropdown");

			WebDriver driver1=new EdgeDriver();
			driver1.get("https://practice.expandtesting.com/dropdown");

			WebDriver driver2= new FirefoxDriver();
			driver2.get("https://practice.expandtesting.com/dropdown");
			driver.manage().window().maximize();
			Thread.sleep(2000);
//			WebElement we=driver.findElement(By.xpath("//select[@id='country']"));
//			 Select slcobj=new Select(we);
//			 we.click();
//			
			// driver.findElement(By.xpath("@id="country")).sendkeys("India");
			// driver.Sendkeys(Keys.DOWN).perform();
	                 driver.close();

	}

}
