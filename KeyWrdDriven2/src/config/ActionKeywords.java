package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
	
	public static WebDriver driver;
	 
	public static void openBrowser(){		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Chrome_Driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		}
 
	public static void navigate(){	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://google.com");
		}
 
	public static void click_Gmail(){
		driver.findElement(By.linkText("Gmail")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	
	public static void signIn(){
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		}
 
	public static void userId(){
		driver.findElement(By.id("identifierId")).sendKeys("keyword.driven2018@gmail.com");
		}
	
	public static void userNext(){
		driver.findElement(By.id("identifierNext")).click();
		}
 
	public static void input_Password(){
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aaa");
		}
 
	public static void password_Next(){
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		}
 
	public static void waitFor() throws Exception{
		Thread.sleep(5000);
		}
 
	/*public static void click_Logout(){
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		}
 */
	public static void closeBrowser(){
			driver.quit();
		}
 
	}

