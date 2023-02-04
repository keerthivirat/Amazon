import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Amazonloginpageobj extends Baseclass{

    WebDriver driver;

    Amazonloginpageobj(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void navigateToUrl(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

    }

    By signUpButton=By.xpath("(//span[text()=\"Sign in\"])[1]");
    public void HoverSignup(){
        WebElement Hovertosign=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(Hovertosign).perform();
        Click(signUpButton);
    }
    By enteremail=By.xpath("//input[@id=\"ap_email\"]");

    public void setemail(String text){
        SendKeys(enteremail,text);
    }

    By entercontinue=By.xpath("//input[@id=\"continue\"]");
    public void setcontinue(){
        Click(entercontinue);

    }

    By enterpassword=By.xpath("//input[@id=\"ap_password\"]");
    public void setpassword(String text){
        SendKeys(enterpassword,text);
    }
    By signup=By.xpath("//input[@id=\"signInSubmit\"]");
    public void setSignup(){
        Click(signup);
    }



}
