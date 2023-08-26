package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
		WebDriver driver;
		
		@BeforeTest
		public void beforeTest() throws Exception {
			
			//driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://iamneo.ai");
			Thread.sleep(100);
		}

		@Test(priority = 1)
		public void testcase_1() throws InterruptedException //Go to Ebay
		{
			
			String title = driver.getTitle();
			String act="We are Hiring!";
			if(title.equals(act)) {
				System.out.println("PASS");
			}
			else {
				System.out.println("FAIL");
			}
			
		}

		@Test(priority = 2)
		public void testcase_2() throws InterruptedException 
	      {
		      driver.navigate().to("https://www.facebook.com");
		}
		@Test (priority= 3)
		public void testcase_3() throws InterruptedException{
			driver.navigate().back();
			System.out.println(driver.getCurrentUrl());
		}
		@Test (priority= 4)
		public void testcase_4() throws InterruptedException{
			driver.navigate().forward();
			driver.navigate().refresh();
		}
		@AfterTest
		public void afterTest() {
			driver.close();
		}
}