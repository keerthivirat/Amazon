import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BASE_TEST {

public WebDriver driver;
@BeforeTest
    public void openbrowser(){
    System.setProperty("webdriver.chrome.driver", "D:\\USERFILESDONTDELETE\\Downloads\\chromedriver_win32\\chromedriver.exe");

    driver=new ChromeDriver();
    }
    @AfterTest
    public void teardown(){
    driver.close();
    }
}
