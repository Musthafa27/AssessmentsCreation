package ExcelAssessment;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class AhascentQuiz {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://akt-on.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/ahascent/Account/Login?ReturnUrl=%2Fahascent%2FChallenge%2FDiversity");
	    driver.findElement(By.id("LoginPage_Email")).clear();
	    driver.findElement(By.id("LoginPage_Email")).sendKeys("designer@aktrea.com");
	    driver.findElement(By.id("LoginPage_Password")).clear();
	    driver.findElement(By.id("LoginPage_Password")).sendKeys("test123");
	    driver.findElement(By.id("submit_login")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.xpath("//div[@id='sidebar-wrapper']/ul/li[2]/a/span")).click();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
driver.findElement(By.linkText("Create New Assessment")).click();
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	driver.findElement(By.id("AssesmentName")).clear();
    driver.findElement(By.id("AssesmentName")).sendKeys("test68");
    
    driver.findElement(By.id("Title")).clear();
    driver.findElement(By.id("Title")).sendKeys("ahscent");
    
    driver.findElement(By.xpath("//*[@id=\"maindiv\"]/div[3]/div/ul/li[1]")).click();
    driver.findElement(By.cssSelector("input.ui-autocomplete-input")).clear();
    driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("mus");
    new Select(driver.findElement(By.id("GameCategory"))).selectByVisibleText("Quiz");
    new Select(driver.findElement(By.id("DifficultyLevel"))).selectByVisibleText("Beginner");
    new Select(driver.findElement(By.id("LearningOptions"))).selectByVisibleText("Individual");
    driver.findElement(By.id("MaximumScore")).clear();
    driver.findElement(By.id("MaximumScore")).sendKeys("500");
    driver.findElement(By.id("MinimumScore")).clear();
    driver.findElement(By.id("MinimumScore")).sendKeys("450");
    driver.findElement(By.id("TimeLimit")).clear();
    driver.findElement(By.id("TimeLimit")).sendKeys("00:30:00");
    driver.findElement(By.id("TotalQuestions")).clear();
    driver.findElement(By.id("TotalQuestions")).sendKeys("5");
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/form/div/div[9]/div[5]/div/div/div[2]")).clear();
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/form/div/div[9]/div[5]/div/div/div[2]")).sendKeys("Good");
    
    driver.findElement(By.id("btnsubmit")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();



try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  }
    @Test
	  public void testJava() throws Exception {
		  String FilePath = "E:\\mus.xls";
			FileInputStream fs = new FileInputStream(FilePath);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet("Sheet1");
			int totalNoOfRows = sh.getRows();
			int totalNoOfCols = sh.getColumns();
			for (int row = 0; row < totalNoOfRows; row++) {
	              
	              String Question="";
	              String Sequence="";
	              String Choice1="";
	              String Choice2="";
	              String Choice3="";
	              String Choice4="";
	              String correct1="";
	              String correct2="";
	              String correct3="";
	              String correct4="";
				for (int col = 0; col < totalNoOfCols; col++) {


					
					{
						
						 if(col==0)
						{
							Question=sh.getCell(col, row).getContents();
							System.out.println(Question);
						}
						else if(col==1)
						{
							Sequence=sh.getCell(col, row).getContents();
							System.out.println(Sequence);
						}
						else if(col==2)
						{
							Choice1=sh.getCell(col, row).getContents();
							System.out.println(Choice1);
						}
						else if(col==3)
						{
							Choice2=sh.getCell(col, row).getContents();
							System.out.println(Choice2);
						}
						else if(col==4)
						{
							Choice3=sh.getCell(col, row).getContents();
							System.out.println(Choice3);
						}
						else if(col==5)
						{
							Choice4=sh.getCell(col, row).getContents();
							System.out.println(Choice4);
						}
						else if(col==6)
						{
							correct1=sh.getCell(col, row).getContents();
							System.out.println(correct1);
						}
						else if(col==7)
						{
							correct2=sh.getCell(col, row).getContents();
							System.out.println(correct2);
						}
						else if(col==8)
						{
							correct3=sh.getCell(col, row).getContents();
							System.out.println(correct3);
						}
						else if(col==9)
						{
							correct4=sh.getCell(col, row).getContents();
							System.out.println(correct4);
						}
					}
					//break;
					//UpdateBroswer(firstName,lastName,NickName,email,Password,role);
				}
				if(row!=0)
				{
				UpdateBroswer(Question,Sequence,Choice1,Choice2,Choice3,Choice4,correct1,correct2,correct3,correct4);
				}
				System.out.println();
			}
	           
	  }

    @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  
	  private void UpdateBroswer(String Question,String Sequence,String Choice1,String Choice2,String Choice3,String Choice4,String correct1,String correct2,String correct3,String correct4) 
	  {
	  
	    
	    
		  driver.findElement(By.id("questionTab")).click();
		  try {
		  		Thread.sleep(1000);
		  	} catch (InterruptedException e) {
		  		// TODO Auto-generated catch block
		  		e.printStackTrace();
		  	}
		  driver.findElement(By.id("createQuestion")).click();
		  try {
		  		Thread.sleep(1000);
		  	} catch (InterruptedException e) {
		  		// TODO Auto-generated catch block
		  		e.printStackTrace();
		  	}
		  new Select(driver.findElement(By.id("QuestionType"))).selectByVisibleText("CheckBox");
		  driver.findElement(By.id("questiontext")).clear();
		  driver.findElement(By.id("questiontext")).sendKeys(Question);
		  driver.findElement(By.id("questionsequence")).clear();
		  driver.findElement(By.id("questionsequence")).sendKeys(Sequence);
		  driver.findElement(By.id("addChoice")).click();
		  driver.findElement(By.id("addChoice")).click();
		  driver.findElement(By.id("addChoice")).click();
		  driver.findElement(By.id("addChoice")).click();
		  driver.findElement(By.id("choicetext_0")).clear();
		  driver.findElement(By.id("choicetext_0")).sendKeys(Choice1);
		  driver.findElement(By.id("choicetext_1")).clear();
		  driver.findElement(By.id("choicetext_1")).sendKeys(Choice2);
		  driver.findElement(By.id("choicetext_2")).clear();
		  driver.findElement(By.id("choicetext_2")).sendKeys(Choice3);
		  driver.findElement(By.id("choicetext_3")).clear();
		  driver.findElement(By.id("choicetext_3")).sendKeys(Choice4);
		  if(correct1.equals("1"))
		  {
		  	driver.findElement(By.id("iscorrect_0")).click();
		  }
		  if(correct2.equals("1"))
		  {
		  	driver.findElement(By.id("iscorrect_1")).click();
		  }
		  if(correct3.equals("1"))
		  {
		  	driver.findElement(By.id("iscorrect_2")).click();
		  }
		  if(correct4.equals("1"))
		  {
		  	driver.findElement(By.id("iscorrect_3")).click();
		  }

		  driver.findElement(By.xpath("//input[@value='Create Question']")).click();
		  try {
		  		Thread.sleep(1000);
		  	} catch (InterruptedException e) {
		  		// TODO Auto-generated catch block
		  		e.printStackTrace();
		  	}
	    
	    
	}
}