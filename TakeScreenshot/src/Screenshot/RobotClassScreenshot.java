package Screenshot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassScreenshot {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boopathi\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
     
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		
	Robot robot=new Robot();
	Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle=new Rectangle(dim);
	BufferedImage from=robot.createScreenCapture(rectangle);
	File to=new File("robotclass.png");
	ImageIO.write(from, "png", to);
	
	driver.close();
		

	}

}
