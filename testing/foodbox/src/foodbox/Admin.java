package foodbox;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/lenovo/Testing in a DevOps LifeCycle/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://localhost:8090/");

		// admin login
		driver.findElement(By.xpath("/html/body/div[1]/a[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();

		// manage products
		driver.findElement(By.xpath("/html/body/div[2]/a[1]")).click();
		driver.findElement(By.name("name")).sendKeys("idli");
		driver.findElement(By.name("price")).sendKeys("100");
		driver.findElement(By.name("category")).sendKeys("food");
		driver.findElement(By.name("button")).click();
		Thread.sleep(1000);

		// update product details
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[5]/a[1]")).click();
		driver.findElement(By.name("addproduct")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[5]/a[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("dashboard")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click();
		Thread.sleep(1000);
	}

}
