package foodbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/lenovo/Testing in a DevOps LifeCycle/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://localhost:8090/");
		
		driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click();
		driver.findElement(By.name("email")).sendKeys("a@123.com");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.xpath("/html/body/div[2]/center/form/button")).click();
		Thread.sleep(1000);
		
		//add cart
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[5]/td/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/center[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/div[2]/center[2]/form/table/tbody/tr[6]/td/button")).click();
		
		//view orders
		driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click();
		
		driver.findElement(By.id("yes")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/form/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/a[1]")).click();
		
		
		
		
	}
	
	
}
