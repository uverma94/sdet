package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {

  WebDriver driver;
  
  @Test
  @Parameters({"username", "password"})
  public void testpage(String Username, String Password) {
	  
	  WebElement user = driver.findElement(By.id("username"));
	  WebElement pass = driver.findElement(By.id("password"));
	  
	  user.sendKeys(Username);
	  pass.sendKeys(Password);
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
  public void afterclass() {
	  driver.close();
  }
  
  
}
