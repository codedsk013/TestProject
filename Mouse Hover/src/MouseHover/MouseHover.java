package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hamza  Sultani\\Desktop\\Selenium\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		//WebElement clients =
				
				driver.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div[1]/div/div[2]/div/ul/li[2]/span")).click();

		//action.moveToElement(clients).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("IT")).click();
		
		Thread.sleep(4000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
