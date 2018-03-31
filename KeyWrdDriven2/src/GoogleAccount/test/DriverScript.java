/*package GoogleAccount.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DriverScript {
	
	
	WebDriver driver;
@Test
public void googleCheck() throws Exception {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Chrome_Driver\\chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.findElement(By.linkText("Gmail")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@id=\"identifierId\"]/following-sibling::div")).sendKeys("aaa");;
	driver.findElement(By.id("identifierId")).sendKeys("keyword.driven2018@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aaa");
	driver.findElement(By.xpath("//div[@id='passwordNext']")).click();

	Thread.sleep(5000);
	driver.quit();
	}

}


*/