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

public class Activity5 {
	
  WebDriver driver; 	
  
  @BeforeClass(alwaysRun = true)
  public void beforeeclass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\UdayVerma\\Desktop\\SDET\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");  
  }
  
  @Test(groups = {"HeaderTests", "ButtonTests"})
  public void Checkpagetitle() {	  
	  String title = driver.getTitle();
	  System.out.println("Title of Page: " + title);
	  Assert.assertEquals(title, "Target Practice");	  
  }
  
  @Test (groups = {"HeaderTests"})
  public void Headertestthird() {	  
      WebElement header = driver.findElement(By.cssSelector("h3#third-header"));  	
      Assert.assertEquals(header.getText(), "Third header"); 
  }
  
  @Test	(groups = {"HeaderTests"})
  public void Headertestcolor() {	  
      WebElement header = driver.findElement(By.cssSelector("h3#third-header"));  	
      Assert.assertEquals(header.getCssValue("color"), "rgb(251, 189, 8)");
  }
  
  @Test (groups = {"ButtonTests"})
  public void butontest1() {	  
      WebElement button1 = driver.findElement(By.cssSelector("button.olive"));  	
      Assert.assertEquals(button1.getText(), "Olive");
  }
  
  @Test (groups = {"ButtonTests"})
  public void butontest2() {	  
      WebElement button2 = driver.findElement(By.cssSelector("button.olive"));  	
      Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
  }
   
  @AfterClass(alwaysRun=true)
  public void afterclass() {
	  driver.close();
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
  }
  
}
