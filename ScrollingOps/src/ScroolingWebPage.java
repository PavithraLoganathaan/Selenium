import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolingWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boopathi\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("amazon\n");
		
		/*
		 * //scroll to some position //scroll down
		 * 
		 *  JavascriptExecutor exe=(JavascriptExecutor) driver; exe.executeScript("window.scroll(0,450)","");
		 * 
		 * Thread.sleep(1000); 
		 * //scroll up exe.executeScript("window.scroll(0,-450)","");
		 */
		
		/*
		 * //Go to the bottom of the page JavascriptExecutor exe=(JavascriptExecutor)
		 * driver; exe.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		 * Thread.sleep(2000); //Go to the top
		 * exe.executeScript("window.scroll(0,0)","");
		 */
		
		//Go to the some element position
		JavascriptExecutor exe=(JavascriptExecutor) driver;
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.linkText("View on Twitter"));
		exe.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		
	}

}
