package foodbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/lenovo/Testing in a DevOps LifeCycle/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://localhost:8090/");

		driver.findElement(By.xpath("/html/body/div[1]/a[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/center[2]/form/input[1]")).sendKeys("a@123.com");
		driver.findElement(By.xpath("/html/body/div[2]/center[2]/form/input[2]")).sendKeys("ramesh");
		driver.findElement(By.xpath("/html/body/div[2]/center[2]/form/input[3]")).sendKeys("990920320");
		driver.findElement(By.xpath("/html/body/div[2]/center[2]/form/input[4]")).sendKeys("a");
		driver.findElement(By.xpath("/html/body/div[2]/center[2]/form/button")).click();

		driver.findElement(By.xpath("/html/body/div[1]/a[1]")).click();

	}

}
