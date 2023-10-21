package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;

public class BaseClass {
	public WebDriver driver;
	
	FileUtils fUtils=new FileUtils();
	
	@BeforeSuite
	public void bs() {
		System.out.println("Data base connection achieved");
	}
	
	@BeforeClass()
	public void bc() throws IOException {
		String url = fUtils.fetchDataFromProperty("url");
		
		driver = new ChromeDriver();
		System.out.println("Launch the browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		System.out.println("Nav to the URL");
	}
	
	@BeforeMethod
	public void bm() throws IOException {
		String username = fUtils.fetchDataFromProperty("username");
		String password = fUtils.fetchDataFromProperty("password");
		LoginPage login = new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("Login to the application");
	}
	
	@AfterMethod
	public void am() {
		HomePage home = new HomePage(driver);
		home.logoutAction();
		System.out.println("Logout from the application");
	}
	
	@AfterClass()
		public void ac() {
		driver.quit();
		System.out.println("Close the browser");
	}

	@AfterSuite
	public void as() {
		System.out.println("Data base connection closed");
	}
	
	
}
