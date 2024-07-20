package TMS.PageObject;

import TMS.PageFactory.TMSPageFactory;
import TMS.Runner.TMSRunner;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.util.Objects;

public class LoginLogoutPO extends TMSRunner {

    public void enterUsername(String userName) throws InterruptedException {
        test = extent.createTest("Login Test Case Executing");
        test.log(Status.INFO, "Starting Login Form Test Cases");
        TMSPageFactory.pf.userNameID.sendKeys(userName);
        Thread.sleep(2000);
        test.log(Status.PASS, "Username entering Passed");
    }

    public void enterPassword(String password) throws InterruptedException {
        TMSPageFactory.pf.passwordID.sendKeys(password);
        String pwd = TMSPageFactory.pf.passwordID.getAttribute("value");
        if (Objects.equals(pwd, "haulmatic1234")) {
            test.log(Status.PASS, "Password entering Passed");
        } else {
            test.log(Status.FAIL,"Password Entering Failed");
        }
        Thread.sleep(2000);
    }

    public void clickLoginBtn() throws InterruptedException {
        TMSPageFactory.pf.loginBtnID.click();
        Thread.sleep(5000);
        String currentUrl = WebDriverHelper.getWebDriver().getCurrentUrl();
        if (Objects.equals("https://staging.app.haulmatic.com/dashboard", currentUrl)) {
            test.log(Status.PASS, "Login test cases Passed");
        } else {
            test.log(Status.FAIL, "Login test cases Failed");
        }
    }
}
