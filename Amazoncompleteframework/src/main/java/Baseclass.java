import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Baseclass {

    WebDriver driver;

    WebDriverWait driverWait;

    public Baseclass(WebDriver driver){

        this.driver=driver;
        driverWait=new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    public void Click(By locator){
        driver.findElement(locator).click();
    }
    public void SendKeys(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

}
