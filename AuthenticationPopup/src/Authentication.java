import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//either we can use external software like sikuli or AutoIt
		
		//or else below option directly

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Boopathi\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//syntax
		
	//http://username:password@url.com
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
