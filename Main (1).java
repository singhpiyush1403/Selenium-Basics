import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("Http://Google.in");
		driver.manage().window().maximize();
		
		driver.get("http://tcs.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
