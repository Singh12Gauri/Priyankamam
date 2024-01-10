package locatorsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorDemo3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//total inputs
		List<WebElement> inputs=driver.findElements(By.tagName("input"));
		System.out.println("Total inputs are: "+inputs.size());
		
		//total images
		int images=driver.findElements(By.tagName("img")).size();
		System.out.println("Total images are: "+images);
		
		//Total links,get the text link,get the attribute value(href)
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());//5
		
		//for every link get the text-getText(),getAttribute()
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			
			System.out.println(i.getText());	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
