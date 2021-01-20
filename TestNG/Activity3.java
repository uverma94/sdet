package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	
  WebDriver driver;
  
  @Test
  public void testcasepage() {
	  
	  WebElement username = driver.findElement(By.id("username"));
	  WebElement password = driver.findElement(By.id("password"));
	  WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
	  username.sendKeys("admin");
	  password.sendKeys("password");
	  login.click();
	  
	  String confrimationmessage = driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals("Welcome Back, admin", confrimationmessage);
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
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
  }
  
}
