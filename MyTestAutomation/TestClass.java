import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {
	

public static void login() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://google.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	driver.close();
	}
public static void main (String[] args) throws Exception
{
	login();
}
}
