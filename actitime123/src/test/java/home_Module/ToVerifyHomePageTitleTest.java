package home_Module;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.FileUtils;



public class ToVerifyHomePageTitleTest extends BaseClass {

	
	
	@Test
	public void toverifyHomePageTest() throws IOException, InterruptedException {
	
		FileUtils fUtils = new FileUtils();
		String expectedTitle = fUtils.fetchDataFromExcelSheet("Sheet2", 1, 0);
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains(expectedTitle));
		System.out.println("Pass: the title is verified");		
	}

}
