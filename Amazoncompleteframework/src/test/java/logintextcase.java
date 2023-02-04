import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class logintextcase extends BASE_TEST {
    @Test
    @Parameters({"mailid","pwd"})
    public void loginpage(String mailid,String pwd) throws InterruptedException {

        Amazonloginpageobj amazonloginpageobj = new Amazonloginpageobj(driver);

        amazonloginpageobj.navigateToUrl();

        amazonloginpageobj.HoverSignup();

        amazonloginpageobj.setemail(mailid);
        Thread.sleep(4000);

        amazonloginpageobj.setcontinue();
        Thread.sleep(2000);

        amazonloginpageobj.setpassword(pwd);
        Thread.sleep(1000);

        amazonloginpageobj.setSignup();




    }




}
