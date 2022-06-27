package webtest.webteest;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_image {
	public static void main(String[] args) throws  AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\eclipse-workspace\\webteest\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		/* driver.findElement(By.id("file-upload")); */
		
		chooseFile.sendKeys("C:\\Users\\lenovo\\OneDrive\\Pictures\\test.JPG");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();

	}
}
