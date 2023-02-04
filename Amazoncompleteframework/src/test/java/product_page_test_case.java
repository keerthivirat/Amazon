import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class product_page_test_case extends BASE_TEST{
    ExtentReports extent;
    @BeforeTest
    public void extentReportGenerate(){

        extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("D:\\USERFILESDONTDELETE\\Desktop\\Amazoncompleteframework\\report\\spark.html");
        extent.attachReporter(spark);
    }

    @Test(dataProvider = "product_page")
    public void productPage(String setProductName) throws InterruptedException {
        ExtentTest test=extent.createTest("amazonTest").log(Status.PASS,"this test case pass");
        test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());


    amazonproductpage productobj=new amazonproductpage(driver);

    productobj.navigateToUrl();

    productobj.verifyThePage();
    Thread.sleep(4000);

    productobj.setSearchBox();
    Thread.sleep(2000);

    productobj.setProductName("realMe 9");
    Thread.sleep(3000);

    productobj.setSearch();
    Thread.sleep(2000);

    productobj.setSelectModel();

    }
    @DataProvider(name ="product_page")

    public Object[][] amazonData(){
        return new Object[][]{
                {"realMe 9"},
        };
    }
    @AfterTest
    public void flushreport(){

        extent.flush();

    }
}
