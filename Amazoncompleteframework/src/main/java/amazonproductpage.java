import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class amazonproductpage extends Baseclass {
    
    WebDriver driver;
    
    amazonproductpage(WebDriver driver){
        super(driver);

        this.driver=driver;
    }

    public void navigateToUrl(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

    }
    public void verifyThePage(){

        WebElement verify= driver.findElement(By.xpath("//a[@aria-label=\"Amazon.in\"]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(verify).perform();
    }

    By searchBox=By.xpath("//input[@id=\"twotabsearchtextbox\"]");

    public void setSearchBox(){
        Click(searchBox);
    }
    By productName=By.xpath("//input[@id=\"twotabsearchtextbox\"]");

    public void setProductName(String text){
        SendKeys(productName,text);
    }

    By search=By.xpath("//input[@id=\"nav-search-submit-button\"]");

    public void setSearch(){
        Click(search);
    }
By selectModel=By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");

    public void setSelectModel(){

        Click(selectModel);
    }

    }


