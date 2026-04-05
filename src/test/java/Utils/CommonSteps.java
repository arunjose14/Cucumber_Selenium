package Utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import Utils.Hooks;
public class CommonSteps extends BaseTest{
	
	WebDriver driver;

	@Given ("User launces the application")
	public void User_launces_the_application()
	{
		
		Hooks.driver.get("https://automationexercise.com");

	}
	
	@And("User logins with {string} and {string}")
	public void user_logins_with_and(String username , String password)
	{
		
		Hooks.driver.findElement(By.xpath("")).click();
		Hooks.driver.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys(username);
		Hooks.driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys(password);
//		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		
	}
	
	@And("User clicks on the {string} on the {string}")
	public void clicksonElement(String locator , String pageName) throws Exception
	{
		
		String xpathvalue=getLocator(locator,pageName);
		Hooks.driver.findElement(By.xpath(xpathvalue)).click();
		
	}
	
	@And("User verifies {string} is displayed on the {string}")
	public void elementIsDisplayes(String locator , String pageName) throws Exception {
		String xpathvalue=getLocator(locator,pageName);
		Hooks.driver.findElement(By.xpath(xpathvalue)).isDisplayed();
		System.out.println("Element "+ locator+" is displayed");
	}

	@And("User enters {testData} on the {string} on {string}")
	public void enterText(String text , String locator , String pageName ) throws Exception
	{
		String xpathvalue=getLocator(locator,pageName);
		
		Hooks.driver.findElement(By.xpath(xpathvalue)).sendKeys(text);
	}
	
	@And("User enters {string} on the {string} on {string}")
	public void enterTextPlaindata(String text , String locator , String pageName ) throws Exception
	{
		String xpathvalue=getLocator(locator,pageName);
		
		Hooks.driver.findElement(By.xpath(xpathvalue)).sendKeys(text);
	}
	 @ParameterType("\\$\\$\\[([^\\]]+)\\](.+)")
	    public static String testData(String fileName, String propertyKey) throws Exception {
	        Properties prop = new Properties();
	        
	        String path = "Properties/" + fileName + ".properties";
	        
	        FileInputStream fis = new FileInputStream(path);
	        prop.load(fis);
	        fis.close();
	        
	        return prop.getProperty(propertyKey);
	    }
	 @And("User selects value {string} from dropdown {string} on the {string}")
	 public static void SelectDropdownValue(String value,String locator , String pageName) throws Exception
	 {
		 String xpathvalue=getLocator(locator,pageName);
		 WebElement dropdown =Hooks.driver.findElement(By.xpath(xpathvalue));
		 
		 Select sc = new Select(dropdown);
//		 sc.selectByValue(value);
		
		 sc.selectByVisibleText(value);
		
		 
		 
	 }

}
