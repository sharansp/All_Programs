package personaTest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ModuleAndPersona {

	WebDriver driver=null;
	WebElement element;
	Select select;
	Scanner input;
	Select selenium;
	@Test(priority=0)
  public void openSAP() throws InterruptedException {
		 driver=null;
        System.setProperty("webdriver.chrome.driver","C:\\Sigma_Aldrich\\SoftWares\\Java\\Jars\\chrome driver 3//chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        capabilities.setCapability("chrome.binary","./src//lib//chromedriver");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        driver.get("file:///C:/sapnextbeta/v15/App/dev/259/main.html");
        System.out.println("Opening SAP url");
        Thread.sleep(5000);
        
	}

	/*@Test(priority=1)
	  public void loginSAP() throws InterruptedException{
		element = driver.findElement(By.xpath("//*[@id=\"Environment-arrow\"]"));
		element.click();
		select = new Select(element);
		select.selectByVisibleText("DEV");
		
		Thread.sleep(3000);
		
	}*/
	
	@Test(priority=2)
	public void enterUserName() throws InterruptedException  {
		 driver.findElement(By.id("txtUsername-inner")).sendKeys("spatil1");
		 System.out.println("User name entered...");
		 Thread.sleep(3000);
	 }
	@Test(priority=3)
	public void enterPassword() throws InterruptedException {
		 driver.findElement(By.id("txtPassword-inner")).sendKeys(".aA9980201998");
		// driver.findElement(By.xpath(xpathExpressionPwd)).sendKeys(Keys.TAB);
		 System.out.println("Password entered...");
		Thread.sleep(3000);
	 }

	
	
	@Test(priority=4)
	public void clickLoginButton() throws InterruptedException {	
		driver.findElement(By.id("__button1")).click();
		//driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		Thread.sleep(13000);
	 }
	
	
	@Test(priority=5)
	public void pageTitle() throws InterruptedException {	
		//input = new Scanner(System.in); Assert.assertEquals(driver.getTitle(), input.nextLine());
		Assert.assertEquals(driver.getTitle(), "SIAL SAP Next");
		System.out.println("Title page verified...");
		Thread.sleep(3000);			
	 }


	@Test(priority=6)
	public void enterPriseInbox() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-1\"]")).click();
		// driver.findElement(By.xpath(xpathExpressionPwd)).sendKeys(Keys.TAB);
		 System.out.println("EnterPrise Inbox Module...");
		Thread.sleep(3000);
	 }

	@Test(priority=7)
	public void financeModule() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-2\"]")).click();
		 System.out.println("Finance Module...");
		Thread.sleep(3000);
	 }
	
	
	@Test(priority=8)
	public void salesAndMarket() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-3-imgNav\"]")).click();
		 System.out.println("Sales And Market Module...");
		Thread.sleep(3000);
	 }

	
	@Test(priority=9)
	public void humanResourses() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-4-imgNav\"]")).click();
		 System.out.println("human ResoursesModule...");
		Thread.sleep(3000);
	 }

	@Test(priority=10)
	public void distributionAndCompliance() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-5-imgNav\"]")).click();
		 System.out.println(" distribution And Compliance...");
		Thread.sleep(3000);
	 }
	
	@Test(priority=11)
	public void supplychain() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-6-imgNav\"]")).click();
		 System.out.println(" supply chain...");
		Thread.sleep(3000);
	 }
	
	@Test(priority=12)
	public void reasearchAndDev() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-7-imgNav\"]")).click();
		 System.out.println("  reasearch And Dev...");
		Thread.sleep(3000);
	 }
	
	@Test(priority=13)
	public void masterData() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-8-imgNav\"]")).click();
		 System.out.println("masterData....");
		Thread.sleep(3000);
	 }
	@Test(priority=14)
	public void profilesAndBlogs() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-9-imgNav\"]")).click();
		 System.out.println("masterData....");
		Thread.sleep(3000);
	 }
	
	@Test(priority=15)
	public void ecommerce() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"__item5-NewHomeMaster--lstMain-10-imgNav\"]")).click();
		 System.out.println("masterData....");
		Thread.sleep(3000);
	 }
	

	
	











}
