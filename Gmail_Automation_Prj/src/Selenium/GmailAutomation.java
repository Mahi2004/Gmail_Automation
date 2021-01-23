package Selenium;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
	WebDriver driver;  // null
	public GmailAutomation()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\Seleniumjarfiles\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test	
	public void launchApplication()
	{
		System.out.println("RC :launch Application");
		//ChromeDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\Seleniumjarfiles\\chromedriver.exe");	
		driver.get("https://gmail.com");
		System.out.println("Current URL :"+driver.getCurrentUrl());
		System.out.println("Window Title :"+ driver.getTitle());
		System.out.println("Session ID :"+ driver.getWindowHandle());
	}
@Test
  public void loginAuthentication()
  
  {
	System.out.println("RC : Login Application");
	launchApplication();
	By byObj = By.name("identifier");
	WebElement email = driver.findElement(byObj);
	email.click();
	email.sendKeys("dfddsfsdfds");
	email.clear();
	email.sendKeys("happyvalaja");
	//WebElement email= driver.findElements(By.name("identifier")).sendKeys("kg.magi");
	  WebElement nxtBtn = driver.findElement(By.className("VfPpkd-RLmnJb"));
	  nxtBtn.click();
	 driver.findElement(By.name("password")).sendKeys("magi1810");
	 nxtBtn.click();
			 
	  
  }
	@Test
	public void forgotEmail()
	{
		launchApplication();
		driver.findElement(By.tagName("button")).click();
	}
	@Test
	public void help()
	{
		launchApplication();
		selectElementFromCollection("Help");
	}
	@Test
	public void terms()
	{
		launchApplication();
		selectElementFromCollection("Terms");
	}
	@Test
	public void privacy()
	{
		launchApplication();
		selectElementFromCollection("Privacy");
	}
	@Test
	public void learnMore()
	{
		launchApplication();
		//driver.findElement(By.xpath("//a[text()='Learn more']")).click();
		selectElementFromCollection("learnMore");
	}
	public void selectElementFromCollection(String objName)
	{
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);  // i = 0  1 2 3 
			String iText = element.getAttribute("innerText");
			System.out.println("InnerText :" + iText);
			String text = element.getText();
			System.out.println("Text :" + text);
			if(text.equals(objName))
			{
				element.click();
				break;
			}			
		}
	}
	@Test
	public void createAccount()
	{
		launchApplication();
		//driver.findElement(By.className("NlWrkb snByac")).click();//Compound class name
		driver.findElement(By.cssSelector(".NlWrkb")).click();
	}
	

	  
}
