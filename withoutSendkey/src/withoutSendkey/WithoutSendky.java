package withoutSendkey;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendky {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boopathi\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		
	JavascriptExecutor exe=(JavascriptExecutor) driver;
	//exe.executeScript("document.getElementsByName('q')[0].value='amazon'", "");
	
	
	//WebElement searchbox=driver.findElement(By.name("q"));
	//  exe.executeScript("arguments[0].value='amazon'", searchbox);
	
	
	//Robot class
	driver.switchTo().activeElement();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyRelease(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_Z);
	robot.keyRelease(KeyEvent.VK_Z);
	robot.keyPress(KeyEvent.VK_O);
	robot.keyRelease(KeyEvent.VK_O);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);

	}

}
