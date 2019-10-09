package ExcelAssessment;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import com.actimind.actiwate.testing.html.Action;
//test class with test comment
public class AhascentInteraction {
	
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  
	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://akt-on.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/ahascent/Account/Login");
		  driver.findElement(By.id("LoginPage_Email")).clear();
		  driver.findElement(By.id("LoginPage_Email")).sendKeys("designer@aktrea.com");
		  driver.findElement(By.id("LoginPage_Password")).clear();
		  driver.findElement(By.id("LoginPage_Password")).sendKeys("test123");
		  driver.findElement(By.id("submit_login")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//div[@id='sidebar-wrapper']/ul/li[2]/a/span")).click();
		  Thread.sleep(5000);
		  
	  }

	  @Test
	  public void testSDGGoodHealth() throws Exception {
	    driver.findElement(By.linkText("Create New Assessment")).click();
	    driver.findElement(By.id("AssesmentName")).clear();
	    driver.findElement(By.id("AssesmentName")).sendKeys("test572");
	    
	    driver.findElement(By.id("Title")).clear();
	    driver.findElement(By.id("Title")).sendKeys("SDG");
	    
	    driver.findElement(By.xpath("//*[@id=\"maindiv\"]/div[3]/div/ul/li[1]")).click();
	    driver.findElement(By.cssSelector("input.ui-autocomplete-input")).clear();
	    driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("mus");
	    new Select(driver.findElement(By.id("GameCategory"))).selectByVisibleText("InteractionModule");
	    new Select(driver.findElement(By.id("DifficultyLevel"))).selectByVisibleText("Beginner");
	    new Select(driver.findElement(By.id("LearningOptions"))).selectByVisibleText("Individual");
	    driver.findElement(By.id("MaximumScore")).clear();
	    driver.findElement(By.id("MaximumScore")).sendKeys("500");
	    driver.findElement(By.id("MinimumScore")).clear();
	    driver.findElement(By.id("MinimumScore")).sendKeys("450");
	    driver.findElement(By.id("TimeLimit")).clear();
	    driver.findElement(By.id("TimeLimit")).sendKeys("00:30:00");
	    driver.findElement(By.id("TotalQuestions")).clear();
	    driver.findElement(By.id("TotalQuestions")).sendKeys("1");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/form/div/div[9]/div[5]/div/div/div[2]")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/form/div/div[9]/div[5]/div/div/div[2]")).sendKeys("Good");
	    driver.findElement(By.id("btnsubmit")).click();
	    Alert alert=driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    Thread.sleep(5000);
	    driver.findElement(By.id("searchconversation")).clear();
	    driver.findElement(By.id("searchconversation")).sendKeys("SHBC1");
	    
	    Thread.sleep(5000);
	    
	    WebElement From=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[1]"));
	    
	    WebElement To=driver.findElement(By.xpath("//*[@id='output-conversation-0-0']"));
	    Actions builder = new Actions(driver);
	    Thread.sleep(5000);
	    builder.clickAndHold(From).moveToElement(To).click(To).release().build().perform();
	    builder.clickAndHold(From).build().perform();
	    builder.click(To).build().perform();
	    builder.release(To).build().perform();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("textarea.textarea-value")).click();
	    driver.findElement(By.cssSelector("textarea.textarea-value")).clear();
	    driver.findElement(By.cssSelector("textarea.textarea-value")).sendKeys("Begin");
	    
	    driver.findElement(By.id("searchdecision")).clear();
	    driver.findElement(By.id("searchdecision")).sendKeys("test2.1");
	    driver.findElement(By.cssSelector("input.textarea-value")).click();
	    driver.findElement(By.cssSelector("input.textarea-value")).clear();
	    driver.findElement(By.cssSelector("input.textarea-value")).sendKeys("50");
	    driver.findElement(By.cssSelector("div.flowchart-operator-outputs > div.flowchart-operator-connector-set > div.flowchart-operator-connector > div.flowchart-operator-connector-arrow")).click();
	    driver.findElement(By.cssSelector("svg.flowchart-links-layer")).click();
	    driver.findElement(By.cssSelector("div.flowchart-operator-outputs > div.flowchart-operator-connector-set > div.flowchart-operator-connector > div.flowchart-operator-connector-arrow")).click();
	    driver.findElement(By.cssSelector("#output-decision-14-0 > div.flowchart-operator-inputs-outputs > div.flowchart-operator-inputs > div.flowchart-operator-connector-set > div.flowchart-operator-connector > div.flowchart-operator-connector-arrow")).click();
	    driver.findElement(By.id("getdata")).click();
	    driver.findElement(By.cssSelector("div.addConversation > i.fa.fa-plus-square")).click();
	    driver.findElement(By.id("searchconversation")).clear();
	    driver.findElement(By.id("searchconversation")).sendKeys("SHBC1.1");
	    driver.findElement(By.xpath("//div[@id='mCSB_1_container']/div[18]/div/textarea")).click();
	    driver.findElement(By.xpath("//div[@id='mCSB_1_container']/div[18]/div/textarea")).clear();
	    driver.findElement(By.xpath("//div[@id='mCSB_1_container']/div[18]/div/textarea")).sendKeys("Would you like to take the shots?");
	    driver.findElement(By.xpath("//div[@id='mCSB_1_container']/div[18]/div/div/i")).click();
	    driver.findElement(By.cssSelector("#parent-45 > ul > li > a.conversationedit > div.addDecision > i.fa.fa-plus-square")).click();
	    Thread.sleep(5000);
	    
	  }
}
