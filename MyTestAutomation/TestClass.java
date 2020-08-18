
public class TestClass {
	
@BeforeTest
public void login() throws Exception {
	System.setProperty("webdriver.Chrome.driver", "");
	WebDriver driver = new ChromeDriver();
	}
}
