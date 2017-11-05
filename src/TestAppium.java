import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestAppium {
	private WebDriver driver = null;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {

		File appDir = new File(
				"./src/");
		File app = new File("E:\\backup\\AppiumAndroid-master (2)\\AppiumAndroid-master\\Application\\test Ionic_framework_v0.0.5_apkpure.com.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("device", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); // Name of
																		// mobile
																		// web
																		// browser
																		// to
																		// automate.
																		// Should
																		// be an
																		// empty
																		// string
																		// if
																		// automating
																		// an
																		// app
																		// instead.
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "vivo Y51L");
		capabilities.setCapability("app-package", "com.fabiobiondi.ionic.starterStarter"); // Replace
																				// with
																				// your
																				// app's
																				// package
		capabilities.setCapability("app-activity",
				"com.fabiobionandi.test.iconic.starterStarterApp"); // Replace with app's
															// Activity

		

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		System.out.println(driver.toString());
		Thread.sleep(25000);

	}

	@Test
	public void appiumExampleTest() throws Exception {
		
		driver.findElement(By.name("Cats Furry little creatures. Obsessed with plotting assassination, but never following through on it.")).click();
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);

		driver.findElement(By.name("Dogs Lovable. Loyal almost to a fault. Smarter than they let on.")).click();
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.name("Turtles Everyone likes turtles.")).click();
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.name("Sharks An advanced pet. Needs millions of gallons of salt water. Will happily eat you.")).click();
		Thread.sleep(15000);
		driver.navigate().back();
		Thread.sleep(5000);
		
//		driver.findElement(By.name("Cats Furry little creatures. Obsessed with plotting assassination, but never following through on it.")).click();
//		Thread.sleep(15000);
//		driver.navigate().back();
//		Thread.sleep(15000);

		List<WebElement> element =driver.findElements(By.name("Pet Index"));
		element.size();
		System.out.println(element.size());
		Thread.sleep(10000);
//		driver.navigate().back();
		Thread.sleep(5000);
		//Todo
		driver.findElement(By.name("Adopt")).click();	
		Thread.sleep(5000);
		driver.findElement(By.name("Your name ")).sendKeys("Kiran");
		driver.findElement(By.name("Your email ")).sendKeys("Kiran@kiran.com");
		//To Do	

	

	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
