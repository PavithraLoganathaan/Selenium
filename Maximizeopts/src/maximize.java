
import java.awt.AWTException;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class maximize {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Boopathi\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		// ops.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(ops);
		driver.navigate().to("https://www.google.co.in/");
		// maximize opt
		// driver.manage().window().maximize();

		// Full screen not maximize
		// driver.manage().window().fullscreen();

		/*
		 * //Dimension class&set size
		 * 
		 * Dimension dimension=new Dimension(800, 500);
		 * 
		 * driver.manage().window().setSize(dimension);
		 */
		
		
	}

}
