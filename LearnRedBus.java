package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnRedBus {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		
        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath("(//table//tr//td[@class='we day'])[1]")).click();
		
        driver.findElement(By.xpath("//button[@class='fl button']")).click();
		
		String NBuss=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
        
		System.out.println(NBuss);
		
		driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		
		String newResult=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(newResult);
		
		String currentTitle = driver.getTitle();  
		System.out.println(currentTitle);
	}

}
