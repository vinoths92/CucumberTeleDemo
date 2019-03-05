package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.xpath("//*[@id=\"uh-search-box\"]")).sendKeys("JAVA", Keys.ENTER);
		getPageNumber("3");
	}

	public static void getPageNumber(String num) {

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='compPagination']//a"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals(num)) {
				list.get(i).click();
				break;
			}

		}

	}
}
