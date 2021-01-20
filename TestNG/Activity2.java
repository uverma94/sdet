package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

  WebDriver driver;

  @Test
  public void firsttestmethod() {
	  String title = driver.getTitle();
	  System.out.println("Page Title is: " +title);
	  Assert.assertEquals(title, "Target Practice");	  
  }
  
  @Test
  public void secondtestmethod() {
	  WebElement blackbutton = driver.findElement(By.cssSelector("button.black"));
	  Assert.assertTrue(blackbutton.isDisplayed());
	  Assert.assertEquals(blackbutton.getText(), "black");
  }
  
  @Test(enabled = false)
  public void thirdtestmethod() {
	  System.out.println("This is skipped test. This should not print in console.");	  
  }
  
  @Test
  public void fourthtestmethod() {
	  throw new SkipException("This is skip test case. This should print in console.");	  
  }
  
  @BeforeClass
  public void beforeclass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\UdayVerma\\Desktop\\SDET\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");	  
  }
  
  @AfterClass
  public void afterclass() {
	  driver.close();  
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
  }
  
}
