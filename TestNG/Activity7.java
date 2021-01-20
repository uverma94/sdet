package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	
  WebDriver driver;
  
  @Test(dataProvider = "Authentication")
  public void logintestcase(String username, String password) {
	  
      WebElement user = driver.findElement(By.id("username"));  	
      WebElement pass = driver.findElement(By.id("password"));
      user.sendKeys(username);
      pass.sendKeys(password);
      
      driver.findElement(By.cssSelector("button[type='submit']")).click();
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();  	
      Assert.assertEquals(loginMessage, "Welcome Back, admin");
  }
  
  @BeforeClass
  public void beforeclass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\UdayVerma\\Desktop\\SDET\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");	  
  }
  
  @AfterClass
  public void aftermethod() {
	  driver.close();
  }
  
  @DataProvider(name="Authentication")
  public static Object[][] credentials() {
	  return new Object[][] {{"admin", "password"}};
  }
 
}
