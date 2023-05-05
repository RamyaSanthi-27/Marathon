package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]")).getText();
		System.out.println(text);
		
		//driver.findElement(By.xpath("//div[@id='brandsRefinements']//a")).click();
		driver.findElement(By.xpath("//li[@aria-label='American Tourister']//a")).click();
		driver.findElement(By.xpath("//li[@aria-label='Safari']//a")).click();
		driver.findElement(By.xpath("//span[@aria-label='Sort by:']")).click();
		driver.findElement(By.xpath("//li[@aria-labelledby='s-result-sort-select_4']")).click();
		driver.findElement(By.xpath("//div[@class='s-image-padding']")).click();
		String firstBag = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[1]")).getText();
		System.out.println("First Bag INFO :" +firstBag);
		String dprice = driver.findElement(By.xpath("//span[@class='a-price']")).getText();
		System.out.println("Discount Price : " +dprice);
		
		Thread.sleep(1000);
		driver.close();
	}

}
