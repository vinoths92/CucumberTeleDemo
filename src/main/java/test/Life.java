package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Life {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'locations') and @role='button']")).click();
		List<WebElement> test = driver.findElements(By.xpath("//ul[@id='primaryNav']/li[1]//a"));
		System.out.println(test.get(2).getText());
	}

}
